package com.example.springblog;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;

public interface PostRepository extends JpaRepository<Post, Long> {

}
