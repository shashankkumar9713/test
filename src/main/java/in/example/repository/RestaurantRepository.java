package in.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.example.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
