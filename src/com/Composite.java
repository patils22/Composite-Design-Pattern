package com;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    int price;
    String name;
    public Composite(String name){
        this.name = name;
    }

    public List<Component> components = new ArrayList<Component>();

    public void addComponent(Component c){
        components.add(c);
    }

    @Override
    public int showPrice() {
        // iterate throught the sub components of the Composite object
        // and get the price

        for (Component i : components){
            price = price + i.showPrice();
        }

        return price;
    }

    @Override
    public String toString() {
        return  name  ;
    }
    
}
