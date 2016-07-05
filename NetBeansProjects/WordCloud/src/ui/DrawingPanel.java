/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author veikkokrypczyk
 */
public class DrawingPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Hallo Lars", 200, 200);
    }
}
