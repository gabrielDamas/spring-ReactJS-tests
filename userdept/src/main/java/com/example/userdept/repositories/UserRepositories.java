package com.example.userdept.repositories;
import com.example.userdept.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User, Long>{
}
