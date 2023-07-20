package com.example.animequiz.data

import android.content.Context
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.animequiz.R
import com.example.animequiz.getKey

const val MAX_PICTURES_PER_ROUND = 10.0
const val POINTS_PER_ROUND = 10.0
const val POINTS_IF_HINTS_WATCHED = 2
const val MAX_POINTS = MAX_PICTURES_PER_ROUND * POINTS_PER_ROUND

internal data class animeInformation(
    @StringRes val hint1 : Int,
    @StringRes val hint2 : Int,
    @StringRes val hint3 : Int,
)
internal val animeInformationHints = mapOf(
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

    // <------------------------------------ ASSASSINATION CLASSROOM ----------------------------------------->
    listOf("koro", "korosensei", "senseikoro", "sensei", "koro sensei", "sensei koro") to animeInformation(R.string.koro_hint_1, R.string.koro_hint_2, R.string.koro_hint_3),
    listOf("nagisa", "shiota", "nagisa shiota", "shiota nagisa") to animeInformation(R.string.nagisa_hint_1, R.string.nagisa_hint_2, R.string.nagisa_hint_3),
    listOf("tomoya", "seo", "tomoya seo", "seo tomoya") to animeInformation(R.string.tomoya_hint_1, R.string.tomoya_hint_2, R.string.tomoya_hint_3),

    // <------------------------------------ ATTACK ON TITAN ----------------------------------------->
    listOf("annie", "leonhart", "annie leonhart", "leonhart annie") to animeInformation(R.string.annie_hint_1, R.string.annie_hint_2, R.string.annie_hint_3),
    listOf("armin", "arlet", "armin arlet", "arlet armin") to animeInformation(R.string.armin_hint_1, R.string.armin_hint_2, R.string.armin_hint_3),
    listOf("connie", "springer", "connie springer", "springer connie") to animeInformation(R.string.connie_hint_1, R.string.connie_hint_2, R.string.connie_hint_3),
    listOf("eren", "yeager", "jaeger", "eren jaeger", "eren yeager", "jaeger eren", "yeager eren") to animeInformation(R.string.eren_hint_1, R.string.eren_hint_2, R.string.eren_hint_3),
    listOf("erwin", "smith", "erwin smith", "smith erwin") to animeInformation(R.string.erwin_hint_1, R.string.erwin_hint_2, R.string.erwin_hint_3),
    listOf("hange", "zoe", "hange zoe", "zoe hange") to animeInformation(R.string.hange_hint_1, R.string.hange_hint_2, R.string.hange_hint_3),
    listOf("levi", "ackerman", "levi ackerman", "ackerman levi") to animeInformation(R.string.levi_hint_1, R.string.levi_hint_2, R.string.levi_hint_3),
    listOf("mikasa", "ackerman", "mikasa ackerman", "ackerman mikasa") to animeInformation(R.string.mikasa_hint_1, R.string.mikasa_hint_2, R.string.mikasa_hint_3),

    // <------------------------------------ BLACK BUTLER ----------------------------------------->
    listOf("baldroy", "bardroy", "borudoroi", "baldo", "bard") to animeInformation(R.string.baldroy_hint_1, R.string.baldroy_hint_2, R.string.baldroy_hint_3),
    listOf("ciel", "phantomhive", "earl", "ciel phantomhive", "phantomhive ciel", "earl ciel phantomhhive") to animeInformation(R.string.ciel_hint_1, R.string.ciel_hint_2, R.string.ciel_hint_3),
    listOf("grell", "sutcliff", "grell sutcliff", "sutcliff grell") to animeInformation(R.string.grell_hint_1, R.string.grell_hint_2, R.string.grell_hint_3),
    listOf("madam", "red", "madam red") to animeInformation(R.string.madam_hint_1, R.string.madam_hint_2, R.string.madam_hint_3),
    listOf("mey", "meyrin", "mey-rin", "meirin") to animeInformation(R.string.mey_hint_1, R.string.mey_hint_2, R.string.mey_hint_3),
    listOf("sebastian", "michaelis", "sebastian michaelis", "michaelis sebastian") to animeInformation(R.string.sebastian_hint_1, R.string.sebastian_hint_2, R.string.sebastian_hint_3),
    listOf("undertaker") to animeInformation(R.string.undertaker_hint_1, R.string.undertaker_hint_2, R.string.undertaker_hint_3),

    // <------------------------------------ DEATH NOTE ----------------------------------------->
    listOf("l", "lawliet", "l lawliet") to animeInformation(R.string.l_hint_1, R.string.l_hint_2, R.string.l_hint_3),
    listOf("light", "yagami", "light yagami", "yagami light") to animeInformation(R.string.light_hint_1, R.string.light_hint_2, R.string.light_hint_3),
    listOf("misa", "amane", "misa amane", "amane misa") to animeInformation(R.string.misa_hint_1, R.string.misa_hint_2, R.string.misa_hint_3),
    listOf("near", "n", "nate", "river", "nate river") to animeInformation(R.string.near_hint_1, R.string.near_hint_2, R.string.near_hint_3),
    listOf("rem") to animeInformation(R.string.rem_hint_1, R.string.rem_hint_2, R.string.rem_hint_3),
    listOf("ryuk") to animeInformation(R.string.ryuk_hint_1, R.string.ryuk_hint_2, R.string.ryuk_hint_3),
    listOf("soichiro", "yagami", "soichiro yagami", "yagami soichiro") to animeInformation(R.string.soichiro_hint_1, R.string.soichiro_hint_2, R.string.soichiro_hint_3),

    // <------------------------------------ MONSTER ----------------------------------------->
    listOf("eva", "heinemann", "eva heinemann", "heinemann eva") to animeInformation(R.string.eva_hint_1, R.string.eva_hint_2, R.string.eva_hint_3),
    listOf("johan", "liebhear", "johan liebheart", "liebheart johan") to animeInformation(R.string.johan_hint_1, R.string.johan_hint_2, R.string.johan_hint_3),
    listOf("nina", "fortner", "nina fortner", "fortner nina") to animeInformation(R.string.nina_hint_1, R.string.nina_hint_2, R.string.nina_hint_3),
    listOf("tenma", "kenzo", "tenma kenzo", "kenzo tenma") to animeInformation(R.string.tenma_hint_1, R.string.tenma_hint_2, R.string.tenma_hint_3),

    // <------------------------------------ MY HERO ACADEMY ----------------------------------------->
    listOf("dabi", "toya", "todoroki", "toya torodoki", "torodoki toya") to animeInformation(R.string.dabi_hint_1, R.string.dabi_hint_2, R.string.dabi_hint_3),
    listOf("izuku", "deku", "midoriya", "izuku midoriya", "midoriya izuku") to animeInformation(R.string.izuku_hint_1, R.string.izuku_hint_2, R.string.izuku_hint_3),
    listOf("katsuki", "kacchan", "bakugo", "katsuki bakugo", "bakugo katsuki") to animeInformation(R.string.katsuki_hint_1, R.string.katsuki_hint_2, R.string.katsuki_hint_3),
    listOf("ochaco", "ochako", "uraraka", "uravity", "ochaco uraraka", "uraraka ochagco", "ochako uraraka", "uraraka ochako") to animeInformation(R.string.ochaco_hint_1, R.string.ochaco_hint_2, R.string.ochaco_hint_3),
    listOf("shoto", "todoroki", "shoto todoroki", "todoroki shoto") to animeInformation(R.string.shoto_hint_1, R.string.shoto_hint_2, R.string.shoto_hint_3),

    // <------------------------------------ NARUTO ----------------------------------------->
    listOf("gaara") to animeInformation(R.string.gaara_hint_1, R.string.gaara_hint_2, R.string.gaara_hint_3),
    listOf("hinata", "hyuga", "hinata hyuga", "hyuga hinata") to animeInformation(R.string.hinata_hint_1, R.string.hinata_hint_2, R.string.hinata_hint_3),
    listOf("kakashi", "hatake", "kakashi hatake", "hatake kakashi") to animeInformation(R.string.kakashi_hint_1, R.string.kakashi_hint_2, R.string.kakashi_hint_3),
    listOf("naruto", "uzumaki", "naruto uzumaki", "uzumaki naruto") to animeInformation(R.string.naruto_hint_1, R.string.naruto_hint_2, R.string.naruto_hint_3),
    listOf("orochimaru") to animeInformation(R.string.orochimaru_hint_1, R.string.orochimaru_hint_2, R.string.orochimaru_hint_3),
    listOf("sakura", "haruno", "sakura haruno", "haruno sakura") to animeInformation(R.string.sakura_hint_1, R.string.sakura_hint_2, R.string.sakura_hint_3),
    listOf("sasuke", "uchiha", "sasuke uchiha", "uchiha sasuke") to animeInformation(R.string.sasuke_hint_1, R.string.sasuke_hint_2, R.string.sasuke_hint_3),
    listOf("tsunade") to animeInformation(R.string.tsunade_hint_1, R.string.tsunade_hint_2, R.string.tsunade_hint_3),

    // <------------------------------------ OVER THE GARDEN WALL ----------------------------------------->
    listOf("beast", "the beast") to animeInformation(R.string.beast_hint_1, R.string.beast_hint_2, R.string.beast_hint_3),
    listOf("beatrice", "beatriz") to animeInformation(R.string.beatrice_hint_1, R.string.beatrice_hint_2, R.string.beatrice_hint_3),
    listOf("greg", "gregory") to animeInformation(R.string.greg_hint_1, R.string.greg_hint_2, R.string.greg_hint_3),
    listOf("jason", "funderberker", "jason funderberker") to animeInformation(R.string.jason_hint_1, R.string.jason_hint_2, R.string.jason_hint_3),
    listOf("wirt") to animeInformation(R.string.wirt_hint_1, R.string.wirt_hint_2, R.string.wirt_hint_3),
    listOf("woodsman") to animeInformation(R.string.woodsman_hint_1, R.string.woodsman_hint_2, R.string.woodsman_hint_3),

    // <------------------------------------ THE SEVEN DEADLY SINS ----------------------------------------->
    listOf("ban") to animeInformation(R.string.ban_hint_1, R.string.ban_hint_2, R.string.ban_hint_3),
    listOf("elizabeth", "liones", "elizabeth liones") to animeInformation(R.string.elizabeth_hint_1, R.string.elizabeth_hint_1, R.string.elizabeth_hint_1),
    listOf("escanor") to animeInformation(R.string.escanor_hint_1, R.string.escanor_hint_2, R.string.escanor_hint_3),
    listOf("estarossa") to animeInformation(R.string.estarossa_hint_1, R.string.estarossa_hint_2, R.string.estarossa_hint_3),
    listOf("gowther") to animeInformation(R.string.gowther_hint_1, R.string.gowther_hint_2, R.string.gowther_hint_3),
    listOf("meliodas") to animeInformation(R.string.meliodas_hint_1, R.string.meliodas_hint_2, R.string.meliodas_hint_3),
    listOf("merlin") to animeInformation(R.string.merlin_hint_1, R.string.merlin_hint_2, R.string.merlin_hint_3),
    listOf("zeldris") to animeInformation(R.string.zeldris_hint_1, R.string.zeldris_hint_2, R.string.zeldris_hint_3),

    // <------------------------------------ YOUR NAME ----------------------------------------->
    listOf("mitsuha", "miyamizu", "mitsuha miyamizu", "miyamizu mitsuha") to animeInformation(R.string.mitsuha_hint_1, R.string.mitsuha_hint_2, R.string.mitsuha_hint_3),
    listOf("taki", "tachibana", "taki tachibana", "tachibana taki") to animeInformation(R.string.tanjiro_hint_1, R.string.tanjiro_hint_2, R.string.tanjiro_hint_3),

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

    "koro" to R.drawable.koro,
    "nagisa" to R.drawable.nagisa,      //assassination classroom
    "tomoya" to R.drawable.tomoya,

    "annie" to R.drawable.annie,
    "armin" to R.drawable.armin,
    "connie" to R.drawable.connie,
    "eren" to R.drawable.eren,          //attack on titan
    "erwin" to R.drawable.erwin,
    "hange" to R.drawable.hange,
    "levi" to R.drawable.levi,
    "mikasa" to R.drawable.mikasa,

    "baldroy" to R.drawable.baldroy,
    "ciel" to R.drawable.ciel,
    "grell" to R.drawable.grell,
    "madam" to R.drawable.madam,        //black butler
    "mey" to R.drawable.mey,
    "sebastian" to R.drawable.sebastian,
    "undertaker" to R.drawable.undertaker,

    "l" to R.drawable.l,
    "light" to R.drawable.light,
    "misa" to R.drawable.misa,
    "near" to R.drawable.near,          //death note
    "rem" to R.drawable.rem,
    "ryuk" to R.drawable.ryuk,
    "soichiro" to R.drawable.soichiro,

    "eva" to R.drawable.eva,
    "johan" to R.drawable.johan,        //monster
    "nina" to R.drawable.nina,
    "tenma" to R.drawable.tenma,

    "dabi" to R.drawable.dabi,
    "izuku" to R.drawable.izuku,
    "katsuki" to R.drawable.katsuki,    //my hero academy
    "ochaco" to R.drawable.ochaco,
    "shoto" to R.drawable.shoto,

    "gaara" to R.drawable.gaara,
    "hinata" to R.drawable.hinata,
    "kakashi" to R.drawable.kakashi,
    "naruto" to R.drawable.naruto,      //naruto
    "orochimaru" to R.drawable.orochimaru,
    "sakura" to R.drawable.sakura,
    "sasuke" to R.drawable.sasuke,
    "tsunade" to R.drawable.tsunade,

    "beast" to R.drawable.beast,
    "beatrice" to R.drawable.beatrice,
    "greg" to R.drawable.greg,
    "jason" to R.drawable.jason,        //over the garden
    "wirt" to R.drawable.wirt,
    "woodsman" to R.drawable.woodsman,

    "ban" to R.drawable.ban,
    "elizabeth" to R.drawable.elizabeth,
    "escanor" to R.drawable.escanor,
    "estarossa" to R.drawable.estarossa,
    "gowther" to R.drawable.gowther,
    "meliodas" to R.drawable.meliodas,  // the seven deadly sins
    "merlin" to R.drawable.merlin,
    "zeldris" to R.drawable.zeldris,

    "mitsuha" to R.drawable.mitsuha,    // your name
    "taki" to R.drawable.taki
)
