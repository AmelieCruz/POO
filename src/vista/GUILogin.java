package vista;


import controlador.Factory;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.*;


public class GUILogin extends javax.swing.JFrame {
    
    public GUILogin() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/images/iconLogin.jpg")).getImage());
        this.getContentPane().setBackground(new Color(0xE0F8F7));
        this.setVisible(true);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFusuario = new javax.swing.JTextField();
        TFcontra = new javax.swing.JTextField();
        BTNingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setText("Introduzca usuario y contraseña");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");

        TFusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFusuarioActionPerformed(evt);
            }
        });

        TFcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcontraActionPerformed(evt);
            }
        });
        TFcontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFcontraKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFcontraKeyReleased(evt);
            }
        });

        BTNingresar.setText("Ingresar");
        BTNingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(BTNingresar)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(BTNingresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFusuarioActionPerformed

    private void TFcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcontraActionPerformed

    private void BTNingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNingresarActionPerformed
        ingresar();
    }//GEN-LAST:event_BTNingresarActionPerformed

    private void TFcontraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFcontraKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           ingresar();
        }
    }//GEN-LAST:event_TFcontraKeyPressed
    private void ingresar(){
        String usuario, contra;
        usuario = TFusuario.getText();
        contra = TFcontra.getText();
        
        for(Trabajador t : Factory.getTrabajadores()){
            String clave = t.getClaveAcceso();
            String user = t.getUserName();
            
            if(clave.equals(contra) && user.equals(usuario)){
                if(t instanceof Medico){
                    GUIMedico med = new GUIMedico((Medico) t);
                    this.dispose();
                }else{
                    GUIEnfermera enf = new GUIEnfermera((Enfermera) t);
                    this.dispose();
                }
            }
        }
        if(this.isVisible()){
            JOptionPane.showMessageDialog(null, "El usuario y contraseña no coinciden", "Error de acceso", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void TFcontraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFcontraKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcontraKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNingresar;
    private javax.swing.JTextField TFcontra;
    private javax.swing.JTextField TFusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
