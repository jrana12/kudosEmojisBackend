# KudosEmojisBackend
This application provides a shopping cart experience, where badges can be bought using points a user has.
It can be used internally in a company or organization where points are earned through work, and badges can be bought as a display of achievements. 

## Entities
**Order** {
String orderId;  
String prodId;  
String userId;
String status;
String date;
}

**Product** {
String pId;
String prodName;
String prodUrl;
String prodDesc;
int prodPoints;
}

**User** {
String userId;
String userFirstName;
String userLastName;
String userEmail;
int userPoints;
}

## APIs

 **Add/Update User**
 POST api/updateUser, User Entity in Request Body.
 **Login**
 GET api/userlogin/{email},  Returns User Entity.
 **Fetch All users**
 GET api/user/fetchAll, Returns list of User Entity
**Adding new Product**
POST api/product/addProduct, Product Entity in Request Body
**Fetch All Products**
GET api/product, Returns List of all Product Entity
**Checkout a Product for a User**
POST api/order/checkout/{userid}/{prodid}
**Fetch Products belonging to a User**
GET api/order/get/{userid}, Returns List of Product Entity    

