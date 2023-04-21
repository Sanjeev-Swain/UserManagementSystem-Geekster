# UserManagementSystem-Geekster
Framework Used : Spring MVC Architechture 
Languages Used : Java and Springboot
Database Used  : ArrayList

Data Flow :
Model(UserManagementSystem) - Consists of all entities as per requirements , constructors for the entities and all getters and setters
Controller(USMController) - Consists of all end points for CRUD operations performed (getAllUser , addUser , getUserById , deleteUserById , updateUserById)
Service(USMService) - Consists of all business logic required to implement the control laye end points (getAllUser , addUser , getUserById , deleteUserById , updateUserById)
Repository(USMDao) - It talks to the repository , in our case it is a arral list

Project Summary - This is a simple implementation of CRUD operations where user management system is implemented . Users are created by id and added to the list . We are performing different operations such as deletion , updation , searching on the list of the users
We are running the code on Intellij Idea platform it starts the server on port 8080 and the API can be tested using postman.
