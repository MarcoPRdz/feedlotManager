/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Excel;
import static gui.Desktop.rancho;
import java.util.Date;

/**
 *
 * @author angelesygil
 */
public class ReporteEntradas extends javax.swing.JDialog {

    /**
     * Creates new form PesoManual
     */
    public ReporteEntradas(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        selectorFecha1 = new gui.SelectorFecha();
        etiqueta1 = new abstractt.Etiqueta();
        btn_generar = new abstractt.Boton();
        fondo1 = new abstractt.fondo();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte entradas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(selectorFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 280, -1));

        etiqueta1.setBackground(new java.awt.Color(95, 84, 88));
        etiqueta1.setForeground(new java.awt.Color(230, 225, 195));
        etiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta1.setText("Reporte de entradas");
        etiqueta1.setFont(new java.awt.Font("Trebuchet", 1, 24)); // NOI18N
        etiqueta1.setOpaque(true);
        jPanel1.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 150, 150, 30));

        fondo1.setText("fondo1");
        jPanel1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed

        Excel excel = new Excel();

        Date fecha = selectorFecha1.getFecha();

        excel.reporteEntrada(fecha);

    }//GEN-LAST:event_btn_generarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abstractt.Boton btn_generar;
    private abstractt.Etiqueta etiqueta1;
    private abstractt.fondo fondo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private gui.SelectorFecha selectorFecha1;
    // End of variables declaration//GEN-END:variables
}
