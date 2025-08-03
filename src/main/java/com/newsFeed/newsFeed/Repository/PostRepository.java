package com.newsFeed.newsFeed.Repository;

import com.newsFeed.newsFeed.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PostRepository extends JpaRepository<Post,Long> {

    @Query("SELECT p FROM Post p WHERE p.user.Id = :userId")
    List<Post> findPostByUser(Long userId);
}
