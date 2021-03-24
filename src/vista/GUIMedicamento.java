/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Factory;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Medicamento;

/**
 *
 * @author andre
 */
public class GUIMedicamento extends javax.swing.JFrame {

    /**
     * Creates new form GUIMedicamento
     * recibe el probable nombre del nuevo medicamento;
     * @param medicamentoNuevo
     */
    public GUIMedicamento(String medicamentoNuevo) {
        initComponents();
        txtSustancia.setText(medicamentoNuevo);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/images/iconMedicamento.jpg")).getImage());
        this.getContentPane().setBackground(new Color(0xF8ECE0));  
        this.setVisible(true);
    }
     public GUIMedicamento(String medicamentoNuevo, String nuevaPresentacion) {
        this(medicamentoNuevo);
        txtPresentacion.setText(nuevaPresentacion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSustancia = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblPresentacion = new javax.swing.JLabel();
        txtSustancia = new javax.swing.JTextField();
        txtPresentacion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblSustancia.setText("Sustancia:");

        lblPrecio.setText("Precio:");

        lblPresentacion.setText("Presentacion:");

        txtSustancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSustanciaActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPresentacion)
                            .addComponent(lblPrecio)
                            .addComponent(lblSustancia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSustancia)
                            .addComponent(txtPrecio)
                            .addComponent(txtPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSustancia)
                    .addComponent(txtSustancia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPresentacion)
                    .addComponent(txtPresentacion))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSustanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSustanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSustanciaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       if(txtPresentacion.getText().equals("")||txtPrecio.getText().equals("")||
            txtSustancia.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor debe llenar todos los campos");
       }else{
           double precio;
           try{
               precio = Double.parseDouble(txtPrecio.getText());
           }catch(ArithmeticException e){
               JOptionPane.showMessageDialog(null,"Introduzca un precio válido");
               txtPrecio.setText("");
               return;
           }
           Factory.agregar(new Medicamento(txtSustancia.getText(), txtPresentacion.getText(), precio));
           this.dispose();
       }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPresentacion;
    private javax.swing.JLabel lblSustancia;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPresentacion;
    private javax.swing.JTextField txtSustancia;
    // End of variables declaration//GEN-END:variables
}
