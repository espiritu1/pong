package com.espiritu.juego;

import javax.swing.JFrame;



public class Ventana extends JFrame {
	
	
	
	public Panel panel = new Panel();
	
	  public Ventana (){
	    this.setSize (1300,700);
	    
	  
	    this.add(panel);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    while (true){

	      panel.moverPelotas();
	      panel.repaint();

	      try{
	      Thread.sleep(3);
	    } catch (InterruptedException e){

	      System.out.println(e);

	    }

	    }
	
	  }
	

}
