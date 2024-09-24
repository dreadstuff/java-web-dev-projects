package org.launchcode;



public class MenuItem {
    private double price;
    private static String Description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String Description, String category, boolean isNew) {
        this.price = price;
        this.Description = Description;
        this.category = category;
        this.isNew = isNew;
    }

    public static void getDisplayItem() {

    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public static String getDescription() {
        return Description;
    }

}



