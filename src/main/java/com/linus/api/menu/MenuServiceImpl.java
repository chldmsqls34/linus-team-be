package com.linus.api.menu;

import com.linus.api.enums.Messenger;
import lombok.Getter;

import java.util.List;

public class MenuServiceImpl implements MenuService{
    @Getter
    private static final MenuService instance = new MenuServiceImpl();

    private  final MenuRepository repo;

    private MenuServiceImpl() {
        repo = MenuRepository.getInstance();
    }



    @Override
    public Messenger makeMenuTable() {
        repo.makeTable();
        this.insertMenus();
        return Messenger.SUCCESS;
    }

    @Override
    public Messenger removeTable() {
        return repo.removeTable();
    }

    @Override
    public List<?> getMenusByCategory(String category) {
        return repo.getMenusByCategory(category);
    }

    public void insertMenus(){
        String[] categories = {"navigate", "user", "account", "article", "board", "soccer"};
        String[][] menus = {{"x", "usr", "acc", "cwl", "art", "bbs","scc"},
                {"x", "mk", "joi", "log", "cat :", "ch-pw", "rm",
                        "ls-a", "ls-n", "ls-job", "cnt"},
                {"x", "mk", "touch", "with", "depo", "bal", "rm", "cat", "ls-a"},
                {"x", "mk"},
                {"x", "mk"},
                {"x", "mk"},
        };

        for(int i = 0; i < menus.length; i++)
            for(int j = 0; j < menus[i].length; j++)
                repo.insertMenu(Menu.builder().category(categories[i]).item(menus[i][j]).build());

    }

//    @Override
//    public List<?> makeFoobar() throws SQLException {
//        return repo.makeFoobar();
//    }
//
//    @Override
//    public Messenger returnMessenger() throws SQLException {
//        Messenger m = repo.returnMessenger();
//        return m;
//    }


}
