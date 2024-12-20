package net.javaguides.RecipeManagementSystem.controller;

import net.javaguides.RecipeManagementSystem.model.Recipe;
import net.javaguides.RecipeManagementSystem.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @PostMapping
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        return ResponseEntity.ok(recipeService.createRecipe(recipe));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Recipe>> searchRecipes(@RequestParam String ingredient) {
        return ResponseEntity.ok(recipeService.searchByIngredient(ingredient));
    }
}