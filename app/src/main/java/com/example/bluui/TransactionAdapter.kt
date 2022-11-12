package com.example.bluui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bluui.databinding.ItemTransactionBinding

class TransactionAdapter : RecyclerView.Adapter<TransactionViewHolder>() {

    private var transactionList: MutableList<TransactionModel> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        return TransactionViewHolder(ItemTransactionBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private fun getItem(position: Int): TransactionModel {
        return transactionList[position]
    }

    fun addAll(genreList: List<TransactionModel>) {
        this.transactionList.clear()
        this.transactionList.addAll(genreList)
    }
}