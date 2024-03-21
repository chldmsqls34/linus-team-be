package com.linus.api.article;

import com.linus.api.board.Board;
import com.linus.api.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="ARTICLES")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Article {
    @Id
    @Column(name="ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "BOARD_ID")
    private Board board;

    @Column(name="TITLE")
    private String title;

    @Column(name="CONTENT")
    private String content;

    @Column(name="WRITER")
    private String writer;

    @Column(name="REGISTERDATE")
    private String registerDate;

    @Builder(builderMethodName = "builder")
    public Article(Long id, String title, String content, String writer, String registerDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.registerDate = registerDate;
    }

}