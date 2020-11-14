package com.zhl.internback.repository;

import com.zhl.internback.domain.Sign_in;
import com.zhl.internback.domain.Student;
import com.zhl.internback.domain.Viewsign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Sign_inRepository extends JpaRepository<Sign_in,Integer> {
    @Query(value = "select * from sign_in s where s.stu_num=?1", nativeQuery = true)
    List<Sign_in> findByStunum(int stunum);

    @Query(value = "select * from Student stu,Sign_in sign where stu.Stunum = sign.stu_num",nativeQuery = true)
    public List<Viewsign> findViewsign();
}
