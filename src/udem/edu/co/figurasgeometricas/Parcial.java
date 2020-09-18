/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.figurasgeometricas;

import java.util.ArrayList;
import udem.edu.cofiguras.FiguraGeometrica;


/**
 *
 * @author s103e2
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figurageometrica= new ArrayList<FiguraGeometrica>();
        figurageometrica.add(new udem.edu.cofiguras.Cuadrado(10));
        figurageometrica.add(new udem.edu.cofiguras.Triangulo(5, 5, 5, 5));
        figurageometrica.add(new udem.edu.cofiguras.Rectangulo(10, 50));
        
        
        System.out.println(figurageometrica);
        System.out.println("En xml un cuadrado");
        System.out.println("<FiguraGeometrica>\n" +
"	<Cuadrado Area = 10 perimetro=10 ></Cuadrado>\n" +
"</FiguraGeometrica>");
    }
    
}
