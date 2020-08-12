package sysInventario.BL;

import java.sql.SQLException;
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
    public static Repuesta editar(Producto producto) throws SQLException {
        Repuesta res = new Repuesta();
        Productos productos = new Productos();
        res = productos.editarProducto(producto);
        return res;
    }
    
}
