package sysInventario.DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import sysInventario.Model.DBResult;
import sysInventario.Model.Producto;
import sysInventario.Model.Repuesta;

public class Productos {

    public static DBResult obtenerProducto() {
        Connection db = Dbconnection.getConnection();
        try {
            Statement consulta = db.createStatement();
            ResultSet rs;
            rs = consulta.executeQuery("select *from vwListadoProductos");
            DBResult resultado = Helpers.generarBDResult(rs);
            db.close();
            return resultado;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static Repuesta registrarProducto(Producto producto) {
        Connection db = Dbconnection.getConnection();
        Repuesta res = new Repuesta();
        try {

            CallableStatement sp = db.prepareCall("{call spRegistrarProducto(?,?,?,?)}");
            sp.setString(1, producto.getNombreProducto());
            sp.setDouble(2, producto.getCantidadExistencia());
            sp.setDouble(3, producto.getExistenciMinima());
            sp.setInt(4, producto.getIdUsuario());
            sp.execute();
            ResultSet rs = sp.getResultSet();
            rs.next();
            producto.setIdProdcuto(rs.getInt("idProducto"));
            res.setSuccess(true);
            res.setMessage("Producto guardado");
            res.setObject(producto);
            return res;
        } catch (Exception e) {
            System.out.println(e);
            res.setSuccess(false);
            res.setMessage("Error al guardar el producto");
            res.setObject(null);
            return res;
        }
    }

    public static Repuesta editarProducto(Producto producto) throws SQLException {

        Connection db = Dbconnection.getConnection();
        PreparedStatement ps;
        Repuesta res = new Repuesta();
        try {
            ps = db.prepareStatement("update productos set nombreProducto=?, cantidadExistencia=?, existenciaMinima=?, idUsuarioRegistra=? where idProducto=? ");
            ps.setString(1, producto.getNombreProducto());
            ps.setDouble(2, producto.getCantidadExistencia());
            ps.setDouble(3, producto.getExistenciMinima());
            ps.setInt(4, producto.getIdUsuario());
            ps.setInt(5, producto.getIdProdcuto());
            ps.execute();
            res.setSuccess(true);
            res.setMessage("Producto Editado");
            res.setObject(producto);
            return res;
        } catch (Exception e) {
            System.out.println(e);
            res.setSuccess(false);
            res.setMessage("Error al editar el producto");
            res.setObject(null);
            return res;
        }
    }

}
