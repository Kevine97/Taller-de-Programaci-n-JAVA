
package sysInventario.Model;

import java.util.Vector;


public class DBResult {
    
    private Vector<String> nombreColumns;
    private Vector<Vector<Object>> datos;

    public DBResult(Vector<String> nombreColumns, Vector<Vector<Object>> datos) {
        this.nombreColumns = nombreColumns;
        this.datos = datos;
    }

    public Vector<String> getNombreColumns() {
        return nombreColumns;
    }

    public Vector<Vector<Object>> getDatos() {
        return datos;
    }

    public void setNombreColumns(Vector<String> nombreColumns) {
        this.nombreColumns = nombreColumns;
    }

    public void setDatos(Vector<Vector<Object>> datos) {
        this.datos = datos;
    }
    
    
    
}
