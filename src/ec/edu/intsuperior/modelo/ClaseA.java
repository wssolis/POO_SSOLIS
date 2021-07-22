/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author SANTIAGO SOLIS
 */
public class ClaseA {
    //atributos
    
    
    //metodos
    //metodo de clase de salida
    public static void caminar(){
        System.out.println("hola yo soy el metodo para caminar");
    }
    //metodo de clase de retorno
    public static String retornarDatos(){
        String x;
        x="hola";
        return x;
    }
    //metodo de instancia de salida
    public void vacilar(){
        System.out.println("Hoy no estudio POO por q me voy de vacile");
    }
    //metodo de instancia de retorno
    public boolean estudiar(){
        
        return 5==6; 
    }
    
}
