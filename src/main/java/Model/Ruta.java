package Model;

/**
 *
 * @author josue
 */

//Clase Ruta para el modelo de datos
public class Ruta {
    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.

    /**
     * @return identificador, indice o numero de registro de rutas.
     */
    public int getIdRuta() {
        return IdRuta;
    }

    /**
     * @param IdRuta identificador, indice o numero de registro de rutas.
     */
    public void setIdRuta(int IdRuta) {
        this.IdRuta = IdRuta;
    }

    /**
     * @return Numero de ruta
     */
    public String getNumeroRuta() {
        return NumeroRuta;
    }

    /**
     * @param NumeroRuta Numero de ruta.
     */
    public void setNumeroRuta(String NumeroRuta) {
        this.NumeroRuta = NumeroRuta;
    }
    
    //Miembros de clase
    private int IdRuta;
    private String NumeroRuta;
}
