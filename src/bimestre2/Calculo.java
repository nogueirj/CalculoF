/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimestre2;

/**
 *
 * @author julionogueira
 */
public class Calculo {
    
    public double[] run(double[] intervalo, double epyslon){
        double xa;
        double xb;
        double mediaIntervalo;
        double xmedia;
        double r;
        int iterador = 0;
        do{
            xa = Math.pow(intervalo[0], 3)-(9*intervalo[0])+3;
            xb = Math.pow(intervalo[1], 3)-(9*intervalo[1])+3;
            mediaIntervalo = (intervalo[0]+intervalo[1])/2;
            xmedia = Math.pow(mediaIntervalo, 3)-(9*mediaIntervalo)+3;
            if(xmedia < 0 && xmedia > xb){
                intervalo[1] = mediaIntervalo;
            }else if(xmedia > 0 && xmedia < xa){
                intervalo[0] = mediaIntervalo;
            }
            r = intervalo[1] - intervalo[0];
            iterador++;
        }while( r >= epyslon );
        double[] retorno = new double[3];
        retorno[0] = iterador;
        retorno[1] = r;
        retorno[2] = xmedia;
        return retorno;
    }
    
}
