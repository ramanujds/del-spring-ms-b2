<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Order Details</title>
</head>
<body>

<h2>Order Details</h2>
<form action="save-recipt" method="post">
<p>Product ID : <input type="text" name="productId" value="${order.product.productId}" readonly> </p>
<p>Product Name : <input type="text" name="productName"  value="${order.product.productName}" readonly> </p>
<p>Product Price : <input type="text"  name="price"  value="${order.product.price}" readonly> </p>
<p>Coupon Applied : <input type="text"  name="couponCode" value="${order.coupon.couponCode}" readonly> </p>
<p>Coupon Discount(%) : <input type="text"  name="discount"  value="${order.coupon.discount}" readonly> </p>
<p>Final Price : <input type="text" name="finalPrice" value="${order.finalPrice}" readonly> </p>
<p>Date and Time : <input type="datetime" name="time" value="${order.time}" readonly>  </p>

<p><button type="submit">Save</button></p>
</form>
</body>
</html>