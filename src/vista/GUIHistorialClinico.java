/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import controlador.Factory;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author andre
 */
public class GUIHistorialClinico extends javax.swing.JFrame {
    
    private HistorialClinico historial;
    private Paciente paciente;
    private Enfermera enfermera;
    /** Creates new form GUIHistorialClinico
     * @param paciente 
     *
     */
    public GUIHistorialClinico(Paciente paciente) {
        initComponents();
        txtDia.setVisible(false);
        txtAnio.setVisible(false);
        this.paciente = paciente;
        this.setIconImage(new ImageIcon(getClass().getResource("/images/iconHistorialMedico.png")).getImage());
        historial = paciente.getHistorial();
        this.setTitle(paciente.getNombreCompleto());
        Calendar fecha = Calendar.getInstance();
        cBoxTipoSangre.setVisible(false);
        txtEdad.setText(String.valueOf(fecha.get(Calendar.YEAR) - paciente.getFechaNacimiento().get(Calendar.YEAR)));
        txtEdad.setEditable(false);
        txtEstatura.setText(String.valueOf(historial.getEstatura()));
        txtEstatura.setEditable(false);
        txtPeso.setText(String.valueOf(historial.getPeso()));
        txtPeso.setEditable(false);
        txtSexo.setText(String.valueOf(historial.getSexo()));
        txtSexo.setEditable(false);
        txtTipoSangre.setText(historial.getTipoSangre());
        txtTipoSangre.setEditable(false);
        String cadena="";
        for(String pad:historial.getPadecimientos()){
            cadena+= pad+"\n";
        }
        txtAreaPadecimientos.setText(cadena);
        txtAreaPadecimientos.setEditable(false);
        cadena="";
        for(String pad:historial.getAlergias()){
            cadena+= pad+"\n";
        }
        txtAreaAlergias.setText(cadena);
        txtAreaAlergias.setEditable(false);
        cadena="";
        for(String pad:historial.getEnfermHereditarias()){
            cadena+= pad+"\n";
        }
        txtAreaEnfermHered.setText(cadena);
        txtAreaEnfermHered.setEditable(false);
        this.setLocationRelativeTo(null);
        btnAgregarHistorial.setVisible(false);
        BTNCancelar.setVisible(false);
        this.setSize(new Dimension(423, 470));
        this.getContentPane().setBackground(new Color(0xF7F8E0));  
        this.setVisible(true);
    }
    /**
     * Constructor que se manda a llamar si se desea Actualizar o Agregar un nuevo historial
     * al paciente, en este se desabilita el TXT que muestra el tipo de sangre y en su
     * lugar se muestra 
     * @param paciente
     * @param enfermera
     */

    public GUIHistorialClinico(Paciente paciente, Enfermera enfermera) {
        initComponents();
        this.paciente = paciente;
        this.enfermera = enfermera;
        txtDia.setVisible(true);
        txtAnio.setVisible(true);
        lblEdad.setText("Fecha de Nacimiento");
        this.getContentPane().setBackground(new Color(0xF7F8E0));  
        this.setIconImage(new ImageIcon(getClass().getResource("/images/iconHistorialMedico.png")).getImage());
        historial = paciente.getHistorial();
        txtTipoSangre.setVisible(false);
        this.setTitle(paciente.getNombreCompleto());
        txtEdad.setText(String.valueOf(paciente.getFechaNacimiento().get(Calendar.MONTH)+1));
        txtDia.setText(String.valueOf(paciente.getFechaNacimiento().get(Calendar.DAY_OF_MONTH)));
        txtAnio.setText(String.valueOf(paciente.getFechaNacimiento().get(Calendar.YEAR)));
        if(historial!= null){
            Calendar fecha = Calendar.getInstance();
            txtEdad.setEditable(false);
            txtEstatura.setText(String.valueOf(historial.getEstatura()));
            txtPeso.setText(String.valueOf(historial.getPeso()));
            txtSexo.setText(String.valueOf(historial.getSexo()));
            cBoxTipoSangre.setSelectedItem(historial.getTipoSangre());
            String cadena="";
            for(String pad:historial.getPadecimientos()){
                cadena+= pad+"\n";
            }
            txtAreaPadecimientos.setText(cadena);
            cadena="";
            for(String pad:historial.getAlergias()){
                cadena+= pad+"\n";
            }
            txtAreaAlergias.setText(cadena);
            cadena="";
            for(String pad:historial.getEnfermHereditarias()){
                cadena+= pad+"\n";
            }
            txtAreaEnfermHered.setText(cadena);
            btnAgregarHistorial.setText("Actualizar Historial");
        }else{
            btnAgregarHistorial.setText("Registrar Historial");
        }
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEdad = new javax.swing.JLabel();
        BTNCancelar = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        lblTipoSangre = new javax.swing.JLabel();
        txtTipoSangre = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblEstatura = new javax.swing.JLabel();
        txtEstatura = new javax.swing.JTextField();
        lblPadecimientos = new javax.swing.JLabel();
        scrollPadecimientos = new javax.swing.JScrollPane();
        txtAreaPadecimientos = new javax.swing.JTextArea();
        lblAlergias = new javax.swing.JLabel();
        scrollAlergias = new javax.swing.JScrollPane();
        txtAreaAlergias = new javax.swing.JTextArea();
        lblEnfermHered = new javax.swing.JLabel();
        scrollEnfermHered = new javax.swing.JScrollPane();
        txtAreaEnfermHered = new javax.swing.JTextArea();
        btnAgregarHistorial = new javax.swing.JButton();
        lblKgs = new javax.swing.JLabel();
        lblMts = new javax.swing.JLabel();
        cBoxTipoSangre = new javax.swing.JComboBox<>();
        txtDia = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblEdad.setText("Edad:");

        BTNCancelar.setText("Cancelar");
        BTNCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCancelarActionPerformed(evt);
            }
        });

        txtEdad.setEditable(false);
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        lblSexo.setText("Sexo:");

        txtSexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoActionPerformed(evt);
            }
        });

        lblTipoSangre.setText("Tipo de sangre:");

        txtTipoSangre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoSangreActionPerformed(evt);
            }
        });

        lblPeso.setText("Peso:");

        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        lblEstatura.setText("Estatura:");

        txtEstatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstaturaActionPerformed(evt);
            }
        });

        lblPadecimientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPadecimientos.setText("Padecimientos");

        txtAreaPadecimientos.setColumns(20);
        txtAreaPadecimientos.setRows(5);
        scrollPadecimientos.setViewportView(txtAreaPadecimientos);

        lblAlergias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlergias.setText("Alergias:");

        txtAreaAlergias.setColumns(20);
        txtAreaAlergias.setRows(5);
        scrollAlergias.setViewportView(txtAreaAlergias);

        lblEnfermHered.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnfermHered.setText("Enfermedades Hereditarias");

        txtAreaEnfermHered.setColumns(20);
        txtAreaEnfermHered.setRows(5);
        scrollEnfermHered.setViewportView(txtAreaEnfermHered);

        btnAgregarHistorial.setText("Agregar Historial");
        btnAgregarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHistorialActionPerformed(evt);
            }
        });

        lblKgs.setText("Kilogramos");

        lblMts.setText("Metros");

        cBoxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));

        txtDia.setEditable(false);
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        txtAnio.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(txtTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(lblPadecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrollPadecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAlergias)
                                    .addComponent(scrollAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnfermHered)
                                    .addComponent(scrollEnfermHered, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregarHistorial)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BTNCancelar))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEdad)
                                .addGap(96, 96, 96)
                                .addComponent(txtDia)
                                .addGap(14, 14, 14)
                                .addComponent(txtEdad)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnio)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSexo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblPeso)
                                                .addGap(97, 97, 97)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtEstatura, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                                    .addComponent(txtPeso)))
                                            .addComponent(lblEstatura))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblKgs)
                                            .addComponent(lblMts)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTipoSangre)
                                        .addGap(49, 49, 49)
                                        .addComponent(cBoxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoSangre)
                    .addComponent(txtTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKgs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstatura)
                        .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMts, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPadecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPadecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblEnfermHered, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollEnfermHered, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoActionPerformed

    private void txtTipoSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoSangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoSangreActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtEstaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstaturaActionPerformed

    private void btnAgregarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHistorialActionPerformed
        if(txtEstatura.getText().equals("")||txtSexo.getText().equals("") || txtPeso.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos");
            return;
        }
        historial = new HistorialClinico();
        try{
            historial.setEstatura(Double.parseDouble(txtEstatura.getText()));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingrese una estatura válida");
            txtEstatura.setText("");
        }
        try{
            historial.setPeso(Double.parseDouble(txtPeso.getText()));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingrese un peso válido");
            txtPeso.setText("");
        }
        historial.setTipoSangre(String.valueOf(cBoxTipoSangre.getSelectedItem()));
        String sexo = txtSexo.getText();
        sexo = sexo.toLowerCase();
        if(sexo.equals("hombre")||sexo.equals("masculino")){
            historial.setSexo('m');
        }else if(sexo.equals("mujer")||sexo.equals("femenino")){
            historial.setSexo('f');
        }else{
            historial.setSexo(sexo.charAt(0));
        }
        if(txtAreaPadecimientos.getText().length()>0){
            ArrayList<String> padecimientos = new ArrayList<>();
            String pad =txtAreaPadecimientos.getText();
            String temp="";
            for(int i= 0;i<pad.length();i++){
                if(pad.charAt(i)== ' '||pad.charAt(i)=='\n'){
                    padecimientos.add(temp);
                    temp = "";
                }else{
                    temp+=pad.charAt(i);
                }
            }
            historial.setPadecimientos(padecimientos);
        }
        if(txtAreaAlergias.getText().length()>0){
            ArrayList<String> alergias = new ArrayList<>();
            String pad =txtAreaAlergias.getText();
            String temp="";
            for(int i= 0;i<pad.length();i++){
                if(pad.charAt(i)== ' '||pad.charAt(i)=='\n'){
                    alergias.add(temp);
                    temp = "";
                }else{
                    temp+=pad.charAt(i);
                }
            }
            historial.setAlergias(alergias);
        }
        if(txtAreaEnfermHered.getText().length()>0){
            ArrayList<String> enfermHered = new ArrayList<>();
            String pad =txtAreaEnfermHered.getText();
            String temp="";
            for(int i= 0;i<pad.length();i++){
                if(pad.charAt(i)== ' '||pad.charAt(i)=='\n'){
                    enfermHered.add(temp);
                    temp = "";
                }else{
                    temp+=pad.charAt(i);
                }
            }
            historial.setEnfermHereditarias(enfermHered);
        }
        paciente.setHistorial(historial);
        Factory.actualizarInfo(paciente);
        GUIEnfermera enf = new GUIEnfermera(enfermera, paciente);
        JOptionPane.showMessageDialog(null, "Historial registrado con éxito", paciente.toStringComplete(), JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_btnAgregarHistorialActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void BTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelarActionPerformed
        GUIEnfermera enf = new GUIEnfermera(enfermera, paciente);
        this.dispose();
    }//GEN-LAST:event_BTNCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCancelar;
    private javax.swing.JButton btnAgregarHistorial;
    private javax.swing.JComboBox<String> cBoxTipoSangre;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEnfermHered;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblKgs;
    private javax.swing.JLabel lblMts;
    private javax.swing.JLabel lblPadecimientos;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JScrollPane scrollAlergias;
    private javax.swing.JScrollPane scrollEnfermHered;
    private javax.swing.JScrollPane scrollPadecimientos;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextArea txtAreaAlergias;
    private javax.swing.JTextArea txtAreaEnfermHered;
    private javax.swing.JTextArea txtAreaPadecimientos;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTipoSangre;
    // End of variables declaration//GEN-END:variables

}
