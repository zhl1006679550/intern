package com.zhl.internback.repository;

import com.zhl.internback.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void findAll(){
        Pageable pageable = PageRequest.of(1,2);
        System.out.println(studentRepository.findAll(pageable));
    }

    @Test
    void findByStunum(){
        System.out.println(studentRepository.findByStunum(20200001));
    }


    @Test
    void deleteByStunum(){
         studentRepository.deleteByStunum(20200007);
    }

    @Test
    void save(){
        Student student = new Student();
        student.setName("嘎子");
        student.setClassnamess("电子信息20-3");
        student.setCompany("天堂伞业");
        student.setStunum(20200012);
        student.setPassword("woaini");
        System.out.println(studentRepository.save(student));
    }

    @Test
    void findByStunumAndPassword(){
        System.out.println(studentRepository.findByStunumAndPassword(20200002,"20166332"));
    }
}
