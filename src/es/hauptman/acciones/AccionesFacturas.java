/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones;

import es.hauptman.entities.Clientes;
import es.hauptman.entities.DetalleFactura;
import es.hauptman.entities.Facturas;
import es.hauptman.entities.Productos;
import es.hauptman.gestionbd.FacturasDAO;
import es.hauptman.vista.DialogFactura;
import es.hauptman.vista.PanelVentas;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class AccionesFacturas {
    PanelVentas panel;
    Facturas factura = new Facturas();

    public AccionesFacturas(PanelVentas panel) {
        this.panel = panel;
    }
    
    public void guardarDetalleFactura(){
        
        DetalleFactura detalleFactura = new DetalleFactura();
        Facturas factura = new Facturas();
        Productos producto = new Productos();
        Clientes cliente = new Clientes();
        
        if(!panel.getTxtIDCliente().getText().equals("")){
             cliente.setId(Integer.parseInt(panel.getTxtIDCliente().getText()));
         } 
        
        
        factura.setCliente(cliente);
        factura.setTotal(panel.getSum());
        FacturasDAO daoFactura = new FacturasDAO();
        
        DefaultTableModel model = (DefaultTableModel) panel.getTablaVentas().getModel();
        
        for (Productos p : panel.getListaProductosVenta()) {
            detalleFactura = new DetalleFactura();
            detalleFactura.setProducto(p);
            factura.addDetalleFactura(detalleFactura);
        }
        
        daoFactura.createFactura(factura);
    }
    
    public void displayFactura(){
        
    }
}
