package com.zhl.internback.repository;

import com.zhl.internback.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query(value = "select * from student stu where stu.Stunum=?1", nativeQuery = true)
    Student findByStunum(int stunum);


    @Transactional
    @Modifying
    @Query(value = "delete from Student where Stunum=?1")
     void deleteByStunum(int stunum);
}
