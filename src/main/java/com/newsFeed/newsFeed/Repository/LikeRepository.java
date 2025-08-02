package com.newsFeed.newsFeed.Repository;

import com.newsFeed.newsFeed.Model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like,Long> {
}
