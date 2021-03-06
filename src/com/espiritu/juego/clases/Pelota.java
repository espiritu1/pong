package com.espiritu.juego.clases;


import java.awt.Graphics2D;



public class Pelota {
	
	int x = 610; 
	int	y = 350; 
	int	velX = 2; 
	int	velY = 2; 
	int	tamano = 40 ;

	private Panel panelito;



    public Pelota (Panel xp){

      this.panelito = xp;

    }

    public Pelota (Panel xp, int xvel, int yvel, int xtamano){

      this.panelito = xp;
      this.velX = xvel;
      this.velY = yvel;
      this.tamano = xtamano;
    }

    public void moverPelota (){

      //borde izquierdo
      if ( x + velX < 0 ) velX = velX * -1 ;
      //borde derecho
      if ( x + velX > panelito.getWidth() - tamano) velX =  velX * -1;
      //borde superior
      if ( y + velY < 0 ) velY = velY * -1;
      //borde inferior
      if ( y + velY > panelito.getHeight() - tamano) velY = velY * -1;

      this.x = this.x + velX;
      this.y = this.y + velY;
    }

    public void pintarPelota(Graphics2D g2){

      g2.fillOval (x,y, tamano,tamano);
    }
	
	

}
