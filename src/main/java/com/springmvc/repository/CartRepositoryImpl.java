package com.springmvc.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springmvc.domain.Cart;

@Repository
public class CartRepositoryImpl implements CartRepository {

    private Map<String, Cart> listOfCarts;

    public CartRepositoryImpl() {
        listOfCarts = new HashMap<String, Cart>();
    }

	@Override
	public Cart create(Cart cart) {
		// TODO Auto-generated method stub
		if (listOfCarts.keySet().contains(cart.getCartId())) {
            throw new IllegalArgumentException(String.format("��ٱ��ϸ� ������ �� �����ϴ�. ��ٱ��� id(%)�� �����մϴ�", cart.getCartId()));
        }

        listOfCarts.put(cart.getCartId(), cart);
        return cart;
	}

	@Override
	public Cart read(String cartId) {
		// TODO Auto-generated method stub
		return listOfCarts.get(cartId);
	}

	@Override
	public void update(String cartId, Cart cart) {
		// TODO Auto-generated method stub
		if(!listOfCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("��ٱ��� ����� ������ �� �����ϴ�. ��ٱ��� id(%)�� �������� �ʽ��ϴ�",cartId));
        }
        listOfCarts.put(cartId, cart);
	}

	@Override
	public void delete(String cartId) {
		// TODO Auto-generated method stub
		if(!listOfCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("��ٱ��� ����� ������ �� �����ϴ�. ��ٱ��� id(%)�� �������� �ʽ��ϴ�",cartId));
        }
        listOfCarts.remove(cartId);
	}



}
