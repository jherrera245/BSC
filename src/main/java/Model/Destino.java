package Model;

/**
 *
 * @author josue
 */
// Clase Destino para el modelo de datos.
public class Destino {

    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.
    
    /**
     * @return identificador, indice o numero de registro del destino
     */
    public int getIdDestino() {
        return IdDestino;
    }

    /**
     * @param IdDestino identificador, indice o numero de registro del destino
     */
    public void setIdDestino(int IdDestino) {
        this.IdDestino = IdDestino;
    }

    /**
     * @return identificador o indice  de registro de Ruta 
     */
    public int getIdRutaDestino() {
        return IdRutaDestino;
    }

    /**
     * @param IdRutaDestino identificador o indice  de registro de Ruta
     */
    public void setIdRutaDestino(int IdRutaDestino) {
        this.IdRutaDestino = IdRutaDestino;
    }

    /**
     * @return nombre del destino
     */
    public String getNombreDestino() {
        return NombreDestino;
    }

    /**
     * @param NombreDestino nombre del destino
     */
    public void setNombreDestino(String NombreDestino) {
        this.NombreDestino = NombreDestino;
    }

    //Miembro de Clase
    private int IdDestino;
    private int IdRutaDestino;
    private String NombreDestino;
}
