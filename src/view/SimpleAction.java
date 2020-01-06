package view;

import application.Main;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;


/**
 * This is a simple implementation of an Action. You will most likely not use this
 * implementation in your final solution. Either create your own Actions or alter this to
 * suit the requirements for this assignment.
 * 
 * @author Charles Bryan
 * @version Autumn 2019
 */
public class SimpleAction extends AbstractAction {
    
    /** The serialization ID. */
    private static final long serialVersionUID = -3160383376683650991L;
    
    /** An instance of ActionCallback. */
    private final ActionCallback myCallback;

    /**
     * Constructs a SimpleAction.
     * 
     * @param theText the text to display on this Action
     * @param theIcon the icon to display on this Action
     * @param theCallback the Callback
     */
    SimpleAction(final String theText, final String theIcon,
                 final ActionCallback theCallback) {
        super(theText);
        myCallback = theCallback;
        // small icons are usually assigned to the menu
        final ImageIcon icon = (ImageIcon) new ImageIcon(Main.getRes(theIcon));
        setIcon(icon);
    }
    
    /**
     * Helper to set the Icon to both the Large and Small Icon values. 
     * @param theIcon the icon to set for this Action 
     */
    public final void setIcon(final ImageIcon theIcon) {
        final ImageIcon icon = (ImageIcon) theIcon;
        final Image largeImage =
            icon.getImage().getScaledInstance(24, 24, java.awt.Image.SCALE_SMOOTH);
        final ImageIcon largeIcon = new ImageIcon(largeImage);
        putValue(Action.LARGE_ICON_KEY, largeIcon);
        
        final Image smallImage =
            icon.getImage().getScaledInstance(12, -1, java.awt.Image.SCALE_SMOOTH);
        final ImageIcon smallIcon = new ImageIcon(smallImage);
        putValue(Action.SMALL_ICON, smallIcon);
    }


    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        myCallback.onActionPerformed(theEvent);
    }
    
    /**
     * An interface for actions performed.
     * 
     * @author Nathan Stickler
     * @version 11/23/19
     */
    public interface ActionCallback {
        
        /**
         * Call for actions of buttons being pressed.
         * @param theEvent the event
         */
        void onActionPerformed(ActionEvent theEvent);       
    }
}
