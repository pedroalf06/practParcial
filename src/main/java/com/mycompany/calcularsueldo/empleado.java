/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularsueldo;

/**
 *
 * @author Johan
 */
public class empleado {
    private String nombre;
    private String departamento;
    private String cargo;
    protected double sueldo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCargo() {
        return cargo;
    }
    
    
    
    public void calcularQuincena(){
        System.out.println("CALCULAR QUINCENA!!");
    }
    
    public double getSueldoQuincenal(){
        return sueldo;
    }
    
}
