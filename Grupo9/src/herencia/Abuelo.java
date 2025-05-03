
package herencia;

import java.awt.Color;


public class Abuelo {
    String finca="la granjita";
    long herencia_monetaria=300000000;
    String automovil = "renault 4";
    Color ojos= Color.BLACK;

    public Abuelo() {
    }
    
    
    
    String devolverNombreGranja(){
        return "el nombre de la granja familiar es "+ finca;    
    }
    String devolverHerenciaMonetaria(){
        return "se tiene"+ herencia_monetaria+"de herencia monetaria";
    }
    
}
