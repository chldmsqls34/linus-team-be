package com.linus.api.article;

import lombok.Getter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {

    private Connection connection;

    private ArticleRepository() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/linusdb",
                "linus", "password");
    }

    public List findAll() throws SQLException {
        List<Article> ls = new ArrayList<>();
        String sql = "select * from articles";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet resultSet = pstmt.executeQuery();
        if (resultSet.next()) {
            do {
                ls.add(Article.builder()
                        .id(resultSet.getLong("id"))
                        .title(resultSet.getString("title"))
                        .content(resultSet.getString("content"))
                        .writer(resultSet.getString("writer"))
                        .registerDate(resultSet.getString("register_date"))
                        .build());
            } while (resultSet.next());
        } else {
            System.out.println("조회결과가 없습니다.");
        }
        resultSet.close();
        pstmt.close();
        connection.close();
        return ls;

    }
}
