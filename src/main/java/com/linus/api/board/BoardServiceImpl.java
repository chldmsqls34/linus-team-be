package com.linus.api.board;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository repo;
    @Override
    public void deleteBoards() {

    }

    @Override
    public void createBoards() {

    }
}
