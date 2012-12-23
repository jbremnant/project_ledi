package com.techversat.lediview;

<<<<<<< HEAD
public final class Dot {
    private final float x, y;
    private final int color;
    private final int diameter;
=======
public class Dot {
    private final float x, y;
    private int xpos, ypos;
    private int color;
    private int diameter;
>>>>>>> 08d591b8e71d36124faac1e1916fe90cdb75fe10

    /**
     * @param x horizontal coordinate.
     * @param y vertical coordinate.
     * @param color the color.
     * @param diameter dot diameter.
     */
    public Dot(float x, float y, int color, int diameter) {
        this.x = x;
        this.y = y;
<<<<<<< HEAD
=======
        this.xpos = 0;
        this.ypos = 0;
>>>>>>> 08d591b8e71d36124faac1e1916fe90cdb75fe10
        this.color = color;
        this.diameter = diameter;
    }

    /** @return the horizontal coordinate. */
    public float getX() { return x; }

    /** @return the vertical coordinate. */
    public float getY() { return y; }
<<<<<<< HEAD
=======
    
    public float getXPos() { return xpos; }
    public float getYPos() { return ypos; }
>>>>>>> 08d591b8e71d36124faac1e1916fe90cdb75fe10

    /** @return the color. */
    public int getColor() { return color; }

    /** @return the dot diameter. */
    public int getDiameter() { return diameter; }
<<<<<<< HEAD
=======
    
    public void setColor(int color) { this.color = color; }
    public void setDiameter(int diameter) { this.diameter = diameter; }
    public void setPos(int xpos, int ypos) { this.xpos = xpos; this.ypos = ypos; }
>>>>>>> 08d591b8e71d36124faac1e1916fe90cdb75fe10
}
