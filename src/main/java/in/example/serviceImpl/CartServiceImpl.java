package in.example.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import in.example.entity.CartItem;
import in.example.repository.CartRepository;
import in.example.service.CartService;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository repo;

    public CartServiceImpl(CartRepository repo) {
        this.repo = repo;
    }

    @Override
    public void addItem(String foodName, double price) {
        CartItem item = repo.findByFoodName(foodName);

        if (item == null) {
            item = new CartItem();
            item.setFoodName(foodName);
            item.setPrice(price);
            item.setQuantity(1);
        } else {
            item.setQuantity(item.getQuantity() + 1);
        }
        repo.save(item);
    }

    @Override
    public void removeItem(String foodName) {
        CartItem item = repo.findByFoodName(foodName);
        if (item != null) {
            if (item.getQuantity() > 1) {
                item.setQuantity(item.getQuantity() - 1);
                repo.save(item);
            } else {
                repo.delete(item);
            }
        }
    }

    @Override
    public List<CartItem> getCartItems() {
        return repo.findAll();
    }

}
