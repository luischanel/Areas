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
public class Cilindrohueco extends Cilindro {
        protected double radioint;

    public void setRadioint(double radioint) {
        this.radioint = radioint;
    }
        
        
    public double CircunferenciaH(){
        return (2*pi*(radio*radio-radioint*radioint)+2*pi*radio*h+2*pi*radioint*h);
    }
        
 public double VolumenH(){
        return pi*(radio*radio-radioint*radioint)*h;
    }
}
