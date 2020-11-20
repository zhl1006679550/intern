package com.zhl.internback.repository;

import com.zhl.internback.domain.Viewsign;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewsignRepository extends JpaRepository<Viewsign,String> {
     Page<Viewsign> findByStunum(int Stunum, Pageable pageable);
}
