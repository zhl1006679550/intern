package com.zhl.internback.repository;

import com.zhl.internback.domain.Viewsign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ViewsignRepository extends JpaRepository<Viewsign,String> {
}
