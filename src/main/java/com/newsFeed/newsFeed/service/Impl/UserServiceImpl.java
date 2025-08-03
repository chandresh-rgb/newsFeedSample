package com.newsFeed.newsFeed.service.Impl;

import com.newsFeed.newsFeed.Model.User;
import com.newsFeed.newsFeed.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;

    @Override
    public User getUser(String username) {
       Optional<User> user = Optional.ofNullable((User) userRepo.findByUsername(username));
       User actualUser = user.get();
       if(actualUser != null)
           return actualUser;
       else return null;
    }

    @Override
    public User createUser(String username, String fullname, String emailId) {
        User user = new User();
        user.setUsername(username);
        user.setFullName(fullname);
        user.setEmailId(emailId);

        return userRepo.save(user);

    }
}
