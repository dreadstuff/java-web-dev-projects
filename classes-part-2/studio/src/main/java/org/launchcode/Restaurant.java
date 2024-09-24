package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;


public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(5.99, "Ham Sandwich", "Main Course", true);

        ArrayList<MenuItem> items = new ArrayList<>();
        Menu weekendMenu = new Menu(new Date(), items);


//        // Add item1 to the items list
//        items.add(item1);

        // Iterate over the items and print each one
        for (MenuItems item : items) {
            String aItem = items.keySet(item);
            System.out.println(aItem); }
//        for (MenuItem item : items) {
//            System.out.println(MenuItem.getDisplayItem());  // This will print "Ham Sandwich"
//        }

//        for (MenuItem item : items) {
//            //add item on first iteration - add another for loop
//           MenuItem aItem = item;
//            //print after first loop with item added
//        }
//
//        weekendMenu.addMenuItem(item1);
//        weekendMenu.displayMenu();

        //System.out.println("test");
    }
}
