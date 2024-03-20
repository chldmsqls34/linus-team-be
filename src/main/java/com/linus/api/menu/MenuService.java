package com.linus.api.menu;

import com.linus.api.enums.Messenger;

import java.util.List;

public interface MenuService {
    Messenger makeMenuTable();

    Messenger removeTable();

    List<?> getMenusByCategory(String category);
    void insertMenus();

//    List<?> makeFoobar() throws SQLException;
//
//    Messenger returnMessenger() throws SQLException;
}
