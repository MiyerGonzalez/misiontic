/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author carra
 */
public class Pan {
    int precio;
    String tipo_de_pan;

    public Pan(int precio, String tipo_de_pan) {
        this.precio = precio;
        this.tipo_de_pan = tipo_de_pan;
    }
    
    String devolverPrecio(){
        return "el precio del pan es"+precio;
    }
    
}
