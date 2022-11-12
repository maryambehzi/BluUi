package com.example.bluui

import android.text.TextUtils

private val persianNumbers = arrayOf(
    "۰", "۱", "۲", "۳", "۴", "۵",
    "۶", "۷", "۸", "۹"
)

fun addThousandSeparator(s: String?): String? {
    var s = s ?: return ""
    if (s.contains(".")) {
        s = s.substring(0, s.indexOf("."))
    }
    val f = StringBuilder()
    val temp = s.replace("[^0-9۰-۹]+".toRegex(), "")
    for (i in temp.indices) {
        f.append(temp[i])
        if ((temp.length - 1 - i) % 3 == 0 && temp.length - 1 - i != 0) {
            f.append(",")
        }
    }
    return toPersianNumber(f.toString())
}

fun toPersianNumber(text: String): String? {
    if (TextUtils.isEmpty(text)) {
        return ""
    }
    val out = java.lang.StringBuilder()
    val length = text.length
    for (i in 0 until length) {
        val c = text[i]
        when (c) {
            in '0'..'9' -> {
                val number = c.toString().toInt()
                out.append(persianNumbers[number])
            }
            '٫', ',' -> {
                out.append('،')
            }
            else -> {
                out.append(c)
            }
        }
    }
    return out.toString()
}