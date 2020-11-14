package com.zhl.internback.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ViewsignRepositoryTest {
    @Autowired
    ViewsignRepository viewsignRepository;

    @Test
    public void findAll(){
        System.out.println(viewsignRepository.findAll());
    }
}
