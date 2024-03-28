package com.linus.api.board;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;

    public void deleteBoards() {
        service.deleteBoards();
    }

    public void createBoards() {
        service.createBoards();
    }
}
