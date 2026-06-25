/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularsueldo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Johan
 */
public class CalcularSueldo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre, departamento,cargo;
        double asignacion;
        int opc;
        
       ArrayList<grupoX> listaX = new ArrayList<>();
       ArrayList<grupoY> listaY = new ArrayList<>();
        
        
        do{
        
        System.out.println("Ingrese la opcion que desea: ");
        System.out.println("1 - Empleado X\n2 - Empleado Y \n 3 - Salir\n");
        opc = sc.nextInt();
        
        switch (opc){
        
        
        case 1:  
        sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        
         System.out.println("Ingrese el departamento: ");
        departamento = sc.nextLine();
        
        System.out.println("Ingrese el cargo: ");
        cargo = sc.nextLine();
        
        System.out.println("Ingrese la asignacion mensual: ");
        asignacion = sc.nextDouble();
        
        
       grupoX X = new grupoX();
        
        X.setNombre(nombre);
        X.setDepartamento(departamento);
        X.setCargo(cargo);
        
        X.setSueldoMensual(asignacion);
        
        X.calcularQuincena();
        
        listaX.add(X);
        
        break;
        
        case 2: 
        sc.nextLine();
         System.out.println("\nIngrese el nombre: ");
        nombre = sc.nextLine();
        
         System.out.println("Ingrese el departamento: ");
        departamento = sc.nextLine();
        
        System.out.println("Ingrese el cargo: ");
        cargo = sc.nextLine();
        
        System.out.println("Ingrese las horas trabajadas: ");
        int horas = sc.nextInt();
        
         System.out.println("Ingrese la cuota por hora: ");
        double cuota = sc.nextDouble();
        
         grupoY Y = new grupoY();
        
        Y.setNombre(nombre);
        Y.setDepartamento(departamento);
        Y.setCargo(cargo);
        Y.setCuotasTrabajadas(cuota);
        Y.setHorasTrab(horas);
        Y.calcularQuincena();
        
        listaY.add(Y);

       break;
       
        case 3: System.out.println("PROGRAMA FINALIZADO");
        break;
       
       
        default: System.out.println("opcion invalida");
        }
        }while(opc != 3);
        
                
      System.out.println("\n====== REPORTES FINALES ======");
        
        System.out.println("------ Salidas Grupo X ------");
        for (int i = 0; i < listaX.size(); i++) {
            grupoX x = listaX.get(i);
            System.out.println("Nombre: " + x.getNombre() + " | Sueldo: " + x.getSueldoQuincenal());
        }
        
        System.out.println("\n------ Salidas Grupo Y ------");
        for (int j =0;j<listaY.size();j++) {
            grupoY y = listaY.get(j);
            System.out.println("Nombre: " + y.getNombre() + " | Sueldo: " + y.getSueldoQuincenal());
        }
        
        
    }
}
