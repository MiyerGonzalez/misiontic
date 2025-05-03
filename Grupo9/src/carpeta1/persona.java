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
public class persona {
    
    //variables atributo
    public String sexo;
    public int altura;
    public String comida_favorita;
    
    //metodo constructor

    public persona(String sexo, int altura, String comida_favorita) {
        this.sexo = sexo;
        this.altura = altura;
        this.comida_favorita = comida_favorita;
    }
    
    public persona(){
    }
    
    public persona(String sexo){
        this.sexo=sexo;
    }
    
    
}
