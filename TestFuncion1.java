/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfuncion1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class TestFuncion1 {

    static final int N = 30;

    public static void main(String[] args) {
        int arreglo[]=new int [N];
        System.out.println("Vendedor de articulos de cocina");
        ingresar(arreglo);
        System.out.println("Se logro la venta mayor el día "+mayor(arreglo));
        System.out.println("El total de las ventas fue de "+totalVentas(arreglo));
        menorDias(arreglo);
        System.out.println("La remuneracion del empleado en el mes de abril fue de "+totalVentas(arreglo)/100);
        
    }
    public static void ingresar (int[] venta){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<venta.length;i++){
            System.out.println("Ingrese ventas del dia "+(i+1));
            venta[i]=sc.nextInt();
        }
    
    }
    public static int mayor(int[] mayor){
        int auxiliar=0;
        int dia=0;
        
        for(int i=0;i<mayor.length;i++){
            if(mayor[i]>auxiliar){
                auxiliar=mayor[i];
                dia=i+1;
            }
        }
        return dia;
    }
    public static int totalVentas(int[] dias){
        int maximo=0;
        for(int i=0;i<dias.length;i++){
            maximo=maximo+dias[i];
        }
        return maximo;    
    }
    public static void menorDias(int[] buscaMenor){
        System.out.println("Los dias con ventas menores de 10000 :");
        for(int i=0;i<buscaMenor.length;i++){
            if(buscaMenor[i]<10000){
                System.out.print("["+i+1+"] ");
            }
        
        }
    
    }
    
    
}
