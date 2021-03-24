
package vista;

import java.util.Calendar;
import modelo.*;
import controlador.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUINuevaCita extends javax.swing.JFrame {
    Enfermera enf;
    Paciente p;
    
    public GUINuevaCita(Enfermera enf, Paciente p) {
        initComponents();
        this.enf = enf;
        this.p = p;
        try{
            asignarMedicos();
        }catch(Exception e){}
        this.setIconImage(new ImageIcon(getClass().getResource("/images/iconCitaMedica.jpg")).getImage());
       this.getContentPane().setBackground(new Color(0xF8E0F7)); 
        this.setVisible(true);
    }
    
    public void asignarMedicos(){
        for(Medico m : Factory.getMedicos()){
            CBMedicos.addItem(m.getNombreCompleto());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFDia = new javax.swing.JTextField();
        TFMes = new javax.swing.JTextField();
        TFAnio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CBMedicos = new javax.swing.JComboBox<>();
        BTNRegistrar = new javax.swing.JButton();
        BTNCancelar = new javax.swing.JButton();
        lblHora = new javax.swing.JLabel();
        TFMinutos = new javax.swing.JTextField();
        TFHora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Agendar Cita");

        jLabel2.setText("Fecha:");

        TFDia.setText("DIA");
        TFDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFDiaMouseClicked(evt);
            }
        });
        TFDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFDiaActionPerformed(evt);
            }
        });
        TFDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFDiaKeyTyped(evt);
            }
        });

        TFMes.setText("MES");
        TFMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFMesMouseClicked(evt);
            }
        });
        TFMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFMesActionPerformed(evt);
            }
        });
        TFMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFMesKeyTyped(evt);
            }
        });

        TFAnio.setText("AÑO");
        TFAnio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFAnioMouseClicked(evt);
            }
        });
        TFAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFAnioKeyTyped(evt);
            }
        });

        jLabel3.setText("Medico:");

        BTNRegistrar.setText("Registrar");
        BTNRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistrarActionPerformed(evt);
            }
        });

        BTNCancelar.setText("Cancelar");
        BTNCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCancelarActionPerformed(evt);
            }
        });

        lblHora.setText("Hora:");

        TFMinutos.setText("MM");
        TFMinutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFMinutosMouseClicked(evt);
            }
        });
        TFMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFMinutosActionPerformed(evt);
            }
        });
        TFMinutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFMinutosKeyTyped(evt);
            }
        });

        TFHora.setText("HH");
        TFHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFHoraMouseClicked(evt);
            }
        });
        TFHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFHoraActionPerformed(evt);
            }
        });
        TFHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFHoraKeyTyped(evt);
            }
        });

        jLabel5.setText("hrs");

        jLabel6.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTNRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                                .addComponent(BTNCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHora)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TFHora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(TFDia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TFMes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TFMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBMedicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHora)
                    .addComponent(TFMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNRegistrar)
                    .addComponent(BTNCancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelarActionPerformed
        GUIEnfermera enfe = new GUIEnfermera(enf, p);
        this.dispose();
    }//GEN-LAST:event_BTNCancelarActionPerformed

    private void BTNRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistrarActionPerformed
        // TODO add your handling code here:
       if(revisarCampos()){
            Calendar fecha = Calendar.getInstance();  
            try{
                fecha.set(Integer.parseInt(TFAnio.getText()), Integer.parseInt(TFMes.getText())-1, Integer.parseInt(TFDia.getText()), 
                        Integer.parseInt(TFHora.getText()), Integer.parseInt(TFMinutos.getText()));
                Calendar hoy = Calendar.getInstance();
                if(hoy.after(fecha)) throw new Exception("fecha no valida");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Ingrese una fecha válida");
                TFDia.setText("");
                TFMes.setText("");
                TFAnio.setText("");
                return;
            }
            
            for(Medico m : Factory.getMedicos()){
                if(m.getNombreCompleto().equals(CBMedicos.getSelectedItem().toString())){
                    Cita cita=null;
                    try{
                        cita= enf.crearCita(p, m, fecha);
                    }catch(Exception e){}
                    if(cita != null){
                        JOptionPane.showMessageDialog(null,cita.toString(),"Cita creada con exito",JOptionPane.INFORMATION_MESSAGE);
                        GUIEnfermera enfe = new GUIEnfermera(enf, p);
                        this.dispose();
                    }
                }
            }
       }else{
           JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos");
       }
    }//GEN-LAST:event_BTNRegistrarActionPerformed

    private void TFDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFDiaMouseClicked
       if(TFDia.getText().equals("DIA")){
            TFDia.setText("");
        }
    }//GEN-LAST:event_TFDiaMouseClicked

    private void TFMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFMesActionPerformed
       
    }//GEN-LAST:event_TFMesActionPerformed

    private void TFMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFMesMouseClicked
        if(TFMes.getText().equals("MES")){
            TFMes.setText("");
        }
    }//GEN-LAST:event_TFMesMouseClicked

    private void TFAnioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFAnioMouseClicked
         if(TFAnio.getText().equals("AÑO")){
            TFAnio.setText("");
        }
    }//GEN-LAST:event_TFAnioMouseClicked

    private void TFDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDiaKeyTyped
        if(TFDia.getText().contains("DIA")){
            TFDia.setText(TFDia.getText().replaceAll("DIA", ""));
        }
    }//GEN-LAST:event_TFDiaKeyTyped

    private void TFMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFMesKeyTyped
        if(TFMes.getText().contains("MES")){
            TFMes.setText(TFMes.getText().replaceAll("MES", ""));
        }
    }//GEN-LAST:event_TFMesKeyTyped

    private void TFAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFAnioKeyTyped
        if(TFAnio.getText().contains("AÑO")){
            TFAnio.setText(TFAnio.getText().replaceAll("AÑO", ""));
        }
    }//GEN-LAST:event_TFAnioKeyTyped

    private void TFMinutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFMinutosMouseClicked
        if(TFMinutos.getText().equals("MM")){
            TFMinutos.setText("");
        } 
    }//GEN-LAST:event_TFMinutosMouseClicked

    private void TFMinutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFMinutosKeyTyped
        if(TFMinutos.getText().equals("MM")){
             TFMinutos.setText(TFMinutos.getText().replaceAll("MM", ""));
        }
    }//GEN-LAST:event_TFMinutosKeyTyped

    private void TFHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFHoraMouseClicked
        if(TFMinutos.getText().equals("HH")){
            TFMinutos.setText("");
        }
    }//GEN-LAST:event_TFHoraMouseClicked

    private void TFHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFHoraKeyTyped
        if(TFHora.getText().contains("HH")){
            TFHora.setText(TFHora.getText().replaceAll("HH", ""));
        }
    }//GEN-LAST:event_TFHoraKeyTyped

    private void TFHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFHoraActionPerformed

    private void TFMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFMinutosActionPerformed

    private void TFDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFDiaActionPerformed
    private boolean revisarCampos(){
        if(TFDia.getText().equals("")|TFDia.getText().equals("DIA")){
            return false;
        }
        if(TFMes.getText().equals("")||TFMes.getText().equals("MES")){
            return false;
        }
        return !(TFAnio.getText().equals("")||TFAnio.getText().equals("AÑO"));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCancelar;
    private javax.swing.JButton BTNRegistrar;
    private javax.swing.JComboBox<String> CBMedicos;
    private javax.swing.JTextField TFAnio;
    private javax.swing.JTextField TFDia;
    private javax.swing.JTextField TFHora;
    private javax.swing.JTextField TFMes;
    private javax.swing.JTextField TFMinutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblHora;
    // End of variables declaration//GEN-END:variables
}
