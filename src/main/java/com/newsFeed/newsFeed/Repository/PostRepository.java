package com.newsFeed.newsFeed.Repository;

import com.newsFeed.newsFeed.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post,Long> {
}
