/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CartaFrancesa;

/**
 *
 * @author usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Carta carta1 = new Carta(0,3);
       System.out.println(carta1.getNumero());
       System.out.println(carta1.getPalo());
        System.out.println(carta1.toString());
        System.out.println(carta1.toCodigo());
        
       Carta carta2 = new Carta(6,2);
       System.out.println(carta2.getNumero());
       System.out.println(carta2.getPalo());
       System.out.println(carta2.toString());
       System.out.println(carta2.toCodigo());
       
         
       Carta carta3 = new Carta(1,4);
       System.out.println(carta3.getNumero());
       System.out.println(carta3.getPalo());
       System.out.println(carta3.toString());
       System.out.println(carta3.toCodigo());
          
       
    }
    
}
