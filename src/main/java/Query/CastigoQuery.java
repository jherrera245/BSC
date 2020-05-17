package Query;

import ComboBox.ComboBus;
import Conexion.ConectarDB;
import Interfaces.ComboBoxBus;
import Interfaces.Query;
import Model.Castigo;
import Render.TableRender;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
            ps.setString(2, castigo.getFechaInicioCastigo());
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
        String sql = "UPDATE castigo SET IdBusCastigo =  ?, FechaInicioCastigo = ?, FechaFinCastigo = ?, EstadoCastigo = ? WHERE IdCastigo = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, castigo.getIdBusCastigo());
            ps.setString(2, castigo.getFechaInicioCastigo());
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

            String sql = "SELECT castigo.IdCastigo, jefe.NombreJefe, jefe.ApellidoJefe, ruta.NumeroRuta, destino.NombreDestino, DATE_FORMAT(castigo.FechaInicioCastigo, '%d/%m/%Y') AS FechaInicio, DATE_FORMAT(castigo.FechaFinCastigo, '%d/%m/%Y') AS FechaFinal, castigo.EstadoCastigo FROM castigo INNER JOIN bus ON bus.IdBus = castigo.IdBusCastigo LEFT JOIN jefe ON jefe.IdJefe = bus.IdJefeBus INNER JOIN ruta ON ruta.IdRuta = bus.IdRutaBus INNER JOIN destino ON destino.IdRutaDestino = ruta.IdRuta ORDER BY FechaFinal ASC";

            Object[] registros = new Object[9];
            String[] titulosColumna = {"N#", "Nombre", "Ruta", "Destinos", "Fecha Inicio", "Fecha Fin", "Estado", "Modificar", "Eliminar"};

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
                Filas.get(numeroFila).setName(rs.getString("IdCastigo"));

                registros[0] = Filas.get(numeroFila);
                registros[1] = rs.getString("NombreJefe") + " " + rs.getString("ApellidoJefe");
                registros[2] = rs.getString("NumeroRuta");
                registros[3] = rs.getString("NombreDestino");
                registros[4] = rs.getString("FechaInicio");
                registros[5] = rs.getString("FechaFinal");
                registros[6] = rs.getString("EstadoCastigo");
                registros[7] = btnModificar;
                registros[8] = btnEliminar;
                modelTabla.addRow(registros);//añadir un fila a la tabla

                numeroFila++;
            }

            table.setModel(modelTabla);
            table.getColumnModel().getColumn(1).setPreferredWidth(200);
            table.getColumnModel().getColumn(6).setPreferredWidth(80);
            table.getColumnModel().getColumn(7).setPreferredWidth(80);
            table.setRowHeight(30);
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
    public void LlenarComboBoxBus(JComboBox box) {
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
