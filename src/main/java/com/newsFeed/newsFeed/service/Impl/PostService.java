package com.newsFeed.newsFeed.service.Impl;

import com.newsFeed.newsFeed.Model.Post;
import com.newsFeed.newsFeed.Model.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PostService {
    ResponseEntity<Post> createPost(Post post);
    List<Post> getPostByUser(User user);

}
