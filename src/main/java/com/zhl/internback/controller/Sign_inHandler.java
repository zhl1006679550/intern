package com.zhl.internback.controller;

import com.zhl.internback.domain.Sign_in;
import com.zhl.internback.domain.Student;
import com.zhl.internback.repository.Sign_inRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sign")
public class Sign_inHandler {
    @Autowired
    private Sign_inRepository sign_inRepository;

    @GetMapping("/findAll")
    public List<Sign_in> findAll(){
        return sign_inRepository.findAll();
    }

    @GetMapping("/findAll/{page}/{size}")
    public Page<Sign_in> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable = PageRequest.of(page-1,size);
        return sign_inRepository.findAll(pageable);
    }

    @GetMapping("/findByStunum/{Stunum}")
    public List<Sign_in> findByStu_num(@PathVariable("Stunum") Integer Stunum){
        return sign_inRepository.findByStunum(Stunum);
    }
}
