
package reto1;


public class Control {
    
    Data energia = new Data(6200f);
    Data acueducto = new Data(9256f);
    Data gas = new Data(5234f);
    
    public float energiaTotal(int consumo){
        float resultado = (consumo*energia.precio);
        return resultado;
    }
    public float aguaTotal(int consumo){
        float resultado = (consumo*acueducto.precio);
        return resultado;
    }
    public float gasTotal(int consumo){
        float resultado = (consumo*gas.precio);
        return resultado;
    }
    public float descuento1y2(){
        float total = 0.5f;
        return total;
    }
    public float descuento3y4(){
        float total = 0.1f;
        return total;
    }
    public float sobrecosto5y6(){
        float total = 0.25f;
        return total;
    }
    public float turbaIracunda(){
        float total = 0.01f;
        return total;
    }
}
