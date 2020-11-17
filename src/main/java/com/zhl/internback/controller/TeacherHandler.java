package com.zhl.internback.controller;

import com.zhl.internback.domain.Teacher;
import com.zhl.internback.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherHandler {
    @Autowired
    TeacherRepository teacherRepository;

    //保存教师信息
    @PostMapping("/save")
    public String save(@RequestBody Teacher teacher){
        Teacher result = teacherRepository.save(teacher);
        if (result != null){
            return "Success";
        }else {
            return "Err";
        }
    }
}
