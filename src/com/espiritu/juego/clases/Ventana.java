package com.espiritu.juego.clases;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JButton;


public class Ventana extends JFrame {
	
	public Panel panel = new Panel();
	public JButton b = new JButton("este boton es una futura barra XD pero aun no es ni madres");
	

	public Ventana (String pong, int x, int y, int ancho, int alto){
		super(pong);
		this.setBounds(x,y,ancho, alto);
	    this.setLayout(new BorderLayout());
	


		this.add(b,BorderLayout.NORTH);
	    this.add(panel,BorderLayout.CENTER);
	

	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    this.setVisible(true);
	    while (true){
		
	    	panel.moverTodo();
	    	panel.repaint();
		    
	      try{
	      Thread.sleep(3);
	      } catch (InterruptedException e){
	      System.out.println(e);
	      }
	    }
	  }
}

















	









