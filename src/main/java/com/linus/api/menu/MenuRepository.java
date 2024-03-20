package com.linus.api.menu;

import com.linus.api.enums.Messenger;
import lombok.Getter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuRepository {
    @Getter
    private static final MenuRepository instance;

    static {
        try {
            instance = new MenuRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private PreparedStatement pstmt;
    private ResultSet rs;
    private Connection connection;

    private MenuRepository() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/linusdb",
                "linus","password" );
    }

    //



    public Messenger makeTable() {
        String sql = "CREATE TABLE IF NOT EXISTS menus (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "category VARCHAR(10) NOT NULL," +
                "item VARCHAR(20) NOT NULL)";
        try {
            pstmt = connection.prepareStatement(sql);
            return (pstmt.executeUpdate() >= 0) ? Messenger.SUCCESS : Messenger.FAIL;
        } catch (SQLException e){
            System.err.println("SQL Exception Occurred");
            return Messenger.SQL_ERROR;
        }
    }

    public Messenger removeTable() {
        String sql = "DROP TABLE IF EXISTS menus";
        try {
            pstmt = connection.prepareStatement(sql);
            return pstmt.executeUpdate() >= 0 ? Messenger.SUCCESS : Messenger.FAIL;
        } catch (SQLException e){
            System.err.println("SQL Exception Occurred");
            return Messenger.SQL_ERROR;
        }
    }

    public Messenger insertMenu(Menu menu) {
        String sql = "INSERT INTO menus(category, item) VALUES(?,?)";
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, menu.getCategory());
            pstmt.setString(2, menu.getItem());
            return pstmt.executeUpdate() >= 0 ? Messenger.SUCCESS : Messenger.FAIL;
        } catch (SQLException e){
            System.err.println("SQL Exception Occurred :" + menu.getCategory() + " " + menu.getItem());
            return Messenger.SQL_ERROR;
        }
    }

    public List<?> getMenusByCategory(String category) {
        String sql = "SELECT m.item FROM menus m WHERE category = ?";
        List<Menu> menus = new ArrayList<>();
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, category);
            rs = pstmt.executeQuery();
            while(rs.next())menus.add(Menu.builder().item(rs.getString(1)).build());
        } catch (SQLException e){
            System.err.println("SQL Exception Occurred");
            return menus;
        }
        return menus;
    }


//        //리턴타입이 리스트인경우
//    public List<Menu> makeFoobar() throws SQLException {
//        String sql ="";
//        pstmt = connection.prepareStatement(sql);
//        rs = pstmt.executeQuery();
//        List<Menu> ls = new ArrayList<>();
//        if(rs.next()){
//            do{
//                Menu m = Menu.builder()
//                        .item(rs.getString("item"))
//                        .category(rs.getString("category"))
//                        .build();
//                ls.add(m);
//            }while (rs.next());
//        }else{
//            System.out.println("No Data");
//        }
//
//
//        System.out.println("쿼리 성공 여부: ");
//
//        return ls;
//    }
//
//    public Messenger returnMessenger() throws SQLException {
//        String sql = "";
//        pstmt = connection.prepareStatement(sql);
//        Messenger m = null;
//        return m;
//
//    }
}
