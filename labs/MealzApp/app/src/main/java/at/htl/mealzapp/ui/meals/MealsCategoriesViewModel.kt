package at.htl.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import at.htl.model.MealsRepository
import at.htl.model.response.MealResponse
import at.htl.model.response.MealsCategoriesResponse

class MealsCategoriesViewModel(
    private val repository: MealsRepository = MealsRepository()
) : ViewModel() {

    fun getMeals(
        successCallback: (response: MealsCategoriesResponse?) -> Unit
    ) {
        repository.getMeals() { response ->
            successCallback(response)
        }
    }
}
