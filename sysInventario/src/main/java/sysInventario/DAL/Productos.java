package sysInventario.DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import sysInventario.Model.DBResult;

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

}
