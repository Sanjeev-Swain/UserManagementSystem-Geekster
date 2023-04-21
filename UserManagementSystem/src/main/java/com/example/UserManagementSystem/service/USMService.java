package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.model.UserManagementSystem;
import com.example.UserManagementSystem.repository.USMDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class USMService
{
    @Autowired
    USMDao usmDao;

    public List<UserManagementSystem> getAllUser()
    {
        return usmDao.getAllUser();
    }

    public String addUser(UserManagementSystem usm)
    {
        boolean insertionStatus = usmDao.addUser(usm);
        if(insertionStatus)
        {
            return "User added successfully";
        }
        else
        {
            return "Failed to save user";
        }
    }

    public UserManagementSystem getUserById(String userId)
    {
        List<UserManagementSystem> userListRightNow = usmDao.getAllUser();

        for(UserManagementSystem usm : userListRightNow)
        {
            if(usm.getUserId().equals(userId))
            {
                return usm;
            }
        }
        return null;
    }

    public String deleteUserById(String userId)
    {
        boolean deleteResponse = false;
        String status;
        if(userId != null)
        {
            List<UserManagementSystem> userRightNow = usmDao.getAllUser();

            for(UserManagementSystem usm : userRightNow)
            {
                if(usm.getUserId().equals(userId))
                {
                    deleteResponse = usmDao.deleteUserById(usm);
                    if(deleteResponse)
                    {
                        status = "User with id"+userId+"was deleted";
                    }
                    else
                    {
                        status = "User with id"+userId+"was not deleted";
                    }
                    return status;
                }
            }

            return "user with id"+userId+"does not exist";
        }

        else
        {
            return "Invalid id";
        }
    }

    public String updateUserById(String userId,String name,String userName,String address,String phoneNumber)
    {
        boolean updateStatus  = usmDao.updateUserById(userId,name,userName,address,phoneNumber);
        if(updateStatus)
        {
            return "User with id"+userId+"was updated";
        }
        else
        {
            return "User with id"+userId+"was not updated";
        }
    }
}
