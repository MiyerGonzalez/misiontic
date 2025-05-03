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
public class Vista {
    public static void main(String[] args) {
        Controlador micontrolador= new Controlador();
        System.out.println(micontrolador.obtenerListaPanes());
        
        ControladorHuevos huevocontroller= new ControladorHuevos();
        System.out.println(huevocontroller.obtenerListaHuevos());
        
        
        }
        
    
    
}
