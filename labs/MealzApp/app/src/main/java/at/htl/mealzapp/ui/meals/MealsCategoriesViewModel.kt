package at.htl.mealzapp.ui.meals

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import at.htl.model.MealsRepository
import at.htl.model.response.MealResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class MealsCategoriesViewModel(
    private val repository: MealsRepository = MealsRepository()
) : ViewModel() {

    val TAG = MealsCategoriesViewModel::class.java.name

    init {
        Log.d(TAG, "we are about to launch a coroutine")
        viewModelScope.launch(Dispatchers.IO) {
            Log.d(TAG, "we have launched the coroutine")
            val meals = getMeals()
            Log.d(TAG, "we have received the asynchronous data")
            mealsState.value = meals
        }
        Log.d(TAG, "other work")
    }

    val mealsState: MutableState<List<MealResponse>> = mutableStateOf(emptyList<MealResponse>())

    private suspend fun getMeals(): List<MealResponse> {
        return repository.getMeals().categories
    }
}
