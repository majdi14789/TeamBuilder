/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gui.admin;
import Entité.Faq;
import Mail.MailToSend;
import com.tn.connect.MyConnection;
import com.tn.doa.FaqDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author majdi
 */
public class NouveauGererFaq extends javax.swing.JPanel {

    /**
     * Creates new form NouveauGererFaq
     */
    public NouveauGererFaq() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSplitPane5 = new javax.swing.JSplitPane();
        leftSplitFAQ3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        faqTable3 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        objetfaq = new javax.swing.JPanel();
        Ajouter = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        objettxt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contenutxt1 = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        jSplitPane5.setDividerLocation(350);
        jSplitPane5.setDividerSize(8);
        jSplitPane5.setOneTouchExpandable(true);

        leftSplitFAQ3.setBackground(new java.awt.Color(204, 204, 204));
        leftSplitFAQ3.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion des FAQ"));

        faqTable3.setModel(new com.tn.tableModel.FaqTable());
        faqTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqTable3MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(faqTable3);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Table informations FAQ:");

        javax.swing.GroupLayout leftSplitFAQ3Layout = new javax.swing.GroupLayout(leftSplitFAQ3);
        leftSplitFAQ3.setLayout(leftSplitFAQ3Layout);
        leftSplitFAQ3Layout.setHorizontalGroup(
            leftSplitFAQ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitFAQ3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftSplitFAQ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftSplitFAQ3Layout.setVerticalGroup(
            leftSplitFAQ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSplitFAQ3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane5.setLeftComponent(leftSplitFAQ3);

        Ajouter.setText("Ajouter");
        Ajouter.setMaximumSize(new java.awt.Dimension(38, 86));
        Ajouter.setMinimumSize(new java.awt.Dimension(38, 86));
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
            }
        });

        Supprimer.setText("Supprimer");
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });

        Modifier.setText("Modifier");
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        objettxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objettxt1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Objet :");

        jLabel5.setText("Contenu :");

        contenutxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contenutxt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(objettxt1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenutxt1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(objettxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(contenutxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout objetfaqLayout = new javax.swing.GroupLayout(objetfaq);
        objetfaq.setLayout(objetfaqLayout);
        objetfaqLayout.setHorizontalGroup(
            objetfaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(objetfaqLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        objetfaqLayout.setVerticalGroup(
            objetfaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(objetfaqLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(objetfaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Supprimer)
                    .addComponent(Modifier)
                    .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140))
        );

        jSplitPane5.setRightComponent(objetfaq);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane5)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane5)
                .addContainerGap())
        );

        add(jPanel2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void faqTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqTable3MouseClicked
        //System.out.println(fa);
        int row = faqTable3.getSelectedRow();
        String table_click = (faqTable3.getModel().getValueAt(row, 0).toString());
        FaqDAO fdao = new FaqDAO();
        Faq f = fdao.findFaqById(Integer.parseInt(table_click));

        objettxt1.setText(f.getObjet());
        contenutxt1.setText(f.getContenu());
    }//GEN-LAST:event_faqTable3MouseClicked

    private void objettxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objettxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_objettxt1ActionPerformed

    private void contenutxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contenutxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contenutxt1ActionPerformed

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed

        
        if (objettxt1.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(this,"Ajouter Une Question !");   

        }
        else if(contenutxt1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Ajouter La Reponse !");   

        }  else {
        FaqDAO faqDAO=new FaqDAO();
        Faq faq=new Faq();

        faq.setObjet(objettxt1.getText());
        faq.setContenu(contenutxt1.getText());
        faqDAO.insertFaq(faq);

        update_table();
        }
    }//GEN-LAST:event_AjouterActionPerformed
 private void update_table(){
    try{
    String sql = " select * from faq";
    PreparedStatement ps = MyConnection.getInstance().prepareStatement(sql);
    ResultSet result=ps.executeQuery();
    faqTable3.setModel(DbUtils.resultSetToTableModel(result));
    
    }
    catch(Exception e)
    {
     JOptionPane.showMessageDialog(null, e);   
    }
    }
    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        // TODO add your handling code here:
        FaqDAO FaqDAO=new FaqDAO();
        int row=faqTable3.getSelectedRow();
        int id=(int)faqTable3.getValueAt(row,0);
        FaqDAO.deleteFaq(id);

        update_table();
    }//GEN-LAST:event_SupprimerActionPerformed

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
        try {

            int row=faqTable3.getSelectedRow();
            int id=(int)faqTable3.getValueAt(row,0);
            String obj =objettxt1.getText();
            String cont =contenutxt1.getText();
            Faq faq=new Faq();
            faq.setContenu(cont);
            faq.setObjet(obj);
            FaqDAO faqDAO = new FaqDAO();
            faqDAO.updateFaq(faq,id);
            MailToSend mailToSend=new MailToSend();
            String objet="Modification d'un Frequent Asked Question "+objettxt1;
            String contenu="Faq modifiée : "+contenutxt1;

            MailToSend.sendMessage(objet, contenu,"torjmen.salma@gmail.com","olfa.ayed@esprit.tn");

            JOptionPane.showMessageDialog(null, "Faq modifié avec succes");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Selectionner une Q/R a modifier");
            
        }
        update_table();
    }//GEN-LAST:event_ModifierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Supprimer;
    private javax.swing.JTextField contenutxt1;
    private javax.swing.JTable faqTable3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JPanel leftSplitFAQ3;
    private javax.swing.JPanel objetfaq;
    private javax.swing.JTextField objettxt1;
    // End of variables declaration//GEN-END:variables
}
