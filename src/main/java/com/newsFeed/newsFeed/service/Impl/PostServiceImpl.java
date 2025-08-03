package com.newsFeed.newsFeed.service.Impl;

import com.newsFeed.newsFeed.Model.Post;
import com.newsFeed.newsFeed.Model.User;
import com.newsFeed.newsFeed.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepo;

    @Override
    public ResponseEntity<Post> createPost(Post post)
    {
        if(postRepo.save(post) != null)
        {
            return ResponseEntity.ok(post);
        }
        return null;

    }

    @Override
    public List<Post> getPostByUser(User user)
    {
        return postRepo.findPostByUser(user.getId());

    }

}
