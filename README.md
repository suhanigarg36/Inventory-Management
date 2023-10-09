# Inventory-Management

Purpose

• A successful login system to authenticate registered users. 
• A successful registration system for unregistered users. 
• A product inventory system which allows the users to add product details, and the data is displayed in a list.

API details
1. API Name: /validateuser
Protocol:	JSON /HTTP-POST
Purpose:	To validate the user details entered by the user for successful login.
Data source:	Mongo DB
Connection details:	mongodb+srv://Suhani:suhani88@suhani.ppzq9im.mongodb.net/?retryWrites=true&w=majority

2.	API Name: /submituser
Protocol:	JSON /HTTP-POST
Purpose:	To save the user details given by the user in the database
Data source:	Mongo DB
Connection details:	mongodb+srv://Suhani:suhani88@suhani.ppzq9im.mongodb.net/?retryWrites=true&w=majority

3.	API Name: /getproducts
Protocol:	JSON /HTTP-GET
Purpose:	To display the list of products with its details which are saved in the database.
Data source:	Mongo DB
Connection details:	mongodb+srv://Suhani:suhani88@suhani.ppzq9im.mongodb.net/?retryWrites=true&w=majority

4.	API Name: /saveproducts
Protocol:	JSON /HTTP-POST
Purpose:	To save the product details given by the user in the database.
Data source:	Mongo DB
Connection details:	mongodb+srv://Suhani:suhani88@suhani.ppzq9im.mongodb.net/?retryWrites=true&w=majority




