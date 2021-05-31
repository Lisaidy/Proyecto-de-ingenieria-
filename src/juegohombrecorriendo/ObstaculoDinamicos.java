/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegohombrecorriendo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import static juegohombrecorriendo.Obstaculo.posicionX;


/**
 *
 * @author HP 360
 */
public class ObstaculoDinamicos extends ElementoDinamico {
    public int estaRodando;
    private String rutaObstaculo ="/imagenes/arbol.png";
    
    public int valorIniciarX=500;
    public int x;
    
    public ObstaculoDinamicos(PanelDeJuego panelDeJuego, Carretera carretera, int Desplazamiento) {
       super( panelDeJuego );
        valorIniciarX += Desplazamiento;
        x = valorIniciarX;
       
        
    }
    
    public ObstaculoDinamicos(String lizy,PanelDeJuego panelDeJuego, Carretera carretera, int Desplazamiento) {
       super( panelDeJuego );
        rutaObstaculo=lizy;
        valorIniciarX += Desplazamiento;
        x = valorIniciarX;
       
        
    }
 
   public void ReiniciarPosicion()
   {
       x=this.valorIniciarX;
   }
   
    @Override
    public void dibujar(Graphics g){
           if( estaRodando <= 1){
 
        }
     int yJugador = 150 + estaRodando ;
    
    
    
    
    Image imagen1 = new javax.swing.ImageIcon(getClass().getResource(rutaObstaculo)).getImage();
    
    
    if(x < -400)
        x = 1000;
    
    Rectangle BombaCuadro = new Rectangle(x-=15, panelDeJuego.getHeight()- yJugador +80 , 50, 50);
    this.limites=BombaCuadro;
    g.drawImage(imagen1, BombaCuadro.x, BombaCuadro.y, BombaCuadro.width, BombaCuadro.height, panelDeJuego);
    //g.drawRect(BombaCuadro.x, BombaCuadro.y, BombaCuadro.width, BombaCuadro.height);
   
           
    
}
    }