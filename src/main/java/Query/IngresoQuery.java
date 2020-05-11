package Query;

import ComboBox.ComboPersona;
import Conexion.ConectarDB;
import Interfaces.ComboBoxBus;
import Interfaces.Query;
import Model.Ingreso;
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
public class IngresoQuery extends ConectarDB implements Query, ComboBoxBus {

    /**
     * Metodo para registrar un nuevo elemento en la tabla ingreso.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Store(Object modelo) {

        Ingreso ingreso = (Ingreso) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "INSERT INTO detalle_ingreso (IdDetalleIngreso, IdIngreso, IdBusDetalleIngreso, MontoIngreso) VALUES (NULL, ?, ?, ?)";
        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, ingreso.getIdTipoDetalle());
            ps.setInt(2, ingreso.getIdBusDetalle());
            ps.setDouble(3, ingreso.getMontoDetalle());
            ps.execute(); //Ejecutar consulta.

            int numero = ps.executeUpdate(sql, PreparedStatement.RETURN_GENERATED_KEYS);

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
     * Metodo para acualizar un registro en la tabla ingreso.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Update(Object modelo) {
        Ingreso ingreso = (Ingreso) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "UPDATE ingreso SET IdRutaIngreso = ?, IdMotoristaIngreso = ?, IdCobradorIngreso = ?, IdJefeIngreso = ?, PlacaIngreso = ?, MarcaIngreso = ?, ModeloIngreso = ?, SerieIngreso = ? WHERE IdIngreso = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, ingreso.getIdTipoDetalle());
            ps.setInt(2, ingreso.getIdBusDetalle());
            ps.setDouble(3, ingreso.getMontoDetalle());
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
     * Metodo para eliminar un registro de la tabla ingreso.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Delete(Object modelo) {
        Ingreso ingreso = (Ingreso) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "DELETE FROM ingreso WHERE IdIngreso = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, ingreso.getIdIngreso());
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
     * Metodo para ingresocar un registro de la tabla ingreso.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Search(Object modelo) {
        Ingreso ingreso = (Ingreso) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "SELECT * FROM ingreso WHERE PlacaIngreso = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, ingreso.getIdBusDetalle());
            rs = ps.executeQuery();  //Ejecutar consulta.

            if (rs.next()) { //Obteniendo valores de cada campo o columna de fila encontrada.
                //Completar
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

    /**
     * Metodo para mostrar registros de la tabla ingreso
     *
     * @param table tabla de arrellenar con datos
     */
    @Override
    public void View(JTable table) {
        PreparedStatement ps = null; //Definir objeto para la consulta
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        DefaultTableModel modelTabla = new DefaultTableModel(); //Modelo de tabla
        try {

            String sql = "SELECT CONCAT(jefe.NombreJefe,' ',jefe.ApellidoJefe) AS NombreJefe, CONCAT(motorista.NombreMotorista, ' ', motorista.ApellidoMotorista) AS NombreMotorista, CONCAT(cobrador.NombreCobrador, ' ', cobrador.ApellidoCobrador) AS NombreCobrador, ruta.NumeroRuta, destino.NombreDestino, ingreso.PlacaIngreso, ingreso.SerieIngreso, ingreso.MarcaIngreso, ingreso.ModeloIngreso FROM ingreso INNER JOIN jefe ON jefe.IdJefe = ingreso.IdJefeIngreso INNER JOIN motorista ON motorista.IdMotorista = ingreso.IdMotoristaIngreso INNER JOIN cobrador ON cobrador.IdCobrador = ingreso.IdCobradorIngreso INNER JOIN ruta ON ruta.IdRuta= ingreso.IdRutaIngreso INNER JOIN destino ON destino.IdRutaDestino = ruta.IdRuta";
            String[] registros = new String[sql.length()];
            String[] titulosColumna = {"Propietario", "Motorista", "Cobrador", "Ruta", "Destino", "N° Placa", "Serie", "Marca", "Modelo"};

            //Añadiendo encabezado para tabla
            modelTabla = new DefaultTableModel(null, titulosColumna);
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.

            while (rs.next()) {
                registros[0] = rs.getString("NombreJefe");
                registros[1] = rs.getString("NombreMotorista");
                registros[2] = rs.getString("NombreCobrador");
                registros[3] = rs.getString("NumeroRuta");
                registros[4] = rs.getString("NombreDestino");
                registros[5] = rs.getString("PlacaIngreso");
                registros[6] = rs.getString("SerieIngreso");
                registros[7] = rs.getString("MarcaIngreso");
                registros[8] = rs.getString("ModeloIngreso");
                modelTabla.addRow(registros);//añadir un fila a la tabla
            }

            table.setModel(modelTabla);
            table.getColumnModel().getColumn(0).setPreferredWidth(300);
            table.getColumnModel().getColumn(1).setPreferredWidth(300);
            table.getColumnModel().getColumn(2).setPreferredWidth(300);

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
     * Metodo para rellenar un JComboBox con la lista de Bus.
     *
     * @param box objeto del tipo JComboBox
     */
    @Override
    public void LlenarComboxBus(JComboBox box) {
        DefaultComboBoxModel model;  //Modelo de ComboBox.
        PreparedStatement ps = null; //Definir objeto para la consulta
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.
        String sql = "SELECT cobrador.IdCobrador, cobrador.NombreCobrador, cobrador.ApellidoCobrador FROM cobrador";

        try {
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.
            model = new DefaultComboBoxModel();
            box.setModel(model);

            while (rs.next()) {
                model.addElement(new ComboPersona(rs.getInt("IdCobrador"), rs.getString("NombreCobrador"), rs.getString("ApellidoCobrador")));
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
