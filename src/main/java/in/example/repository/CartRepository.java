package in.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.example.entity.CartItem;

public interface CartRepository extends JpaRepository<CartItem, Long> {
	CartItem findByFoodName(String foodName);
}
