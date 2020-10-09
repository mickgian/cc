package me.mickgian.common.network

data class Resource<out T>(
    val status: Status,
    val data: T? = null,
    val message: String?,
    val statusCode: Int? = null
) {
    companion object {
        fun <T> success(data: T?, statusCode: Int? = null): Resource<T> {
            return Resource(Status.SUCCESS, data, null, statusCode)
        }

        fun <T> error(message: String? = null, data: T? = null, statusCode: Int? = null): Resource<T> {
            return Resource(Status.ERROR, data, message, statusCode)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }
    }

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING;

        /**
         * Returns `true` if the [Resource] is success else `false`.
         */
        fun isSuccessful() = this == SUCCESS

        /**
         * Returns `true` if the [Resource] is loading else `false`.
         */
        fun isLoading() = this == LOADING

        /**
         * Returns `true` if the [Resource] is in error else `false`.
         */
        fun isError() = this == ERROR
    }
}


