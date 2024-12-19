package com.springmvc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.springmvc.domain.Book;

@Component
public class UnitsInStockValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Book.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Book book = (Book) target;
        if (book.getUnitPrice() >= 10000 && book.getUnitsInStock() > 99) {
            // ���� ��ü�� �Ӽ��� �޽��� ����
            errors.rejectValue("unitsInStock", "UnitsInStockValidator.message"); 
        }
		
	}

}
