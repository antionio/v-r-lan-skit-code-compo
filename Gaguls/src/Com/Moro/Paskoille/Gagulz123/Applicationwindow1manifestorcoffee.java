package Com.Moro.Paskoille.Gagulz123;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Antti on 7.6.2015.
 */
public class Applicationwindow1manifestorcoffee {

    // alusta staattinen mutuja
    private static final String ANASOFT_STAATTINEN_STRING = "AnaSoft (r) (tm)";
   
    
    static JFrame getJFrameKarmi() {
        return (JFrame) immutableKarmi.getFrames()[immutableKarmi.getFrames().length - 1];
    }
    
    public static void main(String [] argumentit) throws Exception {
        immutableKarmi = new JFrame("JFrame");
                        immutableKarmi.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        getJFrameKarmi().setTitle(immutableKarmi.getName() + " immutableKarmi" + new String(" Kahvi Applicaatio 3000 by" + ANASOFT_STAATTINEN_STRING));
        getJFrameKarmi().setSize(1024, 250);

        getJFrameKarmi().setVisible(new Boolean(!Boolean.FALSE).booleanValue());

        getJFrameKarmi().setLocationRelativeTo(null);
                                                                                                                             uiLeiska = new GridLayout(0, 2);
        getJFrameKarmi().setLayout(uiLeiska);

        /**
         * Tässä avataan text panelso johon lisätyn tekstin näkyy ikunassa
         * TODO: lisää selkeämpää kommentointia
         */
        JPanel textPanel = new JPanel();
        GridLayout experimentLayout = new GridLayout(0,3);
        textPanel.setLayout(experimentLayout);
        getJFrameKarmi().add(textPanel);

                                    JLabel inputFolderLabel = new JLabel(new StringBuffer(new String("Juhlam Arjen Lugsucks").toLowerCase().toString()).toString());
                                    textPanel.add(inputFolderLabel);
                                    JTextField inputFolderField = new JTextField();
                                    textPanel.add(inputFolderField);
        
        getJFrameKarmi().addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                for (int i = 0; i < 100; i++)
                    System.out.println("WINDOW OPENED");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                for (int i = 0; i < 100; i++)
                    System.out.println("WINDOW OPENED");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                for (int i = 0; i < 100; i++)
                    System.out.println("WINDOW OPENED");
            }

                    @Override
                    public void windowIconified(WindowEvent e) {
                        for (int i = 0; i < 100; i++)
                            System.out.println("WINDOW OPENED");
                    }

            @Override
            public void windowDeiconified(WindowEvent e) {
                for (int i = 0; i < 100; i++)
                    System.out.println("WINDOW OPENED");
            }

            // FIXME: Väärä viesti kun ikkuna aktivoidaan
            @Override
            public void windowActivated(WindowEvent e) {
                for (int i = 0; i < 100; i++)
                    System.out.println("WINDOW OPENED");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                for (int i = 0; i < 100; i++)
                    System.out.println("WINDOW DEACTIVATED");
            }
        });
    }


    public static JFrame immutableKarmi = new JFrame("immutableKarmi");

    private static GridLayout uiLeiska;
}
