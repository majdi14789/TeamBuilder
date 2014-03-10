

package Gui;

import Entité.Adherent;
import static Gui.MainFrame.contentPanel;
import com.tn.doa.AdherentDAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author majdi
 */
public class ModifierMonProfil extends javax.swing.JFrame {
        Adherent ad=new Adherent(); 
        AdherentDAO adDAO=new AdherentDAO();
        
    public ModifierMonProfil() throws UnsupportedLookAndFeelException, ParseException {
        
        initComponents();
        this.setName("form Modifier information Profil");
        System.out.println(Authentification.id_adherent+" | "+this.getName());
        modifierMotdepasse.disable();
        modifierEmailText.disable();
        modifierNomText.disable();
        modifierTelephoneText.disable();
        ModierPrenomText.disable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelModifierProfil = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modifierNomText = new javax.swing.JTextField();
        ModierPrenomText = new javax.swing.JTextField();
        modifierEmailText = new javax.swing.JTextField();
        modifierTelephoneText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        modifierMotdepasseButton = new javax.swing.JButton();
        verifmotdepasseText = new javax.swing.JTextField();
        modifierMotdepasse = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelModifierProfil.setLayout(new java.awt.CardLayout());

        jButton1.setText("Valider Modification");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mon Nom:");

        jLabel2.setText("Mon Prenom:");

        jLabel3.setText("Adresse Mail:");

        jLabel4.setText("Telephone :");

        modifierNomText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierNomTextActionPerformed(evt);
            }
        });

        jLabel5.setText("Mot de passe :");

        modifierMotdepasseButton.setText("Edit");
        modifierMotdepasseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierMotdepasseButtonActionPerformed(evt);
            }
        });

        verifmotdepasseText.setText("Taper Votre Mot de Passe Ici...");
        verifmotdepasseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifmotdepasseTextActionPerformed(evt);
            }
        });
        verifmotdepasseText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                verifmotdepasseTextKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modifierEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modifierTelephoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modifierMotdepasse)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(modifierNomText, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addComponent(ModierPrenomText)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(verifmotdepasseText, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(modifierMotdepasseButton))))
                        .addGap(123, 123, 123)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelModifierProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(modifierNomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ModierPrenomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifierMotdepasseButton)
                    .addComponent(verifmotdepasseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(modifierMotdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modifierEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(modifierTelephoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifierNomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierNomTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifierNomTextActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ad=adDAO.findAdherentById(Authentification.id_adherent);
        modifierNomText.setText(ad.getNom());
        ModierPrenomText.setText(ad.getPrenom());
        modifierEmailText.setText(ad.getAdresseMail());
        modifierTelephoneText.setText(ad.getTelephone().toString());
        modifierMotdepasse.setText(ad.getMdp());
        
    }//GEN-LAST:event_formWindowOpened

    private void modifierMotdepasseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierMotdepasseButtonActionPerformed
        if(verifmotdepasseText.getText().equals(ad.getMdp()) ){
           modifierMotdepasse.setEnabled(true);
           modifierEmailText.setEnabled(true);
           modifierNomText.setEnabled(true);
           modifierMotdepasse.setEnabled(true);
           modifierTelephoneText.setEnabled(true);
           ModierPrenomText.setEnabled(true);
           
           modifierMotdepasse.setText(ad.getMdp()); 
       }else {
           System.out.println("error mot de pas");
           JOptionPane.showMessageDialog(rootPane, "Mo de passe incorrect");
//new JOptionPane("Mot de passe Invalid", JOptionPane.ERROR_MESSAGE);
       }
        
    }//GEN-LAST:event_modifierMotdepasseButtonActionPerformed

    private void verifmotdepasseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifmotdepasseTextActionPerformed
        verifmotdepasseText.setText("");
    }//GEN-LAST:event_verifmotdepasseTextActionPerformed

    private void verifmotdepasseTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verifmotdepasseTextKeyPressed
      if(verifmotdepasseText.getText().equals("Taper Votre Mot de Passe Ici..."))
        verifmotdepasseText.setText("");
      
    }//GEN-LAST:event_verifmotdepasseTextKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adDAO.updateAdherent(Authentification.id_adherent,
                modifierNomText.getText(),
                ModierPrenomText.getText(),
                modifierEmailText.getText(),
                modifierMotdepasse.getText(),
                Integer.parseInt(modifierTelephoneText.getText().toString()),
                ad.getNombreReclamation()
                );
        AdherentDAO adDAO=new AdherentDAO();
         Adherent ad= new Adherent();
              ad=adDAO.findAdherentById(Authentification.id_adherent);
         NouveauMonProfil np=new NouveauMonProfil();
         NouveauMonProfil.monNom.setText(ad.getNom());
         NouveauMonProfil.monPrenom.setText(ad.getPrenom());
         NouveauMonProfil.monMail.setText(ad.getAdresseMail());
         NouveauMonProfil.monTelephone.setText(ad.getTelephone().toString());
        
        contentPanel.removeAll();
        contentPanel.add(np);
        contentPanel.repaint();
        contentPanel.revalidate();
        //adDAO.update_adherent(ad);
         this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModifierMonProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierMonProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierMonProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierMonProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModifierMonProfil().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ModifierMonProfil.class.getName()).log(Level.SEVERE, null, ex);}
                 catch (ParseException ex) {
                    Logger.getLogger(ModifierMonProfil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ModierPrenomText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField modifierEmailText;
    private javax.swing.JPasswordField modifierMotdepasse;
    private javax.swing.JButton modifierMotdepasseButton;
    private javax.swing.JTextField modifierNomText;
    private javax.swing.JTextField modifierTelephoneText;
    private javax.swing.JPanel panelModifierProfil;
    private javax.swing.JTextField verifmotdepasseText;
    // End of variables declaration//GEN-END:variables
}
