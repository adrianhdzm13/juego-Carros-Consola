/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playercar;


public class Carro {
 
    public String marca;

    public Carro() {
    }

    
    public Carro(String marca) {

        this.marca = marca;

    }//fin  constructor

    //-----------------------------------------------------------------------
    //               metodos analizadores y modificadores
    //-----------------------------------------------------------------------
   
    public String getMarca() {
        
        return this.marca;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /*------------------------------------------------------------------------*/
    //				Metodo toString
    /*------------------------------------------------------------------------*/

    public String toString() {
        String s = " ";
          s ="Marca    : " + getMarca() + "\n";
          System.out.print(" "+s); 
   return s;
    }
}


