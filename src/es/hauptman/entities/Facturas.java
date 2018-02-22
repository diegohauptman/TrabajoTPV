/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.entities;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Diego
 */
public class Facturas {
    
    private int ticketID;
    private Usuarios usuario;
    private Clientes cliente;
    private double iva;
    private double total;
    private String fecha;
    //FIXME mudar para ArrayList
    private DetalleFactura detalleFactura;
    
    private List<DetalleFactura> listDetalleFacturas;
    
    //TODO: 1.Criar lista de Detalles Facturas
    //        a) criar a lista a partir do getListaProductosVenta()
    //      2.Ao adicionar DetalleFactura na Factura passar a referencia a esta clase:
    //        DetalleFactura.setFactura(this);
    //      3.

    public Facturas() {
        listDetalleFacturas = new ArrayList<DetalleFactura>();
    }

    public Facturas(int ticketID) {
        this.ticketID = ticketID;
    }
    
    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public List<DetalleFactura> getListDetalleFacturas() {
        return listDetalleFacturas;
    }

    public void setListDetalleFacturas(List<DetalleFactura> listDetalleFacturas) {
        this.listDetalleFacturas = listDetalleFacturas;
    }
    
    public void addDetalleFactura(DetalleFactura detalleFactura){
        
        detalleFactura.setFactura(this);
        listDetalleFacturas.add(detalleFactura);
        
    }
}
