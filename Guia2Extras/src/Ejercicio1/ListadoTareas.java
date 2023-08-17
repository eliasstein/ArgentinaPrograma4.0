package Ejercicio1;

import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListadoTareas extends javax.swing.JFrame {
    private DefaultTableModel tabla= new DefaultTableModel();
    private TreeSet<Tarea> listatareas= new TreeSet<>();
   
    public ListadoTareas() {
        initComponents();
        crearCabecera();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        jBTAgregarTarea = new javax.swing.JButton();
        jBTCambiarEstado = new javax.swing.JButton();
        jBTEliminarTarea = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Listado de tareas");

        jTabla1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabla1);

        jBTAgregarTarea.setText("Agregar Tarea");
        jBTAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAgregarTareaActionPerformed(evt);
            }
        });

        jBTCambiarEstado.setText("Cambiar estado");
        jBTCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCambiarEstadoActionPerformed(evt);
            }
        });

        jBTEliminarTarea.setText("Eliminar Tarea");
        jBTEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEliminarTareaActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBTAgregarTarea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBTCambiarEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBTEliminarTarea))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTAgregarTarea)
                    .addComponent(jBTCambiarEstado)
                    .addComponent(jBTEliminarTarea))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTAgregarTareaActionPerformed
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción de la tarea"); //Muestra un mensaje por pantalla para añadir la descripcion
        listatareas.add(new Tarea(listatareas.size()+1,descripcion,Estado.PENDIENTE));  //Añade una tarea a nuestro treeset
        actualizarTabla();              //Actualiza la tabla
    }//GEN-LAST:event_jBTAgregarTareaActionPerformed

    private void jBTCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCambiarEstadoActionPerformed
        for(Tarea t:listatareas){
            if(t.getID()==jTabla1.getSelectedRow()+1){
                if(t.getEstado()==Estado.PENDIENTE)
                    t.setEstado(Estado.COMPLETADA);
                else
                    t.setEstado(Estado.PENDIENTE);
            }
        }
        actualizarTabla();
    }//GEN-LAST:event_jBTCambiarEstadoActionPerformed

    private void jBTEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEliminarTareaActionPerformed
        for (Tarea t : listatareas) {
            if(t.getID()==jTabla1.getSelectedRow()+1){
                listatareas.remove(t);
                //t.setDescripcion("");
                //t.setEstado(null);
                actualizarTabla();
                return;
            }
        }
    }//GEN-LAST:event_jBTEliminarTareaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        limpiarTabla();
        for (Tarea t : listatareas) {
            if(jComboBox1.getSelectedItem()==t.getEstado())
            {
                tabla.addRow(new Object[]{
                t.getID(),
                t.getDescripcion(),
                t.getEstado()
                });
            }
            else if(jComboBox1.getSelectedItem()==Estado.TODO){
                actualizarTabla();
            }
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTAgregarTarea;
    private javax.swing.JButton jBTCambiarEstado;
    private javax.swing.JButton jBTEliminarTarea;
    private javax.swing.JComboBox<Estado> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla1;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(){
        jComboBox1.addItem(Estado.TODO);
        jComboBox1.addItem(Estado.COMPLETADA);
        jComboBox1.addItem(Estado.PENDIENTE);

    }
    private void crearCabecera(){
        tabla.addColumn("ID");
        tabla.addColumn("Descripcion");
        tabla.addColumn("Estado");
        jTabla1.setModel(tabla);
    }
    private void limpiarTabla(){
        int f = jTabla1.getRowCount()-1;
        for(int x=f;x>=0;x--){
            tabla.removeRow(x);
        }
    }
    private void actualizarTabla(){
        limpiarTabla();                                         //Limpia la tabla por default
        int cont=1;
        for(Tarea t:listatareas){                               //Recorre el treeSet y agrega filas a la tabla
            t.setID(cont);
                tabla.addRow(new Object[]{
                t.getID(),
                t.getDescripcion(),
                t.getEstado()
                });
            cont++;
        }        
        
    }

}
