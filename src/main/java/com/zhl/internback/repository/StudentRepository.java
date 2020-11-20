package com.zhl.internback.repository;

import com.zhl.internback.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


public interface StudentRepository extends JpaRepository<Student,Integer> {
    //按学号查询
    @Query(value = "select * from student stu where stu.Stunum=?1", nativeQuery = true)
    Student findByStunum(int stunum);


    //按学号删除
    @Transactional
    @Modifying
    @Query(value = "delete from Student where stunum=?1")
     void deleteByStunum(int stunum);

    //按学号和密码查询
    Student findByStunumAndPassword(int stunum,String password);
}
