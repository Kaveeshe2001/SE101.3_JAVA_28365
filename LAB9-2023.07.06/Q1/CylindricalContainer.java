package com.mycompany.mainvolume;

public class CylindricalContainer extends Container 
{
    public CylindricalContainer(double height, double radius)
    {
        super(height, radius);
    }

    public double calculateVolume()
    {
        double pi = 3.14159;
        return pi*radius*radius*height;
    }
}
