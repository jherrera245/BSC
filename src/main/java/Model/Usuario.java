package Model;

/**
 *
 * @author josue
 */
//Clase Usuario para el modelo de datos
public class Usuario {
    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.

    /**
     * @return idetentificador indice o numero de registro de usuario.
     */
    public int getIdUsuario() {
        return IdUsuario;
    }

    /**
     * @param IdUsuario idetentificador indice o numero de registro de usuario.
     */
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    /**
     * @return nombre de Usuario
     */
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    /**
     * @param NombreUsuario nombre de Usuario
     */
    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    /**
     * @return Apellido de Usuario
     */
    public String getApellidoUsuario() {
        return ApellidoUsuario;
    }

    /**
     * @param ApellidoUsuario Apellido de Usuario
     */
    public void setApellidoUsuario(String ApellidoUsuario) {
        this.ApellidoUsuario = ApellidoUsuario;
    }

    /**
     * @return numero de telefono del usuario
     */
    public String getTelefonoUsuario() {
        return TelefonoUsuario;
    }

    /**
     * @param TelefonoUsuario numero de telefono del usuario
     */
    public void setTelefonoUsuario(String TelefonoUsuario) {
        this.TelefonoUsuario = TelefonoUsuario;
    }

    /**
     * @return username de la cuenta
     */
    public String getUsername() {
        return Username;
    }

    /**
     *
     * @param Username username de la cuenta
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return password de la cuenta
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password password de la cuenta
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return email de la cuenta
     */
    public String getEmailUsuario() {
        return EmailUsuario;
    }

    /**
     * @param EmailUsuario email de la cuenta
     */
    public void setEmailUsuario(String EmailUsuario) {
        this.EmailUsuario = EmailUsuario;
    }

    //Miembros de clase.
    private int IdUsuario;
    private String NombreUsuario;
    private String ApellidoUsuario;
    private String TelefonoUsuario;
    private String Username;
    private String Password;
    private String EmailUsuario;
}
