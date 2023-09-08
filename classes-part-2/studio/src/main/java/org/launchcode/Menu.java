package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        this.lastUpdated = new Date(); // Update the lastUpdated field when adding an item.
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
        this.lastUpdated = new Date(); // Update the lastUpdated field when removing an item.
    }

    public MenuItem getItem(String itemName) {
        for (MenuItem menuItem : items) {
            if (menuItem.getName().equalsIgnoreCase(itemName)) {
                return menuItem;
            }
        }
        return null;
    }
}