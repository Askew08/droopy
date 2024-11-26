package com.awekawek.droopy.util

interface StateListener {

    fun onLoading()

    fun onSuccess(message:String?)

    fun onError(message: String)

}