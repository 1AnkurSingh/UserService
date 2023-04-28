package com.lcwd.user.service.service;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    // user operation
    //created
    User saveUser(User user);

    // get All User
    List<User>getAllUser();

    //Get Single User of Given UserId
    User getUser(String userId);

    // delete ,, update

}
