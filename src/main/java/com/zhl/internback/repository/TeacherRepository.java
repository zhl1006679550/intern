package com.zhl.internback.repository;

import com.zhl.internback.domain.Teacher;
import com.zhl.internback.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

    @Transactional
    Teacher findByTecnumAndPassword(int tecnum, String password);
}
