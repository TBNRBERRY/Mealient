package gq.kirmanak.mealient.datastore.recipe

import kotlinx.coroutines.flow.Flow

interface AddRecipeStorage {

    val updates: Flow<AddRecipeDraft>

    suspend fun save(addRecipeDraft: AddRecipeDraft)

    suspend fun clear()
}
