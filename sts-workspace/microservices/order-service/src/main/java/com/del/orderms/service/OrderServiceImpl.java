package com.del.orderms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.del.orderms.model.Coupon;
import com.del.orderms.model.OrderDetails;
import com.del.orderms.model.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class OrderServiceImpl implements OrderService {

	@Value("${COUPON_SERVICE_URL}")
	private String COUPON_SERVICE_URL;

	@Value("${PRODUCT_SERVICE_URL}")
	private String PRODUCT_SERVICE_URL;

	@Autowired
	RestTemplate restClient;

	@Override
	
	public OrderDetails getOrderDetails(String productId, String couponCode) {
		Product product = getProduct(productId);

		Coupon coupon = getCoupon(couponCode);

		float discount = coupon.getDiscount();

		float price = product.getPrice();
		if (price >= coupon.getMinOderValue()) {
			price = price - price * (discount / 100.0f);
		}

		OrderDetails order = new OrderDetails(product, coupon, price);
		return order;

	}

	public Product getProduct(String productId) {

		return restClient.getForObject(PRODUCT_SERVICE_URL + productId, Product.class);

	}

	
	public Coupon getCoupon(String couponCode) {

		return restClient.getForObject(COUPON_SERVICE_URL + couponCode, Coupon.class);
	}
	
	@Override
	public Product addProduct(Product product) {
		
		return restClient.postForObject(PRODUCT_SERVICE_URL, product, Product.class);
		
	}
	
	

	

}
