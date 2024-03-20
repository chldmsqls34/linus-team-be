package com.linus.api.crawler;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
@RestController
@RequiredArgsConstructor

public class CrawlerController {
    private final CrawlerServiceImpl service;
    public Map<String,?> findBugsMusic(Scanner sc) throws IOException {
        System.out.println("크롤링할 주소를 입력하시오");
        String url = sc.next();
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("URL",url);

        return service.findNamesFromWeb(paramMap);
    }
    public Map<String,?> findMelonMusic(Scanner sc) throws IOException {
        System.out.println("크롤링할 주소를 입력하시오");
        String url = sc.next();
        Map<String,String> paramMap2 = new HashMap<>();
        paramMap2.put("URL",url);
        return service.findMelonWeb(paramMap2);
    }
}
