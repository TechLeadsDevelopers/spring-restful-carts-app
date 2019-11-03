package com.spring.restful.carts.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.carts.app.commons.CartURIs;
import com.spring.restful.carts.app.model.Cart;
import com.spring.restful.carts.app.service.CartService;

@RestController
public class CartController {
	@Autowired
	private CartService service;

	@RequestMapping(value = CartURIs.CART_API_ROOT, method = RequestMethod.POST)
	public ResponseEntity<Cart> createCart(@RequestBody Cart cart) {
		cart = service.createCart(cart);
		return new ResponseEntity<Cart>(cart, HttpStatus.CREATED);
	}

	@RequestMapping(value = CartURIs.CART_API_ROOT_BATCH, method = RequestMethod.POST)
	public ResponseEntity<List<Cart>> createCartBatch(@RequestBody List<Cart> carts) {
		carts = service.createBatchCart(carts);
		return new ResponseEntity<List<Cart>>(carts, HttpStatus.CREATED);
	}

	@RequestMapping(value = CartURIs.CART_API_ROOT, method = RequestMethod.GET)
	public ResponseEntity<List<Cart>> getAllCarts() {
		List<Cart> carts = service.getAllCarts();
		return new ResponseEntity<List<Cart>>(carts, HttpStatus.OK);
	}

	@RequestMapping(value = CartURIs.CART_API_URI_BY_ID, method = RequestMethod.GET)
	public ResponseEntity<Cart> getCartById(@PathVariable("id") String id) {
		Cart cart = service.getCartById(Long.valueOf(id));
		return new ResponseEntity<Cart>(cart, HttpStatus.OK);
	}

	@RequestMapping(value = CartURIs.CART_API_URI_BY_ID, method = RequestMethod.PUT)
	public ResponseEntity<Cart> updateCartById(@RequestBody Cart cart, @PathVariable("id") String id) {
		cart = service.updateCartById(cart, Long.valueOf(id));
		cart = service.getCartById(Long.valueOf(id));
		return new ResponseEntity<Cart>(cart, HttpStatus.OK);
	}

	@RequestMapping(value = CartURIs.CART_API_URI_BY_ID, method = RequestMethod.DELETE)
	public ResponseEntity<Cart> deleteCartById(@PathVariable("id") String id) {
		Cart cart = service.deleteCartById(Long.valueOf(id));
		return new ResponseEntity<Cart>(cart, HttpStatus.GONE);
	}

}
