package com.zhl.internback.controller;


import com.zhl.internback.domain.Users;
import com.zhl.internback.domain.Viewsign;
import com.zhl.internback.repository.Sign_inRepository;
import com.zhl.internback.repository.ViewsignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/viewsign")
public class ViewsignHandler {

    @Autowired
    private ViewsignRepository viewsignRepository;

    @RequestMapping("findAll")
    public List<Viewsign> findAll(){
        return viewsignRepository.findAll();
    }

    @GetMapping("/findAll/{page}/{size}")
    public Page<Viewsign> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable = PageRequest.of(page-1,size);
        return viewsignRepository.findAll(pageable);
    }
    @GetMapping("/findByStunum/{stunum}/{page}/{size}")
    public Page<Viewsign> findByStunum(@PathVariable("page") Integer page, @PathVariable("size") Integer size,@PathVariable("stunum") Integer stunum){
        Pageable pageable = PageRequest.of(page-1,size);
        return viewsignRepository.findByStunum(stunum,pageable);
    }
}
