package com.spring.restful.carts.app.service;

import java.util.List;

import com.spring.restful.carts.app.model.Cart;

public interface CartService {
	public Cart createCart(Cart cart);
	public List<Cart> createBatchCart(List<Cart> carts);
	public List<Cart> getAllCarts();
	public Cart getCartById(Long id);
	public Cart updateCartById(Cart cart, Long id);
	public Cart deleteCartById(Long id);

}
