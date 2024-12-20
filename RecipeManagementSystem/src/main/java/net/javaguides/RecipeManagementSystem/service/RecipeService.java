package net.javaguides.RecipeManagementSystem.service;

import net.javaguides.RecipeManagementSystem.model.Recipe;
import net.javaguides.RecipeManagementSystem.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public List<Recipe> searchByIngredient(String ingredient) {
        return recipeRepository.findByIngredientsContaining(ingredient);
    }
}