package com.spring.restful.carts.app.commons;

public interface DbQueries {
	String INSERT_CART="INSERT INTO CART(ID,CUSTINFO,ITEMCOUNT,STATUS,CREATEDATE,LASTMODIFIED)VALUES(CART_SEQ_ID.NEXTVAL,?,?,?,?,?)";
	String GET_ALL_CART="SELECT ID, CUSTINFO, ITEMCOUNT, STATUS, CREATEDATE, LASTMODIFIED  FROM CART";
	String GET_CART_BY_ID= "SELECT ID, CUSTINFO, ITEMCOUNT, STATUS, CREATEDATE, LASTMODIFIED  FROM CART WHERE ID=?";
	String UPDATE_CART_BY_ID="UPDATE CART SET CUSTINFO =?,ITEMCOUNT =?,STATUS =?,LASTMODIFIED =? WHERE ID =?"; 
	String DELETE_CART_BY_ID="DELETE FROM CART WHERE ID =?";

}
