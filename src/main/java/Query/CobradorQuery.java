package Query;

import Interfaces.Query;
import Conexion.ConectarDB;
import javax.swing.JTable;
import Model.Empleado;
import Render.TableRender;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class CobradorQuery extends ConectarDB implements Query {

    /**
     * Metodo para registrar un nuevo elemento en la tabla Cobrador.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Store(Object modelo) {
        Empleado cobrador = (Empleado) modelo; // Castear el modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "INSERT INTO cobrador (IdCobrador, NombreCobrador, ApellidoCobrador, DuiCobrador, LicenciaCobrador, TelefonoCobrador, DireccionCobrador, GeneroCobrador, SueldoCobrador) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, cobrador.getNombreEmpleado());
            ps.setString(2, cobrador.getApellidoEmpleado());
            ps.setString(3, cobrador.getDuiEmpleado());
            ps.setString(4, cobrador.getLicenciaEmpleado());
            ps.setString(5, cobrador.getTelefonoEmpleado());
            ps.setString(6, cobrador.getDuiEmpleado());
            ps.setString(7, cobrador.getGeneroEmpleado());
            ps.setDouble(8, cobrador.getSueldoEmpleado());
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
     * Metodo para acualizar un registro en la tabla cobrador.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Update(Object modelo) {
        Empleado cobrador = (Empleado) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "UPDATE cobrador SET NombreCobrador = ?, ApellidoCobrador = ?, DuiCobrador = ?, LicenciaCobrador = ?, TelefonoCobrador = ?, DireccionCobrador = ?, GeneroCobrador = ?, SueldoCobrador = ? WHERE IdCobrador=?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, cobrador.getNombreEmpleado());
            ps.setString(2, cobrador.getApellidoEmpleado());
            ps.setString(3, cobrador.getDuiEmpleado());
            ps.setString(4, cobrador.getLicenciaEmpleado());
            ps.setString(5, cobrador.getTelefonoEmpleado());
            ps.setString(6, cobrador.getDuiEmpleado());
            ps.setString(7, cobrador.getGeneroEmpleado());
            ps.setDouble(8, cobrador.getSueldoEmpleado());
            ps.setInt(9, cobrador.getIdEmpleado());
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
     * Metodo para eliminar un registro de la tabla cobrador.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Delete(Object modelo) {
        Empleado cobrador = (Empleado) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "DELETE FROM cobrador WHERE IdCobrador = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, cobrador.getIdEmpleado());
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
     * Metodo para buscar un registro de la tabla cobrador.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Search(Object modelo) {
        Empleado cobrador = (Empleado) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "SELECT * FROM cobrador WHERE NombreCobrador = ? AND ApellidoCobrador = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, cobrador.getNombreEmpleado());
            ps.setString(2, cobrador.getApellidoEmpleado());
            rs = ps.executeQuery();  //Ejecutar consulta.

            if (rs.next()) { //Obteniendo valores de cada campo o columna de fila encontrada.
                cobrador.setIdEmpleado(rs.getInt("IdCobrador"));
                cobrador.setNombreEmpleado(rs.getString("NombreCobrador"));
                cobrador.setApellidoEmpleado(rs.getString("ApellidoCobrador"));
                cobrador.setDuiEmpleado(rs.getString("DuiCobrador"));
                cobrador.setLicenciaEmpleado(rs.getString("LicenciaCobrador"));
                cobrador.setTelefonoEmpleado(rs.getString("TelefonoCobrador"));
                cobrador.setDireccionEmpleado(rs.getString("DireccionCobrador"));
                cobrador.setGeneroEmpleado(rs.getString("GeneroCobrador"));
                cobrador.setSueldoEmpleado(rs.getDouble("SueldoCobrador"));
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

        table.setDefaultRenderer(Object.class, new TableRender());
        //Crear Botones
        JButton btnModificar = new JButton("Modificar");
        btnModificar.setName("modificar");

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setName("eliminar");

        ArrayList<JLabel> Filas = new ArrayList(); //Crear un array list de tipo JLabel
        int numeroFila = 0;

        DefaultTableModel modelTabla; //Modelo de tabla

        try {

            String sql = "SELECT * FROM cobrador";
            Object[] registros = new Object[10];
            String[] titulosColumna = {"N#", "Nombre", "Numero DUI", "Licencia", "Telefono", "Direccion", "Genero", "Sueldo", "Modificar", "Eliminar"};

            //Añadiendo encabezado para tabla y anulando la edicion de las celdas
            modelTabla = new DefaultTableModel(null, titulosColumna) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.

            while (rs.next()) {
                Filas.add(numeroFila, new JLabel());
                Filas.get(numeroFila).setText(String.valueOf(numeroFila + 1));
                Filas.get(numeroFila).setName(rs.getString("IdCobrador"));

                registros[0] = Filas.get(numeroFila);
                registros[1] = rs.getString("NombreCobrador") + " " + rs.getString("ApellidoCobrador");
                registros[2] = rs.getString("DuiCobrador");
                registros[3] = rs.getString("LicenciaCobrador");
                registros[4] = rs.getString("TelefonoCobrador");
                registros[5] = rs.getString("DireccionCobrador");
                registros[6] = rs.getString("GeneroCobrador");
                registros[7] = rs.getString("SueldoCobrador");
                registros[8] = btnModificar;
                registros[9] = btnEliminar;
                modelTabla.addRow(registros);//añadir un fila a la tabla

                numeroFila++;
            }

            table.setModel(modelTabla);
            table.getColumnModel().getColumn(1).setPreferredWidth(200);
            table.getColumnModel().getColumn(5).setPreferredWidth(200);

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
