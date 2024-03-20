package com.linus.api.board;

import lombok.Getter;

public class BoardRepository {
    @Getter
    private static BoardRepository instance;

    private BoardRepository() {
    }

}
