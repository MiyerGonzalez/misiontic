
package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 




//lienzo y pintor
public class Principal {
    static FileOutputStream archivosalida;
    static ObjectOutputStream escritor;
    
    //lienzo y lector (deserializar)
    static FileInputStream archivoentrada;
    static ObjectInputStream lector;
    
    //paso 1 inicializar objetos
    static void inicializar(){
        try {
            archivosalida = new FileOutputStream("src/serializacion/salida.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("error al crear el archivo");
        }
        try {
            escritor = new ObjectOutputStream(archivosalida);
        } catch (IOException ex) {
            System.out.println("error al acceder al archivo");
        }
    }
    // paso 2 escribir objetos en el arcivo
    static void escribir(Comidas comida_a_escribir){
        if(escritor !=null){
            try {
                escritor.writeObject(comida_a_escribir);
            } catch (IOException ex) {
                System.out.println("error al escribir el archivo");
            }
        }
    }
    //paso 3 cerrar archivo
    static void cerrarsalida(){
        if(escritor !=null){
            try {
                escritor.close();
            } catch (IOException ex) {
                System.out.println("esrror al cerrar el archivo");
            }
        }
        
    }
    
    //desrializar
    static void inicializar2(){
        try {
            archivoentrada = new FileInputStream("src/serializacion/salida.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("error al encontrar el archivo");
        }
        try {
            lector= new ObjectInputStream(archivoentrada);
        } catch (IOException ex) {
            System.out.println("error al acceder el archivo");
        }
        
    }
    
    //deserializar (convertir el objeto a binario)
    static Comidas leer(){
        Comidas temporal= null;
        if(lector!=null){
            try {
                temporal = (Comidas) lector.readObject();
            } catch (IOException ex) {
                System.out.println("error al leer el archivo");
            } catch (ClassNotFoundException ex) {
                System.out.println("error al convertir el archivo");
            }
        }
        return temporal;
    }
    //deserializar(cerrar archivo)
    static void cerrar2(){
        if (lector!=null){
            try {
                lector.close();
            } catch (IOException ex) {
                System.out.println("error al cerrar el archivo");
            }
        }
    }
    public static void main(String[] args) {
        Comidas c = new Comidas("cazuela de mariscos","benjamin");
        inicializar();
        escribir(c);
        cerrarsalida();
        
        inicializar2();
        Comidas c2= leer();
        System.out.println(c2.getNombre_persona());
        cerrar2();
    }
    
}
