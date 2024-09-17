package com.azaiskr.nutapos_android_test_1.case2

fun calculateDiscount(
    discounts: IntArray,
    total_sebelum_diskon: Double,
    total_diskon: Double = 0.0,
    index: Int = 0
): DiscountResult {
    if (index >= discounts.size){
        return DiscountResult(total_diskon, total_sebelum_diskon)
    }

    val diskonRp = total_sebelum_diskon * (discounts[index] / 100.0)
    val harga_setelah_diskon = total_sebelum_diskon - diskonRp
    return calculateDiscount(discounts, harga_setelah_diskon, total_diskon + diskonRp, index + 1)
}

fun main(){
    val total_sebelum_diskon =  100000
    val discounts = intArrayOf(20, 10)

    val result = calculateDiscount(discounts, total_sebelum_diskon.toDouble())

    println("Total Diskon: ${result.total_discount}")
    println("Total Harga Setelah Diskon: ${result.total_harga_setelah_diskon}")
}