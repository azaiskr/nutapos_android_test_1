package com.azaiskr.nutapos_android_test_1.case4.main

import android.os.Build
import android.os.Build.VERSION_CODES.UPSIDE_DOWN_CAKE
import androidx.annotation.RequiresApi
import com.azaiskr.nutapos_android_test_1.case4.data.FinanceIn
import com.azaiskr.nutapos_android_test_1.case4.data.FinanceOut
import com.azaiskr.nutapos_android_test_1.case4.data.FinanceStatement

@RequiresApi(UPSIDE_DOWN_CAKE)
fun createMutationReport (uangMasuk: List<FinanceIn>, uangKeluar: List<FinanceOut>, startDate: String, endDate: String): List<FinanceStatement> {
    val statements = mutableListOf<FinanceStatement>()
    val dateRange = generateDateRange(startDate, endDate)
    var saldo = 0

    for (date in dateRange) {
        val pemasukan = uangMasuk.find { it.date == date }?.amount ?: 0
        val pengeluaran = uangKeluar.find { it.date == date }?.amount ?: 0

        saldo += pemasukan - pengeluaran

        val statement = FinanceStatement(date, pemasukan, pengeluaran, saldo)
        statements.add(statement)
    }

    return statements
}


@RequiresApi(UPSIDE_DOWN_CAKE)
fun generateDateRange(start: String, end: String): List<String> {
    val format = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val startDate = java.time.LocalDate.parse(start, format)
    val endDate = java.time.LocalDate.parse(end, format)

    return startDate.datesUntil(endDate.plusDays(1))
        .map { it.format(format) }
        .toList()
}