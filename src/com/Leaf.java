package com;

public class Leaf implements Component {

    int price;
    String name;

    public Leaf( String name, int price) {
        this.price = price;
        this.name = name;
    }

    @Override
	public int showPrice() {
		return price;
		
	}

    @Override
    public String toString() {
        return  name  ;
    }
    
}
