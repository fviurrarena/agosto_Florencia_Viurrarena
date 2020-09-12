package Practico3;

import java.util.Scanner;

public class Boolean_Ejercicio1 {
//Método que reciba dos números y retorne verdadero si el primer numero es mayor que el segundo.
//De lo contrario, retornar debe retornar falso.

    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        int[] lista = ingresarNumeros(input);
        if (primerNumeroMayorASegundo(lista[0], lista[1])){
            System.out.println("Es VERDADERO, primer numero > segundo numero");
        }else{
            System.out.println("Es FALSO primer numero < segundo numero");
        }
    }

    public static int[] ingresarNumeros(Scanner input){
        int[] lista = new int[2];
        System.out.println("Ingrese el primer numero");
        lista[0] = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        lista[1] = input.nextInt();
        return lista;
    }
    public static boolean primerNumeroMayorASegundo (int num1, int num2){
        boolean esMayor=true;
        if (num1>num2){
            esMayor=true;
        }else{
            esMayor=false;
        }
        return esMayor;
    }

}
