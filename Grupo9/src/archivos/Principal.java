
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {    

    
    public static void main(String[] args) {
        try {
            File mi_archivo = new File("src/archivos/tabla.csv");
            System.out.println(mi_archivo.getAbsolutePath());
            System.out.println(mi_archivo.length());
            
            ArrayList<Estudiante9> Lista_de_estudiantes = new ArrayList<>();
            
            Scanner lector = new Scanner(mi_archivo);
            while (lector.hasNextLine()){
            String linea_actual = lector.nextLine();
            String[] separado = linea_actual.split(",");
            
                System.out.println(separado[0]);
                System.out.println(separado[1]);
                System.out.println(separado[2]);
                //tambien se puede hacer con un for
                //for (int i = 0; i < separado.length; i++) {
                    //System.out.println(separado[i]);
                    
                //}
                Lista_de_estudiantes.add(new Estudiante9(separado[0],separado[1],separado[2]));
            }
            System.out.println(Lista_de_estudiantes.size());
        } catch (FileNotFoundException ex) {
            System.out.println("fallo al abrir el archivo");
        }
    }
    
}
