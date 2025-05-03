
package interfaces;


public class Senador implements Humano, SerVivo {   

    @Override
    public String razonar() {
        return"never";
    }

    @Override
    public String cocinar() {
        return"only eat";
    }

    @Override
    public String hablar() {
        return"bull shit";
    }

    @Override
    public String dormir() {
        return"all time";
    }

    @Override
    public String comer() {
        return"like a pig";
    }

    @Override
    public String reproducirse() {
        return"rat mode";
    }

    @Override
    public String toString() {
        return "la cantidad de memoria es" + super.toString(); 
    }
    
    
}
