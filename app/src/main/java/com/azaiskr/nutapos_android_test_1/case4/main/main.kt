package com.azaiskr.nutapos_android_test_1.case4.main

import android.os.Build
import androidx.annotation.RequiresApi
import com.azaiskr.nutapos_android_test_1.case4.data.uangKeluar
import com.azaiskr.nutapos_android_test_1.case4.data.uangMasuk

@RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
fun main(){
    val laporanMutasi = createMutationReport(uangMasuk, uangKeluar, "2021-10-01", "2021-10-06")
    println("Tanggal \t| Masuk \t| Keluar \t| Saldo")
    for (laporan in laporanMutasi) {
        println("${laporan.date} \t| ${laporan.amount_in} \t| ${laporan.amount_out} \t\t| ${laporan.balance}")
    }
}