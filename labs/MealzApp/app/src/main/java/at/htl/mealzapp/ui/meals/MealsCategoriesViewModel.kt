package at.htl.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import at.htl.model.MealsRepository
import at.htl.model.response.MealResponse

class MealsCategoriesViewModel(
    private val repository: MealsRepository = MealsRepository()
) : ViewModel() {

    suspend fun getMeals(): List<MealResponse> {
        return repository.getMeals().categories
    }
}
