/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java19;

/**
 *
 * @author Usuario
 */
public class Cilindro extends Circulo {
    protected double h;

    public void setH(double h) {
        this.h = h;
    }
    
    public double AreaC(){
        return (2*pi*radio*h+2*pi*radio*radio);
    }
    public double Volumen(){
        return pi*radio*radio*h;
    }
    
}
