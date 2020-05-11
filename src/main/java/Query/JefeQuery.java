package Query;

import Interfaces.Query;
import Conexion.ConectarDB;
import javax.swing.JTable;
import Model.Jefe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class JefeQuery extends ConectarDB implements Query {

    /**
     * Metodo para registrar un nuevo elemento en la tabla Jefe.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Store(Object modelo) {
        Jefe jefe = (Jefe) modelo; // Castear el modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "INSERT INTO jefe (IdJefe, NombreJefe, ApellidoJefe, TelefonoJefe, DireccionJefe, DuiJefe, GeneroJefe) VALUES (NULL, ?, ?, ?, ?, ?, ?)";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, jefe.getNombreJefe());
            ps.setString(2, jefe.getApellidoJefe());
            ps.setString(3, jefe.getTelefonoJefe());
            ps.setString(4, jefe.getDireccionJefe());
            ps.setString(5, jefe.getDuiJefe());
            ps.setString(6, jefe.getGeneroJefe());
            ps.execute(); //Ejecutar consulta.

            return true;
        } catch (SQLException sqle) { //Capturando errores en la consulta
            System.err.println(sqle);
            return false;
        } finally {
            try {
                conectar.close(); //Cerrar conexion a DB.
            } catch (SQLException sqle) { //Capturar errores al cerrar la conexion
                System.err.println(sqle);
            }
        }
    }

    /**
     * Metodo para acualizar un registro en la tabla jefe.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Update(Object modelo) {
        Jefe jefe = (Jefe) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "UPDATE jefe SET NombreJefe = ?, ApellidoJefe = ?, TelefonoJefe = ?, DireccionJefe = ?, DuiJefe = ?, GeneroJefe = ? WHERE IdJefe = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, jefe.getNombreJefe());
            ps.setString(2, jefe.getApellidoJefe());
            ps.setString(3, jefe.getTelefonoJefe());
            ps.setString(4, jefe.getDireccionJefe());
            ps.setString(5, jefe.getDuiJefe());
            ps.setString(6, jefe.getGeneroJefe());
            ps.setInt(7, jefe.getIdJefe());
            ps.execute(); //Ejecutar consulta.

            return true;
        } catch (SQLException sqle) { //Capturando errores en la consulta
            System.err.println(sqle);
            return false;
        } finally {
            try {
                conectar.close(); //Cerrar conexion a DB.
            } catch (SQLException sqle) { //Capturar errores al cerrar la conexion
                System.err.println(sqle);
            }
        }
    }

    /**
     * Metodo para eliminar un registro de la tabla jefe.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Delete(Object modelo) {
        Jefe jefe = (Jefe) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "DELETE FROM jefe WHERE IdJefe = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, jefe.getIdJefe());
            ps.execute(); //Ejecutar consulta.

            return true;
        } catch (SQLException sqle) { //Capturando errores en la consulta
            System.err.println(sqle);
            return false;
        } finally {
            try {
                conectar.close(); //Cerrar conexion a DB.
            } catch (SQLException sqle) { //Capturar errores al cerrar la conexion
                System.err.println(sqle);
            }
        }
    }

    /**
     * Metodo para buscar un registro de la tabla jefe.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Search(Object modelo) {
        Jefe jefe = (Jefe) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "SELECT * FROM jefe WHERE NombreJefe = ? AND ApellidoJefe = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, jefe.getNombreJefe());
            ps.setString(2, jefe.getApellidoJefe());
            rs = ps.executeQuery();  //Ejecutar consulta.

            if (rs.next()) { //Obteniendo valores de cada campo o columna de fila encontrada.
                jefe.setIdJefe(rs.getInt("IdJefe"));
                jefe.setNombreJefe(rs.getString("NombreJefe"));
                jefe.setApellidoJefe(rs.getString("ApellidoJefe"));
                jefe.setTelefonoJefe(rs.getString("TelefonoJefe"));
                jefe.setDireccionJefe(rs.getString("DireccionJefe"));
                jefe.setDuiJefe(rs.getString("DuiJefe"));
                jefe.setGeneroJefe(rs.getString("GeneroJefe"));
            }
            return true;
        } catch (SQLException sqle) { //Capturando errores en la consulta
            System.err.println(sqle);
            return false;
        } finally {
            try {
                conectar.close(); //Cerrar conexion a DB.
            } catch (SQLException sqle) { //Capturar errores al cerrar la conexion
                System.err.println(sqle);
            }
        }
    }

    @Override
    public void View(JTable table) {
        PreparedStatement ps = null; //Definir objeto para la consulta
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        DefaultTableModel modelTabla = new DefaultTableModel(); //Modelo de tabla
        try {

            String sql = "SELECT * FROM jefe";
            String[] registros = new String[sql.length()];
            String[] titulosColumna = {"Nombre", "Telefono", "Direccion", "Numero DUI", "Genero"};

            //Añadiendo encabezado para tabla
            modelTabla = new DefaultTableModel(null, titulosColumna);
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.

            while (rs.next()) {
                registros[0] = rs.getString("NombreJefe")+" "+rs.getString("ApellidoJefe");
                registros[1] = rs.getString("TelefonoJefe");
                registros[2] = rs.getString("DireccionJefe");
                registros[3] = rs.getString("DuiJefe");
                registros[4] = rs.getString("GeneroJefe");
                modelTabla.addRow(registros);//añadir un fila a la tabla
            }

            table.setModel(modelTabla);
            table.getColumnModel().getColumn(0).setPreferredWidth(200);
            table.getColumnModel().getColumn(2).setPreferredWidth(200);

        } catch (SQLException sqle) { //Capturando errores en la consulta
            System.err.println(sqle);
        } finally {
            try {
                conectar.close(); //Cerrar conexion a DB.
            } catch (SQLException sqle) { //Capturar errores al cerrar la conexion
                System.err.println(sqle);
            }
        }
    }
}
