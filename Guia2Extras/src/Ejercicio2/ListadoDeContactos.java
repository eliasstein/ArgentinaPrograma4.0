package Ejercicio2;

import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListadoDeContactos extends javax.swing.JFrame {
    private static DefaultTableModel tabla= new DefaultTableModel();
    public static TreeSet<Contacto> listacontactos= new TreeSet<>();
   
    public ListadoDeContactos() {
        initComponents();
        crearCabecera();
        //cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        jBTAgregarContacto = new javax.swing.JButton();
        jBTBuscarContacto = new javax.swing.JButton();
        jBTEditarContacto = new javax.swing.JButton();
        jBTEliminarContacto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setOpaque(false);
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Listado de contactos");

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

        jBTAgregarContacto.setText("Agregar Contacto");
        jBTAgregarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAgregarContactoActionPerformed(evt);
            }
        });

        jBTBuscarContacto.setText("Buscar Contacto");
        jBTBuscarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarContactoActionPerformed(evt);
            }
        });

        jBTEditarContacto.setText("Editar Contacto");
        jBTEditarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEditarContactoActionPerformed(evt);
            }
        });

        jBTEliminarContacto.setText("Eliminar contacto");
        jBTEliminarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEliminarContactoActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBTAgregarContacto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBTBuscarContacto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBTEditarContacto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBTEliminarContacto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBTAgregarContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBTEliminarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBTBuscarContacto)
                        .addGap(18, 18, 18)
                        .addComponent(jBTEditarContacto)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTAgregarContacto)
                    .addComponent(jBTBuscarContacto)
                    .addComponent(jBTEditarContacto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTEliminarContacto)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTAgregarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTAgregarContactoActionPerformed
    /*
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción de la tarea"); //Muestra un mensaje por pantalla para añadir la descripcion
        listacontactos.add(new Contacto(listacontactos.size()+1,descripcion,));  //Añade una tarea a nuestro treeset
        actualizarTabla();              //Actualiza la tabla
    */
    
        jBTAgregarContacto.setEnabled(false);
        jBTBuscarContacto.setEnabled(false);
        jBTEditarContacto.setEnabled(false);
        jBTEliminarContacto.setEnabled(false);
        AgregarContacto wind = new AgregarContacto();
        int centerX=(this.getWidth()/2)-(wind.getWidth()/2);
        int centerY=(this.getHeight()/2)-(wind.getHeight()/2);
        wind.setBounds(centerX,centerY,wind.getWidth(), wind.getHeight());
        wind.setVisible(true);
        jDesktopPane1.add(wind);
        jDesktopPane1.moveToFront(wind);
    
    }//GEN-LAST:event_jBTAgregarContactoActionPerformed

    
    private void jBTBuscarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarContactoActionPerformed

        String contacto=JOptionPane.showInputDialog("Ingrese el nombre del contacto para buscar");
        limpiarTabla();
        for(Contacto c: listacontactos){
            if(c.getNombre().toLowerCase().startsWith(contacto.toLowerCase()))
                tabla.addRow(new Object[]{
                c.getTelefono(),
                c.getNombre(),
                c.getMail()});
        }
    }//GEN-LAST:event_jBTBuscarContactoActionPerformed
    
    
    private void jBTEditarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEditarContactoActionPerformed
        /*
        for (Contacto t : listacontactos) {
            if(t.getID()==jTabla1.getSelectedRow()+1){
                listacontactos.remove(t);
                //t.setDescripcion("");
                //t.setEstado(null);
                actualizarTabla();
                return;
            }
        }
        */
        if(jTabla1.getSelectedRow()!=-1)
        {
            jBTAgregarContacto.setEnabled(false);
            jBTBuscarContacto.setEnabled(false);
            jBTEditarContacto.setEnabled(false);
            jBTEliminarContacto.setEnabled(false);
            EditarContacto wind = new EditarContacto();
            int centerX=(this.getWidth()/2)-(wind.getWidth()/2);
            int centerY=(this.getHeight()/2)-(wind.getHeight()/2);
            wind.setBounds(centerX,centerY,wind.getWidth(), wind.getHeight());
            wind.datosOriginales(""+tabla.getValueAt(jTabla1.getSelectedRow(), 0),
                    ((String)tabla.getValueAt(jTabla1.getSelectedRow(), 1)),
                    ((String)tabla.getValueAt(jTabla1.getSelectedRow(), 2)));
           
            wind.setVisible(true);
            jDesktopPane1.add(wind);
            jDesktopPane1.moveToFront(wind);
        }
    }//GEN-LAST:event_jBTEditarContactoActionPerformed

    private void jBTEliminarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEliminarContactoActionPerformed
        if(jTabla1.getSelectedRow()!=-1){
            Long telefono = (Long)tabla.getValueAt(jTabla1.getSelectedRow(), 0);
            String nombre = (String)tabla.getValueAt(jTabla1.getSelectedRow(), 1);
            String mail = (String)tabla.getValueAt(jTabla1.getSelectedRow(), 2);


            listacontactos.remove(new Contacto(telefono,nombre,mail));
            actualizarTabla();
        }
    }//GEN-LAST:event_jBTEliminarContactoActionPerformed


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
            java.util.logging.Logger.getLogger(ListadoDeContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoDeContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoDeContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoDeContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoDeContactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jBTAgregarContacto;
    private static javax.swing.JButton jBTBuscarContacto;
    private static javax.swing.JButton jBTEditarContacto;
    private static javax.swing.JButton jBTEliminarContacto;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTabla1;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(){
        /*
        jComboBox1.addItem(Estado.TODO);
        jComboBox1.addItem(Estado.COMPLETADA);
        jComboBox1.addItem(Estado.PENDIENTE);
    */
    }
    private void crearCabecera(){
        tabla.addColumn("Telefono");
        tabla.addColumn("Nombre");
        tabla.addColumn("Mail");
        jTabla1.setModel(tabla);
        
    }
    private static void limpiarTabla(){
        int f = jTabla1.getRowCount()-1;
        for(int x=f;x>=0;x--){
            tabla.removeRow(x);
        }
    }
    public static JButton getjBTAgregarContacto(){
        return jBTAgregarContacto;
    }
    public static JButton getjBTBuscarContacto(){
        return jBTBuscarContacto;
    }
    public static JButton getjBTEditarContacto(){
        return jBTEditarContacto;
    }
    public static JButton getjBTEliminarContacto(){
        return jBTEliminarContacto;
    }
   public static void actualizarTabla(){
        limpiarTabla();                                         //Limpia la tabla por default

        for(Contacto t:listacontactos){                               //Recorre el treeSet y agrega filas a la tabla
                tabla.addRow(new Object[]{
                t.getTelefono(),
                t.getNombre(),
                t.getMail()
                });
        }        
        
    }

}
