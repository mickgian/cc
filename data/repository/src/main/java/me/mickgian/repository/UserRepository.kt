package me.mickgian.repository

import androidx.lifecycle.LiveData

import kotlinx.coroutines.Deferred
import me.mickgian.local.dao.UserDao
import me.mickgian.model.ApiResult
import me.mickgian.model.User
import me.mickgian.network.UserDatasource
import me.mickgian.repository.utils.NetworkBoundResource
import me.mickgian.repository.utils.Resource

interface UserRepository {
    suspend fun getTopUsersWithCache(forceRefresh: Boolean = false): LiveData<Resource<List<User>>>
    suspend fun getUserDetailWithCache(forceRefresh: Boolean = false, login: String): LiveData<Resource<User>>
}

class UserRepositoryImpl(private val datasource: UserDatasource,
                         private val dao: UserDao
): UserRepository {

    /**
     * Suspended function that will get a list of top [User]
     * whether in cache (SQLite) or via network (API).
     * [NetworkBoundResource] is responsible to handle this behavior.
     */
    override suspend fun getTopUsersWithCache(forceRefresh: Boolean): LiveData<Resource<List<User>>> {
        return object : NetworkBoundResource<List<User>, ApiResult<User>>() {

            override fun processResponse(response: ApiResult<User>): List<User>
                    = response.items

            override suspend fun saveCallResults(items: List<User>)
                    = dao.save(items)

            override fun shouldFetch(data: List<User>?): Boolean
                    = data == null || data.isEmpty() || forceRefresh

            override suspend fun loadFromDb(): List<User>
                    = dao.getTopUsers()

            override fun createCallAsync(): Deferred<ApiResult<User>>
                    = datasource.fetchTopUsersAsync()

        }.build().asLiveData()
    }

    /**
     * Suspended function that will get details of a [User]
     * whether in cache (SQLite) or via network (API).
     * [NetworkBoundResource] is responsible to handle this behavior.
     */
    override suspend fun getUserDetailWithCache(forceRefresh: Boolean, login: String): LiveData<Resource<User>> {
        return object : NetworkBoundResource<User, User>() {

            override fun processResponse(response: User): User
                    = response

            override suspend fun saveCallResults(item: User)
                    = dao.save(item)

            override fun shouldFetch(data: User?): Boolean
                    = data == null
                    || data.haveToRefreshFromNetwork()
                    || data.name.isNullOrEmpty()
                    || forceRefresh

            override suspend fun loadFromDb(): User
                    = dao.getUser(login)

            override fun createCallAsync(): Deferred<User>
                    = datasource.fetchUserDetailsAsync(login)

        }.build().asLiveData()
    }
}