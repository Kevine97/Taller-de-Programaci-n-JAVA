package sysInventario.DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sysInventario.Model.Usuario;

public class Usuarios {

    public static boolean validarUsuario(Usuario usuario, String contrasena) {
        boolean valido = false;
        Connection db;
        db = Dbconnection.getConnection();

        try {
            CallableStatement sp = db.prepareCall("{call spValidarUsuario(?,?,?)}");
            sp.setString(1, usuario.getNombreUsuario());
            sp.setString(2, contrasena);
            sp.registerOutParameter(3, java.sql.Types.BOOLEAN);
            sp.execute();
            valido = sp.getBoolean(3);

            if (valido) {
                ResultSet rs = sp.getResultSet();

                while (rs.next()) {

                    usuario.setIdUsuario(rs.getInt("idUsuario"));
                    usuario.setActivo(rs.getBoolean("activo"));
                    usuario.setFechaCreacion(rs.getDate("fechaCreacion"));

                }
            }
            db.close();
            return valido;

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
