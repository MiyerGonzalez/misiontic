
package DTO;

/**
 * Class that represent a real candy
 * @author cyberpunk
 */
public class DulcesVO {
    /**
     * Atributo que representa el nombre de la isntancia de un dulce
     * @since 1.12
     */
    private String nombre;
    /**
     *constructor de instancia sin inicilizacion de atributos 
     */

    public DulcesVO() {
    }
    /**
     * constructor de instancia que permite inicilizar l momento de la creacion el valor del atributo nombre
     * @param nombre nombe asociado al dulce en esta instancia
     */
    public DulcesVO(String nombre) {
        this.nombre = nombre;
    }
    /**
     * obtiene el valor almacenado en el atributo nombre
     * @return string conteniendo el valor almacenado en nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * permite modificar el valor almacenado del atributo nombre, dentro de esta instancia
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
