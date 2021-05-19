package com.espiritu.juego.clases;

//import java.awt.Rectangle;
//import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;




public class Raqueta  {

    int x=15;
    int y=15; 
    int ancho = 15;
    int alto = 500;

    private final Panel panel;
    
    public Raqueta (final Panel panel){
       
        this.panel=panel;

    }
    public Raqueta(Panel panel , int x, int y){
        this.panel=panel;
        this.x=x;
        this.y=y;

    }

    public Raqueta( Panel panel, int x,  int y, int alto , int ancho ){
        this.panel=panel;
        this.x=x;
        this.y=y;
        this.ancho=ancho;
        this.alto=alto;
        
    }


    public void moverRaqueta1(){
        if(EventoTeclado.w && y > panel.getY()){
            y--;
        }
        if (EventoTeclado.s && y < panel.getY()-alto) {
            y++;
        }
    }

    public void moverRaqueta2() {
        if (EventoTeclado.up && y > panel.getY()) {
            y--;
        }
        if (EventoTeclado.down && y < panel.getY()-alto) {
            y++;
        }
    }




    public void pintarRaqueta (final Graphics2D g2){
        g2.fillRect(x, y, ancho, alto);

    }






/////////////



  /*  public class EventoDeTeclado extends KeyListener{

        static boolean w;
		static boolean s;
		static boolean up;
		static boolean down;

		

		@Override
		public void keyPressed(KeyEvent e) {

        final int id = e.getKeyCode();
        if (id == KeyEvent.VK_W) {
            w = true;

        }
        if (id == KeyEvent.VK_S) {
            s = true;

        }
        if (id == KeyEvent.VK_UP) {
            up = true;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = true;
        }
			
			
		}

		@Override
		public void keyReleased( KeyEvent e) {

            final int id = e.getKeyCode();
        if (id == KeyEvent.VK_W) {
            w = false;
        }
        if (id == KeyEvent.VK_S) {
            s = false;
        }
        if (id == KeyEvent.VK_UP) {
            up = false;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = false;
        }
			
			
		}

    }*/



      

 

}