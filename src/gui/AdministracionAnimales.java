/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.Desktop;
import static gui.Desktop.rancho;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Home
 */
public class AdministracionAnimales extends javax.swing.JInternalFrame {

    /**
     * Creates new form CreacionAnimales
     */
    public AdministracionAnimales(Desktop parent) {
        this.parent = parent;
        initComponents();
        this.pack();
        this.setClosable(true);
        this.setFrameIcon(new ImageIcon(this.getClass().getResource("/resources/logo tru-test.png")));
        this.setTitle(this.getTitle() + " " + rancho.descripcion);
        fondo1.cargar(this.getSize());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_manual = new abstractt.Boton();
        btn_automatico = new abstractt.Boton();
        btn_cargarArchivo = new abstractt.Boton();
        btn_sementales = new abstractt.Boton();
        btn_partos = new abstractt.Boton();
        etiqueta1 = new abstractt.Etiqueta();
        fondo1 = new abstractt.fondo();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        btn_manual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ingreso animal ICONO.png"))); // NOI18N
        btn_manual.setToolTipText("Ingreso de Animales Manualmente");
        btn_manual.setPreferredSize(new java.awt.Dimension(150, 120));
        btn_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manualActionPerformed(evt);
            }
        });
        jPanel1.add(btn_manual);

        btn_automatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono STICK READER.png"))); // NOI18N
        btn_automatico.setToolTipText("Ingreso de Animales con Bastón Electrónico");
        btn_automatico.setPreferredSize(new java.awt.Dimension(150, 120));
        btn_automatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_automaticoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_automatico);

        btn_cargarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono EXCEL.png"))); // NOI18N
        btn_cargarArchivo.setToolTipText("Cargar un Archivo de Excel");
        btn_cargarArchivo.setPreferredSize(new java.awt.Dimension(150, 120));
        btn_cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cargarArchivo);

        btn_sementales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono SEMENTAL.png"))); // NOI18N
        btn_sementales.setToolTipText("Sementales");
        btn_sementales.setPreferredSize(new java.awt.Dimension(150, 120));
        btn_sementales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sementalesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sementales);

        btn_partos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono PARTOS.png"))); // NOI18N
        btn_partos.setToolTipText("Partos");
        btn_partos.setPreferredSize(new java.awt.Dimension(150, 120));
        btn_partos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_partosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_partos);

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        etiqueta1.setBackground(new java.awt.Color(95, 84, 88));
        etiqueta1.setForeground(new java.awt.Color(230, 225, 195));
        etiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta1.setText("Ingreso de Animales");
        etiqueta1.setFont(new java.awt.Font("Trebuchet", 1, 48)); // NOI18N
        etiqueta1.setOpaque(true);
        jPanel6.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 80));

        fondo1.setText("fondo1");
        jPanel6.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_automaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_automaticoActionPerformed
        if (parent.especificacionesAnimal != null) {

            parent.especificacionesAnimal.dispose();
        }

        parent.especificacionesAnimal = new EspecificacionesAnimal(parent);

        parent.especificacionesAnimal.cargarStick();

        parent.especificacionesAnimal.setVisible(true);
    }//GEN-LAST:event_btn_automaticoActionPerformed

    private void btn_manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manualActionPerformed

        if (parent.especificacionesAnimal != null) {

            parent.especificacionesAnimal.dispose();
        }

        parent.especificacionesAnimal = new EspecificacionesAnimal(parent);

        parent.especificacionesAnimal.setVisible(true);
    }//GEN-LAST:event_btn_manualActionPerformed

    private void btn_cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarArchivoActionPerformed

        if (parent.cargarArchivoSesion != null) {

            parent.cargarArchivoSesion.dispose();
        }

        parent.cargarArchivoSesion = new CargarArchivoSesion(parent);
        parent.cargarArchivoSesion.setVisible(true);
    }//GEN-LAST:event_btn_cargarArchivoActionPerformed

    private void btn_partosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_partosActionPerformed

        if (partos != null) {
            partos.dispose();
        }

        partos = new PartosAbortos(parent);
        partos.setVisible(true);
    }//GEN-LAST:event_btn_partosActionPerformed

    private void btn_sementalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sementalesActionPerformed
        if (sementales != null) {
            sementales.dispose();
        }

        sementales = new Sementales(parent);
        sementales.setVisible(true);
    }//GEN-LAST:event_btn_sementalesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    }//GEN-LAST:event_formWindowClosing
    /**
     * @param args the command line arguments //
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CreacionAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CreacionAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CreacionAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CreacionAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CreacionAnimales().setVisible(true);
//            }
//        });
//    }
    private Desktop parent;
    PartosAbortos partos;
    Sementales sementales;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abstractt.Boton btn_automatico;
    private abstractt.Boton btn_cargarArchivo;
    private abstractt.Boton btn_manual;
    private abstractt.Boton btn_partos;
    private abstractt.Boton btn_sementales;
    private abstractt.Etiqueta etiqueta1;
    private abstractt.fondo fondo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
