package in.example.service;

import java.util.List;

import in.example.entity.CartItem;

public interface CartService {

    void addItem(String foodName, double price);
    void removeItem(String foodName);
    List<CartItem> getCartItems();
}
