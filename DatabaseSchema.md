# MNT Store Database Documentation

## Entities

### 1. User
This entity represents the user. It should contain the username, email, password Hash and some other details like location, rating, platform age. This entity should be related to the item posts as a parent. Every post has a user, but not every user has a post necessarily.

|Attribute|Description|Type|Constraints|
|-----------|--|--|-|
|_**Id**_|Unique identification for each user. Primary Key|UUID|-|
|_Username_|Unique identification for each user. For searching purposes|String| 50 characters long mazimum
|_Email_|Unique email address for account confirmation and notifications.|String|******@mail.com|
|_Password_|Password hashed for privacy to authenticate user|String|Hash|
|Location|Not required but helps selling|String|-|
|Rating|Builds up over each sell. Not user controlled|Float|##.#|
|Platform age|Time on platform. Builds um automatically|Int|Year aprox. 

#### Relational Schema:
User(*Id*, username, email, password, location, rating, age)

### 2. Post
This entity represents the post a user makes, a.k.a an item they intend to sell. It should contain a Name, a Price, a Description (optional), a Date of posting, and some details of the seller. 

|Attribute|Description|Type|Constraints|
|-|-|-|-|
|_**Id**_|Unique identification of the post. Primary Key| UUID|-|
|_Name_|Title of the post to shortly explain what it is|String|255 characters long maximum|
|_Price_|Required value of intended sell price for the item|Float|#..##,##|
|Description|A longer description of the item, only visible once the item post is opened (Not on search page)|Text|10000 charachters long|
|Date|A automatically generated date of the post|Date|Date <= Now()|