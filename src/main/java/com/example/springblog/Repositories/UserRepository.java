package com.example.springblog.Repositories;

import com.example.springblog.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Table;

public interface UserRepository extends JpaRepository<User, Long> {


}
