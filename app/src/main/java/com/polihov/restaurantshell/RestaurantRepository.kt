package com.polihov.restaurantshell

object RestaurantRepository {
    fun getRestaurants(): List<Restaurant> = listOf(
        Restaurant(
            id = 1,
            name = "Прожарим",
            url = "https://example.com/projarim",
            logoResId = R.drawable.logo_projarim,
            placeholderNote = "Замените на реальный URL сайта Прожарим"
        ),
        Restaurant(
            id = 2,
            name = "Сушидза",
            url = "https://example.com/sushidza",
            logoResId = R.drawable.logo_sushidza,
            placeholderNote = "Замените на реальный URL сайта Сушидза"
        ),
        Restaurant(
            id = 3,
            name = "Банзай",
            url = "https://example.com/banzai",
            logoResId = R.drawable.logo_banzai,
            placeholderNote = "Замените на реальный URL сайта Банзай"
        ),
        Restaurant(
            id = 4,
            name = "Ресторан 4",
            url = "https://example.com/restaurant4",
            logoResId = R.drawable.logo_rest4,
            placeholderNote = "Временная кнопка"
        ),
        Restaurant(
            id = 5,
            name = "Ресторан 5",
            url = "https://example.com/restaurant5",
            logoResId = R.drawable.logo_rest5,
            placeholderNote = "Временная кнопка"
        ),
        Restaurant(
            id = 6,
            name = "Ресторан 6",
            url = "https://example.com/restaurant6",
            logoResId = R.drawable.logo_rest6,
            placeholderNote = "Временная кнопка"
        ),
        Restaurant(
            id = 7,
            name = "Ресторан 7",
            url = "https://example.com/restaurant7",
            logoResId = R.drawable.logo_rest7,
            placeholderNote = "Временная кнопка"
        ),
        Restaurant(
            id = 8,
            name = "Ресторан 8",
            url = "https://example.com/restaurant8",
            logoResId = R.drawable.logo_rest8,
            placeholderNote = "Временная кнопка"
        )
    )
}
