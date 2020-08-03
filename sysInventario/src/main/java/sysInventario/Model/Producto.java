package sysInventario.Model;

import java.util.Date;

public class Producto {

    private int idProdcuto;
    private String nombreProducto;
    private double cantidadExistencia;
    private double existenciMinima;
    private int idUsuario;
    private Date fechaRegistro;



    public int getIdProdcuto() {
        return idProdcuto;
    }

    public void setIdProdcuto(int idProdcuto) {
        this.idProdcuto = idProdcuto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(double cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

    public double getExistenciMinima() {
        return existenciMinima;
    }

    public void setExistenciMinima(double existenciMinima) {
        this.existenciMinima = existenciMinima;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
