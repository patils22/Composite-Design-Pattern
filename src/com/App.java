package com;

public class App {
    public static void main(String[] args) throws Exception {
        Component mb = new Leaf("MB", 4000);
        Component hd = new Leaf("HDD", 8000);
        Component mouse = new Leaf("Mouse", 400);
        Component kb = new Leaf("Keyboard", 800);

        Composite cabinet = new Composite("Cabinet");
        Composite peripherals = new Composite("Peripherals" );
        Composite computer = new Composite("PC");
        computer.addComponent(peripherals);
        computer.addComponent(cabinet);
        cabinet.addComponent(mb);
        cabinet.addComponent(hd);
        peripherals.addComponent(mouse);
        peripherals.addComponent(kb);
        
        
        int price_peripherals = peripherals.showPrice();
        System.out.println("price of peri: " + price_peripherals);

        int price_cabinet = cabinet.showPrice();
        System.out.println("price cabinet :" +price_cabinet);

        int price_computer= computer.showPrice();
        System.out.println("price computer:"+ price_computer);

        System.out.println(computer.components);
        System.out.println(peripherals.components);
        System.out.println(cabinet.components);



    }
}
