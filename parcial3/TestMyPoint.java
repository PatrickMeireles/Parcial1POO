package parcial3;


import java.util.Random;

public class TestMyPoint {

    public static void main(String[] args) {
        
        Random rd = new Random(); //Gerar valores aleatórios
        int p3 = rd.nextInt(50);
        int p4 = rd.nextInt(50);
        
        MyPoint ponto1 = new MyPoint(50,50);
        MyPoint ponto2 = new MyPoint(p3,p4); // Ponto 2 pegando valores aleatórios
         
        System.out.println("\nValores do primeiro ponto " + ponto1 );

        System.out.println("\nValores do segundo ponto " + ponto2 );

        System.out.println("\nA distância entre os pontos: "+ponto1.Distance(ponto2));

        

       
        
    }

}
