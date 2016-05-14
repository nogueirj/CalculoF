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
public class Calculo {
    
    BigDecimal s = new BigDecimal(10000);
//    double s = 10000;
    int i = 1;
    int n;
    BigDecimal x;
//    double x;
    public Calculo() {
    }    
    
    public BigDecimal run(int n, BigDecimal x){
        this.n = n;
        this.x = x;
        while(i<n){
            x.add(x);
            i++;
        }
        //System.out.println("Valor de X somado: "+x);
        return s.min(x);
    }
//    public double run(int n, double x){
//        this.n = n;
//        this.x = x;
//        while(i<n){
//            x += x;
//            i++;
//        }
//        System.out.println("Valor de X somado: "+x);
//        return s - x;
//    }
}
