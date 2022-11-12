package com.example.bluui

import androidx.recyclerview.widget.RecyclerView
import com.example.bluui.databinding.ItemTransactionBinding

class TransactionViewHolder(private val binding: ItemTransactionBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(transaction: TransactionModel) {
        binding.model = transaction
        binding.executePendingBindings()

    }
}