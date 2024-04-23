package com.in30minute.thinkspringboot.Repository;

import com.in30minute.thinkspringboot.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {

}
