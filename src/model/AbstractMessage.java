package model;

/**
 * Abstract message for telemetry, leaderboard, and line crossing messages.
 * @author Nathan Stickler
 * @version 11/17/19
 */
public abstract class AbstractMessage implements Message {

    /** Messages formatting separator. */
    public static final String SEPARATOR = ":";
    
    /** Timestamp of message. */
    private final int myTime;
    
    /**
     * Constructs an abstract message.
     * @param theTime timestamp of message
     */
    public AbstractMessage(final int theTime) {
        myTime = theTime;
    }
    
    @Override
    public int getTime() {
        return myTime;
    }
    

}
