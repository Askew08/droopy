package com.awekawek.droopy.repository

import com.awekawek.droopy.data.cache.AppDatabase
import com.awekawek.droopy.data.datastore.AuthDataStore
import com.awekawek.droopy.models.User
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val appDatabase: AppDatabase,
    private val authDataStore: AuthDataStore
) {

    fun getLoggedInUser() = appDatabase.userDao().getLoggedInUser()

    fun loginUser(email: String, password: String)=appDatabase.userDao().loginUser(email, password)

    suspend fun registerUser(user: User) = appDatabase.userDao().registerUser(user)

    suspend fun logOutUser() = appDatabase.userDao().logOutUser()

    suspend fun setUserLoggedIn() = authDataStore.loginUser()

    suspend fun isUserLoggedIn() = authDataStore.isUserLoggedIn()

    suspend fun setUserLoggedOut() = authDataStore.logOutUser()

}