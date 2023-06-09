/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_lexico;

/**
 *
 * @author 50232
 */
public class Expresiones_Regulares extends javax.swing.JFrame {

    /**
     * Creates new form Expresiones_Regulares
     */
    public Expresiones_Regulares() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIngreso = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnAnalizar_Expresion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIngreso.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIngreso.setInheritsPopupMenu(true);

        btnAnalizar_Expresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-text-color-48.png"))); // NOI18N
        btnAnalizar_Expresion.setText("Analizar");
        btnAnalizar_Expresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizar_ExpresionActionPerformed(evt);
            }
        });

        jLabel1.setText("Expresiones Regulares");

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagram-06_24511.png"))); // NOI18N
        btnMenu.setText("Menú Principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3792081-broom-halloween-magic-witch_109049 (1).png"))); // NOI18N
        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAnalizar_Expresion)
                                    .addComponent(btnMenu)
                                    .addComponent(btnClean)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnalizar_Expresion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenu)
                        .addGap(18, 18, 18)
                        .addComponent(btnClean)))
                .addGap(31, 31, 31)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        Principal abrir = new Principal();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnAnalizar_ExpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizar_ExpresionActionPerformed
        // TODO add your handling code here:
        if (txtIngreso.getText().matches("^(\\?.*[A-Z].*[A-Z])(\\?=.*[!@#$&*])(\\?=.*[0-9].*[0-9])(\\?=.*[a[1]z].*[a-z].*[a-z]).{8}$")){
            txtResultado.setText("Correcto, pertenece a la expresion No. 1");
        }else if (txtIngreso.getText().matches("^[a-z0-9_-]{3,16}$")){
            txtResultado.setText("Correcto, pertenece a la expresion No. 2");
        }else if (txtIngreso.getText().matches("^-?\\d*(\\.\\d+)?$")){
            txtResultado.setText("Correcto, pertenece a la expresion No. 3");
        }else if (txtIngreso.getText().matches("^[a-zA-ZñÑáéíóúÁÉÍÓÚ]+$")){
            txtResultado.setText("Correcto, pertence a la expresion No. 4");
        }else if (txtIngreso.getText().matches("^[0-9]+[.,]{1,1}\\[0]{2,2}$")){
            txtResultado.setText("Correcto 5");
        }else{
              txtResultado.setText("Debes ingresar una cadena válida");  
            }
        
    }//GEN-LAST:event_btnAnalizar_ExpresionActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        // TODO add your handling code here:
        txtIngreso.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Expresiones_Regulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expresiones_Regulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expresiones_Regulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expresiones_Regulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expresiones_Regulares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar_Expresion;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
