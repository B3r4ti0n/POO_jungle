package com.company;

public class WaterSpot {
    private int waterQuantity ;
    private int height ;
    private int width ;
    private Coords coords ;




    public WaterSpot(int waterQuantity , int height , int width ) {
        this.waterQuantity = waterQuantity;
        this.height = height;
        this.width = width;
        this.coords = new Coords(0 ,0 );

    }
}
