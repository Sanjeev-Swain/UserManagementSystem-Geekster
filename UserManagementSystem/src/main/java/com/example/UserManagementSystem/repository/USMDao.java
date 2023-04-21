package com.example.UserManagementSystem.repository;

import com.example.UserManagementSystem.model.UserManagementSystem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class USMDao
{
    private List<UserManagementSystem> USMList;

    public USMDao()
    {
        USMList = new ArrayList<>();
    }

    public List<UserManagementSystem> getAllUser()
    {
        return USMList;
    }

    public boolean addUser(UserManagementSystem usm)
    {
        USMList.add(usm);
        return true;
    }

    public boolean deleteUserById(UserManagementSystem usm)
    {
        USMList.remove(usm);
        return true;
    }

    public boolean updateUserById(String userId, String name, String userName, String address, String phoneNumber)
    {
        boolean updateStatus = false;
        for(UserManagementSystem usm : USMList)
        {
            if(usm.getUserId().equals(userId))
            {
                deleteUserById(usm);

                usm.setName(name);
                usm.setUserName(userName);
                usm.setAddress(address);
                usm.setPhoneNumber(phoneNumber);

                addUser(usm);

                return true;
            }
        }

        return false;
    }
}
