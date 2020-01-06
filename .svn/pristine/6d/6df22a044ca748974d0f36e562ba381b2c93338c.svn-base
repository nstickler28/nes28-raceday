package view;

import static model.PropertyChangeEnabledRaceControls.PROPERTY_TIME;
import static model.PropertyChangeEnabledRaceControls.PROPERTY_HEADER;
import static model.PropertyChangeEnabledRaceControls.PROPERTY_OUTPUT;
import static model.PropertyChangeEnabledRaceControls.PROPERTY_MESSAGES;
import static model.PropertyChangeEnabledRaceControls.PROPERTY_BACK_TO_START;

import java.awt.BorderLayout;
import java.beans.PropertyChangeSupport;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import model.PropertyChangeEnabledRaceControls;

/**
 * Creates the viewable race.
 * 
 * @author Nathan Stickler
 * @version 12/1/19
 */
public class RaceView extends JFrame {
   
    /** Property of ID. */
    protected static final String PROPERTY_SELECT = "SELECT";
    
    /** Property of ID. */
    protected static final String PROPERTY_DESELECT = "DESELECT";
    
    /**
     * 
     */
    private static final long serialVersionUID = 6199382429402306156L;
    
    /** A reference for the model. */
    private final PropertyChangeEnabledRaceControls myModel;
        
    /** Manager for Property Change Listeners. */
    private final PropertyChangeSupport myPcs;
    
    /**
     * Creates the components for the race view.
     * @param theModel the race model
     */
    public RaceView(final PropertyChangeEnabledRaceControls theModel) {
        super("Race Track");
        myModel = theModel;
        setLayout(new BorderLayout());
        myPcs = new PropertyChangeSupport(this);
        setUpComponents();
    }
    
    /**
     * Sets up the components.
     */
    private void setUpComponents() {
        final TrackPanel track = new TrackPanel(myPcs);
        myModel.addPropertyChangeListener(PROPERTY_TIME, track);
        myModel.addPropertyChangeListener(PROPERTY_HEADER, track);
        myModel.addPropertyChangeListener(PROPERTY_MESSAGES, track);
        myModel.addPropertyChangeListener(PROPERTY_BACK_TO_START, track);
        
        final LeaderBoardPanel leaderBoard = new LeaderBoardPanel(myPcs);
        myModel.addPropertyChangeListener(PROPERTY_TIME, leaderBoard);
        myModel.addPropertyChangeListener(PROPERTY_HEADER, leaderBoard);
        myModel.addPropertyChangeListener(PROPERTY_OUTPUT, leaderBoard);
        myModel.addPropertyChangeListener(PROPERTY_MESSAGES, leaderBoard);
        myModel.addPropertyChangeListener(PROPERTY_BACK_TO_START, leaderBoard);
        
        final StatusBar statusBar = new StatusBar();
        myModel.addPropertyChangeListener(PROPERTY_TIME, statusBar);
        myModel.addPropertyChangeListener(PROPERTY_HEADER, statusBar);
        myModel.addPropertyChangeListener(PROPERTY_OUTPUT, statusBar);
        myModel.addPropertyChangeListener(PROPERTY_MESSAGES, statusBar);
        myModel.addPropertyChangeListener(PROPERTY_BACK_TO_START, statusBar);
        myPcs.addPropertyChangeListener(PROPERTY_SELECT, statusBar);
        myPcs.addPropertyChangeListener(PROPERTY_DESELECT, statusBar);
        
        add(track, BorderLayout.WEST);
        add(leaderBoard, BorderLayout.EAST);
        add(statusBar, BorderLayout.SOUTH);
    }
    
    /**
     * Creates and displays the race view.
     */
    public void createAndShowGUI() {
        setIconImage(new ImageIcon("./images/ic_race_view.png").getImage());
        pack();
        setResizable(false);
        setVisible(true);
    }
}
