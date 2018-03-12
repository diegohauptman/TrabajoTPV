/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.vista;

import es.hauptman.acciones.AccionesFacturas;
import es.hauptman.entities.Clientes;
import es.hauptman.entities.Facturas;
import es.hauptman.principal.FrameHome;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Clase del panel de gestion de ventas.
 * @author Diego
 */
public class PanelGestFacturas extends javax.swing.JPanel {
    private FrameHome frame;
    private AccionesFacturas accionesFacturas;
    /**
     * Creates new form PanelGestVentas
     * @param frame
     */
    public PanelGestFacturas(FrameHome frame) {
        this.frame = frame;
        initComponents();
        accionesFacturas = new AccionesFacturas(this);
        
        txtTicketID.setEnabled(true);
        txtIDCliente.setEnabled(false);
        txtNombreCliente.setEnabled(false);
        txtFecha.setEnabled(false);
        MyIntFilter.formatInt(txtIDCliente);
        MyIntFilter.formatInt(txtDetalleIDFactura);
        MyIntFilter.formatInt(txtTicketID);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public JTable getTblFacturas() {
        return tblFacturas;
    }

    public void setTblFacturas(JTable tblFacturas) {
        this.tblFacturas = tblFacturas;
    }

    public JTable getTblDetalleFactura() {
        return tblDetalleFactura;
    }

    public JTextField getTxtDetalleApellido() {
        return txtDetalleApellido;
    }

    public JTextField getTxtDetalleTotalCompra() {
        return txtDetalleTotalCompra;
    }

    public JTextField getTxtDetalleIDFactura() {
        return txtDetalleIDFactura;
    }

    public JTextField getTxtDetalleNombre() {
        return txtDetalleNombre;
    }//</editor-fold> 
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        txtTicketID = new javax.swing.JTextField();
        txtIDCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        rbtnTicket = new javax.swing.JRadioButton();
        rbtnCliente = new javax.swing.JRadioButton();
        rbtnNombre = new javax.swing.JRadioButton();
        rbtnFecha = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();
        btnAllFactura = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDetalleIDFactura = new javax.swing.JTextField();
        txtDetalleTotalCompra = new javax.swing.JTextField();
        txtDetalleNombre = new javax.swing.JTextField();
        txtDetalleApellido = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalleFactura = new javax.swing.JTable();
        btnDetalles = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 800));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        txtTicketID.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtTicketID.setToolTipText("Inserte el ID de la factura.");
        txtTicketID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketIDActionPerformed(evt);
            }
        });

        txtIDCliente.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtIDCliente.setToolTipText("Inserte el ID del Cliente.");

        txtNombreCliente.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtNombreCliente.setToolTipText("Inserte el primer nombre.");
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        try {
            txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFecha.setToolTipText("Inserte la fecha en formato dd/mm/yyyy");
        txtFecha.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        buttonGroup1.add(rbtnTicket);
        rbtnTicket.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        rbtnTicket.setSelected(true);
        rbtnTicket.setText("Nº Factura:");
        rbtnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnCliente);
        rbtnCliente.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        rbtnCliente.setText("ID Cliente:");
        rbtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnNombre);
        rbtnNombre.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        rbtnNombre.setText("Nombre:");
        rbtnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnFecha);
        rbtnFecha.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        rbtnFecha.setText("Fecha:");
        rbtnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 204));
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblFacturas.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura", "ID Cliente", "Nombre", "Apellido", "Fecha", "Descuento", "Subtotal", "Total "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFacturas.setToolTipText("");
        tblFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblFacturasMousePressed(evt);
            }
        });
        tblFacturas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblFacturasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblFacturas);
        if (tblFacturas.getColumnModel().getColumnCount() > 0) {
            tblFacturas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblFacturas.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblFacturas.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        btnAllFactura.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnAllFactura.setForeground(new java.awt.Color(0, 0, 204));
        btnAllFactura.setText("Todas las Facturas");
        btnAllFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllFacturaActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 204));
        btnLimpiar.setText("Reset");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 204));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnNombre)
                    .addComponent(rbtnFecha)
                    .addComponent(rbtnCliente)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbtnTicket)
                                .addComponent(txtTicketID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(188, 188, 188)
                                .addComponent(btnAllFactura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(rbtnTicket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTicketID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar)
                        .addComponent(btnEliminar))
                    .addComponent(btnAllFactura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de la Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Nº Factura:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Total:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        txtDetalleIDFactura.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        txtDetalleTotalCompra.setEditable(false);
        txtDetalleTotalCompra.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        txtDetalleNombre.setEditable(false);
        txtDetalleNombre.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        txtDetalleApellido.setEditable(false);
        txtDetalleApellido.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        tblDetalleFactura.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblDetalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Subtotal Productos"
            }
        ));
        jScrollPane2.setViewportView(tblDetalleFactura);

        btnDetalles.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnDetalles.setForeground(new java.awt.Color(0, 0, 204));
        btnDetalles.setText("Mostrar Detalles");
        btnDetalles.setToolTipText("Seleccione una factura de la tabla de Facturas.");
        btnDetalles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDetalleApellido)
                    .addComponent(txtDetalleNombre)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addComponent(txtDetalleTotalCompra)
                    .addComponent(txtDetalleIDFactura, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetalles)
                .addGap(308, 308, 308))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDetalleIDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDetalleNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addComponent(txtDetalleApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDetalleTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTicketIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketIDActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Facturas factura = new Facturas();
        Clientes cliente = new Clientes();
        
        if(!txtIDCliente.getText().equals("")) {
            
            cliente.setId(Integer.parseInt(txtIDCliente.getText().trim()));
            accionesFacturas.searchFactura(factura.getTicketID(), cliente.getId(), factura.getFecha(), cliente.getNombre(), factura.getDescuento());
            
        } else if(!txtTicketID.getText().equals("")) {
            
            txtIDCliente.setText("");
            txtFecha.setText("");
            
            factura.setTicketID(Integer.parseInt(txtTicketID.getText().trim()));
            accionesFacturas.searchFactura(factura.getTicketID(), cliente.getId(), factura.getFecha(), cliente.getNombre(), factura.getDescuento());
            
        } else if(!txtFecha.getText().equals("  /  /    ")){
            
            try {
                
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date newFecha = new java.sql.Date(formato.parse(txtFecha.getText().trim()).getTime());
                factura.setFecha(String.valueOf(newFecha));
                
            } catch (ParseException ex) {
                System.out.println("No se pudo convertir el formato de la fecha");
                ex.printStackTrace();
            }
            
            accionesFacturas.searchFactura(factura.getTicketID(), cliente.getId(), factura.getFecha(), cliente.getNombre(), factura.getDescuento());
            
        } 
        else if(!txtNombreCliente.getText().equals("")) {
        
            cliente.setNombre(txtNombreCliente.getText().trim());
            accionesFacturas.searchFactura(factura.getTicketID(), cliente.getId(), factura.getFecha(), cliente.getNombre(), factura.getDescuento());
        
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void radiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnActionPerformed
        // TODO add your handling code here:
        if(rbtnTicket.isSelected()){
            txtTicketID.setEnabled(true);
            txtIDCliente.setText("");
            txtNombreCliente.setText("");
            txtFecha.setText("");
        }else
            txtTicketID.setEnabled(false);
        
        if(rbtnCliente.isSelected()){
            txtIDCliente.setEnabled(true);
            txtTicketID.setText("");
            txtNombreCliente.setText("");
            txtFecha.setText("");
        }else
            txtIDCliente.setEnabled(false);
        
        if(rbtnNombre.isSelected()){
            txtNombreCliente.setEnabled(true);
            txtIDCliente.setText("");
            txtTicketID.setText("");
            txtFecha.setText("");
        }else
            txtNombreCliente.setEnabled(false);
        
        if(rbtnFecha.isSelected()){
            txtFecha.setEnabled(true);
            txtIDCliente.setText("");
            txtNombreCliente.setText("");
            txtTicketID.setText("");
        }else
            txtFecha.setEnabled(false);
        
    }//GEN-LAST:event_radiobtnActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        // TODO add your handling code here:
        if(!txtDetalleIDFactura.getText().equals(""))
            accionesFacturas.getDetalleFactura(Integer.parseInt(txtDetalleIDFactura.getText()));
        else
            JOptionPane.showMessageDialog(frame, "Para mostrar los detalles hay que seleccionar un ID de Factura", "Atencón", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void tblFacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacturasMousePressed

        DefaultTableModel model = (DefaultTableModel) tblFacturas.getModel();
        
        limpiaCamposDetalles();
        
        if(tblFacturas.getSelectedRow() != -1){
            txtDetalleIDFactura.setText(tblFacturas.getValueAt(tblFacturas.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tblFacturasMousePressed

    private void tblFacturasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblFacturasKeyReleased
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) tblFacturas.getModel();
         
         limpiaCamposDetalles();
        
        if(tblFacturas.getSelectedRow() != -1){
            txtDetalleIDFactura.setText(tblFacturas.getValueAt(tblFacturas.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tblFacturasKeyReleased

    private void btnAllFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllFacturaActionPerformed
        // TODO add your handling code here:
        accionesFacturas.getAllFactura();
    }//GEN-LAST:event_btnAllFacturaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelFactura = (DefaultTableModel)tblFacturas.getModel();
        DefaultTableModel modelDetalleFactura = (DefaultTableModel)tblDetalleFactura.getModel();
        modelDetalleFactura.setNumRows(0);
        modelFactura.setNumRows(0);
        limpiaCamposDetalles();
        txtDetalleIDFactura.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
         if(txtDetalleIDFactura.getText().equals("")){
            
            JOptionPane.showMessageDialog(frame, "Seleccione una Factura.", 
                    "No se ha Eliminado", JOptionPane.WARNING_MESSAGE);
            
        }else{
        accionesFacturas.eliminaFactura();
        txtDetalleIDFactura.setText("");
        DefaultTableModel modelFactura = (DefaultTableModel)tblFacturas.getModel();
        DefaultTableModel modelDetalleFactura = (DefaultTableModel)tblDetalleFactura.getModel();
        modelFactura.removeRow(tblFacturas.getSelectedRow());
        modelDetalleFactura.setNumRows(0);
        limpiaCamposDetalles();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void limpiaCamposDetalles() {
        
        txtDetalleNombre.setText("");
        txtDetalleApellido.setText("");
        txtDetalleTotalCompra.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllFactura;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnCliente;
    private javax.swing.JRadioButton rbtnFecha;
    private javax.swing.JRadioButton rbtnNombre;
    private javax.swing.JRadioButton rbtnTicket;
    private javax.swing.JTable tblDetalleFactura;
    private javax.swing.JTable tblFacturas;
    private javax.swing.JTextField txtDetalleApellido;
    private javax.swing.JTextField txtDetalleIDFactura;
    private javax.swing.JTextField txtDetalleNombre;
    private javax.swing.JTextField txtDetalleTotalCompra;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTicketID;
    // End of variables declaration//GEN-END:variables
}