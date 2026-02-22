package in.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.example.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findByRestaurantId(Long restaurantId);
    
}
