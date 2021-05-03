package com.espiritu.juego;


import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.RenderingHints;


public class Panel extends JPanel {
	
	Pelota a1 = new Pelota(this);
 
    public void moverPelotas (){

      a1.moverPelota();
    }


    public void paintComponent(Graphics g){
      super.paintComponent(g);
      
      setBackground(Color.GRAY);
      Graphics2D g2 = (Graphics2D)g;
      g2.setColor(Color.BLACK);
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      a1.pintarPelota(g2);
     
    }

}














