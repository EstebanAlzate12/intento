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
public class Triangulo extends FiguraGeometrica{
    public Triangulo(double Base,double Altura,double Lado1, double Lado2) {
        super("Triangulo",((Base*Altura)/2),(Base+Lado1+Lado2));
    }

}
