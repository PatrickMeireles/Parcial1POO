/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

/**
 *
 * @author Meireles
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;
    
    public MyPoint() {
        this.x = x;
        this.y = y;
    }
    
    public MyPoint(int x, int y) {
        this.x=x;
        this.y=y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x,int y) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "\nValor de X: "+ x + "\nValor de Y: "+ y;
    }
    
    public double Distance (int x, int y) {
        int diferencaX = this.x - x;
        int diferencaY = this.y - y;
        return Math.sqrt(diferencaX*diferencaX + diferencaY*diferencaY);
    }
    public double Distance (MyPoint MyPoint) {
        int diferencaX = MyPoint.getX() - this.getX();
        int diferencaY = MyPoint.getY() - this.getY();
        return Math.sqrt((Math.pow(diferencaX, 2)) + (Math.pow(diferencaY, 2)));
    }
    
    
}

