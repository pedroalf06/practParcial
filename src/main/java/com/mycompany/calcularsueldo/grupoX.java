/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularsueldo;

/**
 *
 * @author Johan
 */
public class grupoX extends empleado {
    
    private double sueldoMensual;
    
    public void setSueldoMensual(double sueldoMensual){
        this.sueldoMensual = sueldoMensual;
    }
    
    @Override
    public void calcularQuincena(){
        sueldo = sueldoMensual/2;
    }
    
}
