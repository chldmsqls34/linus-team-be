package com.linus.api.article;

import com.linus.api.enums.Messenger;
import com.linus.api.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequiredArgsConstructor

public class ArticleController {

    private final ArticleServiceImpl service;

    @SuppressWarnings("unchecked")
    @GetMapping("/api/articles")
    public Map<?,?> findAll() throws SQLException {
        Map<String, Object> map = new HashMap<>();
        map.put("message", Messenger.SUCCESS);
        @SuppressWarnings("unchecked")

        List<Article> list = new ArrayList<>();
        // list.add(Article.builder().
        // id(1L)
        // .title("글제목")
        // .content("내용")
        // .writer("작가")
        // .registerDate("2024-03")
        // .build());

        list = service.findAll();
        list.forEach(System.out::println);
        System.out.println("리스트 사이즈 : "+list.size());
        map.put("result",list);
        return map;
    }

}
