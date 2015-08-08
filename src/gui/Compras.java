/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Compra;
import domain.Medicina;
import static domain.Medicina.cargarCodigoMedicinas;
import domain.ParametrosSP;
import domain.Proveedor;
import static gui.Desktop.manejadorBD;
import static gui.Desktop.rancho;
import domain.Rancho;
import static gui.Login.gs_mensaje;
import static gui.Splash.formatoDateTime;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class Compras extends javax.swing.JDialog {

    /**
     * Creates new form IngresoMedicamento
     */
    public Compras(Desktop parent) {
        this.parent = parent;
        initComponents();
//        this.setClosable(true);
//        this.pack();
//        this.setFrameIcon(new ImageIcon(this.getClass().getResource("/resources/logo tru-test.png")));

        setTitle(this.getTitle() + " " + parent.rancho.descripcion);
        fondo1.cargar(jPanel1.getSize());

        String titulos[] = {"Código", "Medicina", "Cantidad", "Precio Unitario", "Importe"};

        t_medicina.setTitulos(titulos);
        t_medicina.cambiarTitulos();
        t_medicina.setFormato(new int[]{4, 0, 4, 2, 2});
        t_medicina.centrar();

        tf_factura.textFieldSoloNumerosYLetras();
        tf_ordenCompra.textFieldSoloNumeros();
        tf_cantidadIngresada.textFieldSoloNumeros();

        proveedorSelector1.cargar();
        medicinaSelector1.cargar();
        codigoSelector.addArray(cargarCodigoMedicinas());

        this.rancho = parent.rancho;

        System.out.println("rancho: " + rancho.descripcion);
        dec = new DecimalFormat("0.00");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fecha1 = new domain.Fecha();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etiqueta1 = new abstractt.Etiqueta();
        etiqueta2 = new abstractt.Etiqueta();
        etiqueta4 = new abstractt.Etiqueta();
        tf_factura = new abstractt.TextField();
        tf_ordenCompra = new abstractt.TextField();
        proveedorSelector1 = new domain.ProveedorSelector();
        selectorFecha1 = new gui.SelectorFecha();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        etiqueta5 = new abstractt.Etiqueta();
        etiqueta6 = new abstractt.Etiqueta();
        etiqueta7 = new abstractt.Etiqueta();
        etiqueta8 = new abstractt.Etiqueta();
        etiqueta9 = new abstractt.Etiqueta();
        jPanel5 = new javax.swing.JPanel();
        medicinaSelector1 = new domain.MedicinaSelector();
        codigoSelector = new abstractt.ComboBox();
        tf_cantidadIngresada = new abstractt.TextField();
        tf_unidadMedida = new abstractt.TextField();
        tf_precioUnitario = new abstractt.TextFieldMoneda();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_medicina = new abstractt.Table();
        btn_agregarCompra = new abstractt.Boton();
        jPanel6 = new javax.swing.JPanel();
        etiqueta3 = new abstractt.Etiqueta();
        etiqueta10 = new abstractt.Etiqueta();
        etiqueta11 = new abstractt.Etiqueta();
        tf_total = new abstractt.TextFieldMoneda();
        tf_iva = new abstractt.TextFieldMoneda();
        tf_subtotal = new abstractt.TextFieldMoneda();
        btn_agregarMedicina = new abstractt.Boton();
        btn_eliminarMedicina = new abstractt.Boton();
        etiqueta12 = new abstractt.Etiqueta();
        btn_proveedor = new abstractt.Boton();
        btn_medicamentos = new abstractt.Boton();
        tf_letras = new abstractt.TextField();
        fondo1 = new abstractt.fondo();

        setPreferredSize(new java.awt.Dimension(850, 650));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(64, 37, 4))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta1.setText("Número de Factura");
        jPanel2.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        etiqueta2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta2.setText("Proveedor");
        jPanel2.add(etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 130, 20));

        etiqueta4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta4.setText("Orden de Compra");
        jPanel2.add(etiqueta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 20));
        jPanel2.add(tf_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, 20));
        jPanel2.add(tf_ordenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 130, 20));
        jPanel2.add(proveedorSelector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 35, 130, 20));
        jPanel2.add(selectorFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 550, 90));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Medicina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(64, 37, 4))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        etiqueta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta5.setText("Medicamento:");
        etiqueta5.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel3.add(etiqueta5);

        etiqueta6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta6.setText("Código:");
        etiqueta6.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel3.add(etiqueta6);

        etiqueta7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta7.setText("Cantidad:");
        etiqueta7.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel3.add(etiqueta7);

        etiqueta8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta8.setText("Unidad de Medida:");
        etiqueta8.setPreferredSize(new java.awt.Dimension(120, 20));
        etiqueta8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(etiqueta8);

        etiqueta9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta9.setText("Precio Unitario:");
        etiqueta9.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel3.add(etiqueta9);

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 30));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        medicinaSelector1.setPreferredSize(new java.awt.Dimension(120, 20));
        medicinaSelector1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinaSelector1ActionPerformed(evt);
            }
        });
        jPanel5.add(medicinaSelector1);

        codigoSelector.setPreferredSize(new java.awt.Dimension(120, 20));
        codigoSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoSelectorActionPerformed(evt);
            }
        });
        jPanel5.add(codigoSelector);

        tf_cantidadIngresada.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel5.add(tf_cantidadIngresada);

        tf_unidadMedida.setEditable(false);
        tf_unidadMedida.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel5.add(tf_unidadMedida);

        tf_precioUnitario.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel5.add(tf_precioUnitario);

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 650, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 670, 80));

        t_medicina.setForeground(new java.awt.Color(230, 225, 190));
        t_medicina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(t_medicina);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 800, 250));

        btn_agregarCompra.setText("Agregar Compra");
        btn_agregarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 150, 30));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiqueta3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta3.setText("Subtotal:");
        jPanel6.add(etiqueta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 20));

        etiqueta10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta10.setText("I.V.A.:");
        jPanel6.add(etiqueta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 50, 20));

        etiqueta11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta11.setText("Total:");
        jPanel6.add(etiqueta11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 20));

        tf_total.setEditable(false);
        jPanel6.add(tf_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, 20));
        jPanel6.add(tf_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 25, 80, 20));
        jPanel6.add(tf_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 80, 20));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, -1, -1));

        btn_agregarMedicina.setText("Agregar");
        btn_agregarMedicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarMedicinaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregarMedicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 80, 25));

        btn_eliminarMedicina.setText("Eliminar");
        btn_eliminarMedicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarMedicinaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminarMedicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 80, 25));

        etiqueta12.setBackground(new java.awt.Color(95, 84, 88));
        etiqueta12.setForeground(new java.awt.Color(230, 225, 195));
        etiqueta12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta12.setText("Compra");
        etiqueta12.setFont(new java.awt.Font("Trebuchet", 1, 48)); // NOI18N
        etiqueta12.setOpaque(true);
        jPanel1.add(etiqueta12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 70));

        btn_proveedor.setText("Catalogo de Proveedor");
        btn_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btn_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 170, 30));

        btn_medicamentos.setText("Catalogo de Medicina");
        btn_medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_medicamentosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_medicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 170, 30));

        tf_letras.setText("Cero 00/100 M.N.");
        jPanel1.add(tf_letras, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 430, 30));

        fondo1.setText("fondo1");
        jPanel1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveedorActionPerformed
        catalogoProveedor = new CatalogoProveedor(parent);
        catalogoProveedor.setVisible(true);
    }//GEN-LAST:event_btn_proveedorActionPerformed

    private void btn_medicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_medicamentosActionPerformed
        administracionMedicamentos = new AdministracionMedicamentos(parent);
        administracionMedicamentos.setVisible(true);
    }//GEN-LAST:event_btn_medicamentosActionPerformed

    private void btn_agregarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCompraActionPerformed

        compra = new Compra();
        compra.setId_rancho(rancho.id_rancho);
        proveedor = new Proveedor();
        proveedor.cargarPorDescripcion(proveedorSelector1.getText());
        compra.setId_proveedor(proveedor);

        compra.setFecha(selectorFecha1.getFecha());

        compra.setFactura(tf_factura.getText());
        compra.setOrden(tf_ordenCompra.getText());
        compra.setSubtotal(tf_subtotal.getDouble());
        compra.setIva(tf_iva.getDouble());
        compra.setTotal(tf_total.getDouble());
        manejadorBD.parametrosSP = new ParametrosSP();
        //valores STRING, INT, DOUBLE, DATETIME, CALENDAR
        manejadorBD.parametrosSP.agregarParametro(compra.id_rancho, "varRancho", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(compra.id_proveedor.id_proveedor, "varproveedor", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(formatoDateTime.format(compra.getFecha()), "varfecha", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(compra.factura, "varFactura", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(compra.orden, "varorden", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(dec.format(compra.subtotal), "varsubtotal", "DOUBLE", "IN");
        manejadorBD.parametrosSP.agregarParametro(dec.format(compra.iva), "variva", "DOUBLE", "IN");
        manejadorBD.parametrosSP.agregarParametro(dec.format(compra.total), "vartotal", "DOUBLE", "IN");

        if (manejadorBD.ejecutarSP("{ call agregarCompra(?,?,?,?,?,?,?,?) }") == 0) {

            agregarDetallesCompra();
        } else {

            JOptionPane.showMessageDialog(this, "Error al guardar la Compra", gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_agregarCompraActionPerformed

    private void agregarDetallesCompra() {

        //valores STRING, INT, DOUBLE, DATETIME, CALENDAR
        for (int i = 0; i < t_medicina.getRowCount(); i++) {
            manejadorBD.parametrosSP = new ParametrosSP();
            manejadorBD.parametrosSP.agregarParametro(compra.id_rancho, "varid_rancho", "STRING", "IN");
            manejadorBD.parametrosSP.agregarParametro(compra.id_compra, "varid_compra", "STRING", "IN");
            manejadorBD.parametrosSP.agregarParametro(medicina.id_medicina, "varid_medicina", "STRING", "IN");
            manejadorBD.parametrosSP.agregarParametro(String.valueOf(t_medicina.getValueAt(i, 2)), "varcantidad", "INT", "IN");
            manejadorBD.parametrosSP.agregarParametro(dec.format(t_medicina.getValueAt(i, 3)), "varprecio_unitario", "DOUBLE", "IN");
            manejadorBD.parametrosSP.agregarParametro(dec.format(t_medicina.getValueAt(i, 4)), "varImporte", "DOUBLE", "IN");
            if (manejadorBD.ejecutarSP("{ call agregarDetalleCompra(?,?,?,?,?,?) }") == 0) {
                System.out.println("Agregado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error en el ingreso de producto", gs_mensaje, WIDTH);
            }
        }
    }


    private void btn_agregarMedicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarMedicinaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) t_medicina.getModel();

        cantidad = this.tf_cantidadIngresada.getInt();
        precioUnitario = this.tf_precioUnitario.obtenerValor();
        importe = cantidad * precioUnitario;

        modelo.addRow(new Object[]{medicina.codigo, medicina.nombre, cantidad, precioUnitario, importe});

        cargarTotales();

        limpiarMedicina();
    }//GEN-LAST:event_btn_agregarMedicinaActionPerformed

    private void medicinaSelector1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinaSelector1ActionPerformed
        if (!medicinaSelector1.equals("")) {
            medicina = medicinaSelector1.getMedicnaNombre();
            this.codigoSelector.setSelectedItem(medicina.codigo);
            tf_unidadMedida.setText(medicina.unidadMedida.descripcion);
        }
    }//GEN-LAST:event_medicinaSelector1ActionPerformed

    private void codigoSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoSelectorActionPerformed
        String codigo;

        codigo = codigoSelector.getSelectedItem().toString();

        if (!codigo.equals("")) {

            medicina.codigo = Integer.parseInt(codigo);

            manejadorBD.consulta(""
                    + "SELECT id_medicina, nombre "
                    + "FROM   medicina "
                    + "WHERE  codigo = " + medicina.codigo + " "
                    + "AND    status = 'S'");

            if (manejadorBD.getRowCount() > 0) {
                medicina.cargarPorNombre(manejadorBD.getValorString(0, 1));
                medicinaSelector1.setSelectedItem(medicina.nombre);
                tf_unidadMedida.setText(medicina.unidadMedida.descripcion);
            }
        }
    }//GEN-LAST:event_codigoSelectorActionPerformed

    private void btn_eliminarMedicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarMedicinaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) t_medicina.getModel();

        modelo.removeRow(t_medicina.getSelectedRow());

        cargarTotales();

        limpiarMedicina();
    }//GEN-LAST:event_btn_eliminarMedicinaActionPerformed

    private void cargarTotales() {
        subtotal = 0;
        iva = 0;
        total = 0;

        for (int i = 0; i < (t_medicina.getRowCount()); i++) {
            subtotal += Double.parseDouble(String.valueOf(t_medicina.getValueAt(i, 4)));
        }

        iva = subtotal * 0.16;
        total = subtotal + iva;
        this.tf_subtotal.setText(dec.format(subtotal));
        this.tf_iva.setText(dec.format(iva));
        this.tf_total.setText(dec.format(total));
    }

    private void limpiarMedicina() {
        this.medicinaSelector1.setSelectedItem("");
        this.codigoSelector.setSelectedItem("");
        this.tf_cantidadIngresada.setText("");
        this.tf_unidadMedida.setText("");
        this.tf_precioUnitario.setText("$ 0.0");
    }
    DecimalFormat dec;
    int cantidad;
    double precioUnitario;
    double importe;
    double subtotal;
    double iva;
    double total;
    Rancho rancho;
    Compra compra;
    Proveedor proveedor;
    Medicina medicina;
    CatalogoProveedor catalogoProveedor;
    AdministracionMedicamentos administracionMedicamentos;
    Desktop parent;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abstractt.Boton btn_agregarCompra;
    private abstractt.Boton btn_agregarMedicina;
    private abstractt.Boton btn_eliminarMedicina;
    private abstractt.Boton btn_medicamentos;
    private abstractt.Boton btn_proveedor;
    private abstractt.ComboBox codigoSelector;
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
    private domain.Fecha fecha1;
    private abstractt.fondo fondo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private domain.MedicinaSelector medicinaSelector1;
    private domain.ProveedorSelector proveedorSelector1;
    private gui.SelectorFecha selectorFecha1;
    private abstractt.Table t_medicina;
    private abstractt.TextField tf_cantidadIngresada;
    private abstractt.TextField tf_factura;
    private abstractt.TextFieldMoneda tf_iva;
    private abstractt.TextField tf_letras;
    private abstractt.TextField tf_ordenCompra;
    private abstractt.TextFieldMoneda tf_precioUnitario;
    private abstractt.TextFieldMoneda tf_subtotal;
    private abstractt.TextFieldMoneda tf_total;
    private abstractt.TextField tf_unidadMedida;
    // End of variables declaration//GEN-END:variables

    private String convertir(String numero) {
        String[] numeros = numero.split(".");
        switch (numeros[1].charAt(0)) {

        }
        return numero;
    }
}
