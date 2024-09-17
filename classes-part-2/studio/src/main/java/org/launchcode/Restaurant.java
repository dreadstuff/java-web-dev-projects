package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(5.99, "Ham Sandwich", "Main Course", true);

        ArrayList<MenuItem> items = new ArrayList<>();
        Menu weekendMenu = new Menu(new Date(), items);

        weekendMenu.addMenuItem(item1);
        weekendMenu.displayMenu();
        //System.out.println("test");
    }
}
