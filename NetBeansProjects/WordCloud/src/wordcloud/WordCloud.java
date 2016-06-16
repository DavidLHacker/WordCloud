/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcloud;

import ui.MainFrame;


/**
 *
 * @author veikko
 */
public class WordCloud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainFrame frame=new MainFrame();
        frame.setTitle("Word Cloud");
        frame.setSize(1000, 600);
        frame.setVisible(true);
    }
    
}
