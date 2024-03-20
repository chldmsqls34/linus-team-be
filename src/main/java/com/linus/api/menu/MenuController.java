package com.linus.api.menu;

import com.linus.api.enums.Messenger;
import lombok.Getter;

public class MenuController {
    @Getter
    private static final MenuController instance =new MenuController();
    private final MenuService service;

    private MenuController() {
        service = MenuServiceImpl.getInstance();
    }

    //
    public Messenger makeMenuTable(){
        return service.makeMenuTable();
    }
    public Messenger removeMenuTable(){
        return service.removeTable();
    }

    public void printMenusByCategory(String category){
        System.out.println("[" + category + "]");
        service.getMenusByCategory(category).forEach(i -> System.out.print(((Menu)i).getItem() + ", "));
        System.out.println();
    }
//    public List<?> getMenusByCategory(String category){
//        return service.getMenusByCategory(category);
//    }

    public void insertMenus()  {
        service.insertMenus();
    }

//    public List<?> makeFoobar() throws SQLException {
//        return service.makeFoobar();
//    }
//
//    public Messenger retuenMessenger() throws SQLException {
//        Messenger m = service.returnMessenger();
//        return m;
//    }
}
