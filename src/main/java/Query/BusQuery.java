package Query;

import ComboBox.ComboPersona;
import Conexion.ConectarDB;
import Interfaces.ComboBoxCobrador;
import Interfaces.ComboBoxJefe;
import Interfaces.ComboBoxMotorista;
import Interfaces.Query;
import Model.Bus;
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
public class BusQuery extends ConectarDB implements Query, ComboBoxCobrador, ComboBoxJefe, ComboBoxMotorista {

    /**
     * Metodo para registrar un nuevo elemento en la tabla bus.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Store(Object modelo) {

        Bus bus = (Bus) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "INSERT INTO bus (IdBus, IdRutaBus, IdMotoristaBus, IdCobradorBus, IdJefeBus, PlacaBus, MarcaBus, ModeloBus, SerieBus) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps =  conectar.prepareStatement(sql);
            ps.setInt(1, bus.getIdRutaBus());
            ps.setInt(2, bus.getIdMotoristaBus());
            ps.setInt(3, bus.getIdCobradorBus());
            ps.setInt(4, bus.getIdJefeBus());
            ps.setString(5, bus.getPlacaBus());
            ps.setString(6, bus.getMarcaBus());
            ps.setString(7, bus.getModeloBus());
            ps.setString(8, bus.getSerieBus());
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
     * Metodo para acualizar un registro en la tabla bus.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Update(Object modelo) {
        Bus bus = (Bus) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "UPDATE bus SET IdRutaBus = ?, IdMotoristaBus = ?, IdCobradorBus = ?, IdJefeBus = ?, PlacaBus = ?, MarcaBus = ?, ModeloBus = ?, SerieBus = ? WHERE IdBus = ?";

        try {
            ps =  conectar.prepareStatement(sql);
            ps.setInt(1, bus.getIdRutaBus());
            ps.setInt(2, bus.getIdMotoristaBus());
            ps.setInt(3, bus.getIdCobradorBus());
            ps.setInt(4, bus.getIdJefeBus());
            ps.setString(5, bus.getPlacaBus());
            ps.setString(6, bus.getMarcaBus());
            ps.setString(7, bus.getModeloBus());
            ps.setString(8, bus.getSerieBus());
            ps.setInt(9, bus.getIdBus());
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
     * Metodo para eliminar un registro de la tabla bus.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Delete(Object modelo) {
        Bus bus = (Bus) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "DELETE FROM bus WHERE IdBus = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, bus.getIdBus());
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
     * Metodo para buscar un registro de la tabla bus.
     *
     * @param modelo objeto de tipo modelo
     * @return true si se realiza la consulta, false si ocurre algun error.
     */
    @Override
    public boolean Search(Object modelo) {
        Bus bus = (Bus) modelo; //Castear el modelo.
        PreparedStatement ps = null; //Definir objeto para la consulta.
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        //Consulta sql.
        String sql = "SELECT * FROM bus WHERE PlacaBus = ?";

        try {
            ps = conectar.prepareStatement(sql);
            ps.setString(1, bus.getPlacaBus());
            rs = ps.executeQuery();  //Ejecutar consulta.

            if (rs.next()) { //Obteniendo valores de cada campo o columna de fila encontrada.
                bus.setIdBus(rs.getInt("IdBus"));
                bus.setIdRutaBus(rs.getInt("IdRutaBus"));
                bus.setIdMotoristaBus(rs.getInt("IdMotoristaBus"));
                bus.setIdCobradorBus(rs.getInt("IdCobradorBus"));
                bus.setIdJefeBus(rs.getInt("IdJefeBus"));
                bus.setPlacaBus(rs.getString("PlacaBus"));
                bus.setMarcaBus(rs.getString("MarcaBus"));
                bus.setModeloBus(rs.getString("ModeloBus"));
                bus.setSerieBus(rs.getString("SerieBus"));
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
     * Metodo para mostrar registros de la tabla bus
     *
     * @param table tabla de arrellenar con datos
     */
    @Override
    public void View(JTable table) {
        PreparedStatement ps = null; //Definir objeto para la consulta
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.

        DefaultTableModel modelTabla; //Modelo de tabla
        modelTabla = new DefaultTableModel();
        try {

            String sql = "SELECT CONCAT(jefe.NombreJefe,' ',jefe.ApellidoJefe) AS NombreJefe, CONCAT(motorista.NombreMotorista, ' ', motorista.ApellidoMotorista) AS NombreMotorista, CONCAT(cobrador.NombreCobrador, ' ', cobrador.ApellidoCobrador) AS NombreCobrador, ruta.NumeroRuta, destino.NombreDestino, bus.PlacaBus, bus.SerieBus, bus.MarcaBus, bus.ModeloBus FROM bus INNER JOIN jefe ON jefe.IdJefe = bus.IdJefeBus INNER JOIN motorista ON motorista.IdMotorista = bus.IdMotoristaBus INNER JOIN cobrador ON cobrador.IdCobrador = bus.IdCobradorBus INNER JOIN ruta ON ruta.IdRuta= bus.IdRutaBus INNER JOIN destino ON destino.IdRutaDestino = ruta.IdRuta";
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
                registros[5] = rs.getString("PlacaBus");
                registros[6] = rs.getString("SerieBus");
                registros[7] = rs.getString("MarcaBus");
                registros[8] = rs.getString("ModeloBus");
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
     * Metodo para rellenar un JComboBox con la lista de Cobradores.
     *
     * @param box objeto del tipo JComboBox
     */
    @Override
    public void LlenarComboBoxCobrador(JComboBox box) {
        DefaultComboBoxModel model;  //Modelo de ComboBox.
        PreparedStatement ps = null; //Definir objeto para la consulta
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.
        String sql = "SELECT cobrador.IdCobrador, cobrador.NombreCobrador, cobrador.ApellidoCobrador FROM cobrador";

        try {
            ps =  conectar.prepareStatement(sql);
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

    /**
     * Metodo para rellenar un JComboBox con la lista de Jefes.
     *
     * @param box objeto del tipo JComboBox
     */
    @Override
    public void LlenarComboBoxJefe(JComboBox box) {
        DefaultComboBoxModel model;  //Modelo de ComboBox.
        PreparedStatement ps = null; //Definir objeto para la consulta
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.
        String sql = "SELECT jefe.IdJefe, jefe.NombreJefe, jefe.ApellidoJefe FROM jefe";

        try {
            ps =  conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.
            model = new DefaultComboBoxModel();
            box.setModel(model);

            while (rs.next()) {
                model.addElement(new ComboPersona(rs.getInt("IdJefe"), rs.getString("NombreJefe"), rs.getString("ApellidoJefe")));
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

    /**
     * Metodo para rellenar un JComboBox con la lista de Motoristas.
     *
     * @param box objeto del tipo JComboBox
     */
    @Override
    public void LlenarComboBoxMotorista(JComboBox box) {
        DefaultComboBoxModel model;  //Modelo de ComboBox.
        PreparedStatement ps = null; //Definir objeto para la consulta
        ResultSet rs = null; //Objeto para recepcion de datos
        Connection conectar = Conectar(); //Estableciendo conexion a DB.
        String sql = "SELECT motorista.IdMotorista, motorista.NombreMotorista, motorista.ApellidoMotorista FROM motorista";

        try {
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();  //Ejecutar consulta.
            model = new DefaultComboBoxModel();
            box.setModel(model);

            while (rs.next()) {
                model.addElement(new ComboPersona(rs.getInt("IdMotorista"), rs.getString("NombreMotorista"), rs.getString("ApellidoMotorista")));
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
