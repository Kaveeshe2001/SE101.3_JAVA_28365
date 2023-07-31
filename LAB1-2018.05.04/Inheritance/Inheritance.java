package com.mycompany.inheritance;

public class Inheritance {

    public static void main(String[] args) 
    {
        Item i = new Item(1, "Item");
        i.setLocation(2);
        i.setDescription("Update Item");
        
        Monster m = new Monster(3, "Monster");
        m.setLocation(4);
        m.setDescription("Update Monster");
        
        System.out.println("Item Location : "+i.getLocation());
        System.out.println("Item Description : "+i.getDescription());
        System.out.println("Monster Location : "+m.getLocation());
        System.out.println("Monster Description : "+m.getDescription());
    }
}
