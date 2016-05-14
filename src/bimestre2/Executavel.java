/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimestre2;

import java.util.Scanner;

/**
 *
 * @author julionogueira
 */
public class Executavel {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double intervalo[] = new double[2];
    
        for(int i = 0; i < intervalo.length; i++){
            System.out.println("Insira o intervalo para "+i);
            intervalo[i] = scanner.nextDouble();
        }
        
        System.out.println("Insira o valor de epsylon");
        double epsylon = scanner.nextDouble();
        
        Calculo calculo = new Calculo();
        System.out.println("O valor da raiz é: "+calculo.run(intervalo, epsylon));
    }
    
    
   
}
