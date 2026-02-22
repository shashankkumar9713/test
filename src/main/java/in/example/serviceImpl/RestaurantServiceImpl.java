package in.example.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import in.example.entity.Food;
import in.example.entity.Restaurant;
import in.example.repository.FoodRepository;
import in.example.repository.RestaurantRepository;
import in.example.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepo;
    private final FoodRepository foodRepo;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepo,
                                 FoodRepository foodRepo) {
        this.restaurantRepo = restaurantRepo;
        this.foodRepo = foodRepo;
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }

    @Override
    public List<Food> getFoodsByRestaurant(Long restaurantId) {
        return foodRepo.findByRestaurantId(restaurantId);
    }
}