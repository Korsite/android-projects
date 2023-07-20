package com.example.gandhisknownspaceapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.gandhisknownspaceapp.R

data class personInfo(
    @DrawableRes val picture : Int,
    @StringRes val name : Int,
    val age : Int,
    @StringRes val description : Int
)

object persons{
    val personsInfo = listOf<personInfo>(
        personInfo(R.drawable.person1picture, R.string.person1Name, 18, R.string.person1Description),
        personInfo(R.drawable.person2picture, R.string.person2Name, 18, R.string.person2Description),
        personInfo(R.drawable.person3picture, R.string.person3Name, 18, R.string.person3Description),
        personInfo(R.drawable.person4picture, R.string.person4Name, 10, R.string.person4Description),
        personInfo(R.drawable.person5picture, R.string.person5Name, 19, R.string.person5Description),
        personInfo(R.drawable.person6picture, R.string.person6Name, 21, R.string.person6Description),
        personInfo(R.drawable.person7picture, R.string.person7Name, 28, R.string.person7Description),
        personInfo(R.drawable.person8picture, R.string.person8Name, 18, R.string.person8Description),
        personInfo(R.drawable.person9picture, R.string.person9Name, 18, R.string.person9Description),
        personInfo(R.drawable.person10picture, R.string.person10Name, 18, R.string.person10Description),
        personInfo(R.drawable.person11picture, R.string.person11Name, 26, R.string.person11Description),
        personInfo(R.drawable.person12picture, R.string.person12Name, 18, R.string.person12Description)
    )
}
