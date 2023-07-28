package com.example.animequiz.data

import androidx.annotation.StringRes
import com.example.animequiz.Difficulty
import com.example.animequiz.R


const val MAX_PICTURES_PER_ROUND = 10.0
const val POINTS_PER_ROUND = 10.0


data class animeInformation(
    @StringRes val hint1 : Int,
    @StringRes val hint2 : Int,
    @StringRes val hint3 : Int,
)
internal val animeInformationHints = mapOf(
    Difficulty.EASY to mapOf(
        listOf("muzan", "kibutsuji", "muzan kibutsuji", "kibutsuji muzan") to animeInformation(R.string.muzan_hint_1, R.string.muzan_hint_2, R.string.muzan_hint_3),
        listOf("nezuko", "kamado", "nezuko kamado", "kamado nezuko") to animeInformation(R.string.nezuko_hint_1, R.string.nezuko_hint_2, R.string.nezuko_hint_3),
        listOf("tanjiro", "kamado", "tanjiro kamado", "kamado tanjiro") to animeInformation(R.string.tanjiro_hint_1, R.string.tanjiro_hint_2, R.string.tanjiro_hint_3),
        listOf("eren", "yeager", "jaeger", "eren jaeger", "eren yeager", "jaeger eren", "yeager eren") to animeInformation(R.string.eren_hint_1, R.string.eren_hint_2, R.string.eren_hint_3),
        listOf("mikasa", "ackerman", "mikasa ackerman", "ackerman mikasa") to animeInformation(R.string.mikasa_hint_1, R.string.mikasa_hint_2, R.string.mikasa_hint_3),
        listOf("l", "lawliet", "l lawliet") to animeInformation(R.string.l_hint_1, R.string.l_hint_2, R.string.l_hint_3),
        listOf("light", "yagami", "light yagami", "yagami light") to animeInformation(R.string.light_hint_1, R.string.light_hint_2, R.string.light_hint_3),
        listOf("ryuk") to animeInformation(R.string.ryuk_hint_1, R.string.ryuk_hint_2, R.string.ryuk_hint_3),
        listOf("izuku", "deku", "midoriya", "izuku midoriya", "midoriya izuku") to animeInformation(R.string.izuku_hint_1, R.string.izuku_hint_2, R.string.izuku_hint_3),
        listOf("naruto", "uzumaki", "naruto uzumaki", "uzumaki naruto") to animeInformation(R.string.naruto_hint_1, R.string.naruto_hint_2, R.string.naruto_hint_3),
    ),

    Difficulty.MEDIUM to mapOf(
        listOf("inosuke", "hashibira", "inosuke hashibira", "hashibira inosuke") to animeInformation(R.string.inosuke_hint_1, R.string.inosuke_hint_2, R.string.inosuke_hint_3),
        listOf("zenitsu", "agatsuma", "zenitsu agatsuma", "agatsuma zenitsu") to animeInformation(R.string.zenitsu_hint_1, R.string.zenitsu_hint_2, R.string.zenitsu_hint_3),
        listOf("annie", "leonhart", "annie leonhart", "leonhart annie") to animeInformation(R.string.annie_hint_1, R.string.annie_hint_2, R.string.annie_hint_3),
        listOf("armin", "arlet", "armin arlet", "arlet armin") to animeInformation(R.string.armin_hint_1, R.string.armin_hint_2, R.string.armin_hint_3),
        listOf("connie", "springer", "connie springer", "springer connie") to animeInformation(R.string.connie_hint_1, R.string.connie_hint_2, R.string.connie_hint_3),
        listOf("hange", "zoe", "hange zoe", "zoe hange") to animeInformation(R.string.hange_hint_1, R.string.hange_hint_2, R.string.hange_hint_3),
        listOf("misa", "amane", "misa amane", "amane misa") to animeInformation(R.string.misa_hint_1, R.string.misa_hint_2, R.string.misa_hint_3),
        listOf("near", "n", "nate", "river", "nate river") to animeInformation(R.string.near_hint_1, R.string.near_hint_2, R.string.near_hint_3),
        listOf("soichiro", "yagami", "soichiro yagami", "yagami soichiro") to animeInformation(R.string.soichiro_hint_1, R.string.soichiro_hint_2, R.string.soichiro_hint_3),
        listOf("dabi", "toya", "todoroki", "toya torodoki", "torodoki toya") to animeInformation(R.string.dabi_hint_1, R.string.dabi_hint_2, R.string.dabi_hint_3),
    ),

    Difficulty.DIFFICULT to mapOf(
        listOf("kokushibo", "tsukiguni", "michikatsu", "tsukiguni michikatsu", "michikatsu tsukiguni") to animeInformation(R.string.kokushibo_hint_1,  R.string.kokushibo_hint_2, R.string.kokushibo_hint_3),
        listOf("giyu", "tomioka", "giyu tomioka", "tomioka giyu") to animeInformation(R.string.giyu_hint_1, R.string.giyu_hint_2, R.string.giyu_hint_3),
        listOf("akaza", "hakuji") to animeInformation(R.string.akaza_hint_1, R.string.akaza_hint_2, R.string.akaza_hint_3),
        listOf("doma") to animeInformation(R.string.doma_hint_1, R.string.doma_hint_2, R.string.doma_hint_3),
        listOf("rengoku", "kyojuro", "rengoku kyojuro", "kyojuro rengoku") to animeInformation(R.string.rengoku_hint_1, R.string.rengoku_hint_2, R.string.rengoku_hint_3),
        listOf("koro", "korosensei", "senseikoro", "sensei", "koro sensei", "sensei koro") to animeInformation(R.string.koro_hint_1, R.string.koro_hint_2, R.string.koro_hint_3),
        listOf("nagisa", "shiota", "nagisa shiota", "shiota nagisa") to animeInformation(R.string.nagisa_hint_1, R.string.nagisa_hint_2, R.string.nagisa_hint_3),
        listOf("tomoya", "seo", "tomoya seo", "seo tomoya") to animeInformation(R.string.tomoya_hint_1, R.string.tomoya_hint_2, R.string.tomoya_hint_3),
        listOf("erwin", "smith", "erwin smith", "smith erwin") to animeInformation(R.string.erwin_hint_1, R.string.erwin_hint_2, R.string.erwin_hint_3),
        listOf("levi", "ackerman", "levi ackerman", "ackerman levi") to animeInformation(R.string.levi_hint_1, R.string.levi_hint_2, R.string.levi_hint_3),
    )
)


internal var animeData = mapOf(
    Difficulty.EASY to mapOf(
        "muzan" to  R.drawable.muzan,
        "nezuko" to R.drawable.nezuko,
        "tanjiro" to R.drawable.tanjiro,
        "eren" to R.drawable.eren,
        "mikasa" to R.drawable.mikasa,
        "l" to R.drawable.l,
        "light" to R.drawable.light,
        "ryuk" to R.drawable.ryuk,
        "izuku" to R.drawable.izuku,
        "naruto" to R.drawable.naruto,
    ),
    Difficulty.MEDIUM to mapOf(
        "inosuke" to R.drawable.inosuke,
        "zenitsu" to R.drawable.zenitsu,
        "annie" to R.drawable.annie,
        "armin" to R.drawable.armin,
        "connie" to R.drawable.connie,
        "hange" to R.drawable.hange,
        "misa" to R.drawable.misa,
        "near" to R.drawable.near,
        "soichiro" to R.drawable.soichiro,
        "dabi" to R.drawable.dabi,
    ),
    Difficulty.DIFFICULT to mapOf(
        "kokushibo" to  R.drawable.kokushibo,
        "giyu" to R.drawable.giyu,
        "akaza" to R.drawable.akaza,
        "doma" to R.drawable.doma,
        "rengoku" to R.drawable.rengoku,
        "koro" to R.drawable.koro,
        "nagisa" to R.drawable.nagisa,
        "tomoya" to R.drawable.tomoya,
        "erwin" to R.drawable.erwin,
        "levi" to R.drawable.levi,
    )
)