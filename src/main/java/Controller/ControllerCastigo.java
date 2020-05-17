package Controller;

import ComboBox.ComboBus;
import Model.Castigo;
import Query.CastigoQuery;
import View.EjemploVista;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author josue
 */
public class ControllerCastigo implements ActionListener {

    public ControllerCastigo(Castigo Modelo, CastigoQuery Query, EjemploVista Vista) {
        this.Modelo = Modelo;
        this.Query = Query;
        this.Vista = Vista;

        //Inicializar componentes
        this.Vista.txtIdCastigo.setVisible(false);
        RefrescarPantalla();
        ObtenerFilaTabla();
        EstadoBoton(true, false);

        //Activar funcionalidad de botone
        this.Vista.btnGuardar.addActionListener(this);
        this.Vista.btnActualizar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Vista.btnGuardar) {
            GuardarCastigo();
        }

        if (ae.getSource() == Vista.btnActualizar) {
            ActualizarCastigo();
        }
    }

    //Metodo para Guardar Castigo
    private void GuardarCastigo() {
        ComboBus idBusSeleccionado = (ComboBus) Vista.cbxBus.getSelectedItem();
        Modelo.setIdBusCastigo(idBusSeleccionado.getIdBus());
        Modelo.setFechaInicioCastigo(ObtenerFechaGuardar(Vista.txtFechaInicioCastigo));
        Modelo.setFechaFinCastigo(ObtenerFechaGuardar(Vista.txtFechaFinalCastigo));

        if (Vista.rbActivo.isSelected()) {
            Modelo.setEstadoCastigo("Activo");
        } else {
            Modelo.setEstadoCastigo("Inactivo");
        }

        MostrarMensaje("Registro", Query.Store(Modelo));
        LimpiarPantalla();
        RefrescarPantalla();
    }

    //Metodo para Actualizar Castigo
    private void ActualizarCastigo() {
        Modelo.setIdCastigo(Integer.parseInt(Vista.txtIdCastigo.getText()));
        ComboBus idBusSeleccionado = (ComboBus) Vista.cbxBus.getSelectedItem();
        Modelo.setIdBusCastigo(idBusSeleccionado.getIdBus());
        Modelo.setFechaInicioCastigo(ObtenerFechaGuardar(Vista.txtFechaInicioCastigo));
        Modelo.setFechaFinCastigo(ObtenerFechaGuardar(Vista.txtFechaFinalCastigo));

        if (Vista.rbActivo.isSelected()) {
            Modelo.setEstadoCastigo("Activo");
        } else {
            Modelo.setEstadoCastigo("Inactivo");
        }

        MostrarMensaje("Actualización", Query.Update(Modelo));
        LimpiarPantalla();
        RefrescarPantalla();
        EstadoBoton(true, false);
    }

    //Obtener fila para borrar o editar
    private void ObtenerFilaTabla() {
        Vista.tablaDeCastigos.addMouseListener(new MouseAdapter() { //Evento mouse
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == Vista.tablaDeCastigos) {

                    int column = Vista.tablaDeCastigos.getColumnModel().getColumnIndexAtX(e.getX());
                    int row = e.getY() / Vista.tablaDeCastigos.getRowHeight();

                    if (row < Vista.tablaDeCastigos.getRowCount() && row >= 0 && column < Vista.tablaDeCastigos.getColumnCount() && column >= 0) {
                        Object btn = Vista.tablaDeCastigos.getValueAt(row, column);
                        Object label = Vista.tablaDeCastigos.getValueAt(row, 0);

                        if (btn instanceof JButton && label instanceof JLabel) {
                            JButton boton = (JButton) btn;
                            int IdCastigo = Integer.parseInt(((JLabel) label).getName());

                            if (boton.getName().equals("modificar")) {
                                int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas modificar este registro", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                                if (opcion == 0) { //modificar
                                    Vista.txtIdCastigo.setText(String.valueOf(IdCastigo));
                                    String[] datos = DatosDeLaFila(Vista.tablaDeCastigos);

                                    Vista.cbxBus.setSelectedItem(datos[0]);
                                    Vista.txtFechaInicioCastigo.setDate(ObtenerFechaEditar(datos[1]));
                                    Vista.txtFechaFinalCastigo.setDate(ObtenerFechaEditar(datos[2]));

                                    if (datos[3].equals("Activo")) {
                                        Vista.rbActivo.setSelected(true);
                                    } else {
                                        Vista.rbInactivo.setSelected(true);
                                    }
                                    EstadoBoton(false, true);
                                }
                            }

                            if (boton.getName().equals("eliminar")) {
                                int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas eliminar este registro", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                if (opcion == 0) {
                                    Modelo.setIdCastigo(IdCastigo);
                                    MostrarMensaje("Eliminar", Query.Delete(Modelo));
                                    RefrescarPantalla();
                                }
                            }
                        }
                    }
                }
            }
        });//Fin Evento mouse
    }

    //Metodo para obtener datos de una fila
    //en este metodo elimine algunas cosas innecesarias que hice durante el video
    private String[] DatosDeLaFila(JTable tabla) {
        int fila = tabla.getSelectedRow();
        //Pasar valores a arreglo;
        String[] datos = {
            String.valueOf(tabla.getValueAt(fila, 3)), String.valueOf(tabla.getValueAt(fila, 4)),
            String.valueOf(tabla.getValueAt(fila, 5)), String.valueOf(tabla.getValueAt(fila, 6))
        };
        return datos;
    }

    //Refrescar Pantalla
    private void RefrescarPantalla() {
        Query.View(Vista.tablaDeCastigos); //Llenar una tabla
        Query.LlenarComboBoxBus(Vista.cbxBus); //Llena combo box
    }

    //Mostar mensajes al eliminar, guadar o borrar registro
    private void MostrarMensaje(String Operacion, boolean Estado) {
        if (Estado) {
            JOptionPane.showMessageDialog(null, "La operación de " + Operacion + " se realizo con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al " + Operacion + " intente de nuevo", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Metodo para cambiar el estado de un boton
    private void EstadoBoton(boolean guardar, boolean actualizar) {
        Vista.btnGuardar.setEnabled(guardar);
        Vista.btnActualizar.setEnabled(actualizar);
    }

    //Limpiar Pantalla
    private void LimpiarPantalla() {
        Vista.cbxBus.setSelectedIndex(0);
        Vista.txtFechaInicioCastigo.setDate(new Date());
        Vista.txtFechaFinalCastigo.setDate(new Date());
        Vista.rbInactivo.setSelected(true);
    }

    //Metodo para obtener la fecha actual.
    private String ObtenerFechaGuardar(JDateChooser calendario) {
        int año = calendario.getCalendar().get(GregorianCalendar.YEAR);
        int mes = calendario.getCalendar().get(GregorianCalendar.MONTH) + 1;
        int dia = calendario.getCalendar().get(GregorianCalendar.DAY_OF_MONTH);
        return año + "/" + mes + "/" + dia;
    }

    //Metodo para obtener la fecha a editar.
    private Date ObtenerFechaEditar(String fecha) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = dateFormat.parse(fecha);
            return date;
        } catch (ParseException e) {
            return null;
        }
    }

    //Miembros de clase o atributos.
    private Castigo Modelo;
    private CastigoQuery Query;
    private EjemploVista Vista;
}
