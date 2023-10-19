package com.example.reynosaapp.data.goodplaces

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.data.framework.filters.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.data.returnAPairDataTypeAboutTheScheduleOfAShop

object GoodPlacesProviderSubCategories {

    private val coffeeShops = listOf(
        SubCategoryData( // 1
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName1,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture1,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere1,
            subCategoryCompleteSchedule =
            returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 20:00",
                null,
                "11:00 - 20:00",
                "11:00 - 20:00",
                "11:00 - 20:00",
                "15:00 - 21:00",
                "15:00 - 21:00",
            )
        ),

        SubCategoryData( // 2
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName2,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture2,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule2,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere2,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(8.0, 23.0)
            )
        ),
        SubCategoryData( //3
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName3,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture3,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule3,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere3,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "13:00 - 21:00",
            )
        ),
        SubCategoryData( //4
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName4,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture4,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule4,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere4,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "9:00 - 22:00",
            )
        ),
        SubCategoryData( //5
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName5,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture5,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule5,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere5,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(7.0, 22.0)
            )
        ),
        SubCategoryData(
            //6
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName6,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture6,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule6,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere6,
        ),
        SubCategoryData( //7
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName7,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture7,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule7,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere7,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(8.0, 20.0)
            )
        ),
        SubCategoryData( //8
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName8,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture8,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule8,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere8,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(8.0, 18.0)
            )
        ),
        SubCategoryData( //9
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName9,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture9,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule9,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere9,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 20:00",
                "9:00 - 20:00",
                "9:00 - 20:00",
                "9:00 - 20:00",
                "9:00 - 20:00",
                "10:00 - 18:00",
                null
            )
        ),
        SubCategoryData( //10
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName10,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture10,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule10,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere10,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 21:00",
                "8:00 - 21:00",
                "8:00 - 21:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
            )
        ),
        SubCategoryData( //11
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName11,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture11,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule11,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere11,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 21:00",
            )
        ),
        SubCategoryData( //12
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName12,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture12,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule12,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere12,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(6.30, 20.30)
            )
        ),
        SubCategoryData( //13
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName13,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture13,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule13,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere13,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(12.30, 21.00)
            )
        ),
        SubCategoryData( //14
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName14,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture14,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule14,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere14,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(10.00, 20.00), exceptionDay = listOf(0)
            )
        ),
        SubCategoryData( //15
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName15,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture15,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule15,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere15,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(6.00, 22.00)
            )
        ),
        SubCategoryData( //16
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName16,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture16,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule16,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere16,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(14.00, 22.00), exceptionDay = listOf(0)
            )
        ),
        SubCategoryData( //17
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName17,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture17,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule17,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere17,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(13.30, 22.00)
            )
        ),
        SubCategoryData(
            //18
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName18,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture18,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule18,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere18,
        ),
        SubCategoryData( //19
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName19,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture19,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule19,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere19,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(7.00, 20.30), exceptionDay = listOf(6)
            )
        ),
        SubCategoryData( //20
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName20,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture20,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule20,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere20,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(10.00, 17.00), exceptionDay = listOf(5, 6)
            )
        ),
        SubCategoryData( //21
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName21,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture21,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule21,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere21,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(11.00, 22.00)
            )
        ),
        SubCategoryData( //22
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName22,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture22,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule22,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere22,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(13.00, 22.00)
            )
        ),
        SubCategoryData( //23
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName23,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture23,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule23,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere23,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "16:00 - 21:00",
                "16:00 - 21:00",
                "13:00 - 20:00",
                "16:00 - 21:00",
                "16:00 - 21:00",
                "16:00 - 21:00",
                null
            )
        ),
        SubCategoryData( //24
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName24,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture24,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule24,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere24,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(9.00, 21.00)
            )
        ),
        SubCategoryData( //25
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName25,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture25,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule25,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere25,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(9.00, 21.00)
            )
        ),
        SubCategoryData( //26
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName26,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture26,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule26,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere26,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(8.00, 20.00), exceptionDay = listOf(6)
            )
        ),
        SubCategoryData( //27
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName27,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture27,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule27,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere27,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00",
                "15:00 - 23:00",
                "15:00 - 23:00",
                "15:00 - 23:00",
                "15:00 - 23:00",
            )
        ),
        SubCategoryData( //28
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName28,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture28,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule28,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere28,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "15:00 - 20:00",
                "15:00 - 20:00",
                "15:00 - 20:00",
                "15:00 - 20:00",
                "11:00 - 20:00",
                null
            )
        ),
        SubCategoryData( //29
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName29,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture29,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule29,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere29,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(8.00, 20.00)
            )
        ),
        SubCategoryData( //30
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName30,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture30,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule30,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere30,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 22:00",
                "10:00 - 22:00",
                "10:00 - 22:00",
                "10:00 - 23:00",
                "10:00 - 23:00",
                "10:00 - 23:00",
                "10:00 - 23:00",
            )
        ),
        SubCategoryData( //31
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName31,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture31,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule31,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere31,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(12.00, 19.30), exceptionDay = listOf(5, 6)
            )
        ),
        SubCategoryData( //32
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName32,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture32,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule32,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere32,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "15:00 - 21:30",
                "15:00 - 21:30",
                null,
                "15:00 - 21:30",
                "15:00 - 22:00",
                "15:00 - 22:00",
                "15:00 - 22:00"
            )
        ),
        SubCategoryData( //33
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName33,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture33,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule33,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere33,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(10.00, 20.30), exceptionDay = listOf(0)
            )
        ),
        SubCategoryData( //34
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName34,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture34,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule34,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere34,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 22:00",
                "7:00 - 22:00",
                "7:00 - 22:00",
                "7:00 - 22:00",
                "7:00 - 22:00",
                "8:00 - 22:00",
                "8:00 - 22:00",
            )
        ),
        SubCategoryData( //35
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName35,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture35,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule35,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere35,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(9.00, 23.00), exceptionDay = listOf(0)
            )
        ),
        SubCategoryData( //36
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName36,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture36,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule36,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere36,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 20:30",
                "9:00 - 20:30",
                "9:00 - 20:30",
                "9:00 - 20:30",
                "9:00 - 20:30",
                "9:00 - 20:30",
                "17:00 - 19:00",
            )
        ),
        SubCategoryData( //37
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName37,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture37,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule37,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere37,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(6.30, 20.30)
            )
        ),
        SubCategoryData( //38
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName38,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture38,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule38,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere38,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(7.00, 20.00)
            )
        ),
        SubCategoryData( //39
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName39,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture39,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule39,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere39,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(12.00, 21.30)
            )
        ),
        SubCategoryData( //40
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName40,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture40,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule40,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere40,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(14.00, 22.00)
            )
        ),
        SubCategoryData( //41
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName41,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture41,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule41,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere41,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(9.00, 21.00)
            )
        ),
        SubCategoryData( //42
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName42,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture42,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule42,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere42,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(18.00, 23.30), exceptionDay = listOf(0, 1, 2)
            )
        ),
        SubCategoryData( //43
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName43,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture43,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule43,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere43,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(9.00, 18.00)
            )
        ),
        SubCategoryData( //44
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName44,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture44,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule44,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere44,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(7.00, 21.00), exceptionDay = listOf(6)
            )
        ),
        SubCategoryData( //45
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName45,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture45,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule45,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere45,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(9.00, 19.00), exceptionDay = listOf(6)
            )
        ),
        SubCategoryData( //46
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName46,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture46,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule46,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere46,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(8.00, 14.00), exceptionDay = listOf(6)
            )
        ),
        SubCategoryData( //47
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName47,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture47,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule47,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere47,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 17:00",
                "17:00 - 21:30",
                "9:00 - 17:00",
                "9:00 - 17:00",
                "9:00 - 17:00",
                "9:00 - 17:00",
                "9:00 - 17:00",
            )
        ),
        SubCategoryData( //48
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName48,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture48,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule48,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere48,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                openTimeAndClose = Pair(14.00, 23.30), exceptionDay = listOf(6)
            )
        ),
        SubCategoryData( //49
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName49,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture49,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule49,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere49,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 20:00",
                "9:00 - 20:00",
                "9:00 - 20:00",
                "9:00 - 20:00",
                "9:00 - 20:00",
                "10:00 - 20:00",
                "10:00 - 20:00",
            )
        ),
        SubCategoryData(
            //50
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName50,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture30,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule50,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere50,
        )
    )

    private val restaurants = listOf(
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName1,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture1,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere1,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName2,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture2,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule2,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere2,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName3,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture3,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule3,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere3,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName4,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture4,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule4,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere4,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName5,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture5,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule5,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere5,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian
        ),

        )

    private val kidFriendlyPlaces = listOf(
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName7,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture1,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere1,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName8,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture1,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere1,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesSubCategoryName9,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture1,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere1,
        )
    )

    private val parks = listOf(
        SubCategoryData(
            subCategoryName = R.string.useForNoThing,
            subCategoryPicture = R.drawable.usefornothing
        )
    )

    private val shoppingCenters = listOf(
        SubCategoryData(
            subCategoryName = R.string.useForNoThing,
            subCategoryPicture = R.drawable.usefornothing
        )
    )

    val SubCategories = mapOf(
        MainCategories.GoodPlaces.Categories[0] to coffeeShops,

        MainCategories.GoodPlaces.Categories[1] to restaurants,

        MainCategories.GoodPlaces.Categories[2] to kidFriendlyPlaces,

        MainCategories.GoodPlaces.Categories[3] to parks,

        MainCategories.GoodPlaces.Categories[4] to shoppingCenters

    )
}

