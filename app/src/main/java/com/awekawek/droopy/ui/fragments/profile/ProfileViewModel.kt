package com.awekawek.droopy.ui.fragments.profile

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.awekawek.droopy.models.User
import com.awekawek.droopy.repository.AuthRepository
import com.awekawek.droopy.util.StateListener
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class ProfileViewModel @ViewModelInject constructor(private val authRepository: AuthRepository) :
    ViewModel() {

    var stateListener: StateListener? = null

    private val _loggedInUser = MutableLiveData<User>()
    val loggedInUser = _loggedInUser

    init {
        getLoggedInUser()
    }

    private fun getLoggedInUser() {
        stateListener?.onLoading()

        viewModelScope.launch {
            try {
                val userResponse = authRepository.getLoggedInUser()
                userResponse.collect { user ->
                    _loggedInUser.value = user
                }

                stateListener?.onSuccess("Fetched logged in user")
                return@launch
            } catch (e: Exception) {
                stateListener?.onError(e.message!!)
                return@launch
            }
        }
    }

    fun logOutUser() {
        stateListener?.onLoading()

        viewModelScope.launch {
            try {
                //authRepository.logOutUser()

                authRepository.setUserLoggedOut()

                stateListener?.onSuccess("Logging out user")
                return@launch
            } catch (e: Exception) {
                stateListener?.onError(e.message!!)
                return@launch
            }
        }
    }

}