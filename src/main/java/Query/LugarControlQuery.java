package Query;

import Interfaces.Query;
import Conexion.ConectarDB;
import javax.swing.JTable;
import Model.LugarControl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class LugarControlQuery extends ConectarDB implements Query {

    /**
     * Metodo para registrar un nuevo elemento en la tabla LugarControl.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Store(Object modelo) {
        LugarControl lugarControl = (LugarControl) modelo; // Castear el modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "INSERT INTO lugarControl (IdLugarControl, NombreLugarControl) VALUES (NULL, ?)";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, lugarControl.getNombreLugarControl());
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
     * Metodo para acualizar un registro en la tabla lugarControl.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Update(Object modelo) {
        LugarControl lugarControl = (LugarControl) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "UPDATE lugarControl SET NombreLugarControl = ? WHERE IdLugarControl = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, lugarControl.getNombreLugarControl());
            ps.setInt(2, lugarControl.getIdLugarControl());
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
     * Metodo para eliminar un registro de la tabla lugarControl.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Delete(Object modelo) {
        LugarControl lugarControl = (LugarControl) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "DELETE FROM lugarControl WHERE IdLugarControl = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, lugarControl.getIdLugarControl());
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
     * Metodo para buscar un registro de la tabla lugarControl.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Search(Object modelo) {
        LugarControl lugarControl = (LugarControl) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "SELECT * FROM lugarControl WHERE NombreLugarControl = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, lugarControl.getNombreLugarControl());
            rs = ps.executeQuery();  //Ejecutar consulta.

            if (rs.next()) { //Obteniendo valores de cada campo o columna de fila encontrada.
                lugarControl.setIdLugarControl(rs.getInt("IdLugarControl"));;
                lugarControl.setNombreLugarControl(rs.getString("NombreLugarControl"));
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

            String sql = "SELECT * FROM lugarControl";
            String[] registros = new String[sql.length()];
            String[] titulosColumna = {"Nombre del Lugar de Control"};

            //Añadiendo encabezado para tabla
            modelTabla = new DefaultTableModel(null, titulosColumna);
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.

            while (rs.next()) {
                registros[1] = rs.getString("NombreLugarControl");
                modelTabla.addRow(registros);//añadir un fila a la tabla
            }

            table.setModel(modelTabla);
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
