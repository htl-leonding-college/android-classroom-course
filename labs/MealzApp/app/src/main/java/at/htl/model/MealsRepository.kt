package at.htl.model

import at.htl.model.api.MealsWebService
import at.htl.model.response.MealsCategoriesResponse

class MealsRepository(
    private val webService: MealsWebService = MealsWebService()
) {

    suspend fun getMeals(): MealsCategoriesResponse {
        return webService.getMeals()
    }

}