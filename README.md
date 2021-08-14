# kudosEmojisBackend

Open API's and Entities:

get-Login - api/userlogin/{emial} - returns user entity

View Products - get
api/product  - returns all the products
api/order/get/{userid}  - all the products belonging to the user

Add to cart - 
Check if already belongs to user- api/
Add to cart- api/order/addtoKart/{json order object}
Checkout- post
api/order/checkout/{userid}/{prodid} - call this function for each product-saving the order
api/user/updateUser  - send the user object as the body
View cart- api/order/get/{userid}/{status}:cart
View badges- api/order/get/{userid}


Order {

	String orderId;
	String prodId;
	String userId;
String status;
	String date;
}

Product {

	String pId;
	String prodName;
	String prodUrl;
	String prodDesc;
	int prodPoints;
}
public class User {

	String userId;
	String userFirstName;
	String userLastName;
	String userEmail;
	int userPoints;
}


