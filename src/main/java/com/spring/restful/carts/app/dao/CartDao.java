package com.spring.restful.carts.app.dao;

import java.util.List;

import com.spring.restful.carts.app.model.Cart;

public interface CartDao {
	public int createCart(Cart cart);
	public int[] createBatchCart(List<Cart> carts);
	public List<Cart> getAllCarts();
	public Cart getCartById(Long id);
	public int updateCartById(Cart cart, Long id);
	public int deleteCartById(Long id);

}
