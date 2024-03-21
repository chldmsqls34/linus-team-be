package com.linus.api.board;

import com.linus.api.article.Article;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity(name = "BOARDS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Board {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "BOARDS")
    private List<Article> article;

    @Column(name = "BOARD_NAME")
    private String boardName;

    @Column(name = "BOARD_TYPE")
    private String boardType;

    @Builder(builderMethodName = "builder")
    public Board(String boardName, String boardType) {
        this.boardName = boardName;
        this.boardType = boardType;
    }
}
