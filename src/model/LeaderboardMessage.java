package model;

/**
 * The leaderboard message.
 * @author Nathan Stickler
 * @version 11/17/19
 */
public class LeaderboardMessage extends AbstractMessage {

    /** List containing all racer ids. */
    private final int[] myRacerIDs;
    
    /**
     * Constructs a leaderboard message.
     * @param theTime timestamp of message
     * @param theRacerIDs all racer ids
     */
    public LeaderboardMessage(final int theTime, final int[] theRacerIDs) {
        super(theTime);
        myRacerIDs = theRacerIDs.clone();
    }

    /**
     * Returns all racer ids.
     * @return all racer ids
     */
    public int[] getRacerID() {
        return myRacerIDs.clone();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(32);
        sb.append("$L");
        sb.append(SEPARATOR);
        sb.append(getTime());
        for (final int racerID : myRacerIDs) {
            sb.append(SEPARATOR);
            sb.append(racerID);
        }
        return sb.toString();
    }
}
