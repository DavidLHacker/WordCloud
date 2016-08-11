/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author veikkokrypczyk
 */
public class DrawingPanel extends JPanel {

    private List<String> words;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (words != null) {
            for (String w : words) {
                g.drawString(w, 200, 300);
            }
        }
    }

    /**
     * @return the words
     */
    public List<String> getWords() {
        return words;
    }

    /**
     * @param words the words to set
     */
    public void setWords(List<String> words) {
        this.words = words;
    }

}
