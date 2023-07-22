package com.ecommerce.jaychemist.repository;

import com.ecommerce.jaychemist.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepo extends JpaRepository<UserLogin,Long> {
    UserLogin findByEmailId(String email_id);
}
