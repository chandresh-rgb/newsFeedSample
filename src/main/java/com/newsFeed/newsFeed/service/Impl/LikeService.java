package com.newsFeed.newsFeed.service.Impl;

import com.newsFeed.newsFeed.Model.Post;

public interface LikeService {

    void likePost(Long postId);
    int getLikeCount(Long postId);
}
