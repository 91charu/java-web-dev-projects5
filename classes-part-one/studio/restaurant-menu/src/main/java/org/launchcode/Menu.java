package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
public class Menu {
    private Date dated;
    private ArrayList<MenuItem> items;

    public Date getDated() {
        return dated;
    }

    public void setDated(Date dated) {
        this.dated = dated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.dated=d;
        this.items=i;
    }
}
