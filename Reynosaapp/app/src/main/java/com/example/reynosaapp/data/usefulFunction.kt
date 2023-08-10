package com.example.reynosaapp.data

import com.example.reynosaapp.R
import com.example.reynosaapp.ui.layer.ReynosaUiState
import java.util.Calendar

fun returnIfShopIsCurrentlyOpenedOrClosed(openTime : Double, closeTime: Double) : Int{


    val reynosaUiState = ReynosaUiState()
    val getInstance = reynosaUiState.currentTime
    val currentTime = getInstance[Calendar.HOUR_OF_DAY].toDouble() + getInstance[Calendar.MINUTE].toDouble() / 100

    return if(currentTime in openTime .. closeTime)
        R.string.openedNow
    else
        R.string.closedNow
}

fun checkHowMuchTimeLeftToClose(minutesLeft : Int) : String{
    return if(minutesLeft < 60)
        "$minutesLeft " + if (minutesLeft == 1) "minute" else "minutes"
    else{
        val hoursLeft = minutesLeft / 60
        "$hoursLeft " + if(hoursLeft == 1) "hour" else "hours"
    }
}

fun checkHowMinutesLefToClose(currentTime : Double, closeTime : Double) : Int{
    val currentTimeInMinutes = convertTimeInMinutes(currentTime)
    val closeTimeInMinutes = convertTimeInMinutes(closeTime)
    return closeTimeInMinutes - currentTimeInMinutes
}

fun convertTimeInMinutes(hoursAndMinutes: Double) : Int {
    val totalMinutes = hoursAndMinutes - hoursAndMinutes.toInt()
    val totalHours = hoursAndMinutes - totalMinutes
    return (totalHours * 60 + totalMinutes * 100).toInt()
}
