/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Animal;
import static domain.Animal.animalEmparejamiento;
import static gui.Desktop.busquedaAnimalSelector;
import static gui.Desktop.rancho;
import static gui.Desktop.manejadorBD;
import static gui.Login.gs_mensaje;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Developer GAGS
 */
public class Emparejamiento extends javax.swing.JFrame {

    /**
     * Creates new form SalidaGanado
     */
    public Emparejamiento(Desktop parent, Animal semental) {
        this.parent = parent;
        initComponents();
        setLocationRelativeTo(null);

        this.semental = semental;
        hembra = new Animal();

        cargarAnimales();

        this.setTitle(this.getTitle() + " " + rancho.descripcion);

        Image i = null;
        i = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/logo tru-test.png"));
        setIconImage(i);

        animalSelector.cargarTagsIdsSementales();

        setResizable(false);

        fondo1.cargar(getSize());
        animalSelector.setSelectedItem(semental.arete_visual);

    }

    public void cargarAnimales() {

        t_animales = animalEmparejamiento(t_animales, semental);

        if (t_animales.getRowCount() > 0) {

            btn_det_hembra.setEnabled(true);
        } else {

            btn_det_hembra.setEnabled(false);
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        animalSelector = new domain.AnimalSelector();
        btn_det_semental = new abstractt.Boton();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_animales = new abstractt.Table();
        etiqueta1 = new abstractt.Etiqueta();
        btn_det_hembra = new abstractt.Boton();
        btn_agregar = new abstractt.Boton();
        btn_eliminar = new abstractt.Boton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 50));
        fondo1 = new abstractt.fondo();

        setTitle("Emparejamiento");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(95, 84, 88));
        jLabel2.setText("Semental:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 20));

        animalSelector.setEnabled(false);
        animalSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalSelectorActionPerformed(evt);
            }
        });
        jPanel4.add(animalSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 200, 20));

        btn_det_semental.setText("Detalles Semental");
        btn_det_semental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_det_sementalActionPerformed(evt);
            }
        });
        jPanel4.add(btn_det_semental, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 200, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        t_animales.setForeground(new java.awt.Color(230, 225, 195));
        t_animales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        t_animales.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(t_animales);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 1000, 400));

        etiqueta1.setBackground(new java.awt.Color(95, 84, 88));
        etiqueta1.setForeground(new java.awt.Color(230, 225, 195));
        etiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta1.setText("Emparejamiento");
        etiqueta1.setFont(new java.awt.Font("Trebuchet", 1, 48)); // NOI18N
        etiqueta1.setOpaque(true);
        jPanel1.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 80));

        btn_det_hembra.setText("Detalles Hembra");
        btn_det_hembra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_det_hembraActionPerformed(evt);
            }
        });
        jPanel1.add(btn_det_hembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 200, 30));

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 200, 30));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 200, 30));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, 80));

        fondo1.setText("fondo1");
        jPanel1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing


    }//GEN-LAST:event_formWindowClosing

    private void animalSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalSelectorActionPerformed


    }//GEN-LAST:event_animalSelectorActionPerformed

    private void btn_det_sementalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_det_sementalActionPerformed

        if (especificacionesAnimal != null) {

            especificacionesAnimal.dispose();
        }

        especificacionesAnimal = new EspecificacionesAnimal(parent);
        especificacionesAnimal.setId_animal(semental.id_animal);
        especificacionesAnimal.setVisible(true);

    }//GEN-LAST:event_btn_det_sementalActionPerformed

    private void btn_det_hembraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_det_hembraActionPerformed

        int fila;

        if (especificacionesAnimal != null) {

            especificacionesAnimal.dispose();
        }

        especificacionesAnimal = new EspecificacionesAnimal(parent);

        fila = t_animales.getSelectedRow();

        if (fila < 0) {

            JOptionPane.showMessageDialog(this, "Seleccione una Hembra\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
            return;
        }

        hembra.cargarPorId(this.t_animales.getValueAt(fila, 0).toString());

        if (!hembra.id_animal.equals("")) {

            especificacionesAnimal.setId_animal(hembra.id_animal);
        }

        especificacionesAnimal.setVisible(true);
    }//GEN-LAST:event_btn_det_hembraActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        if (busquedaAnimalSelector != null) {

            busquedaAnimalSelector.stick.setSeguir(false);

            busquedaAnimalSelector.dispose();
        }

        busquedaAnimalSelector = new BusquedaAnimalSelector(parent, hembras);
        busquedaAnimalSelector.setVisible(true);

        hembra = busquedaAnimalSelector.animal;

        busquedaAnimalSelector.stick.setSeguir(false);

        busquedaAnimalSelector.dispose();

        if (hembra.id_animal.equals("")) {
            return;
        }

        hembra.semental = semental;

        if (hembra.actualizar() && hembra.crearRegistroEmpadre()) {            
            
            JOptionPane.showMessageDialog(this, "Se actualizó el animal Correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(this, "Error al actualizar el animal\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(hembra.toString());

        this.cargarAnimales();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        Integer fila, opcion;
        Animal semental_vacio = new Animal();

        fila = t_animales.getSelectedRow();

        if (fila >= 0) {

            opcion = JOptionPane.showConfirmDialog(this, "¿Desea quitar la hmebra del Semental?", gs_mensaje, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (opcion == 0) {

                hembra = new Animal();
                hembra.cargarPorId(this.t_animales.getValueAt(fila, 0).toString());
                hembra.semental = semental_vacio;

                if (hembra.actualizar()) {

                    JOptionPane.showMessageDialog(this, "Se actualizó el animal Correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
                } else {

                    JOptionPane.showMessageDialog(this, "Error al actualizar el animal\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {

            JOptionPane.showMessageDialog(parent, "Selecciona un Animal", gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }

        this.cargarAnimales();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    public static Integer hembras = 2;

    Desktop parent;

    public EspecificacionesAnimal especificacionesAnimal;
    private Integer id_animal;
    private Integer id_corral;
    private String numeroPedido;
    private String corral, eid;
    private String arete_siniiga;
    private Double peso_actual;
    private Animal semental;
    private Animal hembra;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private domain.AnimalSelector animalSelector;
    private abstractt.Boton btn_agregar;
    private abstractt.Boton btn_det_hembra;
    private abstractt.Boton btn_det_semental;
    private abstractt.Boton btn_eliminar;
    private abstractt.Etiqueta etiqueta1;
    private javax.swing.Box.Filler filler1;
    private abstractt.fondo fondo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private abstractt.Table t_animales;
    // End of variables declaration//GEN-END:variables
}
