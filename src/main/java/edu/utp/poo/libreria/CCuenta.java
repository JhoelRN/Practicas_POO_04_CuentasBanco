/*
   CLASE CCUENTA : clase que agrupa los datos comunes a cualquier
                    tipo de cuenta bancaria.
        MAIN 04
 */
package edu.utp.poo.libreria;

/**
 * @author Jhoel RN MH
 * jhoelrn@hotmail.com
 */
public class CCuenta {
    //ATRIBUTOS
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;
    
    
    //CONSTRUCTORES Y METODOS
    public CCuenta(){
    }
    public CCuenta(String nom, String cue, double sal, double tipo){
        asignarNombre(nom);
        asignarCuenta(cue);
        ingreso(sal);
        asignarTipoDeInteres(tipo);
    }
    
    public void asignarNombre(String nom){
        if (nom.length() == 0) {
            System.out.println("Error : CADENA VACIA ×××××× ");
            return;
        }
        nombre = nom;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void asignarCuenta(String cue){
        if (cue.length() == 0) {
            System.out.println("Error: Cuenta no VÁLIDA ××××××");
            return;
        }
        cuenta = cue;
    }
    
    public String obtenerCuenta(){
        return cuenta;
    }
    
    public double estado(){
        return saldo;
    }
    
    public void comisiones(){
    }
    
    public void ingreso(double cantidad){
        if (cantidad < 0) {
            System.out.println("Error: cantidad Negativa ××××××");
            return;
        }
        saldo += cantidad;
    }
    
    public void reintegro(double cantidad){
        if (saldo - cantidad < 0) {
            System.out.println("Error: no dispone de saldo ××××××");
            return;
        }
        saldo -= cantidad;
    }
    
    public void asignarTipoDeInteres(double tipo){
        if (tipo < 0) {
            System.out.println("Error: tipo no válido ××××××");
            return;
        }
        tipoDeInteres = tipo;
    }
    
    public double obtenerTipoDeInteres(){
        return tipoDeInteres;
    }
    
    
    
    
    
    
}
