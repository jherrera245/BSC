package Interfaces;

import javax.swing.JTable;

/**
 *
 * @author josue
 */
public interface Query {
    /**
     * @param modelo Utilizado para la consulta
     * @return booleano verdadero falso
     */
    public boolean Store(Object modelo);

    /**
     * @param modelo Utilizado para la consulta
     * @return booleano verdadero falso
     */
    public boolean Update(Object modelo);

    /**
     * @param modelo Utilizado para la consulta
     * @return booleano verdadero falso
     */
    public boolean Delete(Object modelo);

    /**
     * @param modelo Utilizado para la consulta
     * @return booleano verdadero falso
     */
    public boolean Search(Object modelo);

    /**
     * @param table elemento a llenar
     */
    public void View(JTable table);
}
