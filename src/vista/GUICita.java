package vista;

import controlador.Factory;
import java.awt.Color;
import java.awt.Image;
import java.util.Calendar;
import javax.swing.ImageIcon;
import modelo.*;


public class GUICita extends javax.swing.JFrame {
    Paciente p;
    Enfermera enf;

    public GUICita(Paciente p, Enfermera enf) {
        this.p = p;
        this.enf = enf;
        initComponents();
        citasCombo();
        LBNombre.setText(p.getNombreCompleto());
        LBnumero.setText(p.getClaveSeguro());
        Image image =new ImageIcon(getClass().getResource("/images/iconCitaMedica.jpg")).getImage();
        this.setIconImage(image);
        PanelDoctor.setVisible(false);
        this.getContentPane().setBackground(new Color(0xF8E0F7));
        PanelDoctor.setBackground(new Color(0xF8E0F7));
        this.setVisible(true);
    }
    public void citasCombo(){
        Calendar hoy = Calendar.getInstance();
        if(p.getCitas()!=null)
            for(Cita c : p.getCitas()){
                if(hoy.before(c.getFecha())){
                    CBcitas.addItem(Factory.FORMATO_FECHA.format(c.getFecha().getTime())+" a las: "+
                                    Factory.FORMATO_HORA.format(c.getFecha().getTime()));
                }
            }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LBnumero = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CBcitas = new javax.swing.JComboBox<>();
        BNTAgendarCita = new javax.swing.JButton();
        BNTRegresar = new javax.swing.JButton();
        PanelDoctor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LBMedico = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LBEspecialidad = new javax.swing.JLabel();
        BTNVerInfo = new javax.swing.JButton();
        LBNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Nombre.setText("Nombre del Paciente:");

        jLabel3.setText("Numero de Seguro:");

        jLabel5.setText("Citas programadas:");

        BNTAgendarCita.setText("Agendar Cita");
        BNTAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTAgendarCitaActionPerformed(evt);
            }
        });

        BNTRegresar.setText("Regresar");
        BNTRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTRegresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Doctor:");

        jLabel2.setText("Especialidad:");

        javax.swing.GroupLayout PanelDoctorLayout = new javax.swing.GroupLayout(PanelDoctor);
        PanelDoctor.setLayout(PanelDoctorLayout);
        PanelDoctorLayout.setHorizontalGroup(
            PanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDoctorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(PanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBMedico)
                    .addComponent(LBEspecialidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDoctorLayout.setVerticalGroup(
            PanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDoctorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LBMedico))
                .addGap(18, 18, 18)
                .addGroup(PanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LBEspecialidad))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        BTNVerInfo.setText("Ver Informacion");
        BTNVerInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVerInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(Nombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBnumero)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBcitas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(BTNVerInfo))
                            .addComponent(LBNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PanelDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BNTAgendarCita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BNTRegresar)))
                        .addGap(75, 75, 75)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(LBNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LBnumero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBcitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNVerInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNTAgendarCita)
                    .addComponent(BNTRegresar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNVerInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVerInfoActionPerformed
        // TODO add your handling code here:
        if(p.getCitas()!=null)
            for(Cita c : p.getCitas()){
                String fechaHora = Factory.FORMATO_FECHA.format(c.getFecha().getTime())+ " a las: "+ Factory.FORMATO_HORA.format(c.getFecha().getTime());
                if(fechaHora.equals(CBcitas.getSelectedItem().toString())){
                    PanelDoctor.setVisible(true);
                    LBMedico.setText(c.getMedico().getNombreCompleto());
                    LBEspecialidad.setText(c.getMedico().getEspecialidad());
                }
            }
    }//GEN-LAST:event_BTNVerInfoActionPerformed

    private void BNTRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTRegresarActionPerformed
        GUIEnfermera enfe = new GUIEnfermera(enf, p);
        this.setVisible(false);
    }//GEN-LAST:event_BNTRegresarActionPerformed

    private void BNTAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTAgendarCitaActionPerformed
       GUINuevaCita nvaCita = new GUINuevaCita(enf, p);
       this.dispose();
    }//GEN-LAST:event_BNTAgendarCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNTAgendarCita;
    private javax.swing.JButton BNTRegresar;
    private javax.swing.JButton BTNVerInfo;
    private javax.swing.JComboBox<String> CBcitas;
    private javax.swing.JLabel LBEspecialidad;
    private javax.swing.JLabel LBMedico;
    private javax.swing.JLabel LBNombre;
    private javax.swing.JLabel LBnumero;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel PanelDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
