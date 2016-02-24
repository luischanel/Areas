/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Java19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sel, ladoA, ladoB, ladoC, radio1, salir=0;
        Circulo cr1= new Circulo();
        Cilindro cl1= new Cilindro();
        Cilindrohueco clh1= new Cilindrohueco();
        Scanner lector= new Scanner(System.in);
        while(salir==0){
            System.out.println("Seleccione figura:");
            System.out.println("1. Circulo   2. Cilindro 3. Clindro Hueco 4.Salir");
            sel=lector.nextInt();
            switch (sel){
                case 1:
                    System.out.println("Ingrese radio: ");
                    radio1=lector.nextInt();
                    cr1.setRadio(radio1);
                    System.out.println("La circunferencia es: "+cr1.Circunferencia());
                    System.out.println("El area es: "+cr1.Area());
                    break;            
                case 2:
                    System.out.println("Ingrese radio: ");
                    radio1=lector.nextInt();
                    cl1.setRadio(radio1);
                    System.out.println("Ingrese altura: ");
                    radio1=lector.nextInt();
                    cl1.setH(radio1);
                    System.out.println("El area es: "+cl1.AreaC());
                    System.out.println("El volumen es: "+cl1.Volumen());
                    break;            
                case 3:
                    System.out.println("Ingrese radio exterior: ");
                    radio1=lector.nextInt();
                    clh1.setRadio(radio1);
                    System.out.println("Ingrese radio interior: ");
                    radio1=lector.nextInt();
                    clh1.setRadioint(radio1);
                    System.out.println("Ingrese altura: ");
                    radio1=lector.nextInt();
                    clh1.setH(radio1);
                    System.out.println("El volumen es: "+clh1.VolumenH());
                    System.out.println("La circunferencia es: "+clh1.CircunferenciaH());
                    break;     
                case 4:
                    salir=1;
                    break;
            }
        }
        
    System.out.println("FIN");
    }
    
}
