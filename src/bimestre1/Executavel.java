package bimestre1;

import java.math.BigDecimal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julionogueira
 */
public class Executavel {
    public static void main(String[] args) {
        Calculo c = new Calculo();
        System.out.println("Resultado final do somatorio: "+c.run(100000, new BigDecimal(0.1)));
//        System.out.println("Resultado final do somatorio: "+c.run(100000, 0.1));
    }
}
