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

public class ArticleServiceImpl extends AbstractService<User> implements ArticleService {

    private final ArticleRepository repository;






    @Override
    public List<?> findUsers() throws SQLException {
        return repository.findUsers();
    }

    @Override
    public Messenger save(User user) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public String count() {
        return null;
    }

    @Override
    public Optional<User> getOne(String id) {
        return Optional.empty();
    }

    @Override
    public String delete(User user) {
        return null;
    }

    @Override
    public Boolean existsById(Long id) {
        return null;
    }
}
