package com.controller;

import com.model.Food;
import com.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/foods")
public class FoodController {

    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/")
    public String getAllFoods(Model model) {
        List<Food> foods = foodService.getAllFoods();
        model.addAttribute("foods", foods);
        return "foods-list";
    }

    @GetMapping("/add")
    public String addFoodForm(Model model) {
        model.addAttribute("food", new Food());
        return "add-food-form";
    }

    @PostMapping("/add")
    public String addFoodSubmit(@ModelAttribute Food food) {
        foodService.addFood(food);
        return "redirect:/foods/";
    }

    @GetMapping("/delete/{id}")
    public String deleteFood(@PathVariable long id) {
        foodService.deleteFood(id);
        return "redirect:/foods/";
    }
}
