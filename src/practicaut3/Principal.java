/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaut3;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto de la clase Reloj
        Reloj miReloj=new Reloj(7,7,59);
        //Mostramos la hora en formato 24H
        System.out.println("La hora que marca miReloj en formato 24H es:");
        System.out.println(miReloj.hora24());
        //Mostramos la hora en formato 12H
        System.out.println("La hora que marca miReloj en formato 12H es:");
        System.out.println(miReloj.hora12());
        //Sumamos un segundo a la hora que marca miReloj
        miReloj.incrementa();
        //Mostramos la hora tras aumentar un segundo la hora
        System.out.println("La hora tras sumar un segundo en formato 24H es: ");
        System.out.println(miReloj.hora24());
        System.out.println("La hora tras sumar un segundo en formato 12H es: ");
        System.out.println(miReloj.hora12());
        //Cambio la hora a las 7:7:00
        System.out.println("Cambio la hora a 7:00:00");
        miReloj.setMM(0);
        miReloj.setSS(0);
        //Restamos un segundo
        miReloj.decrementa();
        //Mostramos la hora tras restar un segundo la hora
        System.out.println("La hora tras restar un segundo en formato 24H es: ");
        System.out.println(miReloj.hora24());
        System.out.println("La hora tras restar un segundo en formato 12H es: ");
        System.out.println(miReloj.hora12());
        
    }
    
}
