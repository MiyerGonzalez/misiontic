
package archivos2;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class principal {

    
    public static void main(String[] args) {
        abrirArchivo();
     
    }
    public static void crearYEscribirArchivo() {
        try {
            FileWriter creador = new FileWriter("src/archivos2/nuevo.txt");
            
        } catch (Exception e) {
            System.out.println("Error al crear el archivo");
        }
        PrintWriter escritor = new PrintWriter(creador);
        
        escritor.println("mi primer archivo java");
        for (int i = 0; i < 10; i++) {
            escritor.println("nuevo"+i);
            
        }
        
    }
    public static void abrirArchivo(){
    File archivo =new File("src/archivos2/tablon.csv");
        System.out.println("el peso del archivo es "+archivo.length());
       
        try {
            Scanner lector = new Scanner(archivo);
            ArrayList<String> lista_de_lineas = new ArrayList<>();
            while (lector.hasNextLine()){
                lista_de_lineas.add(lector.nextLine());
            }
            
            for (String linea : lista_de_lineas) {
                System.out.println(linea);
                
                
            lista_de_lineas.remove(0);
            }
            ArrayList<Pais> lista_paises = new ArrayList<>();
            for (String linea : lista_de_lineas) {
                String[]separadas= linea.split(",");
                lista_paises.add(new Pais(separadas[0], separadas[1], Long.parseLong(separadas[2])));
                
            }
            
        } catch (Exception e) {
            System.out.println("no se encontro el archivo "+ e.getMessage());
        }
        
        
    }
    
    
    
}
