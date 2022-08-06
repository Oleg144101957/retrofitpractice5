package com.vishnevskiypro.retrofitpractice5.screens.first

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice5.databinding.ItemMoneyBinding
import com.vishnevskiypro.retrofitpractice5.model.nal.NalichkaItem

class FirstAdapter : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>(){

    private var listOfMoney = emptyList<NalichkaItem>()


    inner class FirstViewHolder(val binding: ItemMoneyBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(ItemMoneyBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }


    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.binding.apply {
            val nal = listOfMoney[position]
            itemName.text = nal.ccy
            itemBuy.text = nal.buy
            itemSale.text = nal.sale
        }
    }

    override fun getItemCount() = listOfMoney.size

    fun setList(list: List<NalichkaItem>){
        listOfMoney = list
        notifyDataSetChanged()
    }
}