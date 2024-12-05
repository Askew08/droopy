package com.awekawek.droopy.ui.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.awekawek.droopy.R
import com.awekawek.droopy.databinding.ItemCartBinding
import com.awekawek.droopy.mappers.toProduct
import com.awekawek.droopy.models.CartProduct
import com.awekawek.droopy.util.OnClick

class CartRecyclerViewAdapter constructor(
    private val productsList: MutableList<CartProduct>,
    private val onClick: OnClick
) : RecyclerView.Adapter<CartRecyclerviewViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CartRecyclerviewViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val binding: ItemCartBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_cart, parent, false)

        return CartRecyclerviewViewHolder(binding)
    }

    override fun getItemCount() = productsList.size

    override fun onBindViewHolder(holder: CartRecyclerviewViewHolder, position: Int) {
        val cartProduct = productsList[position]

        holder.bind(holder.itemView.context, cartProduct)

        holder.itemView.setOnClickListener {
            onClick.onClick(cartProduct.toProduct())
        }
    }
}

class CartRecyclerviewViewHolder(private val binding: ItemCartBinding) :
    RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("SetTextI18n")
    fun bind(context: Context, cartProduct: CartProduct) {
        Glide.with(context)
            .load(context.getDrawable(cartProduct.imageUrl!!))
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(binding.imageViewProduct)

        binding.textViewProductName.text = cartProduct.name
        binding.textViewProductDescription.text = cartProduct.description
        binding.textViewProductPrice.text = "RP. ${cartProduct.price}"
    }

}