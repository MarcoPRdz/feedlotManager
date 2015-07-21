/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static abstractt.ClaseAbstracta.dialogoConfirmacionSiNo;
import domain.Animal;
import domain.ParametrosSP;
import domain.SR232;
import static gui.Desktop.manejadorBD;
import static gui.Desktop.rancho;
import static gui.Login.gs_mensaje;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class BajasMuerte extends javax.swing.JFrame {

    /**
     * Creates new form BajasMuertes1
     */
    private Animal animal;
    String puertoStick, puertoBascula;
    private SR232 stick;

    public BajasMuerte(java.awt.Frame parent, Animal aAnimal) {
        this.parent = parent;
        initComponents();
        setLocationRelativeTo(null);

        //id_animal = animal;
        animal = aAnimal;

        if (animal.id_animal.equals("")) {

        }

        JDCFechaMuerte.setDate(new Date());

        this.animalSelector1.cargararete_visuals();

        cargarPuertos();

        stick = new SR232(puertoStick, 3, (Desktop) parent, 5);
        stick.setEID(tf_Eid);   //  tf_Eid::tf_numeroPedido

        stick.start();

        this.setTitle(this.getTitle() + " " + rancho.descripcion);

        cargarComponentes();
    }

    public void setEid(String eid) {

        //System.out.println("setEid arete_electronico="+arete_electronico);
        animal.cargarPorEid(eid);

        //System.out.println(animal.toString());
        //this.tf_Eid.setText(animal.arete_electronico);
        this.animalSelector1.setSelectedItem(animal.arete_visual);

        //tagIdSelector.setSelectedItem(animal.arete_visual);//id_animal.toString());
        //corral = corralAnimal(id_animal);
        //tf_corral.setText(animal.corral.nombre);//corral);                   
        //arete_siniiga = areteSiniiga(id_animal);
        //tf_areteSiniiga.setText(animal.arete_siniiga);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etiqueta6 = new abstractt.Etiqueta();
        etiqueta5 = new abstractt.Etiqueta();
        etiqueta4 = new abstractt.Etiqueta();
        etiqueta3 = new abstractt.Etiqueta();
        etiqueta2 = new abstractt.Etiqueta();
        animalSelector1 = new domain.AnimalSelector();
        tfNecropcia = new abstractt.TextField();
        tfDxMuerte = new abstractt.TextField();
        tfEtapaReproductiva = new abstractt.TextField();
        JDCFechaMuerte = new abstractt.Calendar();
        btn_Ingresar = new abstractt.Boton();
        btn_Historico = new abstractt.Boton();
        tf_Eid = new abstractt.TextField();
        etiqueta1 = new abstractt.Etiqueta();
        plecaSuperior1 = new abstractt.PlecaSuperior();
        fondo1 = new abstractt.fondo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiqueta6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta6.setText("Etapa reproductiva");
        etiqueta6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPanel2.add(etiqueta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 25));

        etiqueta5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta5.setText("Dx Muerte");
        etiqueta5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPanel2.add(etiqueta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, 25));

        etiqueta4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta4.setText("Necropcia");
        etiqueta4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPanel2.add(etiqueta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 170, 25));

        etiqueta3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta3.setText("Fecha de muerte");
        etiqueta3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPanel2.add(etiqueta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 25));

        etiqueta2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta2.setText("Arete Visual");
        etiqueta2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPanel2.add(etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 25));

        animalSelector1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jPanel2.add(animalSelector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 25));

        tfNecropcia.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jPanel2.add(tfNecropcia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 200, 25));

        tfDxMuerte.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jPanel2.add(tfDxMuerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 200, 25));

        tfEtapaReproductiva.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jPanel2.add(tfEtapaReproductiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 200, 25));
        jPanel2.add(JDCFechaMuerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 200, 25));

        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 300, 125, 35));

        btn_Historico.setText("Historico");
        btn_Historico.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_Historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HistoricoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Historico, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 300, 125, 35));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, 400));
        jPanel1.add(tf_Eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        etiqueta1.setForeground(new java.awt.Color(230, 225, 195));
        etiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta1.setText("Información para dar de baja");
        etiqueta1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jPanel1.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1220, -1));

        plecaSuperior1.setText("plecaSuperior1");
        jPanel1.add(plecaSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        animal.cargarPorAreteVisual(this.animalSelector1.getSelectedItem().toString(), "M");

        if (animal.id_animal.equals("")) {

            JOptionPane.showMessageDialog(this, "No ha seleccionado Animal ", gs_mensaje, JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (dialogoConfirmacionSiNo(this, "¿Esta Seguro que desea dar de baja a este animal?, se dejará de visualizar en corrales y otras pantallas", gs_mensaje, 1) == 0) {

            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            fechaMuerte = this.JDCFechaMuerte.getCalendar().getTime();
            necropcia = this.tfNecropcia.getText();
            dxMuerte = this.tfDxMuerte.getText();
            etapaReproductiva = this.tfEtapaReproductiva.getText();

            // System.out.println(formatoDelTexto.format(fechaMuerte));
            manejadorBD.parametrosSP = new ParametrosSP();

            manejadorBD.parametrosSP.agregarParametro(rancho.id_rancho, "varIdRancho", "STRING", "IN");
            manejadorBD.parametrosSP.agregarParametro(animal.id_animal, "varIdAnimal", "STRING", "IN");
            manejadorBD.parametrosSP.agregarParametro(formatoDelTexto.format(fechaMuerte), "varFechaMuerte", "STRING", "IN");
            manejadorBD.parametrosSP.agregarParametro(necropcia, "varNecropcia", "STRING", "IN");
            manejadorBD.parametrosSP.agregarParametro(dxMuerte, "varDxMuerte", "STRING", "IN");
            manejadorBD.parametrosSP.agregarParametro(etapaReproductiva, "varEtapaReproductiva", "STRING", "IN");

            if (manejadorBD.ejecutarSP("{ call movimientoMuerte(?,?,?,?,?,?) }") == 0) {

                JOptionPane.showMessageDialog(this, "Se dio de baja el animal Correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(this, "Error al dar de baja el animal\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void btn_HistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HistoricoActionPerformed
        visualizacionMuertes = new VisualizacionMuertes((Desktop)parent);
        this.setVisible(false);
        visualizacionMuertes.setVisible(true);
    }//GEN-LAST:event_btn_HistoricoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.stick.setSeguir(false);
        parent.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void cargarComponentes() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension pantallaTamano = tk.getScreenSize();
//        setSize(pantallaTamano);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        plecaSuperior1.cargar();
        fondo1.cargar(pantallaTamano);
    }

    private Date fechaMuerte;
    private String necropcia;
    private String dxMuerte;
    private String etapaReproductiva;
    // private Integer id_animal;
    java.awt.Frame parent;
    private VisualizacionMuertes visualizacionMuertes;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abstractt.Calendar JDCFechaMuerte;
    private domain.AnimalSelector animalSelector1;
    private abstractt.Boton btn_Historico;
    private abstractt.Boton btn_Ingresar;
    private abstractt.Etiqueta etiqueta1;
    private abstractt.Etiqueta etiqueta2;
    private abstractt.Etiqueta etiqueta3;
    private abstractt.Etiqueta etiqueta4;
    private abstractt.Etiqueta etiqueta5;
    private abstractt.Etiqueta etiqueta6;
    private abstractt.fondo fondo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private abstractt.PlecaSuperior plecaSuperior1;
    private abstractt.TextField tfDxMuerte;
    private abstractt.TextField tfEtapaReproductiva;
    private abstractt.TextField tfNecropcia;
    private abstractt.TextField tf_Eid;
    // End of variables declaration//GEN-END:variables
}
