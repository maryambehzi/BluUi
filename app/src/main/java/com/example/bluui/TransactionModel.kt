package com.example.bluui

data class TransactionModel(
    val type: TransactionType,
    val title: String,
    val date: String,
    val amount: String,
    val isIncome: Boolean
)

enum class TransactionType {
    CHARGE, INTERNET, SHOPPING, SALARY, CHARITY
}

val TransactionDummyData: ArrayList<TransactionModel> = arrayListOf(
    TransactionModel(
        TransactionType.SALARY,
        "افزایش موجودی",
        "دوشنبه 6 تیر",
        "50000000 ریال",
        true
    ),
    TransactionModel(
        TransactionType.CHARGE,
        "شارژ",
        "یکشنبه 5 تیر",
        "100000 ریال",
        false
    ),
    TransactionModel(
        TransactionType.SHOPPING,
        "خرید از فروشگاه",
        "شنبه 4 تیر",
        "3260000 ریال",
        false
    ),
    TransactionModel(
        TransactionType.INTERNET,
        "اینترنت",
        "جمعه 3 تیر",
        "576000 ریال",
        false

    ),
    TransactionModel(
        TransactionType.SALARY,
        "دریافت از حساب",
        "پنجشنبه 2 تیر",
        "78000000 ریال",
        true
    ),
    TransactionModel(
        TransactionType.CHARITY,
        "کمک به خیریه",
        "چهارشنبه 1 تیر",
        "500000 ریال",
        false
    ),
    TransactionModel(
        TransactionType.SALARY,
        "افزایش موجودی",
        "سه شنبه 31 خرداد",
        "50000000 ریال",
        true
    ),
    TransactionModel(
        TransactionType.CHARGE,
        "شارژ",
        "دوشنبه 30 خرداد",
        "100000 ریال",
        false
    ),
    TransactionModel(
        TransactionType.SHOPPING,
        "خرید از فروشگاه",
        "یکشنبه 29 خرداد",
        "3260000 ریال",
        false
    ),
    TransactionModel(
        TransactionType.INTERNET,
        "اینترنت",
        "شنبه 28 خرداد",
        "576000 ریال",
        false

    ),
    TransactionModel(
        TransactionType.SALARY,
        "دریافت از حساب",
        "جمعه 27 خرداد",
        "78000000 ریال",
        true
    ),
    TransactionModel(
        TransactionType.CHARITY,
        "کمک به خیریه",
        "پنجشنبه 26 خرداد",
        "500000 ریال",
        false
    ),
    TransactionModel(
        TransactionType.SALARY,
        "افزایش موجودی",
        "چهارشنبه 25 خرداد",
        "50000000 ریال",
        true
    ),
    TransactionModel(
        TransactionType.CHARGE,
        "شارژ",
        "سه شنبه 24 خرداد",
        "100000 ریال",
        false
    ),
    TransactionModel(
        TransactionType.SHOPPING,
        "خرید از فروشگاه",
        "دوشنبه 23 خرداد",
        "3260000 ریال",
        false
    ),
    TransactionModel(
        TransactionType.INTERNET,
        "اینترنت",
        "یکشنبه 22 خرداد",
        "576000 ریال",
        false

    ),
    TransactionModel(
        TransactionType.SALARY,
        "دریافت از حساب",
        "شنبه 21 خرداد",
        "78000000 ریال",
        true
    ),
    TransactionModel(
        TransactionType.CHARITY,
        "کمک به خیریه",
        "جمعه 20 خرداد",
        "500000 ریال",
        false
    )
)