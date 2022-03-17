/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       Scanner intSC = new Scanner(System.in);
        float x = 0;
        float soma = 0;
        float media = -1;
        do{
            soma +=x;
            media = media + 1;
            System.out.print("Digite um número: ");
            x = intSC.nextFloat();
            System.out.println();
        }while(x >= 0);
        
        if(media == 0){
            System.out.println("0/1 = 0");
        } else {
            float resultado = soma/media;
            System.out.println(soma + "/" + media + " = " + resultado);
        }
    }
}