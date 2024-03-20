package com.linus.api.user;

import com.linus.api.enums.Messenger;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@CrossOrigin(origins ="http://localhost:3000/")
@RestController
@RequiredArgsConstructor

public class UserController {
    private final UserServiceImpl service;

    @PostMapping("/login")
    public Map<String,?> login(@RequestBody Map<String,?>map){
        String username = (String) map.get("username");
        String password = (String) map.get("password");
        System.out.println("리퀘스트가 가져온이름 :"+username);
        System.out.println("비번 :"+password);
        Map<String,String> userMap = new HashMap<>();
        userMap.put("username","입력한 아이디는"+username);
        userMap.put("password","입력한 비밀번호는"+password);
        return userMap;
    }

    public Map<String,?> addUsers(@RequestBody Map<String,?>map) {
        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }

    public Map<String,?> save(@RequestBody Map<String,?>map) {
        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }

    public Map<String,?> findAll() {

        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }


    public Map<?,?> findById(@RequestBody Map<String,?>map) {
        Map<?,?> userMap = new HashMap<>();
        return userMap;
    }

    public Map<?,?> updatePassword(@RequestBody Map<?,?>map) {
        Map<?,?> userMap = new HashMap<>();
        return userMap;
    }

    public Map<?,?> delete(@RequestBody Map<?,?>map) {
        Map<?,?> userMap = new HashMap<>();
        return userMap;
    }

    public Boolean existsById(@RequestBody Map<String,?>map) {
        return null;
    }

    public Map<String,?> findUsersByName(@RequestBody Map<String,?>map) {
        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }

    public Map<String, ?> findUsersByNameFromMap(@RequestBody Map<String,?>map) {
        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }

    public Map<String,?> findUsersByJob(@RequestBody Map<String,?>map) {
        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }

    public Map<String, ?> findUsersByJobFromMap(@RequestBody Map<String,?>map) {
        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }

    public Map<String,?> count() {

        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }
    public Map<String,?> getOne(@RequestBody Map<String,?>map) {
        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }
    public Map<String, ?> getUserMap(){

        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }


    public Map<String,?> findUsers() {
        Map<String,String> userMap = new HashMap<>();
        return userMap;
    }

    public Messenger createUsers()  {
        return null;
    }


    public void deleteUsers()  {

    }

}
