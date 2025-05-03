
 
package MVC;

import java.awt.Color;
import java.util.ArrayList;


public class ControladorHuevos {
    ArrayList<Huevos>listahuevos = new ArrayList<>();

    public ControladorHuevos() {
        listahuevos.add(new Huevos("AAA", Color.ORANGE,100,30));
        listahuevos.add(new Huevos("AA", Color.WHITE,200,15));
        listahuevos.add(new Huevos("AAA", Color.GREEN,300,20));
        listahuevos.add(new Huevos("codorniz", Color.BLACK,150,45));
        listahuevos.add(new Huevos("Velociraptor", new Color(130,11,3),5000,3));
        listahuevos.add(new Huevos("Velociraptor", new Color(Integer.parseInt("FF689D",16)),800,10));
    }
    String obtenerListaHuevos(){
        String respuesta="** liata de huevos delatienda 9**\n";
        for (Huevos huevo_actual : listahuevos){
            respuesta+= huevo_actual.tamanio
                    +" "
                    +huevo_actual.color_del_huevo
                    +" "
                    +huevo_actual.precio
                    +" "
                    +huevo_actual.cantidad
                    +"\n";
        }
        return respuesta;
    }
      
    
    
}
