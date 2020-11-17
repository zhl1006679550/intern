package com.zhl.internback.repository;

import com.zhl.internback.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeacherRepositoryTest {
    @Autowired
    TeacherRepository teacherRepository;

    @Test
    void Save(){
        Teacher teacher = new Teacher( 4,1020160003, "张萌", "电子信息20-1","wowowo");
        System.out.println(teacherRepository.save(teacher));
    }
}
