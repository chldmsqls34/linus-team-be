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
    private final UserRepository repo;

    @PostMapping("/api/login")
    public Map<String,?> login(@RequestBody Map<String,?>paramMap){
        String username = (String) paramMap.get("username");
        String password = (String) paramMap.get("password");
        System.out.println("리퀘스트가 가져온이름 :"+username);
        System.out.println("비번 :"+password);
        Map<String,String> map = new HashMap<>();
        map.put("username","입력한 아이디는"+username);
        map.put("password","입력한 비밀번호는"+password);
        return map;
    }
    @PostMapping(path="/api/users")
    public Map<String,?> join(@RequestBody Map<?,?> paramMap){
        String strHeight = String.valueOf(paramMap.get("height"));
        String strWeight = String.valueOf(paramMap.get("weight"));
        User newUser = repo.save(User.builder()
                .username((String)paramMap.get("username"))
                .password((String)paramMap.get("password"))
                .name((String)paramMap.get("name"))
                .phone((String)paramMap.get("phone"))
                .address((String)paramMap.get("address"))
                .job((String)paramMap.get("job"))
                .height(Double.parseDouble(strHeight))
                .weight(Double.parseDouble(strWeight))
                .build());
        System.out.println("DB에 저장된 User 정보"+newUser);
        boolean flag = repo.findById(newUser.getId()).isEmpty();
        Map<String,Messenger> map = new HashMap<>();
        map.put("result",Messenger.SUCCESS);
        return map;
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
