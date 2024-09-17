package com.azaiskr.nutapos_android_test_1.case1

fun calculateTax(total: Float, persenPajak: Float) : TaxResult {
    val netSales = total / (1 + persenPajak/100)
    val pajakRp = total - netSales
    return TaxResult(netSales, pajakRp)
}

fun main(){
    val total = 22000
    val taxPercentage = 10

    val result = calculateTax(total.toFloat(), taxPercentage.toFloat())

    println("Net Sales: ${result.net_sales}")
    println("Pajak Rp: Rp ${result.pajak_rp}")
}