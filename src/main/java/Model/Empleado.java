package Model;

/**
 *
 * @author josue
 */
//Clase empleado para el modelo de Datos
public class Empleado {
    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.

    /**
     * @return identificador, indice o numero de registro del empleado
     */
    public int getIdEmpleado() {
        return IdEmpleado;
    }

    /**
     * @param IdEmpleado identificador o numero de registro del empleado
     */
    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    /**
     * @return Nombre del empleado
     */
    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    /**
     * @param NombreEmpleado Nombre del Empleado
     */
    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    /**
     * @return Apellido del empleado
     */
    public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    /**
     * @param ApellidoEmpleado Apellido del empleado
     */
    public void setApellidoEmpleado(String ApellidoEmpleado) {
        this.ApellidoEmpleado = ApellidoEmpleado;
    }

    /**
     * @return Numero de Dui del Empleado
     */
    public String getDuiEmpleado() {
        return DuiEmpleado;
    }

    /**
     * @param DuiEmpleado Numero de Dui del Empleado
     */
    public void setDuiEmpleado(String DuiEmpleado) {
        this.DuiEmpleado = DuiEmpleado;
    }

    /**
     * @return Tiene licencia?
     */
    public String getLicenciaEmpleado() {
        return LicenciaEmpleado;
    }

    /**
     * @param LicenciaEmpleado Tiene Liecencia?
     */
    public void setLicenciaEmpleado(String LicenciaEmpleado) {
        this.LicenciaEmpleado = LicenciaEmpleado;
    }

    /**
     * @return Numero de Telefono del Empelado.
     */
    public String getTelefonoEmpleado() {
        return TelefonoEmpleado;
    }

    /**
     * @param TelefonoEmpleado Numero de Telefono del Empleado.
     */
    public void setTelefonoEmpleado(String TelefonoEmpleado) {
        this.TelefonoEmpleado = TelefonoEmpleado;
    }

    /**
     * @return Dirección de Empelado
     */
    public String getDireccionEmpleado() {
        return DireccionEmpleado;
    }

    /**
     * @param DireccionEmpleado Direccion del Empleado.
     */
    public void setDireccionEmpleado(String DireccionEmpleado) {
        this.DireccionEmpleado = DireccionEmpleado;
    }

    /**
     * @return Genero del Empleado.
     */
    public String getGeneroEmpleado() {
        return GeneroEmpleado;
    }

    /**
     * @param GeneroEmpleado Genero del Empleado
     */
    public void setGeneroEmpleado(String GeneroEmpleado) {
        this.GeneroEmpleado = GeneroEmpleado;
    }

    /**
     * @return Monto de sueldo del Empleado.
     */
    public double getSueldoEmpleado() {
        return SueldoEmpleado;
    }

    /**
     * @param SueldoEmpleado Monto de sueldo del Empleado.
     */
    public void setSueldoEmpleado(double SueldoEmpleado) {
        this.SueldoEmpleado = SueldoEmpleado;
    }

    //Miembro de Clase.
    private int IdEmpleado;
    private String NombreEmpleado;
    private String ApellidoEmpleado;
    private String DuiEmpleado;
    private String LicenciaEmpleado;
    private String TelefonoEmpleado;
    private String DireccionEmpleado;
    private String GeneroEmpleado;
    private double SueldoEmpleado;
}
