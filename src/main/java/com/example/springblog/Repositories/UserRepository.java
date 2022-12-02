package com.example.springblog.Repositories;

import com.example.springblog.Classes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
