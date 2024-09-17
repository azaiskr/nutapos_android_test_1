package com.azaiskr.nutapos_android_test_1.case4.data

data class FinanceOut(
    val id: Int,
    val date: String,
    val amount: Int
)

val uangKeluar = arrayListOf(
    FinanceOut(1, "2021-09-30", 250000),
    FinanceOut(2, "2021-10-02", 100000),
    FinanceOut(3, "2021-10-04", 150000),
    FinanceOut(4, "2021-10-06", 50000),
)