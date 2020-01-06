package model;

/**
 * The telemetry message.
 * @author Nathan Stickler
 * @version 11/17/19
 */
public class TelemetryMessage extends AbstractMessage {

    /** Racer ID. */
    private final int myRacerID;
    
    /** Distance that the racer is currently at. */
    private final double myDistance;
    
    /** Lap number that the racer is currently on. */
    private final int myLap;
    
    /**
     * Constructs a telemetry message.
     * @param theTime the timestamp
     * @param theRacerID the racer's ID
     * @param theDistance the current distance
     * @param theLap the current lap
     */
    public TelemetryMessage(final int theTime, final int theRacerID,
                            final double theDistance, final int theLap) {
        super(theTime);
        myRacerID = theRacerID;
        myDistance = theDistance;
        myLap = theLap;
    }
    
    /**
     * Returns the racer's ID.
     * @return the racer's ID
     */
    public int getRacerID() {
        return myRacerID;
    }
    
    /**
     * Returns the current distance.
     * @return the current distance
     */
    public double getDistance() {
        return myDistance;
    }
    
    /**
     * Returns the current lap.
     * @return the current lap
     */
    public int getLap() {
        return myLap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(32);
        sb.append("$T");
        sb.append(SEPARATOR);
        sb.append(getTime());
        sb.append(SEPARATOR);
        sb.append(myRacerID);
        sb.append(SEPARATOR);
        sb.append(myDistance);
        sb.append(SEPARATOR);
        sb.append(myLap);
        return sb.toString();
    }
}
