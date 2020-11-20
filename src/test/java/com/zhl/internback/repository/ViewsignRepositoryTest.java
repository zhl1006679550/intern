package com.zhl.internback.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootTest
public class ViewsignRepositoryTest {
    @Autowired
    ViewsignRepository viewsignRepository;

    @Test
    public void findAll(){
        System.out.println(viewsignRepository.findAll());
    }

    @Test
    public void findByStunum(){
        Pageable pageable = PageRequest.of(1,5);
        System.out.println(viewsignRepository.findByStunum(20200002,pageable));
    }
}
