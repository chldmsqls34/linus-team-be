package com.linus.api.article;

import com.linus.api.common.AbstractService;
import com.linus.api.enums.Messenger;
import com.linus.api.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository repository;

    @Override
    public List<Article> findAll() {
        return repository.findAll();
    }
}
