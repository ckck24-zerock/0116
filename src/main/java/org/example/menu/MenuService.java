package org.example.menu;

import java.util.ArrayList;

public class MenuService {

    private ArrayList<Menu> menus;

    public MenuService(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public ArrayList<Menu> getMenus(){

        return menus;
    }

}
