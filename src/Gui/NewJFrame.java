/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gui;

import Entité.Adherent;
import com.tn.doa.AdherentDAO;
import java.awt.Dimension;

/**
 *
 * @author majdi
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    static Dimension tailleEcran;
    public NewJFrame() {
        initComponents();
        //setLocationRelativeTo(null);
        panelprofil.add(new monProfilPanel());
        panelajoutertrajet.add(new AjouterTrajetPanel());
        panelrecherchertrajet.add(new RechercherTrajetPanel());
        panelgerertrajet.add(new GererMesTrajet());
        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int width=(int)tailleEcran.getWidth();
          int height =(int)tailleEcran.getHeight();
          setSize(tailleEcran);
        //setSize(500, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabprincipale = new javax.swing.JTabbedPane();
        panelprofil = new javax.swing.JPanel();
        panelajoutertrajet = new javax.swing.JPanel();
        panelrecherchertrajet = new javax.swing.JPanel();
        panelgerertrajet = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(panelgerertrajet.getMaximumSize());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(new java.awt.CardLayout());

        tabprincipale.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        panelprofil.setLayout(new java.awt.CardLayout());
        tabprincipale.addTab("mon profil", panelprofil);

        panelajoutertrajet.setLayout(new java.awt.CardLayout());
        tabprincipale.addTab("ajouter trajet", panelajoutertrajet);

        panelrecherchertrajet.setMaximumSize(getPreferredSize());
        panelrecherchertrajet.setLayout(new java.awt.CardLayout());
        tabprincipale.addTab("rechercher trajet", panelrecherchertrajet);

        panelgerertrajet.setLayout(new java.awt.CardLayout());
        tabprincipale.addTab("gerer mes trajet", panelgerertrajet);

        jPanel1.add(tabprincipale, "card2");
        tabprincipale.getAccessibleContext().setAccessibleParent(this);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AdherentDAO adDAO=new AdherentDAO();
        Adherent ad=adDAO.findAdherentById(Authentification.id_adherent);
        monProfilPanel.monNomLabel.setText(ad.getNom());
        monProfilPanel.monAdresseLabel.setText(ad.getAdresseMail());
        monProfilPanel.monPrenomLabel.setText(ad.getPrenom());
        monProfilPanel.monTelephoneLabel.setText(ad.getTelephone().toString());
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelajoutertrajet;
    private javax.swing.JPanel panelgerertrajet;
    private javax.swing.JPanel panelprofil;
    private javax.swing.JPanel panelrecherchertrajet;
    private javax.swing.JTabbedPane tabprincipale;
    // End of variables declaration//GEN-END:variables
}
