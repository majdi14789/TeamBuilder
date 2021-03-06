/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gui.admin;

import Entité.Adherent;
import Entité.Administrateur;
import com.tn.doa.AdherentDAO;
import com.tn.doa.AdministrateurDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author majdi
 */
public class MainFrameAdmin extends javax.swing.JFrame {
//NouveauMonProfil np=new NouveauMonProfil();
    /**
     * Creates new form MainFrame
     */
    NouveauGererFaq gefaq=new NouveauGererFaq();
    NouveauAdminPanel nap=new NouveauAdminPanel();
    public MainFrameAdmin() throws ParseException, UnsupportedLookAndFeelException {
        initComponents();
        //Adherent ad=Adherent(); 
        Toolkit tool=Toolkit.getDefaultToolkit();
          Dimension dim=new Dimension(tool.getScreenSize());
          
          int height1=(int)dim.getHeight();
          int width1=(int)dim.getWidth();
          setSize(width1 -100, height1 -100 );
          setLocationRelativeTo(new Gui.Authentification());
          System.out.println(width1+","+height1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();
        menu_panel = new javax.swing.JPanel();
        monProfilButton = new javax.swing.JButton();
        ajouterTrajetButton = new javax.swing.JButton();
        chercherTrajetButton = new javax.swing.JButton();
        deconexionButton = new javax.swing.JButton();
        gererMesTrajetButtom = new javax.swing.JButton();
        evaluerButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceuil Administrateur");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel.setMaximumSize(new java.awt.Dimension(1031, 578));
        jPanel.setMinimumSize(new java.awt.Dimension(1031, 578));

        bodyPanel.setBackground(new java.awt.Color(153, 0, 0));
        bodyPanel.setMaximumSize(new java.awt.Dimension(1031, 578));
        bodyPanel.setMinimumSize(new java.awt.Dimension(1031, 578));

        menu_panel.setBackground(new java.awt.Color(255, 255, 255));
        menu_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 51, 51)));

        monProfilButton.setBackground(new java.awt.Color(255, 255, 255));
        monProfilButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/MonProfilBleu.jpg"))); // NOI18N
        monProfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monProfilButtonActionPerformed(evt);
            }
        });

        ajouterTrajetButton.setBackground(new java.awt.Color(255, 255, 255));
        ajouterTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ConsulterInformationsIcon.jpg"))); // NOI18N
        ajouterTrajetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ajouterTrajetButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajouterTrajetButtonMouseExited(evt);
            }
        });
        ajouterTrajetButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ajouterTrajetButtonMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ajouterTrajetButtonMouseMoved(evt);
            }
        });
        ajouterTrajetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterTrajetButtonActionPerformed(evt);
            }
        });

        chercherTrajetButton.setBackground(new java.awt.Color(255, 255, 255));
        chercherTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/StatistiquesIIcon.png"))); // NOI18N
        chercherTrajetButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        chercherTrajetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherTrajetButtonActionPerformed(evt);
            }
        });

        deconexionButton.setBackground(new java.awt.Color(255, 255, 255));
        deconexionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-icon.png"))); // NOI18N
        deconexionButton.setMaximumSize(new java.awt.Dimension(10, 10));
        deconexionButton.setMinimumSize(new java.awt.Dimension(10, 10));
        deconexionButton.setPreferredSize(new java.awt.Dimension(10, 10));
        deconexionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconexionButtonActionPerformed(evt);
            }
        });

        gererMesTrajetButtom.setBackground(new java.awt.Color(255, 255, 255));
        gererMesTrajetButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ReclamationIcon.jpg"))); // NOI18N
        gererMesTrajetButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gererMesTrajetButtomActionPerformed(evt);
            }
        });

        evaluerButton.setBackground(new java.awt.Color(255, 255, 255));
        evaluerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/FaqIcon.jpg"))); // NOI18N
        evaluerButton.setMaximumSize(new java.awt.Dimension(113, 69));
        evaluerButton.setMinimumSize(new java.awt.Dimension(113, 69));
        evaluerButton.setPreferredSize(new java.awt.Dimension(113, 69));
        evaluerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluerButtonActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EnvoyerMailIcon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chercherTrajetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(monProfilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ajouterTrajetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deconexionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gererMesTrajetButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(evaluerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addComponent(monProfilButton)
                .addGap(0, 0, 0)
                .addComponent(ajouterTrajetButton)
                .addGap(0, 0, 0)
                .addComponent(chercherTrajetButton)
                .addGap(0, 0, 0)
                .addComponent(gererMesTrajetButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton1)
                .addGap(0, 0, 0)
                .addComponent(evaluerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(deconexionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        contentPanel.setForeground(new java.awt.Color(0, 153, 0));
        contentPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        contentPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        contentPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        contentPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monProfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monProfilButtonActionPerformed
       
        contentPanel.removeAll();
        contentPanel.add(nap);
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_monProfilButtonActionPerformed

    private void ajouterTrajetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterTrajetButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new NouveauConsulterinfoAdherent());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_ajouterTrajetButtonActionPerformed

    private void gererMesTrajetButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gererMesTrajetButtomActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new NouveauGererReclamation());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_gererMesTrajetButtomActionPerformed

    private void chercherTrajetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherTrajetButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new NouveauStatistique());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_chercherTrajetButtonActionPerformed

    private void evaluerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluerButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(gefaq);
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_evaluerButtonActionPerformed

    private void ajouterTrajetButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterTrajetButtonMouseMoved
       // ajouterTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png")));
    }//GEN-LAST:event_ajouterTrajetButtonMouseMoved

    private void ajouterTrajetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterTrajetButtonMouseExited
         ;
        System.out.println("5raj");
       // ajouterTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajoutcov.jpeg")));
    
    }//GEN-LAST:event_ajouterTrajetButtonMouseExited

    private void ajouterTrajetButtonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterTrajetButtonMouseDragged
        // ajouterTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajoutcov.png")));
    }//GEN-LAST:event_ajouterTrajetButtonMouseDragged

    private void ajouterTrajetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterTrajetButtonMouseEntered
         //ajouterTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png")));
          System.out.println("d5all");
    }//GEN-LAST:event_ajouterTrajetButtonMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         AdministrateurDAO administrateurDAO =new AdministrateurDAO();
         Administrateur administrateur=new Administrateur();
          administrateur = administrateurDAO.findAdministrateurById(Authentification.id_administrateur);
         
         nap.nomtxt.setText(administrateur.getNom());
         nap.prenomtxt.setText(administrateur.getPrenom());
         nap.logintxt.setText(administrateur.getLogin());
         nap.passwordtxt.setText(administrateur.getMdp());
         
//         String s = administrateurDAO.findAdministrateurById(Authentification.id_administrateur).getImage();
//         ImageIcon im = new ImageIcon(""+s);
         //profiladminPanel.jLabel1.setIcon(im);
         

    }//GEN-LAST:event_formWindowOpened

    private void deconexionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconexionButtonActionPerformed
    this.setVisible(false);
    new Authentification().setVisible(true);
    }//GEN-LAST:event_deconexionButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      contentPanel.removeAll();
        contentPanel.add(new NouveauNotificationsAdministrateur());
        contentPanel.repaint();
        contentPanel.revalidate();     
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
            java.util.logging.Logger.getLogger(MainFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrameAdmin().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(MainFrameAdmin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainFrameAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterTrajetButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton chercherTrajetButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton deconexionButton;
    private javax.swing.JButton evaluerButton;
    private javax.swing.JButton gererMesTrajetButtom;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JButton monProfilButton;
    // End of variables declaration//GEN-END:variables
}
