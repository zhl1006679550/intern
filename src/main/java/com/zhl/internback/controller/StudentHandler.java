package com.zhl.internback.controller;

import com.zhl.internback.domain.Student;
import com.zhl.internback.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Student")
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;

//    查询所有,分页
    @GetMapping("/findAll/{page}/{size}")
    public Page<Student> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable = PageRequest.of(page-1,size);
        return studentRepository.findAll(pageable);
    }

    //按学号查询
    @GetMapping("/findByStunum/{Stunum}")
    public Student findByStu_num(@PathVariable("Stunum") Integer Stunum){
        return studentRepository.findByStunum(Stunum);
    }
}
