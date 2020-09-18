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
public class FiguraGeometrica {
    
    private String nombre;
    private double Area;
    private double perimetro;

    
    public FiguraGeometrica() {
    }
    
    
    public FiguraGeometrica(String nombre, double Area, double perimetro) {
        this.nombre = nombre;
        this.Area = Area;
        this.perimetro = perimetro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "{\n"+"\"" + nombre  + ":{\n \"Area\":"+ Area + ":\n \"Perimetro\":" + perimetro +  "\n }";
    }
    
   
    
}

   
    
    
    

