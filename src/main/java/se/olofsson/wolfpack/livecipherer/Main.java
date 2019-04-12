package se.olofsson.wolfpack.livecipherer;

import javax.swing.*;

/**
 * Created on 2016-05-29.
 * @author Christoffer Olofsson
 */
public class Main
{
    public static final String CURRENT_VERSION = "v0.3";    // TODO: Set this to build.gradle->version in pre compile.

    public static void main(String[] args)
    {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }

        new LiveCipher().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
