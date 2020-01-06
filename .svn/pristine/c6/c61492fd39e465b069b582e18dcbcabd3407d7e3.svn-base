package model;

import java.awt.Color;
import java.util.Random;

/**
 * Creates race participant.
 * 
 * @author Nathan Stickler
 * @version 11/18/19
 */
public class Racer {

    /** Random generator for RGB numbers. */;
    private static final Random RAND = new Random();
    
    /** The Racer's ID. */
    private final int myRacerID;
    
    /** The Racer's name. */
    private final String myRacerName;
    
    /** The starting point of the racer. */
    private final double myStartingDistance;
    
    /** The color of the racer. */
    private Color myColor;
    
    /**
     * Constructs a racer.
     * 
     * @param theRacerID the racer's ID
     * @param theRacerName the racer's name
     * @param theStartingDistance the racer's starting point
     */
    public Racer(final int theRacerID, final String theRacerName,
                  final double theStartingDistance) {
        myRacerID = theRacerID;
        myRacerName = theRacerName;
        myStartingDistance = theStartingDistance;
        //myColor = ColorMap.getColor(myRacerID);
    }
    
    /**
     * Returns the racer's ID.
     * @return the racer's ID.
     */
    public int getRacerID() {
        return myRacerID;
    }
    
    /**
     * Returns the racer's name.
     * @return the racer's name
     */
    public String getRacerName() {
        return myRacerName;
    }
    
    /**
     * Returns the racer's starting point.
     * @return the racer's starting point
     */
    public double getStartingDistance() {
        return myStartingDistance;
    }

    /**
     * Returns the racer's color.
     * @return the racer's color
     */
    public Color getColor() {
        if (myColor == null) {
            generateColor();
        }
        return myColor;
    }
    
    /** Sets the racer's color.
     * 
     */
    private void generateColor() {
        final float h = RAND.nextFloat();
        final float s = 0.45f;
        final float b = 1.0f;
        myColor = Color.getHSBColor(h, s, b);
    }
}
