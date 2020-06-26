package com.ma.models

import org.threeten.extra.YearQuarter

data class CrossSectionalResult(
        val yearQuarter: YearQuarter,
        val pe: Double,
        val totalMarketCap: Double,
        val numberOfCompanies: Int
)