package com.jpa.jpa.repository;

import com.jpa.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<User,Integer> 来完成数据库 User为实体类 Integer是主键类型
public interface UserRepository extends JpaRepository<User,Integer> {
}
