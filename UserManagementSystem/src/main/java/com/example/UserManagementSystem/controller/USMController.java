package com.example.UserManagementSystem.controller;

import com.example.UserManagementSystem.model.UserManagementSystem;
import com.example.UserManagementSystem.service.USMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class USMController
{
    @Autowired
    USMService usmService;

    @GetMapping(value = "/getAllUser")
    public List<UserManagementSystem> getAllUser()
    {
        return usmService.getAllUser();
    }

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody UserManagementSystem usm)
    {
        return usmService.addUser(usm);
    }

    @RequestMapping(value = "/getUserById/{userId}" , method = RequestMethod.GET)
    public UserManagementSystem getUserById(@PathVariable String userId)
    {
        return usmService.getUserById(userId);
    }

    @DeleteMapping(value = "/deleteUserById/{userId}")
    public String deleteUserById(@PathVariable String userId)
    {
        return usmService.deleteUserById(userId);
    }

    @PutMapping(value = "/updateUserById/{userId}")
    public String updateUserById(@PathVariable String userId , @PathVariable String name , @PathVariable String userName , @PathVariable String address , @PathVariable String phoneNumber)
    {
        return usmService.updateUserById(userId,name,userName,address,phoneNumber);
    }
}
