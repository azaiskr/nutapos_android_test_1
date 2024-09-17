package com.azaiskr.nutapos_android_test_1.case3

fun calculateShareRevenue(
    hargaSebelumMarkUp: Double,
    markupPersen: Double,
    sharePersen: Double,
): RevenueResut {
    val hargaSetelahMarkUp = hargaSebelumMarkUp + (hargaSebelumMarkUp *(markupPersen / 100.0))
    val shareOjol = hargaSetelahMarkUp * (sharePersen / 100.0)
    val netResto = hargaSetelahMarkUp - shareOjol

    return RevenueResut(net_resto = netResto, share_ojol = shareOjol)
}

fun main (){
    val hargaSebelumMarkUp = 100000
    val markupPersen = 10
    val sharePersen = 20
    val result = calculateShareRevenue(hargaSebelumMarkUp.toDouble(), markupPersen.toDouble(), sharePersen.toDouble())
    println("Net untuk resto: Rp ${result.net_resto}")
    println("Share untuk Ojol: Rp ${result.share_ojol}")
}
