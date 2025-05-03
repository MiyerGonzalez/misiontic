
package carpeta1;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        persona marthim = new persona("M", 165,"arroz");
        persona carol = new persona("F", 167, "sushi");
        System.out.println("marthim");
        System.out.println("sexo "+marthim.sexo);
        System.out.println("altura "+marthim.altura);
        System.out.println("comida_favorita "+marthim.comida_favorita);
        
        //objeto scanner
        Scanner lector= new Scanner(System.in);
        String sexo=lector.nextLine();
        int altura=lector.nextInt();
        //quemar linea
        lector.nextLine();
        String comida= lector.nextLine();
        
        persona geraldin = new persona(sexo, altura, comida);
        System.out.println("geraldin");
        System.out.println("sexo "+geraldin.sexo);
        System.out.println("altura "+geraldin.altura);
        System.out.println("comida "+geraldin.comida_favorita);
        
        persona sergio =new persona("M");
        System.out.println("sergio");
        System.out.println("sexo "+sergio.sexo);
        System.out.println("altura "+sergio.altura);
        System.out.println("comida "+sergio.comida_favorita);
        
        persona jessica=new persona();
        System.out.println("jessica");
        System.out.println("sexo "+jessica.sexo);
        System.out.println("altura "+jessica.altura);
        System.out.println("comida "+jessica.comida_favorita);
        
        jessica.sexo="F";
        jessica.altura=165;
        jessica.comida_favorita="lasagna";
        
        System.out.println("jessica");
        System.out.println("sexo "+jessica.sexo);
        System.out.println("altura "+jessica.altura);
        System.out.println("comida "+jessica.comida_favorita); 
        
    
       
    }
    
}
