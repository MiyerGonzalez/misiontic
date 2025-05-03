/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpeta1;

/**
 *
 * @author carra
 */
public class Celular {
    public static void main(String[] args) {
       //Numero entero
        int numero_de_miyer=32;
        int numero_menor=-12;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        //numero entero largo
        long numero_mio=27433;
        long numero_de_seba=7272723838745L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        
        //numeros flotantes
        float numero_de_kevin=4.75f;
        float numero_de_july=1.56f;
        System.out.println(numero_de_kevin+numero_de_july);
        
        //numero flotante largo
        double numero_andres=520;
        double numero_claudia=950.10;
        System.out.println(numero_andres*numero_claudia);
        
        //cadenas de caracteres
        String comidas=""
                + "nachos,"
                + "papas,"
                + "sushi,"
                + "butifarra,"
                + "arroz chino,"
                + " asado huilense,"
                + " camarones al ajillo";
        System.out.println("tengo antojo de "+comidas);
        
        //caracter solitario
        char c='w';
        System.out.println((int)c);
        System.out.println((char)200);
        
        //booleanos
        boolean marthim_tiene_hambre=true;
        boolean yeldi_desayuno=false;
        
        if (marthim_tiene_hambre==true);{
        System.out.println("puede ir a comer algo");
        }
        if (yeldi_desayuno){
            System.out.println("que bien");
        } else {
            System.out.println("a comer");
        }
        
        }
}
