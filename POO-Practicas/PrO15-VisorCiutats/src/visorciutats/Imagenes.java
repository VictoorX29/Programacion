/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visorciutats;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Imagenes extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Imagenes.class.getName());

    public Imagenes() {
        initComponents();
        this.setTitle("¡Visor Equipos! :-)");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.toggleSelectTeam(false);
        this.setLblTeamImage("Team Heretics");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkShowImages = new javax.swing.JCheckBox();
        cboSelectTeam = new javax.swing.JComboBox<>();
        lblTeam = new javax.swing.JLabel();
        lblTeamImage = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chkShowImages.setText("Hide");
        chkShowImages.addActionListener(this::chkShowImagesActionPerformed);

        cboSelectTeam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Team Heretics", "Paper Rex", "FNATIC" }));
        cboSelectTeam.addActionListener(this::cboSelectTeamActionPerformed);

        lblTeam.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTeam.setText("VALORANT Teams");

        lblTeamImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeamImageMouseClicked(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(this::btnExitActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkShowImages)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeamImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboSelectTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTeam))
                        .addGap(0, 188, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkShowImages, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addGap(12, 12, 12)
                .addComponent(lblTeam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSelectTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTeamImage, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkShowImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowImagesActionPerformed
        if(!this.chkShowImages.isSelected()){
            this.chkShowImages.setText("Hide");
            this.toggleSelectTeam(false);
        }else{
            this.chkShowImages.setText("Show");
            this.toggleSelectTeam(true);
        }
    }//GEN-LAST:event_chkShowImagesActionPerformed

    private void cboSelectTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelectTeamActionPerformed
        String team = this.cboSelectTeam.getSelectedItem().toString();
        this.setLblTeamImage(team);
    }//GEN-LAST:event_cboSelectTeamActionPerformed

    private void lblTeamImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeamImageMouseClicked
        teamDetail d = new teamDetail(this.cboSelectTeam.getSelectedItem().toString());
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblTeamImageMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    void toggleSelectTeam(Boolean state){
        this.lblTeam.setVisible(state);
        this.lblTeamImage.setVisible(state);
        this.cboSelectTeam.setVisible(state);
    }
    void setLblTeamImage(String team){
        Image imagen = new ImageIcon().getImage();
        switch (team) {
            case "Team Heretics":
                imagen = new ImageIcon(this.getClass().getResource("/imagenes/teamheretics.jpg")).getImage();
                break;
            case "Paper Rex":
                imagen = new ImageIcon(this.getClass().getResource("/imagenes/paperrex.jpg")).getImage();
                break;
            case "FNATIC":
                imagen = new ImageIcon(this.getClass().getResource("/imagenes/fnatic.jpg")).getImage();
                break;
        }
        Image imagenEscalada = imagen.getScaledInstance(this.lblTeamImage.getWidth(), this.lblTeamImage.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        this.lblTeamImage.setIcon(iconoEscalado);
    }
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new Imagenes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cboSelectTeam;
    private javax.swing.JCheckBox chkShowImages;
    private javax.swing.JLabel lblTeam;
    private javax.swing.JLabel lblTeamImage;
    // End of variables declaration//GEN-END:variables
}
