/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Corral;
import domain.Recepcion;

/**
 *
 * @author Marco
 */
public class AlimentoLotes extends javax.swing.JFrame {

    /**
     * Creates new form AlimentoLotes
     */
    public AlimentoLotes() {
        initComponents();
        this.loteSelector1.cargar();
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

        jPanel1 = new javax.swing.JPanel();
        etiqueta1 = new abstractt.Etiqueta();
        loteSelector1 = new domain.LoteSelector();
        etiqueta2 = new abstractt.Etiqueta();
        jPanel2 = new javax.swing.JPanel();
        tf_totalAlimento = new abstractt.TextField();
        fondo1 = new abstractt.fondo();
        btn_ingreso = new abstractt.Boton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiqueta1.setBackground(new java.awt.Color(95, 84, 88));
        etiqueta1.setForeground(new java.awt.Color(230, 225, 195));
        etiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta1.setText("Alimento por Lotes");
        etiqueta1.setFont(new java.awt.Font("Trebuchet", 1, 36)); // NOI18N
        etiqueta1.setOpaque(true);
        jPanel1.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        loteSelector1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loteSelector1ActionPerformed(evt);
            }
        });
        jPanel1.add(loteSelector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        etiqueta2.setText("Lote:");
        jPanel1.add(etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total de Alimento Ingresado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel2.setOpaque(false);

        tf_totalAlimento.setBackground(new java.awt.Color(255, 255, 153));
        tf_totalAlimento.setText("0.0");
        tf_totalAlimento.setEnabled(false);
        tf_totalAlimento.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_totalAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_totalAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 360, -1));

        fondo1.setText("fondo1");
        jPanel1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_ingreso.setText("Ingresar Alimento");
        btn_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresoActionPerformed
        corral = new Corral();
        ingresoAlimento = new IngresoAlimento(this, recepcion.numero_lote, corral);
        ingresoAlimento.setVisible(true);
    }//GEN-LAST:event_btn_ingresoActionPerformed

    private void loteSelector1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loteSelector1ActionPerformed
        recepcion.cargarPorLote(loteSelector1.getText());
        tf_totalAlimento.setText(recepcion.total_alimento.toString());
    }//GEN-LAST:event_loteSelector1ActionPerformed
    
    IngresoAlimento ingresoAlimento;
    Recepcion recepcion;
    Corral corral;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abstractt.Boton btn_ingreso;
    private abstractt.Etiqueta etiqueta1;
    private abstractt.Etiqueta etiqueta2;
    private abstractt.fondo fondo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private domain.LoteSelector loteSelector1;
    private abstractt.TextField tf_totalAlimento;
    // End of variables declaration//GEN-END:variables
}
