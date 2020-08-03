package sysInventario.BL;

import javax.swing.table.DefaultTableModel;
import sysInventario.DAL.Productos;
import sysInventario.Model.DBResult;

public class ProductoBL {

    public static DefaultTableModel obtenerProductos() {
        DBResult resultado = Productos.obtenerProducto();
        return new DefaultTableModel(resultado.getDatos(), resultado.getNombreColumns());
    }

}
