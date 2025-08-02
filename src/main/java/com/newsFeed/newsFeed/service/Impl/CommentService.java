package com.newsFeed.newsFeed.service.Impl;

import com.newsFeed.newsFeed.Model.Comment;

import java.util.List;

public interface CommentService {

    boolean addComment(Comment comment);
    List<String> getCommentForPost(Long postId);
}
