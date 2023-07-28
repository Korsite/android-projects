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
        listOf("sakura", "haruno", "sakura haruno", "haruno sakura") to animeInformation(R.string.sakura_hint_1, R.string.sakura_hint_2, R.string.sakura_hint_3),
        listOf("sasuke", "uchiha", "sasuke uchiha", "uchiha sasuke") to animeInformation(R.string.sasuke_hint_1, R.string.sasuke_hint_2, R.string.sasuke_hint_3),

        listOf("elizabeth", "liones", "elizabeth liones") to animeInformation(R.string.elizabeth_hint_1, R.string.elizabeth_hint_1, R.string.elizabeth_hint_1),
        listOf("meliodas") to animeInformation(R.string.meliodas_hint_1, R.string.meliodas_hint_2, R.string.meliodas_hint_3),
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
        "sakura" to R.drawable.sakura,
        "sasuke" to R.drawable.sasuke,

        "elizabeth" to R.drawable.elizabeth,
        "meliodas" to R.drawable.meliodas,
    )
)




