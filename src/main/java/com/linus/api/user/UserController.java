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

    @PostMapping("/join")
    public Map<String, ?> join(@RequestBody Map<String, ?> jmap){
        String username = (String) jmap.get("username");
        String password = (String) jmap.get("password");
        String name = (String) jmap.get("name");
        String phone = (String) jmap.get("phone");
        String address = (String) jmap.get("address");
        String job = (String) jmap.get("job");
        String height = (String) jmap.get("height");
        String weight = (String) jmap.get("weight");
        System.out.println("리퀘스트가 가져온이름 : "+username);
        Map<String, String> joinMap = new HashMap<>();
        joinMap.put("username", username);
        joinMap.put("password", password);
        joinMap.put("name", name);
        joinMap.put("phone", phone);
        joinMap.put("address", address);
        joinMap.put("job", job);
        joinMap.put("height", height);
        joinMap.put("weight", weight);

        return joinMap;
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
