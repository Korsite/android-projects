package com.example.animequiz.data

import androidx.annotation.StringRes
import com.example.animequiz.R

const val MAX_PICTURES_PER_ROUND = 10.0
const val POINTS_PER_ROUND = 10.0
const val POINTS_IF_HINTS_WATCHED = 2
const val MAX_POINTS = MAX_PICTURES_PER_ROUND * POINTS_PER_ROUND

data class animeInformation(
    @StringRes val hint1 : Int,
    @StringRes val hint2 : Int,
    @StringRes val hint3 : Int,
)

var animeInformationHints = mapOf<List<String>, animeInformation>(
    // <------------------------------------ DEMON SLAYER ----------------------------------------->

    listOf("kokushibo", "tsukiguni", "michikatsu", "tsukiguni michikatsu", "michikatsu tsukiguni") to animeInformation(R.string.kokushibo_hint_1, R.string.kokushibo_hint_2, R.string.kokushibo_hint_3),
    listOf("muzan", "kibutsuji", "muzan kibutsuji", "kibutsuji muzan") to animeInformation(R.string.muzan_hint_1, R.string.muzan_hint_2, R.string.muzan_hint_3),
    listOf("giyu", "tomioka", "giyu tomioka", "tomioka giyu") to animeInformation(R.string.giyu_hint_1, R.string.giyu_hint_2, R.string.giyu_hint_3),
    listOf("akaza", "hakuji") to animeInformation(R.string.akaza_hint_1, R.string.akaza_hint_2, R.string.akaza_hint_3),
    listOf("doma") to animeInformation(R.string.doma_hint_1, R.string.doma_hint_2, R.string.doma_hint_3),
    listOf("inosuke", "hashibira", "inosuke hashibira", "hashibira inosuke") to animeInformation(R.string.inosuke_hint_1, R.string.inosuke_hint_2, R.string.inosuke_hint_3),
    listOf("nezuko", "kamado", "nezuko kamado", "kamado nezuko") to animeInformation(R.string.nezuko_hint_1, R.string.nezuko_hint_2, R.string.nezuko_hint_3),
    listOf("rengoku", "kyojuro", "rengoku kyojuro", "kyojuro rengoku") to animeInformation(R.string.rengoku_hint_1, R.string.rengoku_hint_2, R.string.rengoku_hint_3),
    listOf("tanjiro", "kamado", "tanjiro kamado", "kamado tanjiro") to animeInformation(R.string.tanjiro_hint_1, R.string.tanjiro_hint_2, R.string.tanjiro_hint_3),
    listOf("zenitsu", "agatsuma", "zenitsu agatsuma", "agatsuma zenitsu") to animeInformation(R.string.zenitsu_hint_1, R.string.zenitsu_hint_2, R.string.zenitsu_hint_3),

    )

val animeData = mutableMapOf<String, Int>(

    "kokushibo" to R.drawable.kokushibo,
    "muzan" to R.drawable.muzan,
    "giyu" to R.drawable.giyu,
    "akaza" to R.drawable.akaza,
    "doma" to R.drawable.doma,          //demon slayer
    "inosuke" to R.drawable.inosuke,
    "nezuko" to R.drawable.nezuko,
    "rengoku" to R.drawable.rengoku,
    "tanjiro" to R.drawable.tanjiro,
    "zenitsu" to R.drawable.zenitsu,

    )
