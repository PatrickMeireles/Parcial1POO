/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author alunos
 */
public class Circle {
    private double radius;
    private String color;
    
    
    
    public Circle () {
       this.radius = 1.0;
       this.color = "red"; 
       
    }
    
    public Circle(double radius) {
        this.radius = radius;
        
    }
    
    public Double getArea() {
        double area;
        area = (radius*radius)*Math.PI;
        return area;
       
    }
    
    public double getRadius() {
        return this.radius;
        
    }

    @Override
    public String toString() {
        return "Circulo: raio=" + this.radius + " cor=" + this.color;
    }
    
    
}
