/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class ConectarDB {

    //private static Connection
    static Connection GetConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //metodo de conexion
    public Connection Conectar() {
        Connection link = null;
        try {
            //Cargamos el Driver MySQL
            Class.forName("com.mysql.jdbc.Driver");
            //Creamos un enlace hacia la base de datos
            link = (Connection) DriverManager.getConnection(this.urlmanager, this.userBD, this.passBD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }

    //Miembros de Clase
    private final String nombreBD = "bus_control";//nombre de la base de datos
    private final String urlmanager = "jdbc:mysql://localhost/" + nombreBD;//este es la url de conexion a la base de datos  mas el nombre de la bd
    private final String userBD = "jherrera";//mi usuario
    private final String passBD = "Ds973558";//la contraseña 
}
