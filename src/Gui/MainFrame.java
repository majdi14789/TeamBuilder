/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gui;

import Entité.Adherent;
import com.tn.doa.AdherentDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author majdi
 */
public class MainFrame extends javax.swing.JFrame {
NouveauMonProfil np=new NouveauMonProfil();
NouveauAjouterReclamation nr=new NouveauAjouterReclamation();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() throws ParseException, UnsupportedLookAndFeelException {
        initComponents();
        //Adherent ad=Adherent(); 
        Toolkit tool=Toolkit.getDefaultToolkit();
          Dimension dim=new Dimension(tool.getScreenSize());
          int height1=(int)dim.getHeight();
          int width1=(int)dim.getWidth();
          setSize(width1 -100, height1 -100 );
          setLocationRelativeTo(new Gui.Authentification());
          //System.out.println(width1+","+height1);
    //contentPanel.setBackground(Color.);
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
        reclamationsButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel.setMaximumSize(new java.awt.Dimension(1031, 578));
        jPanel.setMinimumSize(new java.awt.Dimension(1031, 578));

        bodyPanel.setBackground(new java.awt.Color(26, 120, 167));
        bodyPanel.setMaximumSize(new java.awt.Dimension(1031, 578));
        bodyPanel.setMinimumSize(new java.awt.Dimension(1031, 578));

        menu_panel.setBackground(new java.awt.Color(255, 255, 255));
        menu_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 51, 51)));

        monProfilButton.setBackground(new java.awt.Color(255, 255, 255));
        monProfilButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/monprofil.png"))); // NOI18N
        monProfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monProfilButtonActionPerformed(evt);
            }
        });

        ajouterTrajetButton.setBackground(new java.awt.Color(255, 255, 255));
        ajouterTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajoutcov.jpeg"))); // NOI18N
        ajouterTrajetButton.setMaximumSize(new java.awt.Dimension(75, 57));
        ajouterTrajetButton.setMinimumSize(new java.awt.Dimension(75, 57));
        ajouterTrajetButton.setPreferredSize(new java.awt.Dimension(75, 57));
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
        chercherTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cherch.jpg"))); // NOI18N
        chercherTrajetButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        chercherTrajetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherTrajetButtonActionPerformed(evt);
            }
        });

        deconexionButton.setBackground(new java.awt.Color(255, 255, 255));
        deconexionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dis.png"))); // NOI18N
        deconexionButton.setMaximumSize(new java.awt.Dimension(10, 10));
        deconexionButton.setMinimumSize(new java.awt.Dimension(10, 10));
        deconexionButton.setPreferredSize(new java.awt.Dimension(10, 10));
        deconexionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconexionButtonActionPerformed(evt);
            }
        });

        gererMesTrajetButtom.setBackground(new java.awt.Color(255, 255, 255));
        gererMesTrajetButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gestion.jpg"))); // NOI18N
        gererMesTrajetButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gererMesTrajetButtomActionPerformed(evt);
            }
        });

        evaluerButton.setBackground(new java.awt.Color(255, 255, 255));
        evaluerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/evaluer.png"))); // NOI18N
        evaluerButton.setMaximumSize(new java.awt.Dimension(113, 69));
        evaluerButton.setMinimumSize(new java.awt.Dimension(113, 69));
        evaluerButton.setPreferredSize(new java.awt.Dimension(113, 69));
        evaluerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluerButtonActionPerformed(evt);
            }
        });

        reclamationsButton.setBackground(new java.awt.Color(255, 255, 255));
        reclamationsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reclamations.png"))); // NOI18N
        reclamationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reclamationsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chercherTrajetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(monProfilButton, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
            .addComponent(ajouterTrajetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deconexionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gererMesTrajetButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(evaluerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reclamationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addComponent(monProfilButton)
                .addGap(0, 0, 0)
                .addComponent(ajouterTrajetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(chercherTrajetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(gererMesTrajetButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(evaluerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(reclamationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deconexionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
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
        contentPanel.add(np);
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_monProfilButtonActionPerformed

    private void ajouterTrajetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterTrajetButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new NouveauTrajetPanel());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_ajouterTrajetButtonActionPerformed

    private void gererMesTrajetButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gererMesTrajetButtomActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new NouveauGererMesTrajets());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_gererMesTrajetButtomActionPerformed

    private void chercherTrajetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherTrajetButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new NouveauRechercherTrajetPanel());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_chercherTrajetButtonActionPerformed

    private void evaluerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluerButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new NouveauEvaluationAdherent());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_evaluerButtonActionPerformed

    private void ajouterTrajetButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterTrajetButtonMouseMoved
       // ajouterTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png")));
    }//GEN-LAST:event_ajouterTrajetButtonMouseMoved

    private void ajouterTrajetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterTrajetButtonMouseExited
         ;
        System.out.println("5raj");
        ajouterTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajoutcov.jpeg")));
    
    }//GEN-LAST:event_ajouterTrajetButtonMouseExited

    private void ajouterTrajetButtonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterTrajetButtonMouseDragged
        // ajouterTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajoutcov.png")));
    }//GEN-LAST:event_ajouterTrajetButtonMouseDragged

    private void ajouterTrajetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterTrajetButtonMouseEntered
         ajouterTrajetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png")));
          System.out.println("d5all");
    }//GEN-LAST:event_ajouterTrajetButtonMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AdherentDAO adDAO=new AdherentDAO();
         Adherent ad= new Adherent();
              ad=adDAO.findAdherentById(Authentification.id_adherent);
         
         NouveauMonProfil.monNom.setText(ad.getNom());
         NouveauMonProfil.monPrenom.setText(ad.getPrenom());
         NouveauMonProfil.monMail.setText(ad.getAdresseMail());
         NouveauMonProfil.monTelephone.setText(ad.getTelephone().toString());
            
        AdherentDAO adherentDAO=new AdherentDAO();
          List<Adherent> listeAdherents = new ArrayList<Adherent>();
          listeAdherents=adherentDAO.DisplayAllAdherentSa(Authentification.id_adherent);
          for(int i=0;i<listeAdherents.size();i++)
          {
      NouveauAjouterReclamation.adherentcmb.addItem(listeAdherents.get(i).getIdAdherent()+"  "+listeAdherents.get(i).getNom()+" "+listeAdherents.get(i).getPrenom());
          }
        
    }//GEN-LAST:event_formWindowOpened

    private void deconexionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconexionButtonActionPerformed
this.setVisible(false);
    try {
        new Authentification().setVisible(true);
    } catch (ParseException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (UnsupportedLookAndFeelException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_deconexionButtonActionPerformed

    private void reclamationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reclamationsButtonActionPerformed
         contentPanel.removeAll();
        contentPanel.add(nr);
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_reclamationsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterTrajetButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton chercherTrajetButton;
    public static javax.swing.JPanel contentPanel;
    private javax.swing.JButton deconexionButton;
    private javax.swing.JButton evaluerButton;
    private javax.swing.JButton gererMesTrajetButtom;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JButton monProfilButton;
    private javax.swing.JButton reclamationsButton;
    // End of variables declaration//GEN-END:variables
}
