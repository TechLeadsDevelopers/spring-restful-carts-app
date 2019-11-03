package com.spring.restful.carts.app.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.restful.carts.app.commons.DbQueries;
import com.spring.restful.carts.app.model.Cart;

@Repository
public class CartDaoImpl implements CartDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int createCart(Cart cart) {
		Object[] params = { cart.getCustinfo(), cart.getItemcount(), cart.getStatus(),
				new java.sql.Date(new Date().getTime()), new Timestamp(new Date().getTime())
		};
		int count = jdbcTemplate.update(DbQueries.INSERT_CART, params);
		return count;
	}

	@Override
	public int[] createBatchCart(List<Cart> carts) {
		int count[] = jdbcTemplate.batchUpdate(DbQueries.INSERT_CART, new CartBatchSetter(carts));
		return count;
	}

	@Override
	public List<Cart> getAllCarts() {
		List<Cart> carts = jdbcTemplate.query(DbQueries.GET_ALL_CART, new BeanPropertyRowMapper<Cart>(Cart.class));
		return carts;
	}

	@Override
	public Cart getCartById(Long id) {
		Cart cart = jdbcTemplate.queryForObject(DbQueries.GET_CART_BY_ID, new BeanPropertyRowMapper<Cart>(Cart.class),id);
		return cart;
	}

	@Override
	public int updateCartById(Cart cart, Long id) {
		Object[] params = { cart.getClass(), cart.getId(), cart.getStatus(), new Timestamp(new Date().getTime()), id };

		int count = jdbcTemplate.update(DbQueries.UPDATE_CART_BY_ID, params);
		return count;
	}

	@Override
	public int deleteCartById(Long id) {
		Object[] params = { id };
		int count = jdbcTemplate.update(DbQueries.DELETE_CART_BY_ID, params);
		return count;
	}

}
