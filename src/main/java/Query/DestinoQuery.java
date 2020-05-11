package Query;

import ComboBox.ComboLugar;
import Interfaces.Query;
import Conexion.ConectarDB;
import Interfaces.ComboBoxLugar;
import javax.swing.JTable;
import Model.Destino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class DestinoQuery extends ConectarDB implements Query, ComboBoxLugar {

    /**
     * Metodo para registrar un nuevo elemento en la tabla Destino.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Store(Object modelo) {
        Destino destino = (Destino) modelo; // Castear el modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "INSERT INTO destino (IdDestino, IdRutaDestino, NombreDestino) VALUES (NULL, ?, ?)";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, destino.getIdRutaDestino());
            ps.setString(2, destino.getNombreDestino());
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
     * Metodo para acualizar un registro en la tabla destino.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Update(Object modelo) {
        Destino destino = (Destino) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "UPDATE destino SET IdRutaDestino = ?, NombreDestino = ? WHERE IdDestino = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, destino.getIdRutaDestino());
            ps.setString(2, destino.getNombreDestino());
            ps.setInt(3, destino.getIdDestino());
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
     * Metodo para eliminar un registro de la tabla destino.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Delete(Object modelo) {
        Destino destino = (Destino) modelo; //Castear modelo
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "DELETE FROM destino WHERE IdDestino = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, destino.getIdDestino());
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
     * Metodo para buscar un registro de la tabla destino.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Search(Object modelo) {
        Destino destino = (Destino) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "SELECT * FROM destino WHERE NombreDestino = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, destino.getNombreDestino());
            rs = ps.executeQuery();  //Ejecutar consulta.

            if (rs.next()) { //Obteniendo valores de cada campo o columna de fila encontrada.
                destino.setIdDestino(rs.getInt("IdDestino"));
                destino.setIdRutaDestino(rs.getInt("IdRutaDestino"));
                destino.setNombreDestino(rs.getString("NombreDestino"));
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

            String sql = "SELECT * FROM destino INNER JOIN ruta ON ruta.IdRuta = destino.IdRutaDestino";
            String[] registros = new String[sql.length()];
            String[] titulosColumna = {"Nombre Destino", "Ruta"};

            //Añadiendo encabezado para tabla
            modelTabla = new DefaultTableModel(null, titulosColumna);
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.

            while (rs.next()) {
                registros[0] = rs.getString("NombreDestino");
                registros[1] = rs.getString("NumeroRuta");
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

    /**
     * Metodo para rellenar un JComboBox con la lista de Rutas.
     *
     * @param box objeto del tipo JComboBox
     */
    @Override
    public void LlenarComboBoxLugar(JComboBox box) {
        DefaultComboBoxModel model;  //Modelo de ComboBox.
        PreparedStatement ps = null; //Definir objeto para la consulta
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.
        String sql = "SELECT * FROM ruta";

        try {
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.
            model = new DefaultComboBoxModel();
            box.setModel(model);

            while (rs.next()) {
                model.addElement(new ComboLugar(rs.getInt("IdRuta"), rs.getString("NumeroRuta")));
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
