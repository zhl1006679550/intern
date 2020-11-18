package com.zhl.internback.controller;

import com.zhl.internback.domain.Teacher;
import com.zhl.internback.domain.Users;
import com.zhl.internback.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //验证用户和密码是否正确
    @GetMapping("/findByTecnumAndPassword?tecnum={tecnum}&password={password}")
    public String findByNameAndPassword(@PathVariable Integer tecnum, @PathVariable String password){
        System.out.println(teacherRepository.findByTecnumAndPassword(tecnum,password));
        Teacher result =  teacherRepository.findByTecnumAndPassword(tecnum,password);
        if (result != null){
            return "success";
        }else {
            return "err";
        }
    }
}
