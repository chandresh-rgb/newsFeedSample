package com.newsFeed.newsFeed.service.Impl;

import com.newsFeed.newsFeed.Model.User;

public interface UserService {
     User getUser(String username);
     User createUser(String username, String fullname);

}
