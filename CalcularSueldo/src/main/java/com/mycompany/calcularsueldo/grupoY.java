/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularsueldo;

/**
 *
 * @author Johan
 */
public class grupoY extends empleado {
    private double cuotaHoras;
    private int horasTrab;
    
    public void setCuotasTrabajadas(double cuotaHoras){
        this.cuotaHoras = cuotaHoras;
    }
    
    public void setHorasTrab(int horasTrab){
        this.horasTrab = horasTrab;
    }
    
    @Override
    public void calcularQuincena(){
        sueldo = cuotaHoras*horasTrab;
    }
}
