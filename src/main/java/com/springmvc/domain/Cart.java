package com.springmvc.domain;

import java.util.HashMap;
import java.util.Map;

import java.io.Serializable;

public class Cart implements Serializable{
    private static final long serialVersionUID = 2155125089108199199L;
    
    private String cartId;  
    private Map<String,CartItem> cartItems; 
    private int grandTotal;  

    public Cart() {  
        cartItems = new HashMap<String, CartItem>();
        grandTotal = 0;
    }  
    public Cart(String cartId) {  
        this();
        this.cartId = cartId;
    }  
    public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public Map<String, CartItem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(Map<String, CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	public int getGrandTotal() {
		return grandTotal;
	}

	public void updateGrandTotal() { 
        grandTotal= 0;
        for(CartItem item : cartItems.values()){
            grandTotal = grandTotal + item.getTotalPrice();
        }
    }  

    public void addCartItem(CartItem item) {
        String bookId = item.getBook().getBookId();  

        if(cartItems.containsKey(bookId)) {  
            CartItem cartItem = cartItems.get(bookId);  
            cartItem.setQuantity(cartItem.getQuantity()+item.getQuantity());  
            cartItems.put(bookId, cartItem);  
        } else {
            cartItems.put(bookId, item);  
        }
        updateGrandTotal();  
    }
    
    public void removeCartItem(CartItem item) {
        String bookId = item.getBook().getBookId();
        cartItems.remove(bookId);  
        updateGrandTotal();  
    }
}