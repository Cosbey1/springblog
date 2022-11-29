package com.example.springblog.Repositories;


import com.example.springblog.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;

public interface PostRepository extends JpaRepository<Post, Long> {

// Post findPostBy(String title);
// Post
}
