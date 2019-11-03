package com.spring.restful.carts.app.commons;

public interface CartURIs {
	String CART_API_ROOT = "/carts";
	String CART_API_ROOT_BATCH =  CART_API_ROOT + "/" + "batch";
	String CART_API_URI_BY_ID = CART_API_ROOT + "/" + "{id}";
	String GET_CART_BY_NAME_ID = CART_API_ROOT + "/" + "{name}/{id}";


}
