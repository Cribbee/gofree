package com.cribbee.gofree.dao;

import com.cribbee.gofree.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
}
