package com.spring.restful.carts.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restful.carts.app.dao.CartDao;
import com.spring.restful.carts.app.model.Cart;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDao dao;

	@Override
	public Cart createCart(Cart cart) {
		int count = dao.createCart(cart);
		return cart;
	}

	@Override
	public List<Cart> createBatchCart(List<Cart> carts) {
		int count[] = dao.createBatchCart(carts);
		return carts;
	}

	@Override
	public List<Cart> getAllCarts() {
		List<Cart> carts = dao.getAllCarts();
		return carts;
	}

	@Override
	public Cart getCartById(Long id) {
		Cart cart = dao.getCartById(id);
		return cart;
	}

	@Override
	public Cart updateCartById(Cart cart, Long id) {
		int count = dao.updateCartById(cart, id);
		return cart;
	}

	@Override
	public Cart deleteCartById(Long id) {
		int count = dao.deleteCartById(id);
		Cart cart = new Cart();
		cart.setId(id);
		return cart;
	}

}
