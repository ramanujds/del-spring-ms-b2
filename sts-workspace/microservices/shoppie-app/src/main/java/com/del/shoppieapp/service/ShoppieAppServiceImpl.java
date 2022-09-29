package com.del.shoppieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.del.shoppieapp.model.OrderDetails;

@Service
public class ShoppieAppServiceImpl implements ShoppieAppService {
	
	private String order_service_url="http://localhost:8888/orders";
	
	@Autowired
	RestTemplate rt;
	
	@Override
	public OrderDetails fetchOrderDetails(String productId, String couponCode) {
		
		return rt.getForObject(order_service_url+"/product/"+productId+"/coupon/"+couponCode,
						OrderDetails.class);
		
		
	}

}
