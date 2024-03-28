package com.linus.api.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{
    private final ArticleRepository repository;


    @Override
    public List<Article> findAll() {
        return repository.findAll();
    }
}
