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
public class Circulo {
    final double pi=3.141592;
    protected double radio;
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double LeerRadio(){
            return radio;
        }
    
    public double Circunferencia(){
        return 2*pi*radio;
    }
    
    public double Area(){
        return pi*radio*radio;
    }
}
