package com.spring.restful.carts.app.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;

import com.spring.restful.carts.app.model.Cart;

public class CartBatchSetter implements BatchPreparedStatementSetter {
	private List<Cart> carts;

	public CartBatchSetter(List<Cart> carts) {
		this.carts = carts;
	}

	@Override
	public void setValues(PreparedStatement ps, int i) throws SQLException {
		ps.setString(1, carts.get(i).getCustinfo());
		ps.setString(2, carts.get(i).getItemcount());
		ps.setString(3, carts.get(i).getStatus());
		ps.setDate(4, new java.sql.Date(new Date().getTime()));
		ps.setTimestamp(5, new Timestamp(new Date().getTime()));
	}

	@Override
	public int getBatchSize() {
		int batchSize=carts.size();
		return batchSize;
	}

}
