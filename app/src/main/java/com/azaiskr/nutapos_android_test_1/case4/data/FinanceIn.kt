package com.azaiskr.nutapos_android_test_1.case4.data

data class FinanceIn(
    val id: Int,
    val date: String,
    val amount: Int
)

val uangMasuk = arrayListOf(
    FinanceIn(1, "2021-09-29", 350000),
    FinanceIn(2, "2021-10-01", 200000),
    FinanceIn(3, "2021-10-03", 300000),
    FinanceIn(4, "2021-10-05", 150000),
)
