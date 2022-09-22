package com.del.orderms.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.del.orderms.model.Coupon;
import com.del.orderms.model.OrderDetails;
import com.del.orderms.model.Product;

@Service
public class OrderServiceImpl implements OrderService {
	
	private final String COUPON_SERVICE_URL="http://localhost:5200/coupons/";
	private final String PRODUCT_SERVICE_URL="http://localhost:5100/products/";
	
	RestTemplate restClient = new RestTemplate();

	@Override
	public OrderDetails getOrderDetails(String productId, String couponCode) {
		Product product = getProduct(productId);
		
		Coupon coupon = getCoupon(couponCode);
		
		float discount = coupon.getDiscount();
		
		float price = product.getPrice();
		if(price>=coupon.getMinOderValue()) {
		price = price - price*(discount/100.0f);
		}
		
		OrderDetails order= new OrderDetails(product, coupon, price);
		return order;
		
		
	}
	
	public Product getProduct(String productId) {
		
		return restClient.getForObject(PRODUCT_SERVICE_URL+productId, Product.class);
		
		
	}
	
	public Coupon getCoupon(String couponCode) {
		
		return restClient.getForObject(COUPON_SERVICE_URL+couponCode, Coupon.class);
	}

}
