package com.awekawek.droopy.ui.fragments.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.awekawek.droopy.R
import com.awekawek.droopy.databinding.FragmentDetailsBinding
import com.awekawek.droopy.util.StateListener
import com.awekawek.droopy.util.log
import com.awekawek.droopy.util.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsFragment : Fragment(), StateListener {

    private lateinit var binding: FragmentDetailsBinding
    private val viewModel by viewModels<DetailsViewModel>()
    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false)
        viewModel.stateListener = this

        binding.toolbarDetails.setNavigationOnClickListener {
            it.findNavController().navigateUp()
        }

        binding.buttonAddToCart.setOnClickListener {
            viewModel.saveProductToCart(args.product!!)
        }

        initUI()

        return binding.root
    }

    private fun initUI() {
        val product = args.product!!

        Glide.with(requireActivity())
            .load(requireActivity().getDrawable(product.imageUrl!!))
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(binding.imageViewDetails)

        binding.textViewProductName.text = product.name
        binding.textViewProductPrice.text = "RP. ${product.price}"
        binding.textViewProductDescription.text = product.description
        binding.textViewProductSpec.text = product.spec
        binding.textViewProductModel.text = product.modelNumber

    }

    override fun onLoading() {
        //binding.prog
    }

    override fun onSuccess(message: String?) {
        requireActivity().toast(message!!)
        requireActivity().log(message)
    }

    override fun onError(message: String) {
        requireActivity().toast(message)
        requireActivity().log(message)
    }
}