package com.example.springblog.Repositories;


import com.example.springblog.Classes.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

// Post findPostBy(String title);
// Post
}
