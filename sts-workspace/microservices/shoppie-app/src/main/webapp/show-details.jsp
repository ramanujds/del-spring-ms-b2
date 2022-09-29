<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Order Details</title>
</head>
<body>

<h2>Order Details</h2>
<p>Product ID : ${order.product.productId} </p>
<p>Product Name : ${order.product.productName} </p>
<p>Product Price : ${order.product.price} </p>
<p>Coupon Applied : ${order.coupon.couponCode}</p>
<p>Coupon Discount : ${order.coupon.discount}%</p>
<p>Final Price : ${order.finalPrice}</p>
</body>
</html>