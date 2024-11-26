package com.awekawek.droopy.ui.fragments.details

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.awekawek.droopy.models.Product
import com.awekawek.droopy.repository.CartRepository
import com.awekawek.droopy.util.StateListener
import kotlinx.coroutines.launch

class DetailsViewModel @ViewModelInject constructor(private val cartRepository: CartRepository) :
    ViewModel() {

    var stateListener: StateListener? = null


    fun saveProductToCart(product:Product) {
        stateListener?.onLoading()

        viewModelScope.launch {
            try {
                cartRepository.saveProductToCart(product)

                stateListener?.onSuccess("Saved to cart")
                return@launch
            } catch (e: Exception) {
                stateListener?.onError("${e.message}")
                return@launch
            }
        }
    }


}