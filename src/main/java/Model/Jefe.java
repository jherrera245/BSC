package Model;

/**
 *
 * @author josue
 */
//Clase jefe para el modelo de Datos
public class Jefe {
    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.

    /**
     * @return identificador, indice o numero de registro del jefe
     */
    public int getIdJefe() {
        return IdJefe;
    }

    /**
     * @param IdJefe identificador o numero de registro del jefe
     */
    public void setIdJefe(int IdJefe) {
        this.IdJefe = IdJefe;
    }

    /**
     * @return Nombre del jefe
     */
    public String getNombreJefe() {
        return NombreJefe;
    }

    /**
     * @param NombreJefe Nombre del Jefe
     */
    public void setNombreJefe(String NombreJefe) {
        this.NombreJefe = NombreJefe;
    }

    /**
     * @return ApellidoJefe Apellido del Jefe
     */
    public String getApellidoJefe() {
        return ApellidoJefe;
    }

    /**
     * @param ApellidoJefe Apellido del jefe
     */
    public void setApellidoJefe(String ApellidoJefe) {
        this.ApellidoJefe = ApellidoJefe;
    }

    /**
     * @return Numero de Dui del Jefe
     */
    public String getDuiJefe() {
        return DuiJefe;
    }

    /**
     * @param DuiJefe Numero de Dui del Jefe
     */
    public void setDuiJefe(String DuiJefe) {
        this.DuiJefe = DuiJefe;
    }

    /**
     * @return Numero de Telefono del Empelado.
     */
    public String getTelefonoJefe() {
        return TelefonoJefe;
    }

    /**
     * @param TelefonoJefe Numero de Telefono del Jefe.
     */
    public void setTelefonoJefe(String TelefonoJefe) {
        this.TelefonoJefe = TelefonoJefe;
    }

    /**
     * @return Dirección de Empelado
     */
    public String getDireccionJefe() {
        return DireccionJefe;
    }

    /**
     * @param DireccionJefe Direccion del Jefe.
     */
    public void setDireccionJefe(String DireccionJefe) {
        this.DireccionJefe = DireccionJefe;
    }

    /**
     * @return Genero del Jefe.
     */
    public String getGeneroJefe() {
        return GeneroJefe;
    }

    /**
     * @param GeneroJefe Genero del Jefe
     */
    public void setGeneroJefe(String GeneroJefe) {
        this.GeneroJefe = GeneroJefe;
    }

    //Miembro de Clase.
    private int IdJefe;
    private String NombreJefe;
    private String ApellidoJefe;
    private String DuiJefe;
    private String TelefonoJefe;
    private String DireccionJefe;
    private String GeneroJefe;
}
