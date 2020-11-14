package com.zhl.internback.repository;

import com.zhl.internback.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
    Users findByNameAndPassword(String name,String password);
}
