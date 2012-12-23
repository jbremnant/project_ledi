package com.techversat.lediview;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

<<<<<<< HEAD
=======
import com.techversat.ledimanager.Protocol;

// import com.techversat.ledimanager.LEDIActivity;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
// import android.util.Log;

>>>>>>> 08d591b8e71d36124faac1e1916fe90cdb75fe10

/** A list of dots. */
public class DotMatrix {
    /** DotChangeListener. */
    public interface DotsChangeListener {
        /** @param dots the dots that changed. */
        void onDotsChange(DotMatrix dots);
    }

    private final LinkedList<Dot> dots = new LinkedList<Dot>();
    private final List<Dot> safeDots = Collections.unmodifiableList(dots);
<<<<<<< HEAD

    private DotsChangeListener dotsChangeListener;

=======
 
    private Context context;
    private final int xsize, ysize;
    private float height, width;
    private final float offset = 30;
    private final int diameter;
    private final int defaultColor = Color.WHITE;
    private final int onColor = Color.RED;
    
    private DotsChangeListener dotsChangeListener;
    
    public DotMatrix(float width, float height, int xsize, int ysize, int diameter) {
    	this.width = width;
    	this.height = height;
    	this.xsize = xsize;
    	this.ysize = ysize;
    	this.diameter = diameter;
    	initializeDots();
    }
   
    /** uses the dimensions to create evenly spaced dots to be drawn on canvas **/
    public void initializeDots() {
    	float xbin = width / xsize;
    	float ybin = height / ysize;
    	
    	for(int i=0; i<xsize; i++) {
    		for(int j=0; j<ysize; j++) {
    			float xpos = offset + (i*xbin);
    			float ypos = offset + (j*ybin);
    			// Log.i("DotMatrix", "xpos:"+xbin+ " ypos:"+ybin);
    			dots.add(new Dot(xpos, ypos, defaultColor, diameter));
    		}
    	}
    }
    
>>>>>>> 08d591b8e71d36124faac1e1916fe90cdb75fe10
    /** @param l set the change listener. */
    public void setDotsChangeListener(DotsChangeListener l) {
        dotsChangeListener = l;
    }

    /** @return the most recently added dot. */
    public Dot getLastDot() {
        return (dots.size() <= 0) ? null : dots.getLast();
    }

    /** @return immutable list of dots. */
    public List<Dot> getDots() { return safeDots; }

<<<<<<< HEAD
=======
    public void toggleDot(Dot dot, int xpos, int ypos) {
    	// dot.setColor( (dot.getColor()==defaultColor) ? onColor : defaultColor );
    	dot.setColor( onColor );
    	Protocol.sendPoint(context, xpos, ypos, true);
    }
>>>>>>> 08d591b8e71d36124faac1e1916fe90cdb75fe10
    /**
     * @param x dot horizontal coordinate.
     * @param y dot vertical coordinate.
     * @param color dot color.
     * @param diameter dot size.
      */
<<<<<<< HEAD
    public void addDot(float x, float y, int color, int diameter) {
        dots.add(new Dot(x, y, color, diameter));
=======
    public int getXPos(float x) { return Math.round(x / (width/xsize)); }
    public int getYPos(float y) { return Math.round(y / (height/ysize)); }
    
    public void findDot(float x, float y, int color, int diameter) {
    	int xpos = getXPos(x);
    	int ypos = getYPos(y);
    	
    	// the dots are organized column wise.
    	int pos = (ysize * xpos) + ypos;
    	if(dots.size() <= pos)
    	{
    		// Log.i(LEDIActivity.TAG, "Dots pos outside of size");
    		return;
    	}
    	toggleDot(dots.get(pos), xpos, ypos);
>>>>>>> 08d591b8e71d36124faac1e1916fe90cdb75fe10
        notifyListener();
    }

    /** Remove all dots. */
    public void clearDots() {
<<<<<<< HEAD
        dots.clear();
=======
        for(int i=0; i<dots.size(); i++) {
        	dots.get(i).setColor(defaultColor);
        }
    	// dots.clear();
>>>>>>> 08d591b8e71d36124faac1e1916fe90cdb75fe10
        notifyListener();
    }

    private void notifyListener() {
        if (null != dotsChangeListener) {
            dotsChangeListener.onDotsChange(this);
        }
    }
}
