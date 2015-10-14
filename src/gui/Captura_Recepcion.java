/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Estado;
import domain.ParametrosSP;
import domain.Proveedor;
import domain.Recepcion;
import static domain.Seguridad.pideContraseña;
import static gui.Desktop.manejadorBD;
import static gui.Desktop.rancho;
import static gui.Login.gs_mensaje;
import static gui.Splash.formatoDateTime;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Marco
 */
public class Captura_Recepcion extends javax.swing.JFrame {

    /**
     * Creates new form Captura_Recepcion
     */
    public Captura_Recepcion() {
        setLocationRelativeTo(null);
        proveedorSelector1.cargar();
        estadoSelector1.cargar();
        tf_limiteMerma.textFieldDouble();
        tf_numeroAnimales.textFieldSoloNumeros();
        tf_pesoOrigen.textFieldDouble();
        initComponents();
        String titulos[] = {"id_recepcion", "Folio", "Proveedor",
            "Fecha Compra", "# Animales", "Peso Origen", "Peso Recepción",
            "Kg Merma", "% Merma", "Parametro", "Devoluciones", "Causa"};
        t_recepcion.setTitulos(titulos);
        t_recepcion.cambiarTitulos();
        t_recepcion.ocultarcolumna(0);

        this.setTitle(this.getTitle() + " " + rancho.descripcion);

        fondo1.cargar(this.getSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ = new javax.swing.JPanel();
        fondo1 = new abstractt.fondo();
        etiqueta1 = new abstractt.Etiqueta();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_recepcion = new abstractt.Table();
        etiqueta2 = new abstractt.Etiqueta();
        etiqueta3 = new abstractt.Etiqueta();
        etiqueta4 = new abstractt.Etiqueta();
        etiqueta5 = new abstractt.Etiqueta();
        etiqueta6 = new abstractt.Etiqueta();
        etiqueta7 = new abstractt.Etiqueta();
        etiqueta8 = new abstractt.Etiqueta();
        etiqueta9 = new abstractt.Etiqueta();
        proveedorSelector1 = new domain.ProveedorSelector();
        estadoSelector1 = new domain.EstadoSelector();
        tf_folio = new abstractt.TextField();
        tf_numeroAnimales = new abstractt.TextField();
        tf_pesoOrigen = new abstractt.TextField();
        tf_limiteMerma = new abstractt.TextField();
        tf_costoFlete = new abstractt.TextFieldMoneda();
        etiqueta10 = new abstractt.Etiqueta();
        btn_limpiar = new abstractt.Boton();
        btn_guardar = new abstractt.Boton();
        btn_devoluciones = new abstractt.Boton();
        etiqueta11 = new abstractt.Etiqueta();
        tf_pesoRecepcion = new abstractt.TextField();
        calendar1 = new abstractt.Calendar();
        calendar2 = new abstractt.Calendar();
        etiqueta12 = new abstractt.Etiqueta();
        tf_numeroLote = new abstractt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo1.setText("fondo1");
        btn_.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        etiqueta1.setBackground(new java.awt.Color(95, 84, 88));
        etiqueta1.setForeground(new java.awt.Color(230, 225, 195));
        etiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta1.setText("Recepción");
        etiqueta1.setFont(new java.awt.Font("Trebuchet", 1, 36)); // NOI18N
        etiqueta1.setOpaque(true);
        btn_.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        t_recepcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(t_recepcion);

        btn_.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 960, 300));

        etiqueta2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta2.setText("Proveedor");
        btn_.add(etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 20));

        etiqueta3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta3.setText("Origen de Compra");
        btn_.add(etiqueta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, 20));

        etiqueta4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta4.setText("Folio de Compra");
        btn_.add(etiqueta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 120, 20));

        etiqueta5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta5.setText("Fecha de Compra");
        btn_.add(etiqueta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, 20));

        etiqueta6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta6.setText("Número de Animales");
        btn_.add(etiqueta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, -1));

        etiqueta7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta7.setText("Peso de Origen");
        btn_.add(etiqueta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 120, 20));

        etiqueta8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta8.setText("Limite de Merma");
        btn_.add(etiqueta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 120, 20));

        etiqueta9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta9.setText("Costo de Flete");
        btn_.add(etiqueta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 120, 20));
        btn_.add(proveedorSelector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, 20));
        btn_.add(estadoSelector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));
        btn_.add(tf_folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 20));
        btn_.add(tf_numeroAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, 20));
        btn_.add(tf_pesoOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 130, -1));

        tf_limiteMerma.setToolTipText("Porcentaje asignado de merma al lote de compra");
        btn_.add(tf_limiteMerma, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 130, -1));
        btn_.add(tf_costoFlete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 130, 20));

        etiqueta10.setText("Fecha de Recepción");
        btn_.add(etiqueta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 120, 20));

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        btn_.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 100, -1));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        btn_.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 100, -1));

        btn_devoluciones.setText("Devoluciones");
        btn_.add(btn_devoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, -1, -1));

        etiqueta11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta11.setText("Peso Recepción");
        btn_.add(etiqueta11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 120, 20));
        btn_.add(tf_pesoRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 130, 20));
        btn_.add(calendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 120, -1));
        btn_.add(calendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 120, 20));

        etiqueta12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta12.setText("Número de Lote");
        btn_.add(etiqueta12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 20));

        tf_numeroLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_numeroLoteActionPerformed(evt);
            }
        });
        btn_.add(tf_numeroLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 130, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void tf_numeroLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_numeroLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_numeroLoteActionPerformed

    public void guardar() {
        if (tf_folio.equals("") || tf_numeroAnimales.equals("") || this.tf_numeroLote.equals("")) {
            JOptionPane.showMessageDialog(this, "Verifique que los campos se llenaron correctamente.", gs_mensaje, JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!pideContraseña()) {
            return;
        }
        recepcion = new Recepcion();
        proveedor.cargarPorDescripcion(this.proveedorSelector1.getText());
        recepcion.proveedor = proveedor;
        estado.cargarPorDescripcion(this.estadoSelector1.getText());
        recepcion.origen = estado;
        recepcion.folio = this.tf_folio.getText();
        recepcion.fecha_compra = this.calendar1.getDate();
        recepcion.fecha_recepcion = this.calendar2.getDate();
        recepcion.animales = this.tf_numeroAnimales.getInt();
        recepcion.peso_origen = this.tf_pesoOrigen.getDouble();
        recepcion.limite_merma = this.tf_limiteMerma.getDouble();
        recepcion.numero_lote = this.tf_numeroLote.getText();
        recepcion.costo_flete = this.tf_costoFlete.getDouble();

        manejadorBD.parametrosSP = new ParametrosSP();
        manejadorBD.parametrosSP.agregarParametro(recepcion.proveedor.id_proveedor, "varIdProveedor", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.origen.id_estado, "varIdOrigen", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.folio, "varFolio", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(formatoDateTime.format(recepcion.fecha_compra), "varFechaCompra", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(formatoDateTime.format(recepcion.fecha_recepcion), "varFechaRecepcion", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.animales.toString(), "varAnimales", "INT", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.peso_origen.toString(), "varPesoOrigen", "DOUBLE", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.limite_merma.toString(), "varLimiteMerma", "DOUBLE", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.merma.toString(), "varMerma", "DOUBLE", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.porcentaje_merma.toString(), "varPorcentajeMerma", "DOUBLE", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.peso_recepcion.toString(), "varPesoRecepcion", "DOUBLE", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.numero_lote, "varNumeroLote", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.costo_flete.toString(), "varCostoFlete", "DOUBLE", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.devoluciones.toString(), "varDevoluciones", "INT", "IN");
        manejadorBD.parametrosSP.agregarParametro(recepcion.causa_devolucion, "varCausaDevolucion", "STRING", "IN");
        if (manejadorBD.ejecutarSP("{ call agregarRecepcion(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }") == 0) {
            JOptionPane.showMessageDialog(this, "La compra se ha agregado correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error con los campos, revise los parametros que esta mandando.", gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        this.tf_costoFlete.setText("$ 0.00");
        this.tf_folio.setText("");
        this.tf_limiteMerma.setText("0.00");
        this.tf_numeroAnimales.setText("0");
        this.tf_pesoOrigen.setText("0.00");
        this.tf_pesoRecepcion.setText("0.00");
        this.calendar1.setDate(Calendar.getInstance().getTime());
        this.calendar2.setDate(Calendar.getInstance().getTime());
    }

    Estado estado;
    Proveedor proveedor;
    Recepcion recepcion;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_;
    private abstractt.Boton btn_devoluciones;
    private abstractt.Boton btn_guardar;
    private abstractt.Boton btn_limpiar;
    private abstractt.Calendar calendar1;
    private abstractt.Calendar calendar2;
    private domain.EstadoSelector estadoSelector1;
    private abstractt.Etiqueta etiqueta1;
    private abstractt.Etiqueta etiqueta10;
    private abstractt.Etiqueta etiqueta11;
    private abstractt.Etiqueta etiqueta12;
    private abstractt.Etiqueta etiqueta2;
    private abstractt.Etiqueta etiqueta3;
    private abstractt.Etiqueta etiqueta4;
    private abstractt.Etiqueta etiqueta5;
    private abstractt.Etiqueta etiqueta6;
    private abstractt.Etiqueta etiqueta7;
    private abstractt.Etiqueta etiqueta8;
    private abstractt.Etiqueta etiqueta9;
    private abstractt.fondo fondo1;
    private javax.swing.JScrollPane jScrollPane1;
    private domain.ProveedorSelector proveedorSelector1;
    private abstractt.Table t_recepcion;
    private abstractt.TextFieldMoneda tf_costoFlete;
    private abstractt.TextField tf_folio;
    private abstractt.TextField tf_limiteMerma;
    private abstractt.TextField tf_numeroAnimales;
    private abstractt.TextField tf_numeroLote;
    private abstractt.TextField tf_pesoOrigen;
    private abstractt.TextField tf_pesoRecepcion;
    // End of variables declaration//GEN-END:variables

}
