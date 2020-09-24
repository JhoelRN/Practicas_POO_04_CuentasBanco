/*
   CLASE CCuentaAhorro : clase derivada de CCuenta
    CLASE PADRE: CCuenta
        MAIN 04
 */
package edu.utp.poo.libreria;
import java.util.*;
/**
 * @author Jhoel RN MH
 * jhoelrn@hotmail.com
 */
public class CCuentaAhorro extends CCuenta{
    //ATRIBUTOS
    private double cuotaMantenimiento;
    
    //CONSTRUCTORES
    public CCuentaAhorro(){
        
    }

    public CCuentaAhorro(String nom, String cue, double sal, double tipo, 
                            double cuotaMantenimiento) {
        super(nom, cue, sal, tipo);  // invoca al constructor CCuenta
        //this.cuotaMantenimiento = cuotaMantenimiento;
        asignarCuotaManten(cuotaMantenimiento);    // inicia cuotaMantenimiento
    }
    
    //METODOS
    public void asignarCuotaManten(double cantidad){
        if (cantidad < 0) {
            System.out.println("Error: Cantidad Negativa");
            return;
        }
        cuotaMantenimiento = cantidad;
    }
    
    public double obtenerCuotaManten(){
        return cuotaMantenimiento;
    }
    
    public void comisiones(){
        // Se aplican mensualmente por el mantenimiento de la cuenta
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        
        if (dia == 1) {
            reintegro(cuotaMantenimiento);
        }
    }
    
    
    
    
    
    
    
    
}
