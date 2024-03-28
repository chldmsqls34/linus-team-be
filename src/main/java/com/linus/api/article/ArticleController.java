package com.linus.api.article;

import com.linus.api.enums.Messenger;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequiredArgsConstructor
public class ArticleController {
  private final ArticleService service;

  @GetMapping("/api/articles")
  public Map<?,?> findAll() throws SQLException{
    Map<String, Object> map = new HashMap<>();
    map.put("message", Messenger.SUCCESS);
    @SuppressWarnings("unchecked")
    List<Article> list = service.findAll();
//    List<Article> list = new ArrayList<>();
//    list.add(Article.builder()
//                    .id(1L)
//                    .title("제목")
//                    .content("내용")
//                    .writer("글쓴이")
//                    .registerDate("240327")
//            .build());
    map.put("result", list);
    return map;
  }

}
