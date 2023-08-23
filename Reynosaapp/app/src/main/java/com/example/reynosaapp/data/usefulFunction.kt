package com.example.reynosaapp.data

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.ui.data.ReynosaUiState
import com.example.reynosaapp.ui.layer.itemLayers.DAYS_OF_THE_WEEK
import java.util.Calendar

val dayOfTodayInNumber = when (ReynosaUiState().currentTime[Calendar.DAY_OF_WEEK]) {
    1 -> 6 // Sunday (6)
    2 -> 0 // Monday (0)
    3 -> 1 // Tuesday (1)
    4 -> 2 // Wednesday (2)
    5 -> 3 // Thursday (3)
    6 -> 4 // Friday (4)
    else -> 5 // Saturday (5)
}

fun returnIfShopIsCurrentlyOpenedOrClosed(openTime: Double, closeTime: Double): Int {
    val reynosaUiState = ReynosaUiState()
    val getInstance = reynosaUiState.currentTime
    val currentTime =
        getInstance[Calendar.HOUR_OF_DAY].toDouble() + getInstance[Calendar.MINUTE].toDouble() / 100

    return if (currentTime in openTime..closeTime)
        R.string.openedNow
    else
        R.string.closedNow
}

fun returnCloseAndOpenTimeOfTheShop(completeScheduleOfTheShop: List<Pair<String, Any>>) : Pair<Double, Double> {
    var openTime = 0.0
    var closeTime = 0.0
    for(dayOfTomorrowAndSoOn in returnAListToCheckDaysAfter())
        if(completeScheduleOfTheShop[dayOfTomorrowAndSoOn].component2() is String){
            openTime = completeScheduleOfTheShop[dayOfTomorrowAndSoOn].component2()
                .toString()
                .split("-")
                .component1()
                .replace(":", ".") // 9:00 -> 9.00 (for example)
                .toDouble() // 9.00 -> 9.0
            closeTime = completeScheduleOfTheShop[dayOfTomorrowAndSoOn].component2()
                .toString()
                .split("-")
                .component2()
                .replace(":", ".")
                .toDouble()
            break
        }
    return Pair(openTime, closeTime)
}

fun checkHowMuchTimeLeftToClose(minutesLeft: Int): String {
    return if (minutesLeft < 60)
        "$minutesLeft " + if (minutesLeft == 1) "minute" else "minutes"
    else {
        val hoursLeft = minutesLeft / 60
        "$hoursLeft " + if (hoursLeft == 1) "hour" else "hours"
    }
}

fun checkHowMinutesLefToClose(currentTime: Double, closeTime: Double): Int {
    val currentTimeInMinutes = convertTimeInMinutes(currentTime)
    val closeTimeInMinutes = convertTimeInMinutes(closeTime)
    return closeTimeInMinutes - currentTimeInMinutes
}
fun returnAListToCheckDaysAfter(removeDayOfToday: Int = dayOfTodayInNumber): List<Int> {
    var daysOfTheWeekInNumbers = List(7) { i -> i } // creates (0, 1, 2, 3, 4, 5, 6)
    val (list1, list2) = daysOfTheWeekInNumbers.partition { it > removeDayOfToday }
    val someList = list1.plus(list2).toMutableList()
    someList.removeAt(6) // removes the day of today
    return someList
}

fun checkHowMuchTimeLeftToOpen(
    completeSchedule: List<Pair<String, Any>>
): Pair<String, String> {


    val dayOfTomorrowName = when (dayOfTodayInNumber + 1) {
        0 -> "Monday"
        1 -> "Tuesday"
        2 -> "Wednesday"
        3 -> "Thursday"
        4 -> "Friday"
        5 -> "Saturday"
        else -> "Sunday"
    }

    val listCollector = mutableListOf<String>()

    for (day in returnAListToCheckDaysAfter())
        if (completeSchedule[day].component2() is String) {
            val closesDayToBeOpened = completeSchedule[day]
            listCollector.add(closesDayToBeOpened.component1())
            listCollector.add(closesDayToBeOpened.component2().toString().take(5).replace(" ", ""))
            break
        }

    return Pair(
        if (listCollector[0] == dayOfTomorrowName) "tomorrow"
        else "on ${listCollector[0]}",
        listCollector[1]
    ) // where 1st is day and 2nd is hour
}


fun convertTimeInMinutes(hoursAndMinutes: Double): Int {
    val totalMinutes = hoursAndMinutes - hoursAndMinutes.toInt()
    val totalHours = hoursAndMinutes - totalMinutes
    return (totalHours * 60 + totalMinutes * 100).toInt()
}

fun takeAListOfSubCategoriesAndItemInstanceAndReturnAMap(
    allSubCategories: List<SubCategoryData>,
    allItems: List<ItemData>
): Map<Int, ItemData> {

    val items = buildMap {

        allSubCategories.forEachIndexed { index, subCategory ->
            val currentItem = allItems[index]

            var itemPicture = currentItem.itemPicture
            var itemDescription = currentItem.itemDescription
            var itemDescriptionOptional = currentItem.itemDescriptionOptional
            var itemDaysShopOpened: Int = currentItem.itemDaysShopOpened
            var itemGoogleMaps = currentItem.itemGoogleMaps
            var itemWebSite = currentItem.itemWebsite
            var itemPictureOptional = currentItem.itemPictureOptional
            var itemPictureOptional2 = currentItem.itemPictureOptional2
            var itemSchedule = currentItem.itemSchedule

            put(
                subCategory.subCategoryName,
                ItemData(
                    itemName = subCategory.subCategoryName,
                    itemPicture = itemPicture,
                    itemDescription = itemDescription,
                    itemDescriptionOptional = itemDescriptionOptional,
                    itemDaysShopOpened = subCategory.subCategoryDaysShopOpened,
                    itemGoogleMaps = subCategory.subCategoryGoogleMaps,
                    itemWebsite = itemWebSite,
                    itemPictureOptional = itemPictureOptional,
                    itemPictureOptional2 = itemPictureOptional2,
                    itemSchedule = if (itemSchedule.isEmpty()) subCategory.subCategoryCompleteSchedule else itemSchedule
                )
            )

        }
    }

    return items
}

/**
if vararg is not given any info, then every day will appear as "Closed"
unless we give args to openTimeAndClose parameter, which will apply to every day

if not every day is the same open schedule, we must give data to vararg

if every day is the same schedule, but one or two days is closed, use exceptionDay
0 -> Monday
1 -> Tuesday
...
6 -> Sunday
a listOf(1, 2) in exceptionDay means that every day same schedule, but Tuesday and Wednesday it's close
 */
fun returnAPairDataTypeAboutTheScheduleOfAShop(
    vararg scheduleOfEachDay: Any?,
    openTimeAndClose: Pair<Double, Double> = Pair(0.0, 0.0),
    exceptionDay: List<Int> = emptyList()
): List<Pair<String, Any>> {


    val completeSchedule = mutableListOf<Pair<String, Any>>()

    if (scheduleOfEachDay.isNotEmpty())
        DAYS_OF_THE_WEEK.values().forEachIndexed { index, aDayOfAWeek ->
            completeSchedule.add(
                Pair(
                    aDayOfAWeek.name,
                    scheduleOfEachDay.elementAtOrNull(index) ?: R.string.closed
                )
            )
        }
    else {
        // example: 10.35, 19.40 -> 10:35 - 19:40
        fun finalTimeFormat(openTimeAndClose: Pair<Double, Double>): String {

            // 1.50 -> 1:50, toString() function doesn't work since this happens 1.50 -> 1:5, String.format is used instead
            fun replaceTheDoubleValueToTimeFormat(timeInDoubleFormat: Double): String =
                String.format("%.2f", timeInDoubleFormat).replace(".", ":")

            return "${replaceTheDoubleValueToTimeFormat(openTimeAndClose.component1())} - " +
                    replaceTheDoubleValueToTimeFormat(openTimeAndClose.component2())
        }

        val timeFormat = finalTimeFormat(openTimeAndClose)
        DAYS_OF_THE_WEEK.values().map { it.name }.forEachIndexed { index, aDayOfAWeek ->
            val exceptionDayTrue = exceptionDay.contains(index)
            completeSchedule.add(
                Pair(
                    aDayOfAWeek,
                    if (exceptionDayTrue) R.string.closed else timeFormat
                )
            )
        }
    }
    return completeSchedule

}

fun main() {

    val som = returnCloseAndOpenTimeOfTheShop(
        returnAPairDataTypeAboutTheScheduleOfAShop(
            "8:00 - 15:00",
            null,
            "7:00 - 22:00",
            "9:00 - 23:00",
            "8:00 - 15:00",
            "8:00 - 15:00",
            "9:00  - 14:00"
        )
    )

    println(som)
}
