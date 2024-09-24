package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }


    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
    public void displayMenu() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }
    public void addMenuItem(MenuItem item) {
        items.add(item);
        this.lastUpdated = new Date();
        System.out.println(MenuItem.getDescription() + " added to the menu.");
    }
    public void removeMenuItem(MenuItem item) {
        items.remove(item);
        this.lastUpdated = new Date();
        System.out.println(MenuItem.getDescription() + " has been removed from menu.");
    }
}

//add and remove items
//display if item is new
//last updated ~~~
//print out single menu item and entire menu ~~~~
//determine whether or not two menu items are equal

//        public void addMenuItem(MenuItem item) {
//            items.add(item); //add item
//            this.lastUpdated = new Date(); //update date lastUpdated field
//            System.out.println(items.getDescription() + " added to the menu.");
//        }
//    }




