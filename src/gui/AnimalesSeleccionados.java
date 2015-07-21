/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Animal;
import domain.ParametrosSP;
import static gui.Desktop.rancho;
import static gui.Desktop.manejadorBD;
import static gui.Login.gs_mensaje;
import static gui.Login.usuario_activo;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author sperez
 */
public class AnimalesSeleccionados extends javax.swing.JPanel {

    /**
     * Creates new form AnimalesSeleccionados
     */
    public AnimalesSeleccionados() {
        initComponents();

        t_animales.setSize(this.getSize());

        ListSelectionModel lsm = this.t_animales.getSelectionModel();

        lsm.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                selectAnimal();
            }
        });

    }

    private Animal animal;

    private void selectAnimal() {

        animal = new Animal();

        Integer fila = t_animales.getSelectedRow();

        if (fila >= 0) {

            animal.cargarPorId(t_animales.getValueAt(fila, 0).toString());

            switch (Tipo) {
                case 1:

                    parent.medicinasAnimalGrupo.setAnimal(animal);
                    parent.medicinasAnimalGrupo.cargarMedicinaAnimal();
                    break;
            }

            btn_detalles.setEnabled(true);
            btn_BorrarAnimal.setEnabled(true);

        } else {

            btn_detalles.setEnabled(false);
            btn_BorrarAnimal.setEnabled(false);
        }
    }

    public void reordenar() {

        t_animales.setSize(this.getSize());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        t_animales = new abstractt.Table();
        btn_BorrarTodos = new javax.swing.JButton();
        btn_detalles = new abstractt.Boton();
        btn_BorrarAnimal = new abstractt.Boton();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        t_animales.setForeground(new java.awt.Color(230, 225, 195));
        t_animales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane.setViewportView(t_animales);

        btn_BorrarTodos.setBackground(new java.awt.Color(64, 37, 4));
        btn_BorrarTodos.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_BorrarTodos.setForeground(new java.awt.Color(230, 225, 195));
        btn_BorrarTodos.setText("Borrar Todos");
        btn_BorrarTodos.setContentAreaFilled(false);
        btn_BorrarTodos.setOpaque(true);
        btn_BorrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarTodosActionPerformed(evt);
            }
        });

        btn_detalles.setText("Detalles");
        btn_detalles.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detallesActionPerformed(evt);
            }
        });

        btn_BorrarAnimal.setText("Borrar Animal");
        btn_BorrarAnimal.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_BorrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_BorrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(btn_BorrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_BorrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BorrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BorrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarTodosActionPerformed

        int opcion;

        if (this.t_animales.getRowCount() <= 0) {

            JOptionPane.showMessageDialog(this, "No hay animales seleccionados", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        opcion = JOptionPane.showConfirmDialog(this, "¿Desea quitar todos los animales de la lista?", gs_mensaje, JOptionPane.YES_NO_OPTION);

        if (opcion != 0) {

            return;
        }

        manejadorBD.parametrosSP = new ParametrosSP();
        manejadorBD.parametrosSP.agregarParametro(rancho.id_rancho, "varIdRancho", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(usuario_activo.id_usuario, "varIdUsuario", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(ls_tipo, "varTipo", "STRING", "IN");

        if (manejadorBD.ejecutarSP("{ call eliminarAnimalGrupoUsuario(?,?,?) }") == 0) {

            JOptionPane.showMessageDialog(this, "Se eliminaron los animales de la lista correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(this, "Error al eliminar los animales de la lista\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }

        cargar_tabla();
    }//GEN-LAST:event_btn_BorrarTodosActionPerformed

    private void btn_detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detallesActionPerformed
        if (especificacionesAnimal != null) {

            especificacionesAnimal.dispose();
        }

        especificacionesAnimal = new EspecificacionesAnimal(parent);

        if (!animal.id_animal.equals("")) {

            especificacionesAnimal.setId_animal(animal.id_animal);
        }

        especificacionesAnimal.setVisible(true);
        //  this.dispose();

    }//GEN-LAST:event_btn_detallesActionPerformed

    private void btn_BorrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarAnimalActionPerformed
        int opcion;

        if (animal.id_animal == null) {

            JOptionPane.showMessageDialog(this, "No hay animal seleccionado", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        opcion = JOptionPane.showConfirmDialog(this, "¿Desea quitar el Animal de la lista?", gs_mensaje, JOptionPane.YES_NO_OPTION);

        if (opcion != 0) {

            return;
        }

        manejadorBD.parametrosSP = new ParametrosSP();
        manejadorBD.parametrosSP.agregarParametro(rancho.id_rancho, "varIdRancho", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(usuario_activo.id_usuario.toString(), "varIdUsuario", "INT", "IN");
        manejadorBD.parametrosSP.agregarParametro(animal.id_animal, "varIdAnimal", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(ls_tipo, "varTipo", "STRING", "IN");

        if (manejadorBD.ejecutarSP("{ call eliminarAnimalGrupo(?,?,?,?) }") == 0) {

            JOptionPane.showMessageDialog(this, "Se elimino el animal de la lista correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(this, "Error al eliminar el animal de la lista\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }

        cargar_tabla();

    }//GEN-LAST:event_btn_BorrarAnimalActionPerformed

    public void cargar_tabla() {

        switch (Tipo) {
            case 1:
                parent.medicinasAnimalGrupo.cargarGrupoAnimalUsuario();
                break;
            case 2:
                parent.salidaGanadoGrupo.cargarGrupoAnimalUsuario();
                break;
        }
    }

    private Desktop parent;

    /*
     *   1: medicina
     */
    private int Tipo;
    private String ls_tipo;
    EspecificacionesAnimal especificacionesAnimal;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abstractt.Boton btn_BorrarAnimal;
    private javax.swing.JButton btn_BorrarTodos;
    private abstractt.Boton btn_detalles;
    private javax.swing.JScrollPane jScrollPane;
    public abstractt.Table t_animales;
    // End of variables declaration//GEN-END:variables

    /**
     * @param parent the parent to set
     */
    public void setParent(Desktop parent) {
        this.parent = parent;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(int Tipo) {

        this.Tipo = Tipo;

        switch (Tipo) {
            case 1:
                ls_tipo = "medicina";
                break;
            case 2:
                ls_tipo = "salida";
                break;
        }
    }
}
