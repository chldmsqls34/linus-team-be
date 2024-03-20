package com.linus.api.board;

import lombok.Getter;

public class BoardServiceImpl implements BoardService {
    @Getter
    private static BoardService instance = new BoardServiceImpl();
    BoardRepository repo;

    public BoardServiceImpl() {
        repo = BoardRepository.getInstance();
    }

    @Override
    public void deleteBoards() {

    }

    @Override
    public void createBoards() {

    }
}
