package com.zhl.internback.repository;

import com.zhl.internback.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import java.nio.file.OpenOption;
import java.util.Optional;

@SpringBootTest
class UsersRepositoryTest {
    @Autowired
    private UsersRepository usersRepository;

    @Test
    void findAll(){

        System.out.println(usersRepository.findAll());
    }

    @Test
    void save(){
        Users user = new Users();
        user.setName("张eee");
        user.setPassword("2020123");
        System.out.println(usersRepository.save(user));
    }
    @Test
    void findById(){
        Users users = usersRepository.findById(1).get();
        System.out.println(users);
    }

}