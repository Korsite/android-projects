package com.example.reynosaapp.data.goodplaces

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.MainCategories
import com.example.reynosaapp.data.framework.SubCategoryData
import com.example.reynosaapp.data.framework.filters.ExtraCategoriesForGoodPlaces
import com.example.reynosaapp.data.returnAPairDataTypeAboutTheScheduleOfAShop

object GoodPlacesProviderSubCategories {

    private val coffeeShops = listOf(
        SubCategoryData(
            // 1
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName1,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture1,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule1,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere1,
            subCategoryCompleteSchedule =
            returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
            )
        ),

        SubCategoryData( // 2
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName2,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture2,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule2,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere2,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 20:00",
                null,
                "11:00 - 20:00",
                "11:00 - 20:00",
                "11:00 - 20:00",
                "15:00 - 21:00",
                "15:00 - 21:00",
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
                "7:00 - 22:00",
                "7:00 - 22:00",
                "7:00 - 22:00",
                "7:00 - 22:00",
                "7:00 - 22:00",
                "7:00 - 22:00",
                "7:00 - 22:00"
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
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00"
            )
        ),
        SubCategoryData( //8
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName8,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture8,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule8,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere8,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 18:00",
                "8:00 - 18:00",
                "8:00 - 18:00",
                "8:00 - 18:00",
                "8:00 - 18:00",
                "8:00 - 18:00",
                "8:00 - 18:00"
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
                "6:30 - 20:30",
                "6:30 - 20:30",
                "6:30 - 20:30",
                "6:30 - 20:30",
                "6:30 - 20:30",
                "6:30 - 20:30",
                "6:30 - 20:30"
            )
        ),
        SubCategoryData( //13
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName13,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture13,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule13,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere13,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:30 - 21:00",
                "12:30 - 21:00",
                "12:30 - 21:00",
                "12:30 - 21:00",
                "12:30 - 21:00",
                "12:30 - 21:00",
                "12:30 - 21:00"
            )
        ),
        SubCategoryData( //14
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName14,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture14,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule14,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere14,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "10:00 - 20:00",
                "10:00 - 20:00",
                "10:00 - 20:00",
                "10:00 - 20:00",
                "10:00 - 20:00",
                "10:00 - 20:00"
            )
        ),
        SubCategoryData( //15
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName15,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture15,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule15,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere15,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "6:00 - 22:00",
                "6:00 - 22:00",
                "6:00 - 22:00",
                "6:00 - 22:00",
                "6:00 - 22:00",
                "6:00 - 22:00",
                "6:00 - 22:00"
            )
        ),
        SubCategoryData( //16
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName16,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture16,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule16,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere16,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00"
            )
        ),
        SubCategoryData( //17
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName17,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture17,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule17,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere17,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "13:30 - 22:00",
                "13:30 - 22:00",
                "13:30 - 22:00",
                "13:30 - 22:00",
                "13:30 - 22:00",
                "13:30 - 22:00",
                "13:30 - 22:00"
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
                "7:00 - 20:30",
                "7:00 - 20:30",
                "7:00 - 20:30",
                "7:00 - 20:30",
                "7:00 - 20:30",
                "7:00 - 20:30",
                null
            )
        ),
        SubCategoryData( //20
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName20,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture20,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule20,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere20,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 17:00",
                "10:00 - 17:00",
                "10:00 - 17:00",
                "10:00 - 17:00",
                "10:00 - 17:00",
                null,
                null
            )
        ),
        SubCategoryData( //21
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName21,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture21,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule21,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere21,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00"
            )
        ),
        SubCategoryData( //22
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName22,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture22,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule22,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere22,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "13:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00"
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
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00"
            )
        ),
        SubCategoryData( //25
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName25,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture25,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule25,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere25,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00"
            )
        ),
        SubCategoryData( //26
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName26,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture26,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule26,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere26,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                null
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
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00",
                "8:00 - 20:00"
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
                "12:00 - 19:30",
                "12:00 - 19:30",
                "12:00 - 19:30",
                "12:00 - 19:30",
                "12:00 - 19:30",
                null,
                null
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
                null,
                "10:00 - 20:30",
                "10:00 - 20:30",
                "10:00 - 20:30",
                "10:00 - 20:30",
                "10:00 - 20:30",
                "10:00 - 20:30"
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
                null,
                "9:00 - 23:00",
                "9:00 - 23:00",
                "9:00 - 23:00",
                "9:00 - 23:00",
                "9:00 - 23:00",
                "9:00 - 23:00"
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
                "6:30 - 20:30",
                "6:30 - 20:30",
                "6:30 - 20:30",
                "6:30 - 20:30",
                "6:30 - 20:30",
                "6:30 - 20:30",
                "6:30 - 20:30"
            )
        ),
        SubCategoryData( //38
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName38,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture38,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule38,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere38,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 20:00",
                "7:00 - 20:00",
                "7:00 - 20:00",
                "7:00 - 20:00",
                "7:00 - 20:00",
                "7:00 - 20:00",
                "7:00 - 20:00"
            )
        ),
        SubCategoryData( //39
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName39,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture39,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule39,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere39,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30"
            )
        ),
        SubCategoryData( //40
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName40,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture40,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule40,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere40,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00"
            )
        ),
        SubCategoryData( //41
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName41,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture41,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule41,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere41,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00"
            )
        ),
        SubCategoryData( //42
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName42,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture42,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule42,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere42,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                null,
                "18:00 - 23:30",
                "18:00 - 23:30",
                "18:00 - 23:30",
                "18:00 - 23:30"
            )
        ),
        SubCategoryData( //43
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName43,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture43,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule43,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere43,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 18:00",
                "9:00 - 18:00",
                "9:00 - 18:00",
                "9:00 - 18:00",
                "9:00 - 18:00",
                "9:00 - 18:00",
                "9:00 - 18:00"
            )
        ),
        SubCategoryData( //44
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName44,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture44,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule44,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere44,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 21:00",
                "7:00 - 21:00",
                "7:00 - 21:00",
                "7:00 - 21:00",
                "7:00 - 21:00",
                "7:00 - 21:00",
                null
            )
        ),
        SubCategoryData( //45
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName45,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture45,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule45,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere45,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 19:00",
                "9:00 - 19:00",
                "9:00 - 19:00",
                "9:00 - 19:00",
                "9:00 - 19:00",
                "9:00 - 19:00",
                null
            )
        ),
        SubCategoryData( //46
            subCategoryName = R.string.goodPlacesCoffeeShopSubCategoryName46,
            subCategoryPicture = R.drawable.goodplacescoffeeshopsubcategorypicture46,
            subCategoryDaysShopOpened = R.string.goodPlacesCoffeeShopSubCategorySchedule46,
            subCategoryGoogleMaps = R.string.goodPlacesCoffeeShopSubCategoryClickHere46,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 14:00",
                "8:00 - 14:00",
                "8:00 - 14:00",
                "8:00 - 14:00",
                "8:00 - 14:00",
                "8:00 - 14:00",
                null
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
                "14:00 - 23:30",
                "14:00 - 23:30",
                "14:00 - 23:30",
                "14:00 - 23:30",
                "14:00 - 23:30",
                "14:00 - 23:30",
                null
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
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 23:00",
                "12:00 - 23:00",
                "12:00 - 23:00",
                "12:00 - 23:00",
                "12:00 - 23:00",
                "12:00 - 23:00",
                "12:00 - 23:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName2,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture2,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule2,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere2,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName3,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture3,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule3,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere3,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName4,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture4,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule4,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere4,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 23:30",
                "12:00 - 23:30",
                "12:00 - 23:30",
                "12:00 - 23:30",
                "12:00 - 23:30",
                "12:00 - 23:30",
                "13:00 - 23:30"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName5,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture5,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule5,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere5,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName6,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture6,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule6,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere6,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 17:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName7,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture7,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule7,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere7,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00",
                "12:00 - 21:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName8,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture8,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule8,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere8,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00",
                "8:00 - 23:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName9,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture9,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule9,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere9,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 22:00",
                "14:00 - 23:00",
                "14:00 - 23:00",
                "14:00 - 20:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName10,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture10,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule10,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere10,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 22:30",
                null,
                "11:00 - 22:30",
                "11:00 - 22:30",
                "11:00 - 22:30",
                "11:00 - 22:30",
                "11:00 - 21:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName11,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture11,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule11,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere11,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "13:30 - 21:30",
                "13:30 - 21:30",
                "13:30 - 21:30",
                "13:30 - 21:30",
                "13:30 - 21:30",
                "13:00 - 21:30",
                "13:00 - 21:30"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName12,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture12,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule12,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere12,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 22:00",
                "12:00 - 22:00",
                "12:00 - 22:00",
                "12:00 - 22:00",
                "12:00 - 22:00",
                "12:00 - 22:00",
                "12:00 - 22:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName13,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture13,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule13,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere13,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 19:00",
                "9:00 - 19:00",
                "9:00 - 19:00",
                "9:00 - 19:00",
                "9:00 - 19:00",
                "9:00 - 19:00",
                "9:00 - 19:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName14,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture14,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule14,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere14,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "13:00 - 23:00",
                "13:00 - 23:00",
                "13:00 - 23:00",
                "13:00 - 23:00",
                "13:00 - 23:00",
                "13:00 - 23:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName15,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture15,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule15,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere15,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "13:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName16,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture16,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule16,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere16,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName17,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture17,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule17,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere17,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 20:00",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30",
                "12:00 - 21:30"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName18,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture18,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule18,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere18,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                "12:00 - 18:00",
                "12:00 - 18:00",
                "12:00 - 18:00",
                "12:00 - 18:00",
                "12:00 - 18:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName19,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture19,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule19,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere19,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 23:00",
                "12:00 - 23:00",
                "12:00 - 23:00",
                "12:00 - 23:00",
                "12:00 - 23:59",
                "12:00 - 23:59",
                "12:00 - 23:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName20,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture20,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule20,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere20,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName21,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture21,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule21,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere21,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName22,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture22,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule22,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere22,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00",
                "11:00 - 22:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName23,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture23,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule23,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere23,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "12:30 - 20:00",
                "12:30 - 20:00",
                "12:30 - 20:30",
                "12:30 - 20:30",
                "12:30 - 20:30",
                "12:30 - 20:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName24,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture24,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule24,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere24,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 22:00",
                "10:00 - 22:00",
                "10:00 - 22:00",
                "10:00 - 22:00",
                "10:00 - 22:00",
                "10:00 - 22:00",
                "10:00 - 22:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName25,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture25,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule25,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere25,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName26,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture26,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule26,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere26,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName27,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture27,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule27,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere27,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                "10:00 - 17:00",
                "10:00 - 17:00",
                "10:00 - 17:00",
                "10:00 - 17:00",
                null
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName28,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture28,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule28,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere28,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 21:00",
                "11:00 - 21:00",
                "11:00 - 21:00",
                "11:00 - 21:00",
                "11:00 - 21:00",
                "11:00 - 22:00",
                "11:00 - 22:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName29,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture29,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule29,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere29,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Asian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                "13:00 - 23:00",
                "13:00 - 23:00",
                "13:00 - 23:59",
                "13:00 - 23:59",
                "13:00 - 23:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName30,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture30,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule30,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere30,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName31,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture31,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule31,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere31,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "17:30 - 1:00",
                "17:30 - 1:00",
                "17:30 - 1:00",
                null,
                null,
                "17:30 - 1:00",
                "17:30 - 1:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName32,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture32,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule32,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere32,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName33,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture33,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule33,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere33,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "5:00 - 23:00",
                "5:00 - 23:00",
                "5:00 - 23:00",
                "5:00 - 23:00",
                "5:00 - 23:00",
                "5:00 - 23:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName34,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture34,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule34,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere34,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                "20:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "18:00 - 23:59",
                "18:00 - 23:59"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName35,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture35,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule35,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere35,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "16:00 - 23:59",
                "16:00 - 23:59",
                "16:00 - 23:59",
                "16:00 - 23:59",
                "16:00 - 23:59",
                "16:00 - 23:59",
                "16:00 - 23:59"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName36,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture36,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule36,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere36,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 3:00",
                "18:00 - 3:00",
                "18:00 - 3:00",
                "18:00 - 3:00",
                "18:00 - 3:00",
                "18:00 - 3:00",
                "18:00 - 3:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName37,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture37,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule37,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere37,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "20:30 - 23:00",
                "20:30 - 23:00",
                "20:30 - 23:00",
                "20:30 - 23:00",
                "20:30 - 23:00",
                "20:30 - 23:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName38,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture38,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule38,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere38,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "15:00 - 22:00",
                "15:00 - 22:00",
                "15:00 - 22:00",
                "15:00 - 22:00",
                "15:00 - 22:00",
                "13:00 - 22:00",
                "13:00 - 22:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName39,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture39,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule39,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere39,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName40,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture40,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule40,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere40,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName41,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture41,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule41,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere41,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Argentinian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "17:00 - 22:30",
                "17:00 - 22:30",
                "17:00 - 22:30",
                "17:00 - 22:30",
                "17:00 - 22:30",
                "17:00 - 22:30"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName42,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture42,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule42,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere42,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName43,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture43,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule43,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere43,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName44,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture44,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule44,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere44,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 23:00",
                "18:00 - 23:00",
                "18:00 - 23:00",
                "18:00 - 23:00",
                "18:00 - 23:00",
                "18:00 - 23:00",
                "18:00 - 23:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName45,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture45,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule45,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere45,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 1:00",
                "18:00 - 1:00",
                "18:00 - 1:00",
                "18:00 - 1:00",
                "18:00 - 1:00",
                "18:00 - 1:00",
                "18:00 - 1:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName46,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture46,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule46,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere46,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName47,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture47,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule47,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere47,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                null,
                null,
                "18:00 - 1:00",
                "18:00 - 1:00",
                "18:00 - 1:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName48,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture48,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule48,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere48,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "17:00 - 1:00",
                "17:00 - 1:00",
                "17:00 - 1:00",
                "17:00 - 1:00",
                "17:00 - 1:00",
                "17:00 - 1:00"
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName49,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture49,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule49,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere49,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "17:30 - 23:00",
                "17:30 - 23:00",
                "17:30 - 23:00",
                "17:30 - 23:00",
                "17:30 - 23:00",
                "17:30 - 23:00",
                "17:30 - 23:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName50,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture50,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule50,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere50,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "17:30 - 23:59",
                "17:30 - 23:59",
                "17:30 - 23:59",
                "17:30 - 23:59",
                "17:30 - 23:59",
                null
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName51,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture51,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule51,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere51,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName52,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture52,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule52,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere52,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                "18:00 - 23:30",
                "18:00 - 23:30",
                "18:00 - 23:30",
                "18:00 - 23:30",
                "18:00 - 23:30",
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName53,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture53,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule53,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere53,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "16:00 - 23:59",
                "16:00 - 23:59",
                "16:00 - 23:59",
                "16:00 - 23:59",
                "16:00 - 23:59",
                "16:00 - 23:59",
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName54,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture54,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule54,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere54,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName55,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture55,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule55,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere55,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                null,
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                null
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName56,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture56,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule56,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere56,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "20:00 - 2:00",
                "20:00 - 2:00",
                "20:00 - 2:00",
                "20:00 - 2:00",
                "20:00 - 2:00",
                "18:00 - 2:00",
                "18:00 - 2:00"
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName57,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture57,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule57,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere57,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 17:00",
                null,
                null,
                null,
                "20:00 - 23:59",
                "20:00 - 23:59",
                "20:00 - 23:59"
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName58,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture58,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule58,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere58,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 1:00",
                "19:00 - 1:00",
                null,
                "19:00 - 1:00",
                "19:00 - 1:00",
                "19:00 - 1:00",
                "19:00 - 1:00"
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName59,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture59,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule59,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere59,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:30 -23:00",
                "19:30 -23:00",
                "19:30 -23:00",
                "19:30 -23:00",
                "19:30 -23:00",
                "19:30 -23:00",
                "19:30 -23:00",
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName60,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture60,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule60,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere60,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName61,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture61,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule61,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere61,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName62,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture62,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule62,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere62,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName63,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture63,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule63,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere63,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName64,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture64,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule64,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere64,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00",
                "9:00 - 21:00"
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName65,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture65,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule65,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere65,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                null,
                "18:00 - 23:59",
                "18:00 - 23:59",
                "18:00 - 23:59",
                "18:00 - 23:59"
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName66,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture66,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule66,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere66,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                null,
                "17:00 - 23:00",
                "17:00 - 23:00",
                "17:00 - 23:00",
                "17:00 - 23:00"

            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName67,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture67,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule67,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere67,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                "16:30 - 23:30",
                "16:30 - 23:30",
                "16:30 - 23:30",
                "16:30 - 23:30",
                "16:30 - 23:30",
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName68,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture68,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule68,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere68,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "13:00 - 23:00",
                "13:00 - 23:00",
                "13:00 - 23:00",
                "13:00 - 23:00",
                "13:00 - 23:00",
                null,
                "13:00 - 23:00",
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName69,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture69,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule69,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere69,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName70,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture70,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule70,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere70,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName71,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture71,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule71,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere71,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName72,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture72,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule72,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere72,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName73,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture73,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule73,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere73,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 1:00",
                "18:00 - 1:00",
                null,
                "18:00 - 1:00",
                "18:00 - 1:00",
                "18:00 - 1:00",
                "18:00 - 1:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName74,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture74,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule74,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere74,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                null,
                null,
                "0:00 - 23:59",
                "0:00 - 23:59",
                "0:00 - 23:59",
            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName75,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture75,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule75,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere75,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:30 - 23:59",
                "19:30 - 23:59",
                null,
                "19:30 - 23:59",
                "19:30 - 23:59",
                "19:30 - 23:59",
                "19:30 - 23:59",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName76,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture76,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule76,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere76,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 23:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName77,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture77,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule77,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere77,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName78,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture78,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule78,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere78,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 23:59",
                "18:00 - 23:59",
                "18:00 - 23:59",
                "18:00 - 23:59",
                "18:00 - 23:59",
                "18:00 - 23:59",
                "18:00 - 23:59",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName79,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture79,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule79,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere79,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName80,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture80,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule80,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere80,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 22:00",
                null,
                null,
                "7:00 - 11:00",
                "7:00 - 22:00",
                "7:00 - 11:00",
                "7:00 - 11:00"

            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName81,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture81,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule81,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere81,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 20:00",
                "12:00 - 20:00",
                "12:00 - 20:00",
                "12:00 - 20:00",
                "12:00 - 20:00",
                "12:00 - 20:00",
                "12:00 - 20:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName82,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture82,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule82,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere82,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName83,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture83,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule83,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere83,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName84,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture84,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule84,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere84,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                null,
                null,
                "17:30 - 23:59",
                "17:30 - 23:59",
                "17:30 - 23:59",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName85,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture85,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule85,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere85,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",

                )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName86,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture86,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule86,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere86,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "18:00 - 22:00",
                "18:00 - 22:00",
                "18:00 - 22:00",
                "18:00 - 22:00",
                "18:00 - 22:00",
                null,

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName87,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture87,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule87,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere87,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName88,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture88,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule88,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere88,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                null,
                "19:30 - 11:00",
                "19:30 - 11:00",
                "19:30 - 11:00",
                "19:30 - 11:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName89,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture89,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule89,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere89,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName90,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture90,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule90,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere90,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "3:00 - 8:00", "3:00 - 8:00", "3:00 - 8:00", null, null, null,

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName91,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture91,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule91,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere91,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                "18:00 - 0:30",
                "18:00 - 0:30",
                "18:00 - 0:30",
                "18:00 - 0:30",
                "18:00 - 0:30",
                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName92,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture92,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule92,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere92,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "19:00 - 23:00",
                "19:00 - 23:00",
                "19:00 - 1:00",
                "19:00 - 1:00",
                "19:00 - 1:00",
                "19:00 - 23:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName93,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture93,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule93,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere93,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                "16:00 - 23:00",
                "16:00 - 23:00",
                "16:00 - 23:00",
                "16:00 - 23:00",
                "16:00 - 23:00",
                "16:00 - 23:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName94,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture94,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule94,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere94,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 21:00",
                "8:00 - 21:00",
                "8:00 - 21:00",
                "8:00 - 21:00",
                "8:00 - 21:00",
                "8:00 - 21:00",
                "8:00 - 21:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName95,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture95,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule95,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere95,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "20:30 - 23:59",
                "20:30 - 23:59",
                "20:30 - 23:59",
                "20:30 - 23:59",
                "20:30 - 23:59",
                "20:30 - 23:59",
                "20:30 - 23:59",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName96,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture96,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule96,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere96,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "17:00 - 23:59",
                "17:00 - 23:59",
                "0:00 - 23:59",
                "17:00 - 23:59",
                "17:00 - 0:30",
                "17:00 - 23:59",
                "17:00 - 23:59",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName97,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture97,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule97,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere97,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                null,
                "18:00 - 23:59",
                "18:00 - 23:59",
                "18:00 - 23:59",
                "18:00 - 23:59",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName98,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture98,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule98,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere98,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 23:45",
                "18:00 - 23:45",
                "18:00 - 23:45",
                "18:00 - 23:45",
                "18:00 - 23:45",
                "18:00 - 23:45",
                "18:00 - 23:45",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName99,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture99,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule99,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere99,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 2:00",
                "18:00 - 2:00",
                "18:00 - 2:00",
                "18:00 - 2:00",
                "18:00 - 2:00",
                "18:00 - 2:00",
                "18:00 - 2:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName100,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture100,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule100,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere100,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",
                "9:00 - 22:00",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName101,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture101,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule101,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere101,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null,
                null,
                "18:00 - 23:00",
                "18:00 - 23:00",
                "18:00 - 23:00",
                "18:00 - 23:00",
                null,

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName102,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture102,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule102,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere102,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName103,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture103,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule103,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere103,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName104,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture104,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule104,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere104,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 23:59",
                null,
                null,
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",
                "19:00 - 23:59",

                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName105,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture105,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule105,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere105,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "19:00 - 1:00", "19:00 - 1:00", "19:00 - 1:00", "19:00 - 1:00"
                )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName106,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture106,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule106,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere106,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName107,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture107,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule107,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere107,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, null, "18:00 - 22:00", "18:00 - 22:00", "18:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName108,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture108,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule108,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere108,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 1:30", "7:00 - 1:30", "7:00 - 1:30", "7:00 - 1:30", "7:00 - 1:30", "7:00 - 1:30", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName109,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture109,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule109,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere109,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "19:00 - 23:30", "19:00 - 23:30", "19:00 - 23:30", "19:00 - 23:30", "19:00 - 23:30", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName110,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture110,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule110,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere110,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName111,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture111,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule111,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere111,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, null, "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59",
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName112,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture112,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule112,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere112,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, null, "19:00 - 1:00", "19:00 - 1:00", "19:00 - 23:30",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName113,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture113,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule113,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere113,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName114,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture114,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule114,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere114,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "17:30 - 23:30", null, "17:30 - 23:30", "17:30 - 23:30", "17:30 - 23:30", "17:30 - 23:30", "17:30 - 23:30",

            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName115,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture115,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule115,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere115,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "19:00 - 23:00", "19:00 - 23:00", "19:00 - 23:00", "19:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName116,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture116,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule116,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere116,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName117,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture117,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule117,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere117,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:30 - 0:30", "18:30 - 0:30", "18:30 - 0:30", "18:30 - 0:30", "18:30 - 0:30", "18:30 - 0:30", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName118,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture118,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule118,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere118,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName119,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture119,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule119,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere119,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59",
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName120,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture120,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule120,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere120,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 21:00", "8:00 - 21:00", "8:00 - 21:00", "8:00 - 21:00", "8:00 - 21:00", "8:00 - 21:00", "8:00 - 21:00",
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName121,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture121,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule121,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere121,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, null, "19:30 - 22:30", "19:00 - 22:00", "19:00 - 22:00",
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName122,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture122,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule122,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere122,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "0:00 - 23:59", null, null, "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName123,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture123,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule123,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere123,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "15:30 - 23:00", null, "15:30 - 23:00", "15:30 - 23:00", "15:30 - 23:30", "15:30 - 23:30", "15:30 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName124,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture124,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule124,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere124,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName125,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture125,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule125,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere125,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Burger,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00",

            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName126,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture126,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule126,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere126,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 20:15", "12:00 - 20:15", "12:00 - 20:15", "12:00 - 20:15", "12:00 - 20:15", "12:00 - 20:15", "12:00 - 20:15",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName127,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture127,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule127,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere127,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "14:00 - 22:30", "14:00 - 22:30", "14:00 - 22:30", "14:00 - 22:30", "14:00 - 22:30", "14:00 - 22:30", "14:00 - 22:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName128,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture128,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule128,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere128,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName129,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture129,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule129,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere129,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "14:00 - 21:30", "14:00 - 21:30", "14:00 - 21:30", "14:00 - 21:30", "14:00 - 21:30", "14:00 - 21:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName130,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture130,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule130,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere130,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 23:00", "12:00 - 23:00", "12:00 - 23:00", "12:00 - 23:00", "12:00 - 23:00", "12:00 - 23:00", "12:00 - 23:00"
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName131,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture131,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule131,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere131,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "12:30 - 22:00", "12:30 - 22:00", "12:30 - 22:00", "12:30 - 22:00", "12:30 - 22:00", "12:30 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName132,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture132,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule132,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere132,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName133,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture133,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule133,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere133,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", null,

                )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName134,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture134,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule134,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere134,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName135,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture135,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule135,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere135,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "13:00 - 23:59", "13:00 - 23:59", "13:00 - 23:59", "13:00 - 23:59", "13:00 - 23:59", "13:00 - 23:59", "13:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName136,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture136,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule136,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere136,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Italian,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00",

            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName137,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture137,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule137,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere137,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Japanese,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName138,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture138,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule138,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere138,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Japanese,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName139,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture139,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule139,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere139,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Japanese,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00",

                )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName140,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture140,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule140,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere140,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Japanese,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "13:00 - 22:00", "13:00 - 22:00", "13:00 - 22:00", "13:00 - 22:00", "13:00 - 22:00", "13:00 - 22:00", "13:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName141,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture141,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule141,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere141,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Japanese,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:30 - 21:20", "12:30 - 21:20", "12:30 - 21:20", "12:30 - 21:20", "12:30 - 21:20", "12:30 - 21:30", "13:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName142,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture142,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule142,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere142,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Japanese,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName143,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture143,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule143,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere143,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Japanese,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName144,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture144,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule144,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere144,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Japanese,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 21:00", "12:00 - 21:00", "12:00 - 21:00", "12:00 - 21:00", "12:30 - 22:00", "12:30 - 22:00", "12:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName145,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture145,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule145,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere145,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Japanese,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 21:00", "12:00 - 21:00", "12:00 - 21:00", "12:00 - 21:00", "12:00 - 21:00", "12:00 - 21:00", "13:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName146,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture146,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule146,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere146,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Japanese,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, "14:00 - 21:30", "14:00 - 21:30", "14:00 - 21:30", "14:00 - 21:30", "14:00 - 21:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName147,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture147,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule147,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere147,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:30 - 17:00", "7:30 - 17:00", "7:30 - 17:00", "7:30 - 17:00", "7:30 - 17:00", "7:30 - 17:00", "8:00 - 17:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName148,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture148,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule148,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere148,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName149,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture149,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule149,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere149,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName150,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture150,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule150,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere150,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 15:00", "10:00 - 17:00", "10:00 - 17:00", "10:00 - 17:00", "10:00 - 17:00", "10:00 - 17:00", "13:00 - 15:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName151,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture151,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule151,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere151,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName152,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture152,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule152,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere152,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 17:00", "10:00 - 17:00", "12:00 - 17:00", "12:00 - 17:00", "12:00 - 17:00", "12:00 - 17:00", "10:00 - 16:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName153,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture153,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule153,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere153,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "14:00 - 11:00", "14:00 - 11:00", "14:00 - 11:00", "14:00 - 11:00", "14:00 - 11:00", "14:00 - 11:00", "14:00 - 11:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName154,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture154,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule154,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere154,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00",

            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName155,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture155,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule155,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere155,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "16:00 - 23:00", "16:00 - 23:00", "16:00 - 23:00", "16:00 - 23:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName156,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture156,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule156,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere156,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName157,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture157,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule157,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere157,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "8:00 - 15:00", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName158,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture158,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule158,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere158,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 17:00", "7:00 - 17:00", "7:00 - 17:00", "7:00 - 17:00", "7:00 - 17:00", "7:00 - 17:00", "7:00 - 17:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName159,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture159,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule159,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere159,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName160,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture160,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule160,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere160,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "6:30 - 17:00", "6:30 - 17:00", "6:30 - 17:00", "6:30 - 17:00", "6:30 - 17:00", "6:30 - 17:00", null
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName161,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture161,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule161,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere161,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName162,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture162,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule162,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere162,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:30 - 17:00", "8:30 - 17:00", "8:30 - 17:00", "8:30 - 17:00", "8:30 - 17:00", "8:30 - 17:00", "8:30 - 17:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName163,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture163,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule163,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere163,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 23:30", "8:00 - 23:30", "8:00 - 23:30", "8:00 - 23:30", "8:00 - 23:30", "8:00 - 23:30", "8:00 - 23:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName164,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture164,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule164,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere164,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName165,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture165,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule165,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere165,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName166,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture166,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule166,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere166,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:30 - 23:00", "18:30 - 23:00", "18:30 - 23:00", "18:30 - 23:00", "18:30 - 23:00", "18:30 - 23:00", "18:30 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName167,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture167,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule167,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere167,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName168,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture168,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule168,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere168,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "6:00 - 15:00", "6:00 - 15:00", "6:00 - 15:00", "6:00 - 15:00", "6:00 - 15:00", null, "6:00 - 15:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName169,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture169,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule169,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere169,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 15:00", "7:00 - 15:00", "7:00 - 15:00", "7:00 - 15:00", "7:00 - 15:00", "7:00 - 15:00", "7:00 - 15:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName170,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture170,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule170,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere170,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "7:30 - 15:00", "7:30 - 15:00", "7:30 - 15:00", "7:30 - 15:00", "7:30 - 15:00", "7:00 - 15:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName171,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture171,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule171,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere171,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName172,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture172,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule172,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere172,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 14:00", "8:00 - 14:00", "8:00 - 14:00", "8:00 - 14:00", "8:00 - 14:00", "8:00 - 12:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName173,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture173,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule173,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere173,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName174,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture174,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule174,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere174,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, null, null, "8:00 - 14:00", "8:00 - 14:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName175,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture175,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule175,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere175,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 18:00", "8:00 - 18:00", "8:00 - 18:00", "8:00 - 18:00", "8:00 - 18:00", "8:00 - 18:00", "8:00 - 18:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName176,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture176,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule176,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere176,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, "6:30 - 11:30", "6:30 - 11:30", "6:30 - 11:30", "6:30 - 11:30", "6:30 - 11:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName177,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture177,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule177,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere177,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "8:00 - 14:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName178,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture178,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule178,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere178,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:30 - 15:00", "7:30 - 15:00", "7:30 - 15:00", "7:30 - 15:00", "7:30 - 15:00", "7:30 - 15:00", "7:30 - 15:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName179,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture179,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule179,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere179,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:30 - 14:30", "7:30 - 14:30", "7:30 - 14:30", "7:30 - 14:30", "7:30 - 14:30", "7:30 - 14:30", "7:30 - 14:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName180,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture180,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule180,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere180,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName181,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture181,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule181,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere181,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "9:00 - 22:00", "7:00 - 22:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName182,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture182,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule182,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere182,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName183,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture183,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule183,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere183,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 23:59", "12:00 - 23:59", "12:00 - 23:59", "12:00 - 23:59", "12:00 - 23:59", "12:00 - 23:59", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName184,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture184,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule184,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere184,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName185,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture185,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule185,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere185,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName186,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture186,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule186,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere186,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName187,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture187,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule187,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere187,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 17:00", "9:00 - 17:00", "9:00 - 17:00", "9:00 - 17:00", "9:00 - 17:00", "9:00 - 17:00", null,

            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName188,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture188,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule188,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere188,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName189,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture189,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule189,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere189,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 13:00", "7:00 - 13:00", "7:00 - 13:00", "7:00 - 13:00", "7:00 - 13:00", "7:00 - 13:00", "7:00 - 13:00",
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName190,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture190,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule190,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere190,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:30 - 17:00", "7:30 - 17:00", "7:30 - 17:00", "7:30 - 17:00", "7:30 - 17:00", "7:30 - 17:00", "7:30 - 17:00"
            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName191,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture191,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule191,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere191,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "12:30 - 21:30", "12:30 - 21:30", "12:30 - 21:30", "12:30 - 21:30", "12:30 - 21:30", "10:30 - 17:30",

            )
        ),
        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName192,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture192,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule192,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere192,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 19:00", "7:00 - 19:00", "7:00 - 19:00", "7:00 - 19:00", "7:00 - 19:00", "7:00 - 19:00", "7:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName193,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture193,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule193,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere193,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:30 - 14:00", "7:30 - 14:00", "7:30 - 14:00", "7:30 - 14:00", "7:30 - 14:00", "7:30 - 14:00", "7:30 - 14:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName194,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture194,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule194,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere194,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,

        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName195,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture195,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule195,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere195,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 21:00", "7:00 - 21:00", "7:00 - 21:00", "7:00 - 21:00", "7:00 - 21:00", "7:00 - 21:00", "7:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName196,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture196,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule196,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere196,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "4:00 - 15:00", "4:00 - 15:00", "4:00 - 15:00", "4:00 - 15:00", "4:00 - 15:00", "4:00 - 15:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName197,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture197,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule197,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere197,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName198,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture198,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule198,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere198,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "18:00 - 23:30", "18:00 - 23:45", "18:00 - 23:45", "18:00 - 23:45", "18:00 - 23:45", "12:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName199,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture199,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule199,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere199,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName200,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture200,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule200,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere200,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 9:50", "7:00 - 9:50", "7:00 - 9:50", "7:00 - 9:50", "7:00 - 9:50", "7:00 - 9:50", "7:00 - 9:50",
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName201,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture201,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule201,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere201,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName202,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture202,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule202,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere202,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName203,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture203,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule203,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere203,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName204,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture204,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule204,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere204,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName205,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture205,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule205,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere205,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName206,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture206,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule206,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere206,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName207,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture207,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule207,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere207,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 22:20", "18:00 - 22:20", "18:00 - 22:20", "18:00 - 22:20", "18:00 - 22:20", "18:00 - 22:20", "18:00 - 22:20",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName208,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture208,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule208,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere208,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "20:00 - 23:59", "20:00 - 23:59", "20:00 - 23:59", "20:00 - 23:59", "20:00 - 23:59", "20:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName209,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture209,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule209,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere209,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", null, null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName210,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture210,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule210,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere210,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, null, "8:00 - 20:30", "8:00 - 23:00", "8:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName211,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture211,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule211,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere211,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName212,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture212,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule212,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere212,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "7:00 - 23:30", "7:00 - 23:30", "7:00 - 23:30", "7:00 - 23:30", "7:00 - 23:30", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName213,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture213,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule213,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere213,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName214,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture214,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule214,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere214,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,

        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName215,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture215,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule215,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere215,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "6:30 - 17:00", "6:30 - 17:00", "6:30 - 17:00", "6:30 - 17:00", "6:30 - 17:00", "6:30 - 17:00", "6:30 - 17:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName216,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture216,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule216,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere216,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "18:00 - 2:00", "18:00 - 2:00", "18:00 - 2:00", "18:00 - 2:00", "18:00 - 2:00", "18:00 - 2:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName217,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture217,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule217,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere217,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 22:00", "8:00 - 22:00", null, "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName218,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture218,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule218,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere218,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName219,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture219,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule219,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere219,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "8:00 - 17:00", "7:00 - 15:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName220,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture220,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule220,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere220,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 16:00", "8:00 - 16:00", "8:00 - 16:00", "8:00 - 16:00", "8:00 - 16:00", "8:00 - 16:00", "8:00 - 16:00",
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName221,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture221,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule221,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere221,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00",
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName222,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture222,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule222,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere222,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 23:59", "18:00 - 23:59", null, "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName223,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture223,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule223,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere223,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName224,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture224,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule224,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere224,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 17:00", "10:00 - 17:00", "10:00 - 17:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "10:00 - 14:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName225,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture225,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule225,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere225,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 14:00", "9:00 - 14:00", "9:00 - 14:00", "9:00 - 14:00", "9:00 - 14:00", null, null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName226,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture226,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule226,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere226,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, null, null, null, "7:00 - 16:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName227,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture227,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule227,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere227,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 13:00", "7:00 - 13:00", "7:00 - 13:00", "7:00 - 13:00", "7:00 - 13:00", "7:00 - 13:00", null,
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName228,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture228,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule228,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere228,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName229,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture229,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule229,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere229,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:30 - 1:30", "19:30 - 1:30", "19:30 - 1:30", "21:30 - 1:30", "19:30 - 1:30", "19:30 - 1:30", "19:30 - 1:30",
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName230,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture230,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule230,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere230,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00"
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName231,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture231,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule231,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere231,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName232,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture232,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule232,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere232,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "6:00 - 23:59", "6:00 - 23:59", "6:00 - 23:59", "6:00 - 23:59", "6:00 - 23:59", "6:00 - 23:59", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName233,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture233,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule233,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere233,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 15:00", "8:00 - 15:00", "8:00 - 15:00", "8:00 - 15:00", "8:00 - 15:00", "8:00 - 15:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName234,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture234,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule234,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere234,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName235,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture235,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule235,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere235,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName236,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture236,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule236,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere236,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:30 - 1:00", null, "18:30 - 1:00", "18:30 - 1:00", "18:30 - 1:00", "18:30 - 1:00", "18:30 - 1:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName237,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture237,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule237,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere237,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "6:00 - 11:00", "6:00 - 11:00", "6:00 - 11:00", "6:00 - 11:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName238,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture238,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule238,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere238,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName239,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture239,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule239,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere239,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "17:00 - 1:00", "17:00 - 1:00", null, "17:00 - 1:00", "17:00 - 1:00", "17:00 - 1:00", "17:00 - 1:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName240,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture240,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule240,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere240,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Mexican,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "6:00 - 22:30", "6:00 - 22:30", "6:00 - 22:30", "6:00 - 22:30", "6:00 - 22:30", "6:00 - 22:30", "6:00 - 22:30",

            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName241,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture241,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule241,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere241,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "15:00 - 23:00", null, "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName242,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture242,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule242,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere242,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "13:00 - 23:00", "13:00 - 23:00", "13:00 - 23:00", "13:00 - 23:00", "13:00 - 23:00", "13:00 - 23:00", "13:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName243,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture243,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule243,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere243,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 21:30", "10:00 - 21:30", "10:00 - 21:30", "10:00 - 21:30", "10:00 - 21:30", "10:00 - 21:30", "10:00 - 21:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName244,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture244,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule244,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere244,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName245,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture245,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule245,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere245,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00", "12:00 - 22:00",
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName246,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture246,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule246,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere246,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName247,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture247,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule247,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere247,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName248,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture248,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule248,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere248,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 22:45", "9:00 - 22:45", "9:00 - 22:00", "9:00 - 22:00", "9:00 - 22:00", "10:00 - 22:45", "9:00 - 21:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName249,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture249,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule249,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere249,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName250,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture250,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule250,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere250,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName251,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture251,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule251,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere251,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 22:00", "9:00 - 22:00", "9:00 - 22:00", "9:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName252,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture252,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule252,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere252,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName253,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture253,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule253,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere253,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "13:00 - 1:00", "13:00 - 1:00", "13:00 - 1:00", "13:00 - 1:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName254,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture254,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule254,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere254,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:30 - 20:00", "10:30 - 20:00", "10:30 - 20:00", "10:30 - 20:00", "10:30 - 20:00", "10:30 - 20:00", "10:30 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName255,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture255,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule255,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere255,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 22:30", null, "11:00 - 22:30", "11:00 - 22:30", "11:00 - 22:30", "11:00 - 22:30", "11:00 - 22:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName256,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture256,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule256,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere256,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName257,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture257,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule257,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere257,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName258,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture258,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule258,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere258,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00", "11:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName259,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture259,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule259,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere259,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "13:00 - 22:00", "13:00 - 22:00", "13:00 - 22:00", "13:00 - 22:00", "13:00 - 22:00", "13:00 - 22:00", "13:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName260,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture260,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule260,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere260,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName261,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture261,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule261,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere261,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "10:00 - 20:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "9:00 - 18:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName262,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture262,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule262,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere262,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName263,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture263,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule263,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere263,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 23:00", "11:00 - 23:00", "9:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "10:00 - 20:30", "10:00 - 20:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName264,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture264,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule264,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere264,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName265,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture265,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule265,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere265,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00", "15:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName266,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture266,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule266,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere266,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName267,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture267,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule267,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere267,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName268,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture268,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule268,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere268,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName269,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture269,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule269,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere269,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 21:15", "10:00 - 21:15", "10:00 - 21:15", "10:00 - 21:15", "10:00 - 21:15", "10:00 - 21:15", "10:00 - 21:15",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName270,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture270,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule270,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere270,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00"
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName271,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture271,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule271,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere271,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 21:00", "10:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName272,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture272,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule272,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere272,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00", "10:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName273,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture273,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule273,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere273,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Pizza,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00", "11:00 - 21:00",

            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName274,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture274,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule274,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere274,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName275,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture275,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule275,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere275,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName276,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture276,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule276,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere276,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName277,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture277,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule277,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere277,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName278,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture278,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule278,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere278,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName279,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture279,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule279,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere279,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName280,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture280,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule280,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere280,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 22:00", "9:00 - 20:15",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName281,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture281,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule281,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere281,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 19:00", null, "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName282,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture282,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule282,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere282,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 17:00", null, null, null, null, null, null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName283,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture283,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule283,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere283,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName284,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture284,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule284,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere284,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName285,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture285,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule285,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere285,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 23:00", null, "10:00 - 23:00", "10:00 - 23:00", "10:00 - 23:00", "10:00 - 23:00", "10:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName286,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture286,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule286,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere286,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 17:00", "10:00 - 17:00", "10:00 - 17:00", "10:00 - 17:00", "10:00 - 17:00", "10:00 - 17:00", "10:00 - 17:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName287,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture287,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule287,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere287,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "11:00 - 19:40", "11:00 - 19:40", "11:00 - 19:40", "11:00 - 19:40", "11:00 - 19:40", "11:00 - 19:40",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName288,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture288,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule288,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere288,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName289,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture289,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule289,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere289,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName290,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture290,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule290,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere290,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName291,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture291,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule291,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere291,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 18:00", "11:00 - 18:00", "11:00 - 18:00", "11:00 - 18:00", "11:00 - 18:00", "11:00 - 18:00", "11:00 - 18:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName292,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture292,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule292,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere292,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00", "9:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName293,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture293,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule293,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere293,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 17:35", "9:00 - 17:35", "9:00 - 17:35", "9:00 - 17:35", "9:00 - 17:35", "9:00 - 17:35", "9:00 - 17:35",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName294,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture294,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule294,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere294,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName295,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture295,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule295,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere295,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00", "8:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName296,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture296,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule296,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere296,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:30", "10:00 - 19:30", "10:00 - 19:30", "10:00 - 19:30", "10:00 - 19:30", "10:00 - 19:30", "10:00 - 19:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName297,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture297,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule297,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere297,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName298,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture298,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule298,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere298,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName299,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture299,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule299,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere299,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName300,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture300,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule300,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere300,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 18:00", "7:00 - 18:00", "7:00 - 18:00", "7:00 - 18:00", "7:00 - 18:00", "7:00 - 18:00", "7:00 - 18:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName301,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture301,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule301,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere301,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName302,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture302,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule302,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere302,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:30", "10:00 - 19:30", "10:00 - 19:30", "10:00 - 19:30", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 19:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName303,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture303,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule303,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere303,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName304,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture304,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule304,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere304,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName305,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture305,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule305,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere305,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 19:30", "9:00 - 19:30", "9:00 - 19:30", "9:00 - 19:30", "9:00 - 19:30", "9:00 - 19:30", "9:00 - 19:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName306,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture306,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule306,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere306,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:00", null, "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 17:30", "10:00 - 17:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName307,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture307,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule307,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere307,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName308,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture308,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule308,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere308,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", null, "10:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName309,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture309,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule309,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere309,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName310,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture310,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule310,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere310,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00", "9:00 - 19:00"
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName311,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture311,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule311,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere311,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName312,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture312,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule312,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere312,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 19:00", "8:00 - 19:00", "8:00 - 19:00", "8:00 - 19:00", "8:00 - 19:00", "8:00 - 19:00", "8:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName313,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture313,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule313,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere313,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 18:00", "9:00 - 18:00", "9:00 - 18:00", "9:00 - 18:00", "9:00 - 18:00", "9:00 - 13:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName314,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture314,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule314,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere314,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 20:00", "8:00 - 20:00", "8:00 - 20:00", "8:00 - 20:00", "8:00 - 20:00", "8:00 - 20:00", "8:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName315,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture315,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule315,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere315,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName316,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture316,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule316,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere316,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 20:00", "8:00 - 20:00", "8:00 - 20:00", "8:00 - 20:00", "8:00 - 20:00", "8:00 - 20:00", "8:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName317,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture317,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule317,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere317,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 17:30", "10:00 - 17:30", null, "10:00 - 17:30", "10:00 - 17:30", "10:00 - 17:30", "10:00 - 17:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName318,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture318,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule318,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere318,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName319,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture319,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule319,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere319,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 18:00", "9:00 - 18:00", "9:00 - 18:00", "9:00 - 18:00", "9:00 - 18:00", "9:00 - 18:00", "9:00 - 18:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName320,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture320,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule320,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere320,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName321,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture321,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule321,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere321,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Shellfish,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00", "10:00 - 19:00",

            )
        ),

        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName322,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture322,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule322,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere322,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 13:00", "8:00 - 13:00", "8:00 - 13:00", "8:00 - 13:00", "8:00 - 13:00", "8:00 - 13:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName323,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture323,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule323,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere323,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName324,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture324,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule324,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere324,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "17:30 - 23:00", "17:30 - 23:00", "17:30 - 23:00", "17:30 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName325,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture325,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule325,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere325,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName326,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture326,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule326,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere326,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:0 - 23:59", null, "19:0 - 23:59", "19:0 - 23:59", "19:0 - 23:59", "19:0 - 23:59", "19:0 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName327,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture327,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule327,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere327,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName328,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture328,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule328,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere328,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59", "0:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName329,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture329,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule329,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere329,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 16:00", "8:00 - 16:00", "8:00 - 16:00", "8:00 - 16:00", "8:00 - 16:00", "8:00 - 16:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName330,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture330,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule330,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere330,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "10:00 - 16:00", "10:00 - 16:00", "10:00 - 16:00", "10:00 - 16:00", "10:00 - 16:00", "10:00 - 16:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName331,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture331,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule331,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere331,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 23:59", null, null, "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName332,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture332,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule332,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere332,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "17:00 - 23:59", "17:00 - 23:59", "17:00 - 23:59", "17:00 - 23:59", "17:00 - 23:59", "17:00 - 23:59", "17:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName333,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture333,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule333,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere333,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "9:00 - 17:00", "9:00 - 17:00", "9:00 - 17:00", "9:00 - 17:00", "9:00 - 17:00", "9:00 - 17:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName334,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture334,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule334,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere334,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "15:00 - 1:00", "15:00 - 1:00", null, "15:00 - 1:00", "15:00 - 1:00", "15:00 - 1:00", "15:00 - 1:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName335,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture335,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule335,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere335,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName336,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture336,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule336,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere336,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "20:00 - 1:00", "20:00 - 1:00", "20:00 - 1:00", "20:00 - 1:00", "20:00 - 1:00", "20:00 - 1:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName337,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture337,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule337,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere337,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 23:00", "7:00 - 23:00", "7:00 - 23:00", "7:00 - 23:00", "7:00 - 23:00", "7:00 - 23:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName338,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture338,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule338,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere338,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName339,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture339,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule339,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere339,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, null, "19:00 - 22:00", "20:00 - 22:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName340,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture340,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule340,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere340,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName341,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture341,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule341,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere341,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "17:30 - 23:59", "17:30 - 23:59", "17:30 - 23:59", "17:30 - 23:59", "17:30 - 23:59", "17:30 - 23:59", "17:30 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName342,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture342,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule342,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere342,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "6:30 - 13:30", "6:30 - 13:30", "6:30 - 13:30", "6:30 - 13:30", "6:30 - 13:30", "6:30 - 13:30", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName343,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture343,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule343,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere343,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName344,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture344,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule344,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere344,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName345,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture345,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule345,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere345,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName346,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture346,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule346,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere346,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName347,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture347,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule347,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere347,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName348,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture348,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule348,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere348,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName349,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture349,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule349,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere349,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "8:30 - 23:59", "8:30 - 23:59", "8:30 - 23:59", "8:30 - 1:00", "8:30 - 1:00", "8:30 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName350,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture350,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule350,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere350,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName351,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture351,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule351,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere351,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 15:00", "8:00 - 15:00", "8:00 - 15:00", "8:00 - 15:00", "8:00 - 15:00", null, null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName352,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture352,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule352,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere352,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "8:00 - 23:00", "7:00 - 22:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName353,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture353,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule353,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere353,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName354,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture354,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule354,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere354,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "20:00 - 23:00", "20:00 - 23:00", "20:00 - 23:00", "20:00 - 23:00", "20:00 - 23:00", "7:00 - 11:30", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName355,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture355,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule355,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere355,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName356,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture356,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule356,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere356,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 10:00", "7:00 - 10:00", "7:00 - 11:00", "7:00 - 11:00", "7:00 - 11:00", null, "7:00 - 11:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName357,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture357,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule357,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere357,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:30 - 14:00", "8:30 - 14:00", "8:30 - 12:00", "8:30 - 14:00", "8:30 - 14:00", "8:30 - 14:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName358,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture358,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule358,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere358,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00", "18:00 - 1:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName359,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture359,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule359,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere359,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00", "7:00 - 22:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName360,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture360,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule360,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere360,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName361,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture361,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule361,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere361,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59", "18:30 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName362,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture362,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule362,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere362,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName363,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture363,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule363,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere363,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName364,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture364,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule364,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere364,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName365,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture365,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule365,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere365,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 0:30", "18:00 - 0:30", null, "18:00 - 1:30", "18:00 - 3:00", "18:00 - 3:00", "18:00 - 0:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName366,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture366,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule366,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere366,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, null, "18:00 - 22:50", "18:00 - 22:50", "18:00 - 22:50",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName367,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture367,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule367,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere367,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "7:30 - 23:30", "7:30 - 23:30", "7:30 - 23:30", "7:30 - 23:30", "7:30 - 23:30", "7:30 - 23:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName368,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture368,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule368,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere368,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName369,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture369,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule369,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere369,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "6:00 - 14:00", "6:00 - 14:00", "6:00 - 14:00", "6:00 - 14:00", "6:00 - 14:00", "6:00 - 14:00", "6:00 - 14:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName370,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture370,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule370,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere370,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 0:30", "19:00 - 0:30", "19:00 - 0:30", "19:00 - 0:30", "19:00 - 0:30", "19:00 - 0:30", "19:00 - 0:30",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName371,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture371,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule371,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere371,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,

        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName372,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture372,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule372,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere372,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName373,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture373,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule373,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere373,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "6:00 - 14:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName374,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture374,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule374,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere374,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 1:00",
                "19:00 - 1:00",
                null,
                "19:00 - 1:00",
                "19:00 - 1:00",
                "19:00 - 1:00",
                "19:00 - 1:00",
                )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName375,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture375,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule375,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere375,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 23:00", "7:00 - 23:00", "7:00 - 23:00", "7:00 - 23:00", "7:00 - 23:00", "7:00 - 23:00", "7:00 - 23:00",

                )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName376,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture376,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule376,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere376,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "6:00 - 14:00", "6:00 - 14:00",

                )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName377,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture377,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule377,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere377,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName378,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture378,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule378,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere378,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "17:00 - 23:00", "17:00 - 23:00", "17:00 - 23:00", "17:00 - 23:00",

                )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName379,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture379,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule379,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere379,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 2:00", "19:00 - 2:00", "19:00 - 2:00", "19:00 - 2:00", "19:00 - 3:00", "19:00 - 3:00", "19:00 - 3:00",
                )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName380,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture380,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule380,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere380,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 23:00", "18:00 - 23:00", "18:00 - 23:00", "18:00 - 23:00", "18:00 - 23:00", "18:00 - 23:00", "18:00 - 23:00"
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName381,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture381,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule381,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere381,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName382,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture382,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule382,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere382,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName383,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture383,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule383,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere383,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "13:00 - 23:59", "13:00 - 23:59", "13:00 - 23:59", "13:00 - 23:59", "13:00 - 23:59", "13:00 - 23:59", "13:00 - 23:59",
            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName384,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture384,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule384,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere384,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName385,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture385,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule385,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere385,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName386,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture386,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule386,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere386,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 21:00", "8:00 - 21:00", "8:00 - 21:00", "8:00 - 21:00", "8:00 - 21:00", "8:00 - 21:00", "8:00 - 21:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName387,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture387,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule387,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere387,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "6:00 - 15:00", "6:00 - 15:00", "6:00 - 15:00", "6:00 - 15:00", "6:00 - 15:00", null, null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName388,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture388,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule388,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere388,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "18:00 - 23:59", null, null, null, "18:00 - 23:59", "18:00 - 23:59", "18:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName389,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture389,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule389,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere389,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 14:30", "7:00 - 14:30", "7:00 - 14:30", "7:00 - 14:30", "7:00 - 14:30", "7:00 - 14:30", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName390,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture390,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule390,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere390,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "19:00 - 23:59", null, "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName391,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture391,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule391,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere391,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName392,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture392,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule392,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere392,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 18:00", "8:00 - 18:00", "8:00 - 18:00", "8:00 - 18:00", "8:00 - 18:00", "8:00 - 18:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName393,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture393,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule393,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere393,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, null, null, "19:00 - 23:59", "19:00 - 23:59", "19:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName394,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture394,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule394,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere394,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "10:00 - 23:59", "10:00 - 23:59", "10:00 - 23:59", "10:00 - 23:59", "10:00 - 23:59", "10:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName395,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture395,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule395,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere395,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", "11:00 - 23:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName396,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture396,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule396,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere396,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "16:00 - 2:00", "16:00 - 2:00", "16:00 - 2:00", "16:00 - 2:00", "16:00 - 2:00", "16:00 - 2:00", "16:00 - 2:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName397,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture397,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule397,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere397,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName398,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture398,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule398,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere398,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 14:00", null, "7:00 - 14:00", "18:00 - 23:00", "18:00 - 23:00", "18:00 - 23:00", "18:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName399,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture399,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule399,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere399,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "14:00 - 23:00", "14:00 - 23:00", "14:00 - 23:00", "14:00 - 23:00", "14:00 - 23:00", "14:00 - 23:00", "14:00 - 23:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName400,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture400,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule400,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere400,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 18:00", "7:30 - 18:00", "7:30 - 18:00", "7:30 - 18:00", "7:30 - 18:00", "7:30 - 18:00", "7:00 - 18:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName401,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture401,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule401,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere401,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                null, "17:30 - 1:00", "17:30 - 1:00", "17:30 - 1:00", "17:30 - 1:00", "17:30 - 1:00", "17:30 - 1:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName402,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture402,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule402,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere402,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "12:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", "7:00 - 16:00", null, "9:00 - 23:59",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName403,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture403,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule403,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere403,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 15:00", "7:00 - 15:00", "7:00 - 15:00", "7:00 - 15:00", "7:00 - 15:00", null, null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName404,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture404,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule404,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere404,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "11:00 - 17:00", "12:00 - 18:00", "11:00 - 20:00", "11:00 - 20:00", "11:00 - 20:00", "11:00 - 20:00", "12:00 - 18:00",

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName405,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture405,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule405,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere405,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", "7:00 - 14:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName406,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture406,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule406,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere406,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "8:00 - 13:00", "8:00 - 13:00", "8:00 - 13:00", "8:00 - 13:00", "8:00 - 13:00", "8:00 - 13:00", null,

            )
        ),


        SubCategoryData(
            subCategoryName = R.string.goodPlacesRestaurantsSubCategoryName407,
            subCategoryPicture = R.drawable.goodplacesrestaurantstsubcategorypicture407,
            subCategoryDaysShopOpened = R.string.goodPlacesRestaurantsSubCategorySchedule407,
            subCategoryGoogleMaps = R.string.goodPlacesRestaurantsSubCategoryClickHere407,
            subCategoryTypeOfRestaurant = ExtraCategoriesForGoodPlaces.Tacos,
            subCategoryCompleteSchedule = returnAPairDataTypeAboutTheScheduleOfAShop(
                "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00", "9:00 - 21:00"
            )
        )
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

