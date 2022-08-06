package com.vishnevskiypro.retrofitpractice5.screens.second

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice5.databinding.ItemMoneyBinding
import com.vishnevskiypro.retrofitpractice5.model.beznal.BeznalichkaItem

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>(){

    private var listOfMoney = emptyList<BeznalichkaItem>()

    inner class SecondViewHolder(val binding: ItemMoneyBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        return SecondViewHolder(ItemMoneyBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.binding.apply {
            val beznalichka = listOfMoney[position]
            itemName.text = beznalichka.ccy
            itemBuy.text = beznalichka.buy
            itemSale.text = beznalichka.sale
        }
    }

    override fun getItemCount() = listOfMoney.size

    fun setList(list: List<BeznalichkaItem>){
        listOfMoney = list
        notifyDataSetChanged()
    }
}