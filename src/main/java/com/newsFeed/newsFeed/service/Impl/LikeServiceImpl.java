package com.newsFeed.newsFeed.service.Impl;

import com.newsFeed.newsFeed.Model.Like;
import com.newsFeed.newsFeed.Model.Post;
import com.newsFeed.newsFeed.Model.User;
import com.newsFeed.newsFeed.Repository.LikeRepository;
import com.newsFeed.newsFeed.Repository.PostRepository;
import com.newsFeed.newsFeed.Repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LikeServiceImpl implements LikeService{
    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    LikeRepository likeRepository;

    @Override
    public void likePost(Long postId, Long userId) {

        Optional<Post> post = postRepository.findById(postId);
        Post actualPost = post.get();
        Long currentLike = actualPost.getLikeCount();
        currentLike++;
        actualPost.setLikeCount(currentLike);

        postRepository.save(actualPost);

        Optional<User> user = userRepository.findById(userId);
        User actualUser = user.get();

        Date currentDate = new Date();

        Like like = new Like();
        like.setPost(actualPost);
        like.setUser(actualUser);
        like.setCreatedAt(currentDate);

        likeRepository.save(like);

    }

    @Override
    public Long getLikeCount(Long postId) {
        Optional<Post> post = postRepository.findById(postId);
        Post actualPost = post.get();
        Long currentLike = actualPost.getLikeCount();
        return currentLike;


    }
}
