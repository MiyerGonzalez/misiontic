
package DTO;

import java.util.ArrayList;


public class DulcesBO {
    
    ArrayList<DulcesVO> lista_dulces= new ArrayList();
    //funcion crear
    
    public void crearDulce(String nuevo_dulce){
        lista_dulces.add(new DulcesVO(nuevo_dulce));
    }
    
    // f buscar
     public ArrayList<DulcesVO> obteneradulces(){
         return lista_dulces;
     }
     
     //f eliminar
     
     public boolean eliminarDulce(int pos){
         try{
             lista_dulces.remove(pos);
         }catch (Exception e){
             return false;
         }
         return true;
     }
     
     // f actualizar
     public boolean actualizarDulce(int pos, String nuevo_nombre){
         try{
             lista_dulces.get(pos).setNombre(nuevo_nombre);
         }catch (Exception e){
             return false;
         }
         return true;
         
     }
     
     
}
