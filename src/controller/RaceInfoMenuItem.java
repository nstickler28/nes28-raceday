package controller;

import static model.PropertyChangeEnabledRaceControls.PROPERTY_HEADER;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import model.RaceInfo;
import view.TimePanel;

/**
 * A JMenuItem that displays the race info.
 * 
 * @author Nathan Stickler
 * @version 11/22/19
 */
public class RaceInfoMenuItem extends JMenuItem implements PropertyChangeListener {
    
    /**
     * 
     */
    private static final long serialVersionUID = 7279909447014198508L;

    /** A constant for a new line. */
    private static final String NEW_LINE = "\n";
    
    /** The message to display. */
    private String myMessage;
    
    /**
     * Constructs the info JMenuItem.
     */
    public RaceInfoMenuItem() {
        super("Race Info...");
        myMessage = "";
        addActionListener(theEvent -> {
            JOptionPane.showMessageDialog(this, myMessage, "Race Information",
                                          JOptionPane.INFORMATION_MESSAGE);
        });
        setEnabled(false);
    }

    
    @Override
    public void propertyChange(final PropertyChangeEvent theEvent) {
        if (PROPERTY_HEADER.equals(theEvent.getPropertyName())) {
            final RaceInfo info = (RaceInfo) theEvent.getNewValue();
            final StringBuilder sb = new StringBuilder();
            sb.append(info.getRaceName());
            sb.append(NEW_LINE);
            sb.append("Track type: ");
            sb.append(info.getTrack());
            sb.append(NEW_LINE);
            sb.append("Total time: ");
            sb.append(TimePanel.formatTime(info.getTotalRaceTime()));
            sb.append(NEW_LINE);
            sb.append("Lap Distance: ");
            sb.append(info.getLapDistance());
            sb.append(NEW_LINE);
            myMessage = sb.toString();
            setEnabled(true);
        } 
    }
}
