package model;

/**
 * The line crossing message.
 * @author Nathan Stickler
 * @version 11/17/19
 */
public class LineCrossingMessage extends AbstractMessage {

    /** The Racer ID. */
    private final int myRacerID;
    
    /** The Lap number that was crossed. */
    private final int myLap;
    
    /** See if race is finished or not. */
    private final boolean myIsFinish;
    
    /**
     * Constructs a line crossing message.
     * @param theTime the timestamp
     * @param theRacerID the racer's ID
     * @param theLap the lap that was crossed
     * @param theIsFinish if the race was finished
     */
    public LineCrossingMessage(final int theTime, final int theRacerID, final int theLap,
                               final boolean theIsFinish) {
        super(theTime);
        myRacerID = theRacerID;
        myLap = theLap;
        myIsFinish = theIsFinish;
    }

    /**
     * Returns the Racer's ID.
     * @return the Racer's ID
     */
    public int getRacerID() {
        return myRacerID;
    }
    
    /**
     * Returns the lap number crossed.
     * @return the lap number crossed.
     */
    public int getLap() {
        return myLap;
    }
    
    /**
     * Returns whether racer finished race or not.
     * @return if the racer finished race or not
     */
    public boolean isFinish() {
        return myIsFinish;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(32);
        sb.append("$C");
        sb.append(SEPARATOR);
        sb.append(getTime());
        sb.append(SEPARATOR);
        sb.append(myRacerID);
        sb.append(SEPARATOR);
        sb.append(myLap);
        sb.append(SEPARATOR);
        sb.append(myIsFinish);
        return sb.toString();
    }
}
