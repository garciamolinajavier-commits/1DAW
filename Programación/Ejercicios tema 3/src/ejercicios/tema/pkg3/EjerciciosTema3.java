/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.tema.pkg3;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class EjerciciosTema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1.
        /**
        int[] num=new int[10];
        System.out.println("Introduce 10 numeros");
        for (int i = 0; i<num.length; i++){
            num[i]= sc.nextInt();
        }
        for (int i = 0; i<num.length; i++){
            System.out.println("Indice "+i+" Valor: "+num[i]);
        }
        */
        //Ejercicio 2.
        /**
        int[] num={2,46,3,45,4};
        int sumatotal=0;
        for (int i = 0; i<num.length; i++){
            sumatotal+=num[i];
            //System.out.println(sumatotal);
        }
        System.out.println("La suma total de la cadena es de "+sumatotal);*/
        //Ejercicio 3
        /**
        int[] num=new int[7];
        System.out.println("Introduce 7 numeros");
        for (int i = 0; i<num.length; i++){
            num[i]= sc.nextInt();
        }
        int sumatotal=0;
        for (int i = 0; i<num.length; i++){
            sumatotal+=num[i];
        }
        System.out.println("La media de los numeros introducidos es de "+sumatotal/7);*/
        //Ejercicio 4
        /**System.out.println("Introduce el indice de valores que quieres poner");
        int n =sc.nextInt();
        int[] num=new int[n];
        int max= -99999999;
        int min= 99999999;
        System.out.println("Introduce "+n+ " numeros");
        for (int i = 0; i<num.length; i++){
            num[i]= sc.nextInt();
            if(num[i]> max){
                max=num[i];
            }
            if(num[i]< min){
                min=num[i];
            }
            
        }
        System.out.println("El numero maximo es: "+max+" y el minimo es: "+min);
        */
        //Ejercicio 5
        [] abc= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    }
    
}
