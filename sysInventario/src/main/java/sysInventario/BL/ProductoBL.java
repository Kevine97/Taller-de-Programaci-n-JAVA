package sysInventario.BL;

import javax.swing.table.DefaultTableModel;
import sysInventario.DAL.Productos;
import sysInventario.Model.DBResult;
import sysInventario.Model.Producto;
import sysInventario.Model.Repuesta;

public class ProductoBL {

    public static DefaultTableModel obtenerProductos() {
        DBResult resultado = Productos.obtenerProducto();
        return new DefaultTableModel(resultado.getDatos(), resultado.getNombreColumns());
    }

    public static Repuesta registrar(Producto producto) {
        Repuesta res = new Repuesta();
        Productos productos = new Productos();
        res = productos.registrarProducto(producto);
        return res;
    }

}
