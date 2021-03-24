package vista;

import modelo.*;
import controlador.Factory;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUIEnfermera extends javax.swing.JFrame {
    Enfermera enfermera;
    Paciente paux;

    public GUIEnfermera(Enfermera enfermera) {
        initComponents();
        this.enfermera = enfermera;
        PanelPaciente.setVisible(false);
        LBNombreEnfer.setText(enfermera.getNombreCompleto());
        this.setIconImage(new ImageIcon(getClass().getResource("/images/iconEnfermera.jpg")).getImage());
        this.getContentPane().setBackground(new Color(0xE0E6F8));
        this.setLocationRelativeTo(null);
        PanelPaciente.setBackground(new Color(0xE0E6F8));
        this.setVisible(true);
    }
    public GUIEnfermera(Enfermera enfermera, Paciente pac) {
        this(enfermera);
        paux = pac;
        TFNumSeguro.setText(pac.getClaveSeguro());
        mostrarInfoPaciente(pac);
        PanelPaciente.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LBNombreEnfer = new javax.swing.JLabel();
        BTNRegistrarPaciente = new javax.swing.JButton();
        PanelPaciente = new javax.swing.JPanel();
        BTNAgendarCita = new javax.swing.JButton();
        BTNVerHistorial = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        LBNombre = new javax.swing.JLabel();
        BTNVerCitas = new javax.swing.JButton();
        CURP = new javax.swing.JLabel();
        LBCurp = new javax.swing.JLabel();
        Domicilio = new javax.swing.JLabel();
        LBDomicilio = new javax.swing.JLabel();
        FechaNac = new javax.swing.JLabel();
        LBFechaNac = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        LBTelefono = new javax.swing.JLabel();
        TFNumSeguro = new javax.swing.JTextField();
        BTNBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BTNCerrarCesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("B I E N V E N I D X");

        LBNombreEnfer.setText("usuario");

        BTNRegistrarPaciente.setText("Registrar Paciente");
        BTNRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistrarPacienteActionPerformed(evt);
            }
        });

        BTNAgendarCita.setText("Agendar Cita");
        BTNAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgendarCitaActionPerformed(evt);
            }
        });

        BTNVerHistorial.setText("Ver historial");
        BTNVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVerHistorialActionPerformed(evt);
            }
        });

        Nombre.setText("Nombre:");

        LBNombre.setText("jLabel7");

        BTNVerCitas.setText("Ver Citas");
        BTNVerCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVerCitasActionPerformed(evt);
            }
        });

        CURP.setText("CURP:");

        LBCurp.setText("jLabel8");

        Domicilio.setText("Domicilio:");

        LBDomicilio.setText("jLabel8");

        FechaNac.setText("Fecha De Nacimiento:");

        LBFechaNac.setText("jLabel9");

        Telefono.setText("Telefono:");

        LBTelefono.setText("jLabel10");

        javax.swing.GroupLayout PanelPacienteLayout = new javax.swing.GroupLayout(PanelPaciente);
        PanelPaciente.setLayout(PanelPacienteLayout);
        PanelPacienteLayout.setHorizontalGroup(
            PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPacienteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BTNVerHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNAgendarCita)
                .addGap(34, 34, 34))
            .addGroup(PanelPacienteLayout.createSequentialGroup()
                .addGroup(PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPacienteLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CURP)
                            .addComponent(Nombre)
                            .addComponent(Domicilio)
                            .addComponent(FechaNac)
                            .addComponent(Telefono))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBNombre)
                            .addComponent(LBCurp)
                            .addComponent(LBDomicilio)
                            .addComponent(LBFechaNac)
                            .addComponent(LBTelefono)))
                    .addGroup(PanelPacienteLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(BTNVerCitas)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        PanelPacienteLayout.setVerticalGroup(
            PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPacienteLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(LBNombre))
                .addGap(18, 18, 18)
                .addGroup(PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CURP)
                    .addComponent(LBCurp))
                .addGap(18, 18, 18)
                .addGroup(PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Domicilio)
                    .addComponent(LBDomicilio))
                .addGap(18, 18, 18)
                .addGroup(PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaNac)
                    .addComponent(LBFechaNac))
                .addGap(18, 18, 18)
                .addGroup(PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono)
                    .addComponent(LBTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(PanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNAgendarCita)
                    .addComponent(BTNVerHistorial)
                    .addComponent(BTNVerCitas))
                .addGap(20, 20, 20))
        );

        TFNumSeguro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFNumSeguroMouseClicked(evt);
            }
        });
        TFNumSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNumSeguroActionPerformed(evt);
            }
        });
        TFNumSeguro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFNumSeguroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFNumSeguroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNumSeguroKeyTyped(evt);
            }
        });

        BTNBuscar.setText("Buscar");
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero de Seguro:");

        BTNCerrarCesion.setText("Cerrar sesión");
        BTNCerrarCesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCerrarCesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(LBNombreEnfer)
                            .addComponent(BTNRegistrarPaciente)
                            .addComponent(jLabel1)
                            .addComponent(TFNumSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNBuscar)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTNCerrarCesion)))
                .addGap(64, 64, 64)
                .addComponent(PanelPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(LBNombreEnfer)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TFNumSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNBuscar)
                        .addGap(33, 33, 33)
                        .addComponent(BTNRegistrarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNCerrarCesion))
                    .addComponent(PanelPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistrarPacienteActionPerformed
        // TODO add your handling code here:
        GUIRegistroPaciente reg = new GUIRegistroPaciente(enfermera);
        this.dispose();
    }//GEN-LAST:event_BTNRegistrarPacienteActionPerformed

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        if(TFNumSeguro.getText().length()==8){
            this.mostrarInfoPaciente();
        }else{
            JOptionPane.showMessageDialog(null,"Error: Paciente no encontrado");
            TFNumSeguro.setText("");
        }
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void BTNVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVerHistorialActionPerformed
        GUIHistorialClinico historial = new GUIHistorialClinico(paux, enfermera);
        this.dispose();
    }//GEN-LAST:event_BTNVerHistorialActionPerformed

    private void BTNAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgendarCitaActionPerformed
        GUINuevaCita agendar = new GUINuevaCita(enfermera,paux);
        this.dispose();
    }//GEN-LAST:event_BTNAgendarCitaActionPerformed

    private void BTNVerCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVerCitasActionPerformed
        // TODO add your handling code here:
            try{
                GUICita agenda = new GUICita(paux,enfermera);
                this.dispose();
            }catch(Exception e){
                System.out.println(e.getLocalizedMessage());
            }
    }//GEN-LAST:event_BTNVerCitasActionPerformed

    private void TFNumSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNumSeguroActionPerformed
         if(TFNumSeguro.getText().length()==8){
            this.mostrarInfoPaciente();
        }else{
            JOptionPane.showMessageDialog(null,"Error: las claves constan de 8 numeros");
            TFNumSeguro.setText("");
        }
    }//GEN-LAST:event_TFNumSeguroActionPerformed

    private void TFNumSeguroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNumSeguroKeyTyped
        TFNumSeguro.setEditable(true);
        if(TFNumSeguro.getText().length()==1&& TFNumSeguro.getText().toLowerCase().charAt(0)>96
                &&TFNumSeguro.getText().toLowerCase().charAt(0)<123){
            TFNumSeguro.setText("");
        }
        if(TFNumSeguro.getText().length()==8 && evt.getKeyCode()!= KeyEvent.VK_ENTER){
            this.mostrarInfoPaciente();
        }
    }//GEN-LAST:event_TFNumSeguroKeyTyped

    private void TFNumSeguroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNumSeguroKeyPressed
        if(evt.getKeyCode()== 8){
            if(!TFNumSeguro.isEditable())
                TFNumSeguro.setEditable(true);
            PanelPaciente.setVisible(false);
        }else if((evt.getKeyCode()>47 &&evt.getKeyCode()<58) || evt.getKeyCode()>95 && evt.getKeyCode()<106){
        }else if(evt.getKeyCode()!= KeyEvent.VK_ENTER&&evt.getKeyCode()!= KeyEvent.VK_UP
                && evt.getKeyCode()!= KeyEvent.VK_DOWN&&evt.getKeyCode()!= KeyEvent.VK_LEFT&&
                evt.getKeyCode()!= KeyEvent.VK_RIGHT&&evt.getKeyCode()!= KeyEvent.VK_ESCAPE){
                TFNumSeguro.setText("");
            }
    }//GEN-LAST:event_TFNumSeguroKeyPressed

    private void TFNumSeguroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFNumSeguroMouseClicked
        TFNumSeguro.setEditable(true);
    }//GEN-LAST:event_TFNumSeguroMouseClicked

    private void TFNumSeguroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNumSeguroKeyReleased
        if(TFNumSeguro.getText().length()==1&& TFNumSeguro.getText().toLowerCase().charAt(0)>96
                &&TFNumSeguro.getText().toLowerCase().charAt(0)<123){
            TFNumSeguro.setText("");
        }
    }//GEN-LAST:event_TFNumSeguroKeyReleased

    private void BTNCerrarCesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCerrarCesionActionPerformed
        GUILogin login = new GUILogin();
        this.dispose();
    }//GEN-LAST:event_BTNCerrarCesionActionPerformed
    private void mostrarInfoPaciente(Paciente pac){
        LBNombre.setText(pac.getNombreCompleto().toUpperCase());
        LBFechaNac.setText(Factory.FORMATO_FECHA.format(pac.getFechaNacimiento().getTime()));
        LBCurp.setText(pac.getCURP().toUpperCase());
        LBDomicilio.setText(pac.getDomicilio().toUpperCase());
        String telefonos="";
        for(String tel: pac.getTelefono()){
            telefonos+= tel+"\n";
        }
        LBTelefono.setText(telefonos);
        PanelPaciente.setVisible(true);
        paux = pac;
        if(!paux.getCitas().isEmpty()){
            boolean citasPendientes = false;
            Calendar hoy = Calendar.getInstance();
            for(Cita c : paux.getCitas()){
                if(hoy.before(c.getFecha())){
                    citasPendientes = true;
                    break;
                }
            }
            if(!citasPendientes)BTNVerCitas.setVisible(false);
        }
        if(paux.getHistorial()==null) BTNVerHistorial.setText("Registrar historial");
    }
    private void mostrarInfoPaciente(){
        TFNumSeguro.setEditable(false);
            boolean encontrado=false;
            for(Paciente pac: Factory.getPacientes()){
                if(pac.getClaveSeguro().equals(TFNumSeguro.getText())){
                        encontrado = true;
                        mostrarInfoPaciente(pac);
                    break;
                }
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null,"Paciente no encontrado, favor de registrarlo", "Error en busqueda", JOptionPane.WARNING_MESSAGE);
                TFNumSeguro.setText("");
            }
    }

    public JTextField getTFNumSeguro() {
        return TFNumSeguro;
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgendarCita;
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNCerrarCesion;
    private javax.swing.JButton BTNRegistrarPaciente;
    private javax.swing.JButton BTNVerCitas;
    private javax.swing.JButton BTNVerHistorial;
    private javax.swing.JLabel CURP;
    private javax.swing.JLabel Domicilio;
    private javax.swing.JLabel FechaNac;
    private javax.swing.JLabel LBCurp;
    private javax.swing.JLabel LBDomicilio;
    private javax.swing.JLabel LBFechaNac;
    private javax.swing.JLabel LBNombre;
    private javax.swing.JLabel LBNombreEnfer;
    private javax.swing.JLabel LBTelefono;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel PanelPaciente;
    private javax.swing.JTextField TFNumSeguro;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
