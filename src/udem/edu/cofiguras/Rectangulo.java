/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.cofiguras;

/**
 *
 * @author s103e2
 */
public class Rectangulo extends FiguraGeometrica{
     public Rectangulo(double Base,double Altura) {
        super("Rectangulo",(Base*Altura),(Base*2+Altura*2));
    }
}
