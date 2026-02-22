package in.example.service;

import java.util.List;

import in.example.entity.Restaurant;
import in.example.entity.Food;

public interface RestaurantService {

    List<Restaurant> getAllRestaurants();
    List<Food> getFoodsByRestaurant(Long restaurantId);
}
