/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static abstractt.ClaseAbstracta.dialogoConfirmacionSiNo;
import domain.Animal;
import static domain.Animal.cargararete_visuals;
import static domain.ClaseMovimiento.cargarClaseMovimiento;
import static domain.ClaseMovimiento.idClaseDescripcion;
import static domain.DestinoVenta.idDestinoDescripcion;
import domain.ParametrosSP;
import domain.SR232;
import static gui.Desktop.rancho;
import static gui.Desktop.manejadorBD;
import static gui.Login.gs_mensaje;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Developer GAGS
 */
public class SalidaGanado extends javax.swing.JFrame {

    /**
     * Creates new form SalidaGanado
     */
    public SalidaGanado(Desktop parent) {
        this.parent = parent;
        initComponents();
        setLocationRelativeTo(null);

        animal = new Animal();
        reporteSalidas = new ReporteSalidas();

        this.tagIdSelector.addArray(cargararete_visuals());
        claseMovimientoSelector.addArray(cargarClaseMovimiento());
        destinoSelector1.cargar();

        this.tf_pesoActual.textFieldDouble();

        String titulos[] = {"Arete visual", "EiD", "Arete Siniiga", "Fecha de Salida",
            "Clase de Movimiento", "Numero de Pedido", "Grupo de Origen",
            "Peso (kg)"};

        t_movimientoSalida.setTitulos(titulos);
        t_movimientoSalida.cambiarTitulos();
        t_movimientoSalida.setFormato(new int[]{0, 0, 0, 3, 0, 0, 0, 1});

        cargarSalidas();

        cargarPuertos();

        stick = new SR232(puertoStick, 3, parent, 2);
        stick.setEID(tf_Eid);   //  tf_Eid::tf_numeroPedido
        stick.setTf_Peso(tf_pesoActual);
        stick.start();

        tagIdSelector.ActionTranferfocus = false;

        int[] tamaños = new int[8];
        tamaños[0] = 80;//id Animal
        tamaños[1] = 100;//EID
        tamaños[2] = 80;//Arete Siniiga
        tamaños[3] = 120;//Fecha Salida
        tamaños[4] = 140;//Clase de Movimiento
        tamaños[5] = 120; //Numero de Pedido
        tamaños[6] = 120;//Grupo de Origen
        tamaños[7] = 80;//Peso (kg)

        t_movimientoSalida.tamañoColumna(tamaños);

        this.setTitle(this.getTitle() + " " + rancho.descripcion);
        
        
         Image i = null;
        i = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/logo tru-test.png"));
        setIconImage(i);
        
        cargarComponentes();
    }

    public void cargarPuertos() {

        manejadorBD.consulta(
                "SELECT puerto_baston, puerto_bascula "
                + "FROM configuracion ");

        if (manejadorBD.getRowCount() > 0) {

            puertoStick = manejadorBD.getValorString(0, 0);
            puertoBascula = manejadorBD.getValorString(0, 1);
        }
    }

    String puertoStick, puertoBascula;
    private SR232 stick;
    private Integer idClaseMovimiento;
    private Integer id_destino;

    public void cargarSalidas() {

        // cargarMovimientosSalida(t_movimientoSalida);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tagIdSelector = new abstractt.ComboBox();
        calendar1 = new abstractt.Calendar();
        claseMovimientoSelector = new abstractt.ComboBox();
        destinoSelector1 = new domain.DestinoSelector();
        tf_pesoActual = new abstractt.TextField();
        tf_Eid = new abstractt.TextField();
        tf_numeroPedido = new abstractt.TextField();
        tf_areteSiniiga = new abstractt.TextField();
        tf_corral = new abstractt.TextField();
        boton1 = new abstractt.Boton();
        boton2 = new abstractt.Boton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_movimientoSalida = new abstractt.Table();
        etiqueta1 = new abstractt.Etiqueta();
        fondo1 = new abstractt.fondo();

        setTitle("Salida de Ganado");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(95, 84, 88));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Arete Visual");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 19));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(95, 84, 88));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Arete Electronico:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 130, 19));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(95, 84, 88));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Arete Siniiga:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 19));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(95, 84, 88));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha de Movimiento:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, 130, 19));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(95, 84, 88));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Clase de Movimiento:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, 19));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(95, 84, 88));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Numero de pedido:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 130, 19));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(95, 84, 88));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Destino de venta:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, 19));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(95, 84, 88));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Corral:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 245, 130, 19));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(95, 84, 88));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Peso Actual (Kg):");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 19));

        tagIdSelector.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tagIdSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagIdSelectorActionPerformed(evt);
            }
        });
        jPanel4.add(tagIdSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 200, -1));

        calendar1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(calendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 105, 200, -1));

        claseMovimientoSelector.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(claseMovimientoSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, -1));

        destinoSelector1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(destinoSelector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 200, -1));

        tf_pesoActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_pesoActual.setText("0.00");
        tf_pesoActual.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(tf_pesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 245, 200, -1));

        tf_Eid.setEditable(false);
        tf_Eid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Eid.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tf_Eid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_EidFocusLost(evt);
            }
        });
        tf_Eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EidActionPerformed(evt);
            }
        });
        jPanel4.add(tf_Eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, 200, 20));

        tf_numeroPedido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_numeroPedido.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(tf_numeroPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 175, 200, 20));

        tf_areteSiniiga.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(tf_areteSiniiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 20));

        tf_corral.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(tf_corral, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        boton1.setText("Salida de Animal");
        boton1.setFont(new java.awt.Font("Trebuchet", 1, 12)); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel1.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 150, 30));

        boton2.setText("Reporte de Salida");
        boton2.setFont(new java.awt.Font("Trebuchet", 1, 12)); // NOI18N
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jPanel1.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 150, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        t_movimientoSalida.setForeground(new java.awt.Color(230, 225, 195));
        t_movimientoSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        t_movimientoSalida.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(t_movimientoSalida);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        etiqueta1.setBackground(new java.awt.Color(95, 84, 88));
        etiqueta1.setForeground(new java.awt.Color(230, 225, 195));
        etiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta1.setText("Información de Salida");
        etiqueta1.setFont(new java.awt.Font("Trebuchet", 1, 48)); // NOI18N
        etiqueta1.setOpaque(true);
        jPanel3.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 80));

        fondo1.setText("fondo1");
        jPanel3.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarSalida() {

        if (dialogoConfirmacionSiNo(this, "¿Esta Seguro que dar salida al animal?, se dejará de visualizar en corrales y otras pantallas", gs_mensaje, 1) == 1) {

            return;
        }

        Date fecha;
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        fecha = this.calendar1.getDate();
        idClaseMovimiento = idClaseDescripcion(this.claseMovimientoSelector.getSelectedItem().toString());
        id_destino = idDestinoDescripcion(this.destinoSelector1.getSelectedItem().toString());
        numeroPedido = tf_numeroPedido.getText();
        peso_actual = this.tf_pesoActual.getDouble();

        manejadorBD.parametrosSP = new ParametrosSP();

        manejadorBD.parametrosSP.agregarParametro(rancho.id_rancho, "varIdRancho", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(animal.id_animal, "varIdAnimal", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(formatoDelTexto.format(fecha), "varFechaSalida", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(idClaseMovimiento.toString(), "varIdClaseMovimiento", "INT", "IN");
        manejadorBD.parametrosSP.agregarParametro(numeroPedido, "varNumeroPedido", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(id_destino.toString(), "varIdDestino", "INT", "IN");
        manejadorBD.parametrosSP.agregarParametro(peso_actual.toString(), "varPesoActual", "DOUBLE", "IN");

        if (manejadorBD.ejecutarSP("{ call movimientoSalida(?,?,?,?,?,?,?) }") == 0) {

            JOptionPane.showMessageDialog(this, "Se Realizo el movimiento de salida Correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(this, "Error al actualizar el animal\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }
        cargarSalidas();
    }

    private void tagIdSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagIdSelectorActionPerformed

        //id_animal = Integer.parseInt(tagIdSelector.getSelectedItem().toString());
        animal.cargarPorAreteVisual(tagIdSelector.getSelectedItem().toString(),"A");

        cargarDatosTag();
    }//GEN-LAST:event_tagIdSelectorActionPerformed

    private void cargarDatosTag() {

        // arete_electronico = EEid(id_animal);
        tf_Eid.setText(animal.arete_electronico);

        //corral = corralAnimal(id_animal);
        tf_corral.setText(animal.corral.nombre);

        //arete_siniiga = areteSiniiga(id_animal);
        tf_areteSiniiga.setText(animal.arete_siniiga);
    }

    public void setEid(String eid) {

        //System.out.println("setEid arete_electronico="+arete_electronico);
        animal.cargarPorEid(eid);

        //System.out.println(animal.toString());
        this.tf_Eid.setText(animal.arete_electronico);
        tagIdSelector.setSelectedItem(animal.arete_visual);//id_animal.toString());

        //corral = corralAnimal(id_animal);
        tf_corral.setText(animal.corral.nombre);//corral);                   

        //arete_siniiga = areteSiniiga(id_animal);
        tf_areteSiniiga.setText(animal.arete_siniiga);

    }

    public void cargarDatosEid() {

        animal.cargarPorEid(this.tf_Eid.getText());
        tagIdSelector.setSelectedItem(animal.arete_visual);
        tf_corral.setText(animal.corral.nombre);
        tf_areteSiniiga.setText(animal.arete_siniiga);
    }

    private void tf_EidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_EidFocusLost
        if (true) {
            return;
        }
        //tf_numeroPedido.requestFocus();                
        eid = tf_Eid.getText();
        cargarDatosEid();
    }//GEN-LAST:event_tf_EidFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.stick.setSeguir(false);
        //this.stick.cerrarPuerto();
    }//GEN-LAST:event_formWindowClosing

    private void tf_EidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EidActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        reporteSalidas.setVisible(true);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        agregarSalida();
    }//GEN-LAST:event_boton1ActionPerformed

    private void cargarComponentes() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension pantallaTamano = tk.getScreenSize();
        setResizable(false);
        setSize(pantallaTamano);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        fondo1.cargar(pantallaTamano);
    }

    Desktop parent;
    private ReporteSalidas reporteSalidas;
    private Integer id_animal;
    private Integer id_corral;
    private String numeroPedido;
    private String corral, eid;
    private String arete_siniiga;
    private Double peso_actual;
    private Animal animal;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abstractt.Boton boton1;
    private abstractt.Boton boton2;
    private abstractt.Calendar calendar1;
    private abstractt.ComboBox claseMovimientoSelector;
    private domain.DestinoSelector destinoSelector1;
    private abstractt.Etiqueta etiqueta1;
    private abstractt.fondo fondo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private abstractt.Table t_movimientoSalida;
    private abstractt.ComboBox tagIdSelector;
    private abstractt.TextField tf_Eid;
    private abstractt.TextField tf_areteSiniiga;
    private abstractt.TextField tf_corral;
    private abstractt.TextField tf_numeroPedido;
    private abstractt.TextField tf_pesoActual;
    // End of variables declaration//GEN-END:variables
}
