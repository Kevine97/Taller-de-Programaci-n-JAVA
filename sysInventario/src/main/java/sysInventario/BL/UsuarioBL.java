package sysInventario.BL;

import sysInventario.DAL.Usuarios;
import sysInventario.Model.Usuario;

public class UsuarioBL {

    public static boolean validarUsuario(Usuario usuario, String contrasena) {
        boolean valido = Usuarios.validarUsuario(usuario, contrasena);

        if (valido) {
            if (!usuario.isActivo()) {
                valido = false;
            }
        }
        return valido;
    }

}
