/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularsueldo;
import java.util.ArrayList;
/**
 *
 * @author Johan
 */
public class empleado {
    private ArrayList<String> nombre = new ArrayList<>();
    private ArrayList<String> departamento = new ArrayList<>();
    private ArrayList<String> cargo = new ArrayList<>();
    protected ArrayList<Double> sueldo = new ArrayList<>();

    public void setNombre(String nombre) {
        this.nombre.add(nombre);
        //this.nombre= nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento.add(departamento);
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
