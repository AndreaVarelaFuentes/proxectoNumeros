/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noemí
 */
public class Numeros {
    public static boolean multipoTres(int num) {
        if(num%3==0) 
            return true;
        else
            return false;
    }
    public static boolean positivo(int num){
        if (num>0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println("Proxecto numeros");
        System.out.println("Funcionalidade verificar se o número é positivo");
        int num1=7;
        System.out.println("Número positivo:"+positivo(num1));
        System.out.println("Número mútlipo de tres: " + multipoTres(num1));
    }
}
