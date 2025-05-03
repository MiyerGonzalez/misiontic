
package interfaces;


public class Interface {

    public static void main(String[] args) {
        EstudianteGrupo9 jef = new EstudianteGrupo9();
        System.out.println(jef.cocinar());
        
        Senador palpatine= new Senador();
        System.out.println(palpatine.cocinar());
        
        System.out.println(jef.toString());
        System.out.println(palpatine.toString());
     
    }
    
}
