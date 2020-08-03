/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysInventario.DAL;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import sysInventario.Model.DBResult;

/**
 *
 * @author Ara-PC
 */
public class Helpers {

    public static DBResult generarBDResult(ResultSet rs) {
        try {
            ResultSetMetaData md = rs.getMetaData();
            Vector<String> nombreColumnas = new Vector<>();
            int cantidadColumna = md.getColumnCount();
            for (int col = 1; col <= cantidadColumna; col++) {
                nombreColumnas.add(md.getColumnName(col));
            }

            Vector<Vector<Object>> datos = new Vector<Vector<Object>>();

            while (rs.next()) {
                Vector<Object> dato = new Vector<>();
                for (int i = 1; i <= cantidadColumna; i++) {
                    dato.add(rs.getObject(i));
                }
                datos.add(dato);
            }
            return new DBResult(nombreColumnas, datos);

        } catch (SQLException ex) {
            Logger.getLogger(Helpers.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
