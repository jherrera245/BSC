package Query;

import ComboBox.ComboBus;
import Conexion.ConectarDB;
import Interfaces.ComboBoxBus;
import Interfaces.Query;
import Model.Castigo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class CastigoQuery extends ConectarDB implements Query, ComboBoxBus {

    /**
     * Metodo para registrar un nuevo elemento en la tabla Castigo.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Store(Object modelo) {
        Castigo castigo = (Castigo) modelo; // Castear el modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "INSERT INTO castigo (IdCastigo, IdBusCastigo, FechaInicioCastigo, FechaFinCastigo, EstadoCastigo) VALUES (NULL, ?, ?, ?, ?)";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, castigo.getIdBusCastigo());
            ps.setString(2, castigo.getEstadoCastigo());
            ps.setString(3, castigo.getFechaFinCastigo());
            ps.setString(4, castigo.getEstadoCastigo());
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
     * Metodo para acualizar un registro en la tabla castigo.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Update(Object modelo) {
        Castigo castigo = (Castigo) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "UPDATE castigo SET IdBusCastigo =  ?, FechaInicioCastigo = ?, FechaFinCastigo = ?, EstadoCastigo = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, castigo.getIdBusCastigo());
            ps.setString(2, castigo.getEstadoCastigo());
            ps.setString(3, castigo.getFechaFinCastigo());
            ps.setString(4, castigo.getEstadoCastigo());
            ps.setInt(5, castigo.getIdCastigo());
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
     * Metodo para eliminar un registro de la tabla castigo.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Delete(Object modelo) {
        Castigo castigo = (Castigo) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "DELETE FROM castigo WHERE IdCastigo = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, castigo.getIdCastigo());
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
     * Metodo para buscar un registro de la tabla castigo.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Search(Object modelo) {
        Castigo castigo = (Castigo) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "SELECT * FROM castigo WHERE castigo.IdBusCatigo = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, castigo.getIdBusCastigo());
            rs = ps.executeQuery();  //Ejecutar consulta.

            if (rs.next()) { //Obteniendo valores de cada campo o columna de fila encontrada.
                castigo.setIdCastigo(rs.getInt("IdCastigo"));
                castigo.setIdBusCastigo(rs.getInt("IdBusCastigo"));
                castigo.setFechaInicioCastigo(rs.getString("FechaInicioCastigo"));
                castigo.setFechaFinCastigo(rs.getString("FechaFinCastigo"));
                castigo.setEstadoCastigo(rs.getString("EstadoCastigo"));
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

            String sql = "SELECT jefe.NombreJefe, jefe.ApellidoJefe, ruta.NumeroRuta, destino.NombreDestino, castigo.FechaInicioCastigo, castigo.FechaFinCastigo, castigo.EstadoCastigo FROM castigo INNER JOIN bus ON bus.IdBus = castigo.IdBusCastigo INNER JOIN jefe ON jefe.IdJefe = bus.IdBus INNER JOIN ruta ON ruta.IdRuta = bus.IdRutaBus INNER JOIN destino ON destino.IdRutaDestino = ruta.IdRuta";
            String[] registros = new String[sql.length()];
            String[] titulosColumna = {"Nombre", "Ruta", "Destinos", "Fecha Inicio", "Fecha Fin", "Estado"};

            //Añadiendo encabezado para tabla
            modelTabla = new DefaultTableModel(null, titulosColumna);
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.

            while (rs.next()) {
                registros[0] = rs.getString("NombreJefe") + " " + rs.getString("ApellidoJefe");
                registros[1] = rs.getString("NumeroRuta");
                registros[2] = rs.getString("NombreDestino");
                registros[3] = rs.getString("FechaInicio");
                registros[4] = rs.getString("FechaFin");
                registros[5] = rs.getString("EstadoCastigo");
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

    @Override
    public void LlenarComboxBus(JComboBox box) {
        DefaultComboBoxModel model;  //Modelo de ComboBox.
        PreparedStatement ps = null; //Definir objeto para la consulta
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.
        String sql = "SELECT bus.IdBus, ruta.NumeroRuta, destino.NombreDestino FROM bus INNER JOIN ruta ON ruta.IdRuta = bus.IdRutaBus INNER JOIN destino ON destino.IdRutaDestino = ruta.IdRuta ";

        try {
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.
            model = new DefaultComboBoxModel();
            box.setModel(model);

            while (rs.next()) {
                model.addElement(new ComboBus(rs.getInt("IdBus"), rs.getString("NumeroRuta"), rs.getString("NombreDestino")));
            }

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
