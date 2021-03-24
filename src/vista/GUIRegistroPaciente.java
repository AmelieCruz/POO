package vista;

import controlador.Factory;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Enfermera;
import modelo.Paciente;


public class GUIRegistroPaciente extends javax.swing.JFrame {
    Enfermera enf;
    Paciente pac;
    
    public GUIRegistroPaciente(Enfermera enf) {
        this.enf = enf;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/images/iconRegistroPaciente.jpg")).getImage());
        this.getContentPane().setBackground(new Color(0xCEF6EC));
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        TFApellidoP = new javax.swing.JTextField();
        TFApellidoM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFCurp = new javax.swing.JTextField();
        BTNRegistrar = new javax.swing.JButton();
        BTNCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TFDia = new javax.swing.JTextField();
        TFMes = new javax.swing.JTextField();
        TFAnio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TADomicilio = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        TFTelefono = new javax.swing.JTextField();
        BNTAgregarHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro de Paciente");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido Materno:");

        jLabel5.setText("Apellido Paterno:");

        jLabel7.setText("CURP:");

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

        jLabel2.setText("Fecha de Nacimiento:");

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

        jLabel8.setText("Domicilio:");

        TADomicilio.setColumns(20);
        TADomicilio.setRows(5);
        jScrollPane1.setViewportView(TADomicilio);

        jLabel9.setText("Telefono(s):");

        BNTAgregarHistorial.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BNTAgregarHistorial.setText("Registrar y agregar Historial");
        BNTAgregarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTAgregarHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFNombre)
                            .addComponent(TFApellidoP)
                            .addComponent(TFApellidoM)
                            .addComponent(TFCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TFDia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNCancelar)
                            .addComponent(TFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(BNTAgregarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(BTNRegistrar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TFApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TFDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNRegistrar)
                    .addComponent(BTNCancelar)
                    .addComponent(BNTAgregarHistorial))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelarActionPerformed
        GUIEnfermera enfermera = new GUIEnfermera(enf);
        this.dispose();
    }//GEN-LAST:event_BTNCancelarActionPerformed

    private void BTNRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistrarActionPerformed
        if(agregarDatos()){
            JOptionPane.showMessageDialog(null, "Paciente registrado con éxito", pac.toString(), JOptionPane.INFORMATION_MESSAGE);
            GUIEnfermera enfermera = new GUIEnfermera(enf, pac);
            this.dispose();
        }
    }//GEN-LAST:event_BTNRegistrarActionPerformed

    private void TFDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFDiaActionPerformed

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

    private void TFDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFDiaMouseClicked
        if(TFDia.getText().contains("DIA")){
            TFDia.setText(TFDia.getText().replaceAll("DIA", ""));
        }
    }//GEN-LAST:event_TFDiaMouseClicked

    private void TFMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFMesMouseClicked
        if(TFMes.getText().contains("MES")){
            TFMes.setText(TFMes.getText().replaceAll("MES", ""));
        }
    }//GEN-LAST:event_TFMesMouseClicked

    private void TFAnioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFAnioMouseClicked
        if(TFAnio.getText().contains("AÑO")){
            TFAnio.setText(TFAnio.getText().replaceAll("AÑO", ""));
        }
    }//GEN-LAST:event_TFAnioMouseClicked

    private void BNTAgregarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTAgregarHistorialActionPerformed
        if(agregarDatos()){
            GUIHistorialClinico historial = new GUIHistorialClinico(pac, enf);
            this.dispose();
        }
    }//GEN-LAST:event_BNTAgregarHistorialActionPerformed
    private boolean agregarDatos(){
        String Nombre,ApellidoP,ApellidoM,ClaveSeguro,Curp,Domicilio;
        String[] Telefono = new String[]{TFTelefono.getText()};
        Calendar fechaNacimiento = Calendar.getInstance();
        
        Nombre = TFNombre.getText();
        ApellidoP = TFApellidoP.getText();
        ApellidoM = TFApellidoM.getText();
        Curp = TFCurp.getText();
        Domicilio = TADomicilio.getText();
        try{
        fechaNacimiento.set(Integer.parseInt(TFAnio.getText()), Integer.parseInt(TFMes.getText())-1, Integer.parseInt(TFDia.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fecha no válida", "Error en el registro", JOptionPane.WARNING_MESSAGE);
        }
                
        for(Paciente paux : Factory.getPacientes()){
            if(paux.getCURP().equals(Curp)){
                JOptionPane.showMessageDialog(null, "Paciente ya registrado", "Error en el registro", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        
        pac = new Paciente(Curp,Nombre,ApellidoP,ApellidoM,fechaNacimiento,Domicilio,Telefono);
        enf.registrarPaciente(pac);
        return true;
    }
     private boolean revisarCampos(){
        if(TFDia.getText().equals("")|TFDia.getText().equals("DIA")){
            return false;
        }
        if(TFMes.getText().equals("")||TFMes.getText().equals("MES")){
            return false;
        }
        if(TADomicilio.getText().equals("")){
            return false;
        }
        if(TFApellidoP.getText().equals("")){
            return false;
        }
        if(TFApellidoP.getText().equals("")){
            return false;
        }
        return !(TFAnio.getText().equals("")||TFAnio.getText().equals("AÑO"));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNTAgregarHistorial;
    private javax.swing.JButton BTNCancelar;
    private javax.swing.JButton BTNRegistrar;
    private javax.swing.JTextArea TADomicilio;
    private javax.swing.JTextField TFAnio;
    private javax.swing.JTextField TFApellidoM;
    private javax.swing.JTextField TFApellidoP;
    private javax.swing.JTextField TFCurp;
    private javax.swing.JTextField TFDia;
    private javax.swing.JTextField TFMes;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
