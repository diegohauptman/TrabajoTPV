/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.entities;

/**
 * Clase bean de la entidad Productos.
 * @author Diego
 */
public class Productos {
    private int ID;
    private double precio;
    private String descripcion;
    private int cantidadStock;
    private int cantidadComprada;
    private double subtotal;
    private Categorias categoria;
    
    
    public Productos() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }
    
    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    
    /**
     * Método que retorna un array de Object, sirve para insertar las 
     * líneas (row) en la tabla 
     * del PanelVentas.
     * @return Object[] rowProducto
     */
    public Object[] getRow() {
        //FIXME descuento
        Object[] rowProducto = new Object[] {
            cantidadComprada,
            descripcion,
            precio, 
            subtotal = precio * cantidadComprada
        };
        return rowProducto;
    }
    
    @Override
    public String toString() {
        return getDescripcion();
    }
    
    }
