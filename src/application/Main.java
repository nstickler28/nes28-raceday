package application;

import java.awt.EventQueue;
import java.net.URL;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.MainFrame;


/**
 * Driver for the Astonishing Race.
 * 
 * @author Charles Bryan
 * @version Autumn 2019
 */
public final class Main {

    /**
     * Does not allow public construction.
     */
    private Main() {
    }
    
    /**
     * Set the look and feel for the GUI program.
     */
    private static void setLookAndFeel() {

        try {

            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            /* Turn off metal's use of bold fonts */
            UIManager.put("swing.boldMetal", Boolean.FALSE);

        } catch (final UnsupportedLookAndFeelException e) {
            System.out.println("UnsupportedLookAndFeelException");
        } catch (final ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        } catch (final InstantiationException e) {
            System.out.println("InstantiationException");
        } catch (final IllegalAccessException e) {
            System.out.println("IllegalAccessException");
        }

    }

    /**
     * The start point for the Astonishing Race application.
     * 
     * @param theArgs command line arguments - ignored in this program
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                setLookAndFeel();
                MainFrame.createAndShowGUI();
            }
        });
    }
    
    /**
     * Wrapper method to get a system resource.
     * 
     * @param theResource the name of the resource to retrieve
     * @return the resource
     */
    public static URL getRes(final String theResource) {
        return Main.class.getResource(theResource);
    }
}
