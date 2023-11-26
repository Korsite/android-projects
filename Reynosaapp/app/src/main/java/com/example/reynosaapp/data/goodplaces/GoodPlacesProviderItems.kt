package com.example.reynosaapp.data.goodplaces

import com.example.reynosaapp.R
import com.example.reynosaapp.data.framework.ItemData
import com.example.reynosaapp.data.takeAListOfSubCategoriesAndItemInstanceAndReturnAMap

/**
 * if itemSchedule is not given, every day schedule will be equal to the schedule given in SubCategory Instances
 */
object GoodPlacesProviderItems {

    private val coffeeShopsItems = listOf(
        ItemData(
            //1
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture1,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription1,
        ),
        ItemData(
            //2
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture2,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription2,

            ),
        ItemData(
            //3
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture3,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription3,
        ),
        ItemData(
            //4
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture4,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription4,
        ),
        ItemData(
            //5
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture5,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription5,
        ),
        ItemData(
            //6
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture6,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription6,
        ),
        ItemData(
            //7
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture7,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription7,
        ),
        ItemData(
            //8
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture8,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription8,
        ),
        ItemData(
            //9
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture9,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription9,
        ),
        ItemData(
            //10
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture10,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription10,
        ),
        ItemData(
            //11
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture11,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription11,
        ),
        ItemData(
            //12
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture12,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription12,
        ),
        ItemData(
            //13
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture13,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription13,
        ),
        ItemData(
            //14
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture14,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription14,
        ),
        ItemData(
            //15
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture15,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription15,
        ),
        ItemData(
            //16
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture16,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription16,
        ),
        ItemData(
            //17
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture17,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription17,
        ),
        ItemData(
            //18
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture18,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription18,
        ),
        ItemData(
            //19
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture19,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription19,
        ),
        ItemData(
            //20
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture20,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription20,
        ),
        ItemData(
            //21
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture21,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription21,
        ),
        ItemData(
            //22
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture22,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription22,
        ),
        ItemData(
            //23
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture23,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription23,
        ),
        ItemData(
            //24
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture24,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription24,
        ),
        ItemData(
            //25
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture25,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription25,
        ),
        ItemData(
            //26
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture26,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription26,
        ),
        ItemData(
            //27
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture27,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription27,
        ),
        ItemData(
            //28
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture28,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription28,
        ),
        ItemData(
            //29
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture29,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription29,
        ),
        ItemData(
            //30
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture30,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription30,
        ),
        ItemData(
            //31
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture31,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription31,
        ),
        ItemData(
            //32
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture32,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription32,
        ),
        ItemData(
            //33
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture33,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription33,
        ),
        ItemData(
            //34
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture34,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription34,
        ),
        ItemData(
            //35
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture35,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription35,
        ),
        ItemData(
            //36
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture36,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription36,
        ),
        ItemData(
            //37
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture37,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription37,
        ),
        ItemData(
            //38
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture38,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription38,
        ),
        ItemData(
            //39
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture39,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription39,
        ),
        ItemData(
            //40
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture40,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription40,
        ),
        ItemData(
            //41
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture41,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription41,
        ),
        ItemData(
            //42
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture42,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription42,
        ),
        ItemData(
            //43
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture43,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription43,
        ),
        ItemData(
            //44
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture44,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription44,
        ),
        ItemData(
            //45
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture45,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription45,
        ),
        ItemData(
            //46
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture46,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription46,
        ),
        ItemData(
            //47
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture47,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription47,
        ),
        ItemData(
            //48
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture48,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription48,
        ),
        ItemData(
            //49
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture49,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription49,
        ),
        ItemData(
            //50
            itemPicture = R.drawable.goodplacescoffeeshopitemypicture50,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription50,
        )
    )

    private val restaurantItems = listOf(
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture1,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription1,

            ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture2,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription2,

            ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture3,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription3,

            ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture4,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription4,

            ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture5,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription5,
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture6,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription6,

            ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture7,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription7,

            ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture8,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription8,

            ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture9,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription9,

            ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture10,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription10,
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture11,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription11
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture12,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription12
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture13,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription13
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture14,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription14
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture15,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription15
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture16,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription16
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture17,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription17
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture18,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription18
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture19,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription19
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture20,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription20
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture21,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription21
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture22,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription22
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture23,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription23
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture24,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription24
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture25,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription25
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture26,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription26
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture27,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription27
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture28,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription28
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture29,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription29
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture30,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription30
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture31,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription31
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture32,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription32
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture33,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription33
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture34,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription34
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture35,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription35
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture36,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription36
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture37,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription37
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture38,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription38
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture39,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription39
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture40,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription40
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture41,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription41
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture42,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription42
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture43,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription43
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture44,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription44
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture45,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription45
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture46,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription46
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture47,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription47
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture48,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription48
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture49,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription49
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture50,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription50
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture51,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription51
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture52,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription52
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture53,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription53
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture54,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription54
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture55,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription55
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture56,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription56
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture57,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription57
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture58,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription58
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture59,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription59
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture60,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription60
        ),
        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture61,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription61
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture62,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription62
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture63,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription63
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture64,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription64
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture65,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription65
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture66,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription66
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture67,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription67
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture68,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription68
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture69,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription69
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture70,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription70
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture71,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription71
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture72,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription72
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture73,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription73
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture74,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription74
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture75,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription75
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture76,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription76
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture77,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription77
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture78,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription78
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture79,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription79
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture80,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription80
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture81,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription81
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture82,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription82
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture83,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription83
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture84,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription84
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture85,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription85
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture86,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription86
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture87,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription87
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture88,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription88
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture89,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription89
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture90,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription90
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture91,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription91
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture92,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription92
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture93,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription93
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture94,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription94
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture95,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription95
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture96,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription96
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture97,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription97
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture98,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription98
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture99,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription99
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture100,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription100
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture101,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription101
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture102,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription102
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture103,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription103
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture104,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription104
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture105,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription105
        ),

        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture106,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription106
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture107,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription107
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture108,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription108
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture109,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription109
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture110,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription110
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture111,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription111
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture112,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription112
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture113,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription113
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture114,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription114
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture115,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription115
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture116,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription116
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture117,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription117
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture118,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription118
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture119,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription119
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture120,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription120
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture121,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription121
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture122,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription122
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture123,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription123
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture124,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription124
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture125,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription125
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture126,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription126
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture127,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription127
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture128,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription128
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture129,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription129
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture130,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription130
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture131,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription131
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture132,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription132
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture133,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription133
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture134,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription134
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture135,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription135
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture136,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription136
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture137,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription137
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture138,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription138
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture139,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription139
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture140,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription140
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture141,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription141
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture142,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription142
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture143,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription143
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture144,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription144
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture145,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription145
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture146,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription146
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture147,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription147
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture148,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription148
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture149,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription149
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture150,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription150
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture151,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription151
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture152,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription152
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture153,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription153
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture154,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription154
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture155,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription155
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture156,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription156
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture157,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription157
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture158,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription158
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture159,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription159
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture160,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription160
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture161,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription161
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture162,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription162
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture163,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription163
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture164,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription164
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture165,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription165
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture166,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription166
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture167,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription167
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture168,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription168
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture169,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription169
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture170,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription170
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture171,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription171
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture172,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription172
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture173,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription173
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture174,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription174
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture175,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription175
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture176,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription176
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture177,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription177
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture178,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription178
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture179,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription179
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture180,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription180
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture181,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription181
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture182,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription182
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture183,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription183
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture184,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription184
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture185,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription185
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture186,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription186
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture187,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription187
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture188,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription188
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture189,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription189
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture190,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription190
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture191,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription191
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture192,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription192
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture193,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription193
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture194,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription194
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture195,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription195
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture196,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription196
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture197,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription197
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture198,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription198
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture199,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription199
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture200,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription200
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture201,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription201
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture202,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription202
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture203,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription203
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture204,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription204
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture205,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription205
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture206,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription206
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture207,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription207
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture208,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription208
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture209,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription209
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture210,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription210
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture211,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription211
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture212,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription212
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture213,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription213
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture214,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription214
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture215,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription215
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture216,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription216
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture217,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription217
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture218,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription218
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture219,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription219
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture220,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription220
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture221,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription221
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture222,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription222
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture223,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription223
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture224,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription224
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture225,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription225
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture226,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription226
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture227,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription227
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture228,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription228
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture229,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription229
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture230,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription230
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture231,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription231
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture232,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription232
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture233,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription233
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture234,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription234
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture235,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription235
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture236,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription236
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture237,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription237
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture238,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription238
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture239,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription239
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture240,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription240
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture241,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription241
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture242,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription242
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture243,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription243
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture244,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription244
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture245,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription245
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture246,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription246
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture247,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription247
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture248,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription248
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture249,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription249
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture250,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription250
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture251,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription251
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture252,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription252
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture253,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription253
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture254,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription254
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture255,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription255
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture256,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription256
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture257,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription257
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture258,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription258
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture259,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription259
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture260,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription260
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture261,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription261
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture262,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription262
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture263,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription263
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture264,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription264
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture265,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription265
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture266,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription266
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture267,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription267
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture268,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription268
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture269,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription269
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture270,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription270
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture271,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription271
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture272,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription272
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture273,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription273
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture274,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription274
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture275,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription275
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture276,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription276
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture277,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription277
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture278,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription278
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture279,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription279
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture280,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription280
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture281,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription281
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture282,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription282
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture283,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription283
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture284,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription284
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture285,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription285
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture286,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription286
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture287,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription287
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture288,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription288
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture289,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription289
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture290,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription290
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture291,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription291
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture292,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription292
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture293,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription293
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture294,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription294
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture295,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription295
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture296,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription296
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture297,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription297
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture298,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription298
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture299,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription299
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture300,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription300
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture301,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription301
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture302,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription302
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture303,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription303
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture304,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription304
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture305,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription305
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture306,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription306
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture307,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription307
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture308,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription308
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture309,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription309
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture310,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription310
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture311,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription311
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture312,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription312
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture313,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription313
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture314,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription314
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture315,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription315
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture316,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription316
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture317,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription317
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture318,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription318
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture319,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription319
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture320,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription320
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture321,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription321
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture322,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription322
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture323,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription323
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture324,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription324
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture325,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription325
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture326,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription326
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture327,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription327
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture328,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription328
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture329,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription329
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture330,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription330
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture331,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription331
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture332,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription332
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture333,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription333
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture334,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription334
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture335,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription335
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture336,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription336
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture337,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription337
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture338,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription338
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture339,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription339
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture340,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription340
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture341,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription341
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture342,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription342
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture343,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription343
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture344,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription344
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture345,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription345
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture346,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription346
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture347,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription347
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture348,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription348
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture349,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription349
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture350,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription350
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture351,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription351
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture352,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription352
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture353,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription353
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture354,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription354
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture355,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription355
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture356,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription356
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture357,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription357
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture358,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription358
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture359,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription359
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture360,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription360
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture361,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription361
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture362,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription362
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture363,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription363
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture364,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription364
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture365,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription365
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture366,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription366
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture367,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription367
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture368,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription368
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture369,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription369
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture370,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription370
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture371,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription371
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture372,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription372
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture373,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription373
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture374,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription374
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture375,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription375
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture376,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription376
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture377,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription377
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture378,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription378
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture379,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription379
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture380,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription380
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture381,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription381
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture382,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription382
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture383,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription383
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture384,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription384
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture385,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription385
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture386,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription386
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture387,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription387
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture388,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription388
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture389,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription389
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture390,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription390
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture391,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription391
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture392,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription392
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture393,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription393
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture394,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription394
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture395,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription395
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture396,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription396
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture397,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription397
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture398,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription398
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture399,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription399
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture400,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription400
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture401,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription401
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture402,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription402
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture403,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription403
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture404,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription404
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture405,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription405
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture406,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription406
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesrestaurantsitempicture407,
            itemDescription = R.string.goodPlacesRestaurantsItemContentDescription407
        ),


        )

    private val kidFriendlyPlacesItems = listOf(
        ItemData(
            itemPicture = R.drawable.goodplaceskidfriendlysubitempicture1,
            itemDescription = R.string.goodPlacesKidFriendlyItemContentDescription1,
        ),

        ItemData(
            itemPicture = R.drawable.goodplaceskidfriendlysubitempicture2,
            itemDescription = R.string.goodPlacesKidFriendlyItemContentDescription2,
        ),

        ItemData(
            itemPicture = R.drawable.goodplaceskidfriendlysubitempicture3,
            itemDescription = R.string.goodPlacesKidFriendlyItemContentDescription3,
        ),

        ItemData(
            itemPicture = R.drawable.goodplaceskidfriendlysubitempicture4,
            itemDescription = R.string.goodPlacesKidFriendlyItemContentDescription4,
        ),

        ItemData(
            itemPicture = R.drawable.goodplaceskidfriendlysubitempicture5,
            itemDescription = R.string.goodPlacesKidFriendlyItemContentDescription5,
        ),

        ItemData(
            itemPicture = R.drawable.goodplaceskidfriendlysubitempicture6,
            itemDescription = R.string.goodPlacesKidFriendlyItemContentDescription6,
        ),

        ItemData(
            itemPicture = R.drawable.goodplaceskidfriendlysubitempicture7,
            itemDescription = R.string.goodPlacesKidFriendlyItemContentDescription7,

            ),

        ItemData(
            itemPicture = R.drawable.goodplaceskidfriendlysubitempicture8,
            itemDescription = R.string.goodPlacesKidFriendlyItemContentDescription8,

            ),
        ItemData(
            itemPicture = R.drawable.goodplaceskidfriendlysubitempicture9,
            itemDescription = R.string.goodPlacesKidFriendlyItemContentDescription9,
        )
    )

    private val parksItems = listOf(
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture1),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture2),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture3),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture4),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture5),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture6),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture7),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture8),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture9),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture10),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture11),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture12),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture13),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture14),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture15),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture16),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture17),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture18),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture19),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture20),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture21),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture22),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture23),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture24),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture25),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture26),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture27),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture28),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture29),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture30),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture31),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture32),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture33),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture34),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture35),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture36),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture37),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture38),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture39),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture40),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture41),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture42),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture43),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture44),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture45),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture46),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture47),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture48),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture49),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture50),
        ItemData(itemPicture = R.drawable.goodplacesparksitempicturepicture51),
    )
    private val shoppingCentersItems = listOf(

        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture1,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription1
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture2,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription2
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture3,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription3
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture4,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription4
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture5,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription5
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture6,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription6
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture7,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription7
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture8,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription8
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture9,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription9
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture10,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription10
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture11,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription11
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture12,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription12
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture13,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription13
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture14,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription14
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture15,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription15
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture16,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription16
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture17,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription17
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture18,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription18
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture19,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription19
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture20,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription20
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture21,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription21
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture22,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription22
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture23,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription23
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture24,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription24
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture25,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription25
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture26,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription26
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture27,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription27
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture28,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription28
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture29,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription29
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture30,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription30
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture31,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription31
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture32,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription32
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture33,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription33
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture34,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription34
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture35,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription35
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture36,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription36
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture37,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription37
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture38,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription38
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture39,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription39
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture40,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription40
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture41,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription41
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture42,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription42
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture43,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription43
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture44,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription44
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture45,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription45
        ),


        ItemData(
            itemPicture = R.drawable.goodplacesshoppingcentersitempicture46,
            itemDescription = R.string.goodPlacesShoppingCentersItemContentDescription46
        )
    )
    private val allSubCategories =
        GoodPlacesProviderSubCategories.SubCategories.flatMap { it.value }

    private val allItems =
        coffeeShopsItems
            .plus(restaurantItems)
            .plus(kidFriendlyPlacesItems)
            .plus(parksItems)
            .plus(shoppingCentersItems)

    val Items = takeAListOfSubCategoriesAndItemInstanceAndReturnAMap(
        allSubCategories = allSubCategories,
        allItems = allItems
    )
}
