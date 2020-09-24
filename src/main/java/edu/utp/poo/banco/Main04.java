/*
 * CLASE PRINCIPAL MAIN04: POO_04_CUENTASBANCO
 */
package edu.utp.poo.banco;
import edu.utp.poo.libreria.*;
/**
 * Programación Orientada a Objetos.
 * @author Jhoel RN MH
 * jhoelrn@hotmail.com
 */
public class Main04 {

    public static void main(String[] args) {
        CCuentaAhorro cliente01 = new CCuentaAhorro();
        CCuentaAhorro cliente02 = new CCuentaAhorro("Cliente 02","Cta: 998877", 1000000, 3.5, 300);
        cliente01.asignarNombre("Cliente 01");
        cliente01.asignarCuenta("Cta: 10101010");
        cliente01.asignarTipoDeInteres(2.5);
        cliente01.asignarCuotaManten(300);
        
        cliente01.ingreso(1000000);
        cliente01.reintegro(500000);
        cliente01.comisiones();
        
        System.out.println("------------------------");
        System.out.println(cliente01.obtenerNombre());
        System.out.println(cliente01.obtenerCuenta());
        System.out.println(cliente01.estado());
        System.out.println(cliente01.obtenerTipoDeInteres());
        
        System.out.println("------------------------");
        System.out.println(cliente02.obtenerNombre());
        System.out.println(cliente02.obtenerCuenta());
        System.out.println(cliente02.estado());
        System.out.println(cliente02.obtenerTipoDeInteres());
        
    }
    
}
