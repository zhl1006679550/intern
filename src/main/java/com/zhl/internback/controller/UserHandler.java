package com.zhl.internback.controller;

import com.zhl.internback.domain.Users;
import com.zhl.internback.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserHandler {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Users> findAll(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        Pageable pageable = PageRequest.of(page-1,size);
        return usersRepository.findAll(pageable);
    }

    @PostMapping("/save")
    public String save(@RequestBody Users users){
        Users result = usersRepository.save(users);
        if(result != null){
            return "success";
        }else {
            return "err";
        }
    }

    @GetMapping("/findById/{id}")
    public Users findById(@PathVariable("id") Integer id){
        return usersRepository.findById(id).get();
    }

    @GetMapping("/findByNameAndPassword?name={name}&password={password}")
    public Users findByNameAndPassword(@PathVariable String name,@PathVariable String password){
        System.out.println(usersRepository.findByNameAndPassword(name,password));
        return usersRepository.findByNameAndPassword(name,password);
    }

    @PutMapping("/updata")
    public String updata(@RequestBody Users users){
        Users users1 = usersRepository.save(users);
        if (users1 != null){
            return "success";
        }else {
            return "err";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        usersRepository.deleteById(id);
    }

}
