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
    )

    private val kidFriendlyPlacesItems = listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription1,

            ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription2,

            ),
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCoffeeShopItemContentDescription3,

            )
    )

    private val parksItems = listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription1,

            )
    )
    private val shoppingCentersItems = listOf(
        ItemData(
            itemName = R.string.useForNoThing,
            itemPicture = R.drawable.usefornothing,
            itemDescription = R.string.goodPlacesCategoryContentDescription1,

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
