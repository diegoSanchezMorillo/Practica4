/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CartaFrancesa;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class Carta {
    Random aleatorio = new Random();
     private int numero=aleatorio.nextInt(13);
    private String nombrePalo;
    private static final int AS=0;
    private static final int J=10;
    private static final int Q=11;
    private static final int K=12;
    private int palo=aleatorio.nextInt(5);
    private String nombreNumero;
    private static final int TREBOLES=0;
    private static final int DIAMANTES=1;
    private static final int CORAZONES=2;
    private static final int PICAS=3;
    private static final int COMODIN=4;
    private String codigo;
    
    
    
    Carta(int numero,int palo){
        this.numero = numero;
        this.palo=palo;
    }

    public String getPalo() {
         switch(palo){
            case 0:
               nombrePalo="Treboles";
                break;
            case 1:
                nombrePalo="Diamantes";
                 break;
             case 2:
                nombrePalo="Corazones";
                  break;
            case 3:
                nombrePalo="Picas";
                 break;
            case 4:
                nombrePalo="Comodin";
        }
        return nombrePalo;
    }


    public String getNumero() {
    if(numero>0 && numero<10){
        switch(numero){
            case 1:
                numero=2;
                break;
            case 2:
                numero=3;
                break;
            case 3:
                numero=4;
                break;
            case 4:
                numero=5;
                break;
            case 5:
                numero=6;
                break;
            case 6:
                numero=7;
                break;
            case 7:
                numero=8;
                break;
            case 8:
                numero=9;
                break;
            case 9:
                numero=10;
                break;
        }
        
         return String.valueOf(numero);
    }else{
                switch(numero){
            case 0:
               nombreNumero="AS";
                 break;
            case 10:
                nombreNumero="J";
                 break;
             case 11:
                nombreNumero="Q";
                  break;
            case 12:
                nombreNumero="K";
        }
    }return nombreNumero;
       
    }

    @Override
    public String toString() {
        return getNumero()+" " +"de"+" "+getPalo();
    }
    
    public String toCodigo(){
        switch(nombrePalo){
            case "Treboles":
                nombrePalo="T";
                break;
             case "Diamantes":
                nombrePalo="D";
                break;
             case "Corazones":
                nombrePalo="C";
                break;
              case "Picas":
                nombrePalo="P";
                break;
              case "Comodin":
                nombrePalo="J";
                break;
        }
        switch(numero){
            case 0:
               nombreNumero="AS";
                 break;
            case 1:
                numero=2;
                break;
            case 2:
                numero=3;
                break;
            case 3:
                numero=4;
                break;
            case 4:
                numero=5;
                break;
            case 5:
                numero=6;
                break;
            case 6:
                numero=7;
                break;
            case 7:
                numero=8;
                break;
            case 8:
                numero=9;
                break;
            case 9:
                numero=10;
                break;
            case 10:
                nombreNumero="J";
                 break;
             case 11:
                nombreNumero="Q";
                  break;
            case 12:
                nombreNumero="K";
        }
        if(numero>0 && numero<10){
                this.codigo=numero+nombrePalo;
        
        }if(numero==0 && numero>=10){
        this.codigo=nombreNumero+nombrePalo;
        
            
        }return codigo;
        
    }
    
    
    
}
