package com.example.bluui

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("setTransactionIcon")
fun ImageView.setTransactionIcon(transactionModel: TransactionModel?) {
   when(transactionModel?.type){
      TransactionType.CHARITY ->  this.setImageResource(R.drawable.ic_charity)
      TransactionType.INTERNET ->  this.setImageResource(R.drawable.ic_internet)
      TransactionType.SALARY ->  this.setImageResource(R.drawable.ic_salary)
      TransactionType.CHARGE ->  this.setImageResource(R.drawable.ic_charge)
      TransactionType.SHOPPING ->  this.setImageResource(R.drawable.ic_shopping)
   }
}

@BindingAdapter("setBackground")
fun ImageView.setBackground(transactionModel: TransactionModel?) {
   when(transactionModel?.isIncome){
      false ->  this.background = resources.getDrawable(R.drawable.gray_icon_bg)
      true ->  this.background = resources.getDrawable(R.drawable.green_icon_bg)
   }
}

@BindingAdapter("setTitle")
fun TextView.setTitle(transactionModel: TransactionModel?) {
   this.text = transactionModel?.title

}
@BindingAdapter("setDate")
fun TextView.setDate(transactionModel: TransactionModel?) {
   this.text = transactionModel?.date

}

@BindingAdapter("setAmount")
fun TextView.setAmount(transactionModel: TransactionModel?) {
   this.text = addThousandSeparator(transactionModel?.amount) + " ریال "

}

@BindingAdapter("setAmountBackground")
fun TextView.setAmountBackground(transactionModel: TransactionModel?) {
   when(transactionModel?.isIncome){
      false ->  this.background = null
      true ->  this.background = resources.getDrawable(R.drawable.rectangle_bg)
   }
}
