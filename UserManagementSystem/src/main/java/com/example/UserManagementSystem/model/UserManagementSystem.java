package com.example.UserManagementSystem.model;

public class UserManagementSystem
{
    String userId;
    String name;
    String userName;
    String address;
    String phoneNumber;

    public UserManagementSystem(String userId,String userName,String address,String phoneNumber)
    {
        this.userId=userId;
        this.userName=userName;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }

    public String getUserId()
    {
        return userId;
    }
    public void setUserId(String userId)
    {
        this.userId=userId;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName=userName;
    }

    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
}
