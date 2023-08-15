package Ejercicio4;

import java.util.TreeSet;


public class Formulario extends javax.swing.JFrame {
public static TreeSet<Producto> productlist = new TreeSet<>();


    public Formulario() {
        initComponents();
        cargarProductos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ProductosBT = new javax.swing.JMenuItem();
        Spacing = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        RubroBT = new javax.swing.JMenuItem();
        NombreBT = new javax.swing.JMenuItem();
        PrecioBT = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenu1.setText("Administracion");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        ProductosBT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ProductosBT.setText("Productos");
        jMenu1.add(ProductosBT);

        jMenuBar1.add(jMenu1);

        Spacing.setEnabled(false);
        Spacing.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Spacing.setLabel("  ");
        jMenuBar1.add(Spacing);

        jMenu2.setText("Consulta");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        RubroBT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RubroBT.setText("Por rubro");
        RubroBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RubroBTActionPerformed(evt);
            }
        });
        jMenu2.add(RubroBT);

        NombreBT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NombreBT.setText("Por nombre");
        NombreBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreBTActionPerformed(evt);
            }
        });
        jMenu2.add(NombreBT);

        PrecioBT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PrecioBT.setText("Por precio");
        PrecioBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioBTActionPerformed(evt);
            }
        });
        jMenu2.add(PrecioBT);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreBTActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        BusquedaPorNombre wind = new BusquedaPorNombre();
        int centerX=(this.getWidth()/2)-(wind.getWidth()/2);
        int centerY=(this.getHeight()/2)-(wind.getHeight());
        wind.setBounds(centerX,centerY,500, 300);
        wind.setVisible(true);
        jDesktopPane1.add(wind);
        jDesktopPane1.moveToFront(wind);
        
        
    }//GEN-LAST:event_NombreBTActionPerformed

    private void RubroBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RubroBTActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        BusquedaPorRubro wind = new BusquedaPorRubro();
        int centerX=(this.getWidth()/2)-(wind.getWidth()/2);
        int centerY=(this.getHeight()/2)-(wind.getHeight());
        wind.setBounds(centerX,centerY,500, 300);
        wind.setVisible(true);
        jDesktopPane1.add(wind);
        jDesktopPane1.moveToFront(wind);
    }//GEN-LAST:event_RubroBTActionPerformed

    private void PrecioBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioBTActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        BusquedaPorPrecio wind = new BusquedaPorPrecio();
        int centerX=(this.getWidth()/2)-(wind.getWidth()/2);
        int centerY=(this.getHeight()/2)-(wind.getHeight());
        wind.setBounds(centerX,centerY,wind.getWidth(), wind.getHeight());
        wind.setVisible(true);
        jDesktopPane1.add(wind);
        jDesktopPane1.moveToFront(wind);
    }//GEN-LAST:event_PrecioBTActionPerformed

 
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem NombreBT;
    private javax.swing.JMenuItem PrecioBT;
    private javax.swing.JMenuItem ProductosBT;
    private javax.swing.JMenuItem RubroBT;
    private javax.swing.JMenu Spacing;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void cargarProductos(){
        productlist.add(new Producto(10,"Azucar x 1kg",180.75,5,Categoria.COMESTIBLE));
        productlist.add(new Producto(12,"Yerba Mate",850,10,Categoria.COMESTIBLE));
        productlist.add(new Producto(5,"Aceite de girasol",250,5,Categoria.COMESTIBLE));
        productlist.add(new Producto(6,"Lavandina",500,3,Categoria.LIMPIEZA));

    }
    
    

}
