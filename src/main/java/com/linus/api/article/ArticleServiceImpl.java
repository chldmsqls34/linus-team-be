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
public class ArticleServiceImpl extends AbstractService {
    private final ArticleRepository repository;


    @Override
    public Messenger save(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List findAll() throws SQLException {
        return repository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public String count() {
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public Optional getOne(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public String delete(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Boolean existsById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }
}
