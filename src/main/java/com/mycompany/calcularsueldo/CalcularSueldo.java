/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularsueldo;

import java.util.Scanner;

/**
 *
 * @author Johan
 */
public class CalcularSueldo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        grupoX X = new grupoX();
        grupoY Y = new grupoY();
        
        X.setNombre("Juan");
        X.setDepartamento("TI");
        X.setCargo("INGENIERO");
        
        X.setSueldoMensual(2000);
        
        X.calcularQuincena();
        
        System.out.println("------Salida------");
        System.out.println("Nombre: " + X.getNombre());
        System.out.println("Sueldo: " + X.getSueldoQuincenal());
        
        Y.setNombre("ISABEL");
        Y.setDepartamento("TI");
        Y.setCargo("INGENIERA");
        
        Y.setCuotasTrabajadas(50);
        Y.setHorasTrab(12);
        
        Y.calcularQuincena();
        
        System.out.println("------Salida------");
        System.out.println("Nombre: " + Y.getNombre());
        System.out.println("Sueldo: " + Y.getSueldoQuincenal());
        
        
    }
}
