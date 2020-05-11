package Query;

import Interfaces.Query;
import Conexion.ConectarDB;
import javax.swing.JTable;
import Model.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class MotoristaQuery extends ConectarDB implements Query {

    /**
     * Metodo para registrar un nuevo elemento en la tabla Motorista.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Store(Object modelo) {
        Empleado motorista = (Empleado) modelo; // Castear el modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "INSERT INTO motorista (IdMotorista, NombreMotorista, ApellidoMotorista, DuiMotorista, LicenciaMotorista, TelefonoMotorista, DireccionMotorista, GeneroMotorista, SueldoMotorista) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, motorista.getNombreEmpleado());
            ps.setString(2, motorista.getApellidoEmpleado());
            ps.setString(3, motorista.getDuiEmpleado());
            ps.setString(4, motorista.getLicenciaEmpleado());
            ps.setString(5, motorista.getTelefonoEmpleado());
            ps.setString(6, motorista.getDuiEmpleado());
            ps.setString(7, motorista.getGeneroEmpleado());
            ps.setDouble(8, motorista.getSueldoEmpleado());
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
     * Metodo para acualizar un registro en la tabla motorista.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Update(Object modelo) {
        Empleado motorista = (Empleado) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "UPDATE motorista SET NombreMotorista = ?, ApellidoMotorista = ?, DuiMotorista = ?, LicenciaMotorista = ?, TelefonoMotorista = ?, DireccionMotorista = ?, GeneroMotorista = ?, SueldoMotorista = ? WHERE IdMotorista=?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, motorista.getNombreEmpleado());
            ps.setString(2, motorista.getApellidoEmpleado());
            ps.setString(3, motorista.getDuiEmpleado());
            ps.setString(4, motorista.getLicenciaEmpleado());
            ps.setString(5, motorista.getTelefonoEmpleado());
            ps.setString(6, motorista.getDuiEmpleado());
            ps.setString(7, motorista.getGeneroEmpleado());
            ps.setDouble(8, motorista.getSueldoEmpleado());
            ps.setInt(9, motorista.getIdEmpleado());
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
     * Metodo para eliminar un registro de la tabla motorista.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Delete(Object modelo) {
        Empleado motorista = (Empleado) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "DELETE FROM motorista WHERE IdMotorista = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, motorista.getIdEmpleado());
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
     * Metodo para buscar un registro de la tabla motorista.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Search(Object modelo) {
        Empleado motorista = (Empleado) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "SELECT * FROM motorista WHERE NombreMotorista = ? AND ApellidoMotorista = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, motorista.getNombreEmpleado());
            ps.setString(2, motorista.getApellidoEmpleado());
            rs = ps.executeQuery();  //Ejecutar consulta.

            if (rs.next()) { //Obteniendo valores de cada campo o columna de fila encontrada.
                motorista.setIdEmpleado(rs.getInt("IdMotorista"));
                motorista.setNombreEmpleado(rs.getString("NombreMotorista"));
                motorista.setApellidoEmpleado(rs.getString("ApellidoMotorista"));
                motorista.setDuiEmpleado(rs.getString("DuiMotorista"));
                motorista.setLicenciaEmpleado(rs.getString("LicenciaMotorista"));
                motorista.setTelefonoEmpleado(rs.getString("TelefonoMotorista"));
                motorista.setDireccionEmpleado(rs.getString("DireccionMotorista"));
                motorista.setGeneroEmpleado(rs.getString("GeneroMotorista"));
                motorista.setSueldoEmpleado(rs.getDouble("SueldoMotorista"));
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

            String sql = "SELECT * FROM motorista";
            String[] registros = new String[sql.length()];
            String[] titulosColumna = {"Nombre", "Numero DUI", "Licencia", "Telefono", "Direccion", "Genero", "Sueldo"};

            //Añadiendo encabezado para tabla
            modelTabla = new DefaultTableModel(null, titulosColumna);
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.

            while (rs.next()) {
                registros[0] = rs.getString("NombreMotorista") + " " + rs.getString("ApellidoMotorista");
                registros[1] = rs.getString("DuiMotorista");
                registros[2] = rs.getString("LicenciaMotorista");
                registros[3] = rs.getString("TelefonoMotorista");
                registros[4] = rs.getString("DireccionMotorista");
                registros[5] = rs.getString("GeneroMotorista");
                registros[6] = rs.getString("SueldoMotorista");
                modelTabla.addRow(registros);//añadir un fila a la tabla
            }

            table.setModel(modelTabla);
            table.getColumnModel().getColumn(0).setPreferredWidth(200);
            table.getColumnModel().getColumn(4).setPreferredWidth(200);

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
