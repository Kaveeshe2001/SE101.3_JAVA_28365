package com.mycompany.mainvolume;

public class MainVolume {

    public static void main(String[] args) 
    {
        double height=5;
        double radius=3;
        CylindricalContainer Ci = new CylindricalContainer(height,radius);
        double Volume = Ci.calculateVolume();
        System.out.println("Volume of Cylinder : "+Volume);
    }
}
