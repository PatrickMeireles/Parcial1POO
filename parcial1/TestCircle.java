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
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double raio = 5;
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(raio);
        
        System.out.println(c1.toString());
        System.out.println("Area");
        System.out.println(c1.getArea());
        System.out.println("Raio");
        System.out.println(c1.getRadius());
        
        System.out.println("-------------------");
        System.out.println(c2.toString());
        System.out.println("Area");
        System.out.println(c2.getArea());
        System.out.println("Raio");
        System.out.println(c2.getRadius());
       
    }
    
}
