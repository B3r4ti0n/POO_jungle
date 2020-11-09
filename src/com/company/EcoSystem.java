package com.company;

public class EcoSystem {
    private int m_iwidth;
    private int m_iheight;
    private WaterSpot waterSpot;

    public EcoSystem() {
        m_iheight = 30;
        m_iwidth = 120;
        waterSpot = new WaterSpot(500, m_iheight /4, m_iwidth /4);
    }




}
