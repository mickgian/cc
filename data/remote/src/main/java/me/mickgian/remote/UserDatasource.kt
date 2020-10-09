package me.mickgian.remote

/**
 * Implementation of [Api] interface
 */
class UserDatasource(private val api: Api) {

    fun fetchTopUsersAsync() =
            api.fetchTopUsersAsync()

    fun fetchUserDetailsAsync(login: String) =
            api.fetchUserDetailsAsync(login)
}