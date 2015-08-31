package gui;

import domain.Animal;
import domain.Excel;
import static domain.Medicina.cargarCodigoMedicinas;
import static domain.Medicina.cargarMedicinas;
import static domain.Medicina.leerMedicinaAnimal;
import domain.ParametrosSP;
import domain.Tratamiento;
import static gui.Desktop.manejadorBD;
import static gui.Desktop.rancho;
import static gui.Splash.formatoDateTime;
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
public class MedicinasAnimal extends javax.swing.JFrame {

    /**
     * Creates new form MedicinasAnimal
     */
    public MedicinasAnimal(Animal aAnimal) {
//        super(parent, modal);

        initComponents();
        setLocationRelativeTo(null);
        Image i = null;
        i = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/logo tru-test.png"));
        setIconImage(i);
        animal = aAnimal;

        Dimension d;

        d = medicamentoSelector.getSize();
        codigoSelector.addArray(cargarCodigoMedicinas());
        medicamentoSelector.addArray(cargarMedicinas());
        medicamentoSelector.setSize(d);
//"id Medicina",
        /*
         String titulos[] = {"Codigo", "Medicinas", "Fecha", "Costo","Dosis", "Importe"};

         t_MedicinaAnimal.setTitulos(titulos);
         t_MedicinaAnimal.cambiarTitulos();
         t_MedicinaAnimal.setFormato(new int[]{4, 0, 3, 4,4,4});
         */
        cargarMedicinaAnimal();
        //leerMedicinaAnimal(t_MedicinaAnimal, id_animal);

        tf_TagID.setText(animal.arete_visual.toString());

        tf_Dosis.textFieldDouble();

        this.setTitle(this.getTitle() + " " + rancho.descripcion);

        tratamientoSelectorNombre.cargar();
        tratamientoSelectorCodigo.cargar2();

        cargarComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_MedicinaAnimal = new abstractt.Table();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        medicamentoSelector = new abstractt.ComboBox();
        jLabel1 = new javax.swing.JLabel();
        codigoSelector = new abstractt.ComboBox();
        selectorFecha = new gui.SelectorFecha();
        jLabel6 = new javax.swing.JLabel();
        tf_costo = new abstractt.TextFieldMoneda();
        jPanel3 = new javax.swing.JPanel();
        etiqueta1 = new abstractt.Etiqueta();
        etiqueta2 = new abstractt.Etiqueta();
        tratamientoSelectorCodigo = new domain.TratamientoSelector();
        tratamientoSelectorNombre = new domain.TratamientoSelector();
        jLabel5 = new javax.swing.JLabel();
        tf_Dosis = new abstractt.TextField();
        jLabel4 = new javax.swing.JLabel();
        tf_TagID = new javax.swing.JTextField();
        btn_Aplicar = new abstractt.Boton();
        btn_Eliminar = new abstractt.Boton();
        bt_Reporte = new abstractt.Boton();
        fondo1 = new abstractt.fondo();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Medicinas por Animal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(97, 84, 88));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 225, 195));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aplicacion de Medicinas");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 80));

        jScrollPane2.setOpaque(false);

        t_MedicinaAnimal.setForeground(new java.awt.Color(230, 225, 195));
        t_MedicinaAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_MedicinaAnimal.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        t_MedicinaAnimal.setOpaque(false);
        jScrollPane2.setViewportView(t_MedicinaAnimal);
        if (t_MedicinaAnimal.getColumnModel().getColumnCount() > 0) {
            t_MedicinaAnimal.getColumnModel().getColumn(0).setResizable(false);
            t_MedicinaAnimal.getColumnModel().getColumn(1).setResizable(false);
            t_MedicinaAnimal.getColumnModel().getColumn(2).setResizable(false);
            t_MedicinaAnimal.getColumnModel().getColumn(3).setResizable(false);
            t_MedicinaAnimal.getColumnModel().getColumn(4).setResizable(false);
            t_MedicinaAnimal.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 325, 800, 188));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 500, -1, 100));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 37, 4)), "Medicamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 10), new java.awt.Color(64, 37, 4))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 37, 4));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Medicamento:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, 20));

        medicamentoSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicamentoSelectorActionPerformed(evt);
            }
        });
        jPanel5.add(medicamentoSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 160, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 37, 4));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Codigo:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 25, 150, 20));

        codigoSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoSelectorActionPerformed(evt);
            }
        });
        jPanel5.add(codigoSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 25, 160, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 400, 100));
        jPanel5.getAccessibleContext().setAccessibleName("Medicamento");

        selectorFecha.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jPanel1.add(selectorFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 270, 60));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Costo Total:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 525, 110, 25));

        tf_costo.setFocusable(false);
        tf_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_costoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 525, 150, 25));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 37, 4)), "Tratamientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 11), new java.awt.Color(64, 37, 4))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiqueta1.setForeground(new java.awt.Color(64, 37, 4));
        etiqueta1.setText("Código: ");
        etiqueta1.setFont(new java.awt.Font("Trebuchet", 1, 18)); // NOI18N
        jPanel3.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 25, 150, 20));

        etiqueta2.setForeground(new java.awt.Color(64, 37, 4));
        etiqueta2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta2.setText("Tratamiento: ");
        etiqueta2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPanel3.add(etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 150, 20));

        tratamientoSelectorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tratamientoSelectorCodigoActionPerformed(evt);
            }
        });
        jPanel3.add(tratamientoSelectorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 25, 160, -1));

        tratamientoSelectorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tratamientoSelectorNombreActionPerformed(evt);
            }
        });
        jPanel3.add(tratamientoSelectorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 400, 100));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 37, 4));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Dosis:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 275, 60, 30));

        tf_Dosis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Dosis.setText("0.00");
        tf_Dosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_DosisActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 275, 160, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 37, 4));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Animal (ID Visual)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 100, 150, 20));

        tf_TagID.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tf_TagID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_TagID.setFocusable(false);
        jPanel1.add(tf_TagID, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 100, 160, -1));

        btn_Aplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono crear.png"))); // NOI18N
        btn_Aplicar.setText("Aplicar");
        btn_Aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AplicarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Aplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 575, 150, 40));

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono eliminar.png"))); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 575, 150, 40));

        bt_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icono reporte de entradas.png"))); // NOI18N
        bt_Reporte.setText("Reporte");
        bt_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReporteActionPerformed(evt);
            }
        });
        jPanel1.add(bt_Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 575, 150, 40));

        fondo1.setText("fondo1");
        jPanel1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 575, 20, 75));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarMedicinaAnimal() {

        leerMedicinaAnimal(t_MedicinaAnimal, animal);
/*
        manejadorBD.consulta(""
                + "SELECT round(ifnull(sum(round(costo_unitario,2) * dosis),0.00),2) "
                + "FROM  medicina_animal ma, medicina m "
                + "WHERE ma.id_medicina	=	m.id_medicina "
                + "AND   id_rancho	=	'" + rancho.id_rancho + "' "
                + "AND   id_animal	=	'" + animal.id_animal + "'");
        
  */      
        manejadorBD.consulta(""
                + "SELECT round(ifnull(sum(round(costo,2) * dosis),0.00),2) \n"
                + "FROM  medicina_animal ma \n"
                + "WHERE id_rancho	=	'" + rancho.id_rancho + "' "
                + "AND   id_animal	=	'" + animal.id_animal + "'");

        costo = manejadorBD.getValorDouble(0, 0);

        tf_costo.setDouble(costo);
    }

    private void codigoSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoSelectorActionPerformed

        String numero;

        numero = codigoSelector.getSelectedItem().toString();

        if (!numero.equals("")) {

            codigo = Integer.parseInt(numero);

            manejadorBD.consulta(""
                    + "SELECT id_medicina, nombre "
                    + "FROM   medicina "
                    + "WHERE  codigo = " + codigo + " "
                    + "AND    status = 'S'");

            if (manejadorBD.getRowCount() > 0) {

                id_medicina = manejadorBD.getValorString(0, 0);
                medicina = manejadorBD.getValorString(0, 1);
                medicamentoSelector.setSelectedItem(medicina);
            }

            tratamientoSelectorCodigo.setSelectedItem("");
            tratamientoSelectorNombre.setSelectedItem("");
        }
    }//GEN-LAST:event_codigoSelectorActionPerformed

    private void medicamentoSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicamentoSelectorActionPerformed

        medicina = this.medicamentoSelector.getSelectedItem().toString();

        manejadorBD.consulta(""
                + "SELECT id_medicina, codigo "
                + "FROM medicina "
                + "WHERE nombre = '" + medicina + "'");

        if (manejadorBD.getRowCount() > 0) {

            id_medicina = manejadorBD.getValorString(0, 0);
            codigo = manejadorBD.getValorInt(0, 1);
            codigoSelector.setSelectedItem(codigo);

            tratamientoSelectorCodigo.setSelectedItem("");
            tratamientoSelectorNombre.setSelectedItem("");
        }
    }//GEN-LAST:event_medicamentoSelectorActionPerformed

    private void tf_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_costoActionPerformed

    private void btn_AplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AplicarActionPerformed

        //SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        fecha = this.selectorFecha.getFecha();//this.JDC_Fecha.getCalendar().getTime();
        dosis = tf_Dosis.getDouble();
        if (!id_medicina.equals("")) {
            /*
             * Medicina Indivual
             */
            if (dosis > 0) {
                
                manejadorBD.parametrosSP = new ParametrosSP();
                manejadorBD.parametrosSP.agregarParametro(rancho.id_rancho, "varIdRancho", "STRING", "IN");
                manejadorBD.parametrosSP.agregarParametro(id_medicina, "varMedicina", "STRING", "IN");
                manejadorBD.parametrosSP.agregarParametro(animal.id_animal, "varIdAnimal", "STRING", "IN");
                manejadorBD.parametrosSP.agregarParametro(dosis.toString(), "varDosis", "DOUBLE", "IN");
                manejadorBD.parametrosSP.agregarParametro(formatoDateTime.format(fecha), "varFecha", "STRING", "IN");

                if (manejadorBD.ejecutarSP("{ call agregarMedicinaAnimal(?,?,?,?,?) }") == 0) {

                    JOptionPane.showMessageDialog(this, "Se agrego aplicacion de medicina en el  animal Correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
                } else {

                    JOptionPane.showMessageDialog(this, "Error al agregar la aplicacion de medicina en el animal\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
                }

                cargarMedicinaAnimal();

            } else {

                JOptionPane.showMessageDialog(this, "La Dosis del Medicamento es incorrecta\n");

            }
        } else {
            /*
             * Tratamiento
             */
            if (dosis > 0) {
                if (tratamiento.agregarTratamientoAnimal(animal, dosis, fecha)) {

                    JOptionPane.showMessageDialog(this, "Se agrego aplicacion de Tratamiento en el animal Correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al agregar la aplicacion de Tratamiento en el animal\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
                }
                cargarMedicinaAnimal();
            } else {
                JOptionPane.showMessageDialog(this, "La Cantidad del tratamiento es incorrecta");
            }
        }
    }//GEN-LAST:event_btn_AplicarActionPerformed

    private void bt_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReporteActionPerformed

        Excel excel = new Excel();

        excel.reporteMedicinasAnimal(t_MedicinaAnimal, animal, costo);

    }//GEN-LAST:event_bt_ReporteActionPerformed

    private void tratamientoSelectorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tratamientoSelectorNombreActionPerformed
        tratamiento = tratamientoSelectorNombre.getTratamientoNombre();
        if (!tratamiento.id_tratamiento.equals("")) {
            tratamientoSelectorCodigo.setSelectedItem(tratamiento.codigo);
            codigoSelector.setSelectedItem("");
            medicamentoSelector.setSelectedItem("");
        }
    }//GEN-LAST:event_tratamientoSelectorNombreActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed

        Integer fila;

        fila = this.t_MedicinaAnimal.getSelectedRow();

        if (fila >= 0) {

            id_medicina_animal = t_MedicinaAnimal.getValueAt(fila, 0).toString();

            manejadorBD.parametrosSP = new ParametrosSP();

            manejadorBD.parametrosSP.agregarParametro(rancho.id_rancho, "varIdRancho", "STRING", "IN");
            manejadorBD.parametrosSP.agregarParametro(id_medicina_animal, "varIdMedicinaAnimal", "STRING", "IN");

            if (manejadorBD.ejecutarSP("{ call eliminarMedicinaAnimal(?,?) }") == 0) {

                JOptionPane.showMessageDialog(this, "Se elimino la aplicacion de medicina en el  animal Correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(this, "Error al eliminar la aplicacion de medicina en el animal\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
            }

            cargarMedicinaAnimal();
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void tratamientoSelectorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tratamientoSelectorCodigoActionPerformed

        tratamiento = tratamientoSelectorCodigo.getTratamientoCodigo();

        if (!tratamiento.id_tratamiento.equals("")) {

            id_medicina = "";
            tratamientoSelectorNombre.setSelectedItem(tratamiento.nombre);
            codigoSelector.setSelectedItem("");
            medicamentoSelector.setSelectedItem("");
        }
    }//GEN-LAST:event_tratamientoSelectorCodigoActionPerformed

    private void tf_DosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_DosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_DosisActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void cargarComponentes() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension pantallaTamano = tk.getScreenSize();
//        setSize(pantallaTamano);
//        plecaSuperior1.cargar();
        fondo1.cargar(pantallaTamano);
//        jPanel1.setLocation((pantallaTamano.width / 2) - (jPanel1.getWidth() / 2), (pantallaTamano.height / 2) - (jPanel1.getHeight() / 2));
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
    }

    private Integer codigo;
    private String id_medicina;
    private String medicina;
    private Double dosis;
    private Date fecha;
    private Double costo;
    private String id_medicina_animal;
    private Animal animal;
    private Tratamiento tratamiento;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abstractt.Boton bt_Reporte;
    private abstractt.Boton btn_Aplicar;
    private abstractt.Boton btn_Eliminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private abstractt.ComboBox codigoSelector;
    private abstractt.Etiqueta etiqueta1;
    private abstractt.Etiqueta etiqueta2;
    private javax.swing.Box.Filler filler1;
    private abstractt.fondo fondo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private abstractt.ComboBox medicamentoSelector;
    private gui.SelectorFecha selectorFecha;
    private abstractt.Table t_MedicinaAnimal;
    private abstractt.TextField tf_Dosis;
    private javax.swing.JTextField tf_TagID;
    private abstractt.TextFieldMoneda tf_costo;
    private domain.TratamientoSelector tratamientoSelectorCodigo;
    private domain.TratamientoSelector tratamientoSelectorNombre;
    // End of variables declaration//GEN-END:variables
}
