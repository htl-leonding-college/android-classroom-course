package at.htl.model

import at.htl.model.api.MealsWebService
import at.htl.model.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MealsRepository(
    private val webService: MealsWebService = MealsWebService()
) {

    suspend fun getMeals(): MealsCategoriesResponse {
        return webService.getMeals()
    }

}