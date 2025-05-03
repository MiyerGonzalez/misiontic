/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carra
 */
public class Principal {
    public static void main(String[] args) {
        try {
            Properties archivo_propiedades= new Properties();
            archivo_propiedades.load(new FileInputStream(new File("src/propiedades/mispropiedades.properties")));
            //saber carpeta actual
            System.out.println(System.getProperty("user.dir"));
            //obteniendo propiedades buscando su valor clave
            System.out.println(archivo_propiedades.get("juan.juegofavorito"));
            System.out.println(archivo_propiedades.get("juan.comidafavorita"));
            System.out.println(archivo_propiedades.get("jasson.juegofavorito"));
            System.out.println(archivo_propiedades.get("jasson.comidafavorita"));
            System.out.println(archivo_propiedades.get("laura.juegofavorito"));
            System.out.println(archivo_propiedades.get("laura.comidafavorita"));
            System.out.println(archivo_propiedades.get("yenireth.juegofavorito"));
            System.out.println(archivo_propiedades.get("yenireth.comidafavorita"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
   
}
