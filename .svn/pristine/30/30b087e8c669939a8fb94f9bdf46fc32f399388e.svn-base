package model;

import java.util.List;

/**
 * Information about the race.
 * 
 * @author Nathan Stickler
 * @version 11/18/19
 */
public class RaceInfo {

    /** The name of the race. */
    private final String myRaceName;
    
    /** The track geometry. */
    private final String myTrack;
    
    /** The width of the track. */
    private final int myTrackWidth;
    
    /** The height of the track. */
    private final int myTrackHeight;
    
    /** The single lap distance. */
    private final int myLapDistance;
    
    /** The total race time in MS. */
    private final int myTotalRaceTime;
    
    /** The number of racers. */
    private final int myNumOfRacers;
    
    /** The number of laps. */
    private int myNumOfLaps;
    
    /** List of race participants and their information. */
    private final List<Racer> myRacers;
    
    /**
     * Constructs the compilation of the race info.
     * 
     * @param theRaceName the name of the race
     * @param theTrack the track geometry
     * @param theTrackWidth the track width
     * @param theTrackHeight the track height
     * @param theLapDistance the total lap distance
     * @param theTotalRaceTime the total time of race
     * @param theNumOfRacers the number of racers
     * @param theRacers the list of racer info
     */
    public RaceInfo(final String theRaceName, final String theTrack,
                    final int theTrackWidth, final int theTrackHeight,
                    final int theLapDistance, final int theTotalRaceTime,
                    final int theNumOfRacers, final List<Racer> theRacers) {
        myRaceName = theRaceName;
        myTrack = theTrack;
        myTrackWidth = theTrackWidth;
        myTrackHeight = theTrackHeight;
        myLapDistance = theLapDistance;
        myTotalRaceTime = theTotalRaceTime;
        myNumOfRacers = theNumOfRacers;
        myNumOfLaps = 0;
        myRacers = theRacers;
    }
    
    /**
     * Returns the name of the track.
     * @return the name of the track
     */
    public String getRaceName() {
        return myRaceName;
    }
    
    /**
     * Returns the track geometry.
     * @return the track geometry
     */
    public String getTrack() {
        return myTrack;
    }
    
    /**
     * Returns the width of the track.
     * @return the width of the track
     */
    public int getTrackWidth() {
        return myTrackWidth;
    }
    
    /**
     * Returns the height of the track.
     * @return the height of the track
     */
    public int getTrackHeight() {
        return myTrackHeight;
    }
    
    /**
     * Returns the distance of a lap.
     * @return the distance of a lap
     */
    public int getLapDistance() {
        return myLapDistance;
    }
    
    /**
     * Returns the total time of the race.
     * @return the total time of the race
     */
    public int getTotalRaceTime() {
        return myTotalRaceTime;
    }
    
    /**
     * Returns the number of racers.
     * @return the number of racers
     */
    public int getNumOfRacers() {
        return myNumOfRacers;
    }
    
    /**
     * Returns the total number of laps.
     * @return the total number of laps
     */
    public int getNumOfLaps() {
        return myNumOfLaps;
    }
    
    /**
     * Sets the total number of laps.
     * @param theNumOfLaps the total number of laps
     */
    public void setNumOfLaps(final int theNumOfLaps) {
        myNumOfLaps = theNumOfLaps;
    }
    
    /**
     * Returns a list of racer's info.
     * @return a list of racer's info
     */
    public List<Racer> getRacers() {
        return myRacers;
    }
}
