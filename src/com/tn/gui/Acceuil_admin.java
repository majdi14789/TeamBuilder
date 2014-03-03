package com.tn.gui;

import com.tn.tableModel.TrajetModel;
import Tools.Gmail;
import brouillons.Authentification;
import com.tn.doa.TrajetDAO;
import java.util.ArrayList;
import javax.swing.JTabbedPane;
import javax.swing.table.TableModel;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Acceuil_admin extends javax.swing.JFrame {

    
    TrajetDAO  trajetDAO = new TrajetDAO();
        Gmail gmail = new Gmail();
        
        private final String e_mail_condition_climatique= "Cher Conducteur , ici le test de la prevention (climat)";
        private final String e_mail_condition_embouteillage= "Cher Conducteur , ici le test de la prevention (embouteillage)";
        private final String e_mail_condition_securite= "Cher Conducteur , ici le test de la prevention (securite)";

     public  ArrayList<String> list_ville_arr = new ArrayList<String>();
     public  ArrayList<String> list_Emails = new ArrayList<String>();

    
    
    public Acceuil_admin() {
         initComponents();
        view=new javax.swing.JMenu();
        help=new javax.swing.JMenu();
        view.setText("View");
        menu_bar.add(view);
        help.setText("Help");
        menu_bar.add(help);
        
       
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_general = new javax.swing.JPanel();
        tab_general = new javax.swing.JTabbedPane();
        panelProfil = new javax.swing.JPanel();
        nomCompletlabel = new javax.swing.JLabel();
        login_label = new javax.swing.JLabel();
        passwdLabel = new javax.swing.JLabel();
        mail_Label = new javax.swing.JLabel();
        nomCompletText = new javax.swing.JTextField();
        loginText = new javax.swing.JTextField();
        mailText = new javax.swing.JTextField();
        passwdText = new javax.swing.JPasswordField();
        dcnxBtn = new javax.swing.JButton();
        panelAdherent = new javax.swing.JPanel();
        triCombox = new javax.swing.JComboBox();
        serachText = new javax.swing.JTextField();
        serachBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        adhrentTable = new javax.swing.JTable();
        panelReclamations = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        leftSplitPanel = new javax.swing.JPanel();
        tab_reclamation = new javax.swing.JTabbedPane();
        reclamation_tab_panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        consulter_DetailsBtn = new javax.swing.JButton();
        supprimer_detailsBtn = new javax.swing.JButton();
        suggestion_tabPanel = new javax.swing.JPanel();
        rightSplitPanel = new javax.swing.JPanel();
        tabDetailsReclamation = new javax.swing.JTabbedPane();
        DemandeurPanel = new javax.swing.JPanel();
        accusePanel = new javax.swing.JPanel();
        contexterecPanel = new javax.swing.JPanel();
        panelStatistique = new javax.swing.JPanel();
        panelRapport = new javax.swing.JPanel();
        panelFAQ = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        leftSplitFAQ = new javax.swing.JPanel();
        triComboFAQ = new javax.swing.JComboBox();
        serachTextFAQ = new javax.swing.JTextField();
        searchFAQBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableau_FAQ = new javax.swing.JTable();
        rightSplitFAQ = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gov2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ville2 = new javax.swing.JComboBox();
        jourCombo = new javax.swing.JComboBox();
        moisCombo = new javax.swing.JComboBox();
        anneeCombo = new javax.swing.JComboBox();
        rafraichir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Climat = new javax.swing.JButton();
        button_securite = new javax.swing.JButton();
        embouteillage_mail = new javax.swing.JButton();
        all_trajets = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        Main_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        menu_bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelProfil.setBackground(new java.awt.Color(228, 226, 226));
        panelProfil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information Générales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(0, 102, 51))); // NOI18N

        nomCompletlabel.setText("Nom Complet :");

        login_label.setText("Login :");

        passwdLabel.setText("Password :");

        mail_Label.setText("E_mail :");

        nomCompletText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomCompletTextActionPerformed(evt);
            }
        });

        mailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTextActionPerformed(evt);
            }
        });

        passwdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwdTextActionPerformed(evt);
            }
        });

        dcnxBtn.setText("Deconexion");
        dcnxBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcnxBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProfilLayout = new javax.swing.GroupLayout(panelProfil);
        panelProfil.setLayout(panelProfilLayout);
        panelProfilLayout.setHorizontalGroup(
            panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProfilLayout.createSequentialGroup()
                        .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login_label, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mail_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                        .addGap(33, 33, 33)
                        .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomCompletText)
                            .addComponent(loginText)
                            .addComponent(mailText)
                            .addComponent(passwdText, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addGroup(panelProfilLayout.createSequentialGroup()
                        .addComponent(nomCompletlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dcnxBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(295, 295, 295))
        );
        panelProfilLayout.setVerticalGroup(
            panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfilLayout.createSequentialGroup()
                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProfilLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomCompletlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomCompletText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dcnxBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
        );

        tab_general.addTab("Mon Profil", panelProfil);

        panelAdherent.setBackground(new java.awt.Color(204, 204, 204));
        panelAdherent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des Utilisateurs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(0, 102, 51))); // NOI18N

        triCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Trier Par", "Nom", "Prenom", "UserName", "Date d'inscription" }));
        triCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triComboxActionPerformed(evt);
            }
        });

        serachText.setText("Search....");

        serachBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search_icon.jpg"))); // NOI18N

        adhrentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"saadani","Majdi","chbaya7","02/03/2013"},
                {"ben mansour","Safouene","3angour","15/09/2013"},
                {"torjmen", "Salma","salmouch","29/12/2013"},
                {"ayed", "Olfa", "foufa","01/01/2014"},
                {"yaakoubi", "Sinda","chouchou","05/02/2014"}

            },
            new String [] {
                "Nom", "Prenom", "UserName", "Date d'inscription"
            }
        ));
        jScrollPane1.setViewportView(adhrentTable);

        javax.swing.GroupLayout panelAdherentLayout = new javax.swing.GroupLayout(panelAdherent);
        panelAdherent.setLayout(panelAdherentLayout);
        panelAdherentLayout.setHorizontalGroup(
            panelAdherentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdherentLayout.createSequentialGroup()
                .addGroup(panelAdherentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdherentLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(triCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serachText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAdherentLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(549, Short.MAX_VALUE))
        );
        panelAdherentLayout.setVerticalGroup(
            panelAdherentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdherentLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(panelAdherentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAdherentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(serachText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(triCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        tab_general.addTab("Consulter info Adherent", panelAdherent);

        panelReclamations.setBackground(new java.awt.Color(255, 204, 204));

        jSplitPane2.setDividerLocation(400);
        jSplitPane2.setDividerSize(10);
        jSplitPane2.setOneTouchExpandable(true);

        leftSplitPanel.setBackground(new java.awt.Color(204, 204, 204));
        leftSplitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion des reclamations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(0, 102, 51))); // NOI18N

        reclamation_tab_panel.setBackground(new java.awt.Color(255, 255, 255));
        reclamation_tab_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des reclamation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(0, 153, 51))); // NOI18N

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Reclamations 1", "Reclamations 2", "Reclamations 3", "Reclamations 4", "Reclamations 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        consulter_DetailsBtn.setText("Consulter détails");

        supprimer_detailsBtn.setText("Supprimer");
        supprimer_detailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_detailsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reclamation_tab_panelLayout = new javax.swing.GroupLayout(reclamation_tab_panel);
        reclamation_tab_panel.setLayout(reclamation_tab_panelLayout);
        reclamation_tab_panelLayout.setHorizontalGroup(
            reclamation_tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reclamation_tab_panelLayout.createSequentialGroup()
                .addGroup(reclamation_tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reclamation_tab_panelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reclamation_tab_panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(consulter_DetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supprimer_detailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        reclamation_tab_panelLayout.setVerticalGroup(
            reclamation_tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reclamation_tab_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(reclamation_tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consulter_DetailsBtn)
                    .addComponent(supprimer_detailsBtn))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        tab_reclamation.addTab("Reclamations", reclamation_tab_panel);

        javax.swing.GroupLayout suggestion_tabPanelLayout = new javax.swing.GroupLayout(suggestion_tabPanel);
        suggestion_tabPanel.setLayout(suggestion_tabPanelLayout);
        suggestion_tabPanelLayout.setHorizontalGroup(
            suggestion_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        suggestion_tabPanelLayout.setVerticalGroup(
            suggestion_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        tab_reclamation.addTab("Suggestions", suggestion_tabPanel);

        javax.swing.GroupLayout leftSplitPanelLayout = new javax.swing.GroupLayout(leftSplitPanel);
        leftSplitPanel.setLayout(leftSplitPanelLayout);
        leftSplitPanelLayout.setHorizontalGroup(
            leftSplitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_reclamation)
        );
        leftSplitPanelLayout.setVerticalGroup(
            leftSplitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab_reclamation)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(leftSplitPanel);

        rightSplitPanel.setBackground(new java.awt.Color(204, 204, 204));
        rightSplitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Détails Reclamations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(0, 153, 51))); // NOI18N

        DemandeurPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DemandeurPanelLayout = new javax.swing.GroupLayout(DemandeurPanel);
        DemandeurPanel.setLayout(DemandeurPanelLayout);
        DemandeurPanelLayout.setHorizontalGroup(
            DemandeurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        DemandeurPanelLayout.setVerticalGroup(
            DemandeurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        tabDetailsReclamation.addTab("Demandeur", DemandeurPanel);

        accusePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout accusePanelLayout = new javax.swing.GroupLayout(accusePanel);
        accusePanel.setLayout(accusePanelLayout);
        accusePanelLayout.setHorizontalGroup(
            accusePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        accusePanelLayout.setVerticalGroup(
            accusePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        tabDetailsReclamation.addTab("Accusé", accusePanel);

        contexterecPanel.setBackground(new java.awt.Color(255, 255, 255));
        contexterecPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout contexterecPanelLayout = new javax.swing.GroupLayout(contexterecPanel);
        contexterecPanel.setLayout(contexterecPanelLayout);
        contexterecPanelLayout.setHorizontalGroup(
            contexterecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        contexterecPanelLayout.setVerticalGroup(
            contexterecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        tabDetailsReclamation.addTab("Contexte Reclamations", contexterecPanel);

        javax.swing.GroupLayout rightSplitPanelLayout = new javax.swing.GroupLayout(rightSplitPanel);
        rightSplitPanel.setLayout(rightSplitPanelLayout);
        rightSplitPanelLayout.setHorizontalGroup(
            rightSplitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabDetailsReclamation)
        );
        rightSplitPanelLayout.setVerticalGroup(
            rightSplitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabDetailsReclamation)
        );

        tabDetailsReclamation.setTabPlacement(JTabbedPane.LEFT);

        jSplitPane2.setRightComponent(rightSplitPanel);

        javax.swing.GroupLayout panelReclamationsLayout = new javax.swing.GroupLayout(panelReclamations);
        panelReclamations.setLayout(panelReclamationsLayout);
        panelReclamationsLayout.setHorizontalGroup(
            panelReclamationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        panelReclamationsLayout.setVerticalGroup(
            panelReclamationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        tab_general.addTab("Gérer Reclamations", panelReclamations);

        panelStatistique.setBackground(new java.awt.Color(255, 255, 255));
        panelStatistique.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Génerer Les Statistique", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(0, 102, 51))); // NOI18N

        javax.swing.GroupLayout panelStatistiqueLayout = new javax.swing.GroupLayout(panelStatistique);
        panelStatistique.setLayout(panelStatistiqueLayout);
        panelStatistiqueLayout.setHorizontalGroup(
            panelStatistiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1047, Short.MAX_VALUE)
        );
        panelStatistiqueLayout.setVerticalGroup(
            panelStatistiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        tab_general.addTab("Génerer les statistiques", panelStatistique);

        panelRapport.setBackground(new java.awt.Color(255, 255, 255));
        panelRapport.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Génerer Les Rapports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(0, 102, 51))); // NOI18N

        javax.swing.GroupLayout panelRapportLayout = new javax.swing.GroupLayout(panelRapport);
        panelRapport.setLayout(panelRapportLayout);
        panelRapportLayout.setHorizontalGroup(
            panelRapportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1047, Short.MAX_VALUE)
        );
        panelRapportLayout.setVerticalGroup(
            panelRapportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        tab_general.addTab("Générer Rapport", panelRapport);

        panelFAQ.setBackground(new java.awt.Color(204, 255, 255));

        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setDividerSize(8);
        jSplitPane1.setOneTouchExpandable(true);

        leftSplitFAQ.setBackground(new java.awt.Color(255, 255, 255));
        leftSplitFAQ.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion des FAQ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(0, 102, 51))); // NOI18N

        triComboFAQ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        serachTextFAQ.setText("Search....");
        serachTextFAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serachTextFAQActionPerformed(evt);
            }
        });

        tableau_FAQ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"objet 1","10/10/2013","1"},
                {"objet 2","10/10/2013","1",},
                {"objet 3","10/10/2013","1"},
                {"Objet 4","10/10/2013","1"}
            },
            new String [] {
                "Objet", "Date de Creation", "Nbr de question"
            }
        ));
        jScrollPane3.setViewportView(tableau_FAQ);

        javax.swing.GroupLayout leftSplitFAQLayout = new javax.swing.GroupLayout(leftSplitFAQ);
        leftSplitFAQ.setLayout(leftSplitFAQLayout);
        leftSplitFAQLayout.setHorizontalGroup(
            leftSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitFAQLayout.createSequentialGroup()
                .addGroup(leftSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSplitFAQLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(triComboFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serachTextFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchFAQBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftSplitFAQLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        leftSplitFAQLayout.setVerticalGroup(
            leftSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitFAQLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(leftSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(triComboFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serachTextFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFAQBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftSplitFAQ);

        javax.swing.GroupLayout rightSplitFAQLayout = new javax.swing.GroupLayout(rightSplitFAQ);
        rightSplitFAQ.setLayout(rightSplitFAQLayout);
        rightSplitFAQLayout.setHorizontalGroup(
            rightSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        rightSplitFAQLayout.setVerticalGroup(
            rightSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(rightSplitFAQ);

        javax.swing.GroupLayout panelFAQLayout = new javax.swing.GroupLayout(panelFAQ);
        panelFAQ.setLayout(panelFAQLayout);
        panelFAQLayout.setHorizontalGroup(
            panelFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        panelFAQLayout.setVerticalGroup(
            panelFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        tab_general.addTab("Génerer FAQ", panelFAQ);

        jTable1.setModel(new TrajetModel());
        jTable1.getColumnModel().getColumn(14).setMinWidth(0);
        jTable1.getColumnModel().getColumn(14).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(14).setWidth(0);
        jTable1.getColumnModel().getColumn(4).setMinWidth(0);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(4).setWidth(0);
        jTable1.getColumnModel().getColumn(5).setMinWidth(0);
        jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(5).setWidth(0);
        jTable1.getColumnModel().getColumn(6).setMinWidth(0);
        jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(6).setWidth(0);
        jTable1.getColumnModel().getColumn(7).setMinWidth(0);
        jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(7).setWidth(0);
        jTable1.getColumnModel().getColumn(8).setMinWidth(0);
        jTable1.getColumnModel().getColumn(8).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(8).setWidth(0);
        jTable1.getColumnModel().getColumn(9).setMinWidth(0);
        jTable1.getColumnModel().getColumn(9).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(9).setWidth(0);
        jScrollPane4.setViewportView(jTable1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notifier les Conducteurs D'un Probleme \n", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel4.setText("Jour de Depart :");

        jLabel5.setText("Destination : ");

        gov2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ariana", "Béja", "BenArous", "Bizerte", "Gabès", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "Kébili", "LaManouba", "LeKef", "Mahdia", "Médenine", "Monastir", "Nabeul", "Sfax", "SidiBouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Tunis", "Zaghouan" }));
        gov2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gov2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Gouvernorat :");

        jLabel7.setText("Ville :");

        jourCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        moisCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        anneeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2013", "2014" }));

        rafraichir.setText("Rafraichir la Base");
        rafraichir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rafraichirActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notifier les Conducteurs concernes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)))); // NOI18N

        Climat.setText("Condition climatique");
        Climat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClimatActionPerformed(evt);
            }
        });

        button_securite.setText("Problemes securitaires");
        button_securite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_securiteActionPerformed(evt);
            }
        });

        embouteillage_mail.setText("Embouteillage");
        embouteillage_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                embouteillage_mailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(embouteillage_mail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_securite, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(Climat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Climat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_securite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(embouteillage_mail)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jourCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moisCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anneeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rafraichir)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(gov2, 0, 114, Short.MAX_VALUE)
                                .addComponent(ville2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(198, 198, 198)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jourCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moisCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anneeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(gov2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ville2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rafraichir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        all_trajets.setText("Get All Trajets");
        all_trajets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_trajetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(all_trajets, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(all_trajets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab_general.addTab("Notifications utilisateurs", jPanel1);

        javax.swing.GroupLayout panel_generalLayout = new javax.swing.GroupLayout(panel_general);
        panel_general.setLayout(panel_generalLayout);
        panel_generalLayout.setHorizontalGroup(
            panel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_generalLayout.createSequentialGroup()
                .addComponent(tab_general, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_generalLayout.setVerticalGroup(
            panel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_general)
        );

        tab_general.setTabPlacement(JTabbedPane.LEFT);

        jToggleButton1.setText("jToggleButton1");

        Main_panel.setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Login :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mot de passe :");

        jButton1.setText("Connecter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Rester Connecter");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                            .addComponent(jPasswordField1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout Main_panelLayout = new javax.swing.GroupLayout(Main_panel);
        Main_panel.setLayout(Main_panelLayout);
        Main_panelLayout.setHorizontalGroup(
            Main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_panelLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        Main_panelLayout.setVerticalGroup(
            Main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_panelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        menu_bar.add(jMenu1);

        jMenu2.setText("Edit");
        menu_bar.add(jMenu2);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_general, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(Main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(192, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_general, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(Main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(34, 34, 34)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomCompletTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomCompletTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomCompletTextActionPerformed

    private void mailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextActionPerformed

    private void passwdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwdTextActionPerformed

    private void triComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triComboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triComboxActionPerformed

    private void supprimer_detailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_detailsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supprimer_detailsBtnActionPerformed

    private void serachTextFAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serachTextFAQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serachTextFAQActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //this.setVisible(false);
        //new Acceuil_admin().setVisible(true);
Main_panel.setVisible(false);
panel_general.setVisible(true);
        System.out.println("connecter");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Authentification.setDefaultLookAndFeelDecorated(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void dcnxBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcnxBtnActionPerformed
        panel_general.setVisible(false);
        Main_panel.setVisible(true);
    }//GEN-LAST:event_dcnxBtnActionPerformed

    
    
    
    
    
    
    private void rafraichirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rafraichirActionPerformed
    jTable1.setModel(new TrajetModel(ville2.getSelectedItem().toString(),jourCombo.getSelectedItem()+"/" +moisCombo.getSelectedItem()+"/"+anneeCombo.getSelectedItem()));
    // cacher les champs inutiles 
    jTable1.getColumnModel().getColumn(14).setMinWidth(0);
           jTable1.getColumnModel().getColumn(14).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(14).setWidth(0);
jTable1.getColumnModel().getColumn(4).setMinWidth(0);
           jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(4).setWidth(0);
jTable1.getColumnModel().getColumn(5).setMinWidth(0);
           jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(5).setWidth(0);
jTable1.getColumnModel().getColumn(6).setMinWidth(0);
           jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(6).setWidth(0);
jTable1.getColumnModel().getColumn(7).setMinWidth(0);
           jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(7).setWidth(0);
jTable1.getColumnModel().getColumn(8).setMinWidth(0);
           jTable1.getColumnModel().getColumn(8).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(8).setWidth(0);
jTable1.getColumnModel().getColumn(9).setMinWidth(0);
           jTable1.getColumnModel().getColumn(9).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(9).setWidth(0);
    
    }//GEN-LAST:event_rafraichirActionPerformed

    private void ClimatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClimatActionPerformed

  // retourne la liste des emails des conducteurs qui ont un trajet le jours X et la destination X      
  
        
  list_Emails= (ArrayList<String>) trajetDAO.DisplayAllEmails(ville2.getSelectedItem().toString(),jourCombo.getSelectedItem()+"/" +moisCombo.getSelectedItem()+"/"+anneeCombo.getSelectedItem());
     
 
   for(int i =0 ; i<list_Emails.size(); i++) {
  
    gmail.subject = "Equipe Administration Covoiturage--Prevention";
    gmail.contenu=e_mail_condition_climatique;    
    gmail.adresse_destination=list_Emails.get(i);
   
    gmail.sendMail();
   
   }    
       
  
    }//GEN-LAST:event_ClimatActionPerformed

    private void gov2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gov2ActionPerformed
      
        
        
         switch (gov2.getSelectedIndex()) {
            case 0 :

            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Ariana");
            list_ville_arr.add("Raoued");
            list_ville_arr.add("LaSoukra");
            list_ville_arr.add("SidiThabet");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }

            break;
        }

        // ***************************************************************
        switch (gov2.getSelectedIndex()) {
            case 1 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Beja");
            list_ville_arr.add("MedjezEl_Bab");
            list_ville_arr.add("Testour");
            list_ville_arr.add("Téboursouk");
            list_ville_arr.add("Nefza");
            list_ville_arr.add("Amdoun");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }

            break;
        }
        //***********************************************************

        switch (gov2.getSelectedIndex()) {
            case 2 :

            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("ElMourouj");
            list_ville_arr.add("BenArous");
            list_ville_arr.add("Radès");
            list_ville_arr.add("HammamLif");
            list_ville_arr.add("Ezzahra");
            list_ville_arr.add("Mornag");
            list_ville_arr.add("HammamChott");
            list_ville_arr.add("Mégrine");
            list_ville_arr.add("Khalidia");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }

        //*********************************************************
        switch (gov2.getSelectedIndex()) {
            case 3 :

            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Bizerte");
            list_ville_arr.add("Mateur");
            list_ville_arr.add("RasJebel");
            list_ville_arr.add("MenzelJemil");
            list_ville_arr.add("Tinja");
            list_ville_arr.add("ElAlia");
            list_ville_arr.add("MenzelAbderrahmane");
            list_ville_arr.add("MenzelBourguiba");
            list_ville_arr.add("RafRaf");
            list_ville_arr.add("GharElMelh");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // ***************************************************************

        switch (gov2.getSelectedIndex()) {
            case 4 :

            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Gabès");
            list_ville_arr.add("ElHamma");
            list_ville_arr.add("Ghannouch");
            list_ville_arr.add("Mareth");
            list_ville_arr.add("Métouia");
            list_ville_arr.add("Oudhref");
            list_ville_arr.add("Zarat");
            list_ville_arr.add("Matmata");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // ***************************************************************

        switch (gov2.getSelectedIndex()) {
            case 5 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Gafsa");
            list_ville_arr.add("Métlaoui");
            list_ville_arr.add("ElKsar");
            list_ville_arr.add("Redeyef");
            list_ville_arr.add("ElGuettar");
            list_ville_arr.add("Mdhila");
            list_ville_arr.add("Sened");
            list_ville_arr.add("Matmata");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // ***************************************************************

        switch (gov2.getSelectedIndex()) {
            case 6 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Jendouba");
            list_ville_arr.add("BouSalem");
            list_ville_arr.add("Ghardimaou");
            list_ville_arr.add("Tabarka");
            list_ville_arr.add("AïnDraham");
            list_ville_arr.add("Fernana");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // ***************************************************************

        switch (gov2.getSelectedIndex()) {
            case 7 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Kairouan");
            list_ville_arr.add("Oueslatia");
            list_ville_arr.add("Sbikha");
            list_ville_arr.add("Haffouz");
            list_ville_arr.add("BouHajla");
            list_ville_arr.add("ElAlâa");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // ***************************************************************

        switch (gov2.getSelectedIndex()) {
            case 8 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Kasserine");
            list_ville_arr.add("Fériana");
            list_ville_arr.add("Sbeïtla");
            list_ville_arr.add("Thala");
            list_ville_arr.add("Haïdra");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // ***************************************************************

        switch (gov2.getSelectedIndex()) {
            case 9 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Douz");
            list_ville_arr.add("Kébili");
            list_ville_arr.add("Jemna");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // ***************************************************************

        switch (gov2.getSelectedIndex()) {
            case 10 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("DouarHicher");
            list_ville_arr.add("OuedEllil");
            list_ville_arr.add("LaManouba");
            list_ville_arr.add("Djedeida");
            list_ville_arr.add("DenDen");
            list_ville_arr.add("Tebourba");
            list_ville_arr.add("Mornaguia");
            list_ville_arr.add("BorjElAmri");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }

        // ********************* Le Kef******************

        switch (gov2.getSelectedIndex()) {
            case 11 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("LeKef");
            list_ville_arr.add("Tajerouine");
            list_ville_arr.add("Dahmani");
            list_ville_arr.add("Sers");
            list_ville_arr.add("Jérissa");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }

        // ***********************************Mahdia******************

        switch (gov2.getSelectedIndex()) {
            case 12 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Mahdia");
            list_ville_arr.add("KsourEssef");
            list_ville_arr.add("Chebba");
            list_ville_arr.add("ElJem");
            list_ville_arr.add("Rejiche");
            list_ville_arr.add("Essouassi");
            list_ville_arr.add("BouMerdes");
            list_ville_arr.add("Hebira");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // ******************************medenine*****************************

        switch (gov2.getSelectedIndex()) {
            case 13 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Zarzis");
            list_ville_arr.add("Djerba");
            list_ville_arr.add("Médenine");
            list_ville_arr.add("BenGardane");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }

        // ******************************Monastir*****************************

        switch (gov2.getSelectedIndex()) {
            case 14 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Monastir");
            list_ville_arr.add("Moknine");
            list_ville_arr.add("Jemmal");
            list_ville_arr.add("KsarHellal");
            list_ville_arr.add("Sahline");
            list_ville_arr.add("MenzelKamel");
            list_ville_arr.add("Sayada");
            list_ville_arr.add("Bembla");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;

        }

        //****************************Nabeul****************************

        switch (gov2.getSelectedIndex()) {
            case 15 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Hammamet");
            list_ville_arr.add("Nabeul");
            list_ville_arr.add("Kélibia");
            list_ville_arr.add("DarChaâbane");
            list_ville_arr.add("Korba");
            list_ville_arr.add("MenzelTemime");
            list_ville_arr.add("Soliman");
            list_ville_arr.add("Grombalia");
            list_ville_arr.add("MenzelBouzelfa");
            list_ville_arr.add("BouArgoub");
            list_ville_arr.add("Korbous");
            list_ville_arr.add("Tazarka");
            list_ville_arr.add("ElMaâmoura");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;

        }              // ***********************Sfax******************************

        switch (gov2.getSelectedIndex()) {
            case 16 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Sfax");
            list_ville_arr.add("SakietEzzit");
            list_ville_arr.add("Gremda");
            list_ville_arr.add("Skhira");
            list_ville_arr.add("Jebiniana");
            list_ville_arr.add("Agarebe");
            list_ville_arr.add("Kerkennah");
            list_ville_arr.add("Mahrès");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // *********************sidi bouzid**************************

        switch (gov2.getSelectedIndex()) {
            case 17 :
            list_ville_arr.clear();

            ville2.removeAllItems();

            list_ville_arr.add("SidiBouzid");
            list_ville_arr.add("Meknassy");
            list_ville_arr.add("Regueb");
            list_ville_arr.add("Mezzouna");
            list_ville_arr.add("SidiAliBenAoun");
            list_ville_arr.add("BirElHafey");
            list_ville_arr.add("Jilma");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }

        // **************************Siliana****************************

        switch (gov2.getSelectedIndex()) {
            case 18 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Siliana");
            list_ville_arr.add("Makthar");
            list_ville_arr.add("Gaâfour");
            list_ville_arr.add("Bargou");
            list_ville_arr.add("Rouhia");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // **************************Sousse********************************

        switch (gov2.getSelectedIndex()) {
            case 19 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Sousse");
            list_ville_arr.add("M'saken");
            list_ville_arr.add("Akouda");
            list_ville_arr.add("Ezzouhour");
            list_ville_arr.add("Enfida");
            list_ville_arr.add("Bouficha");
            list_ville_arr.add("Hergla");
            list_ville_arr.add("Messaadine");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // *******************************tatouine***************************

        switch (gov2.getSelectedIndex()) {
            case 20 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Tataouine");
            list_ville_arr.add("Ghomrassen");
            list_ville_arr.add("Remada");
            list_ville_arr.add("Dehiba");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }

            break;
        }
        // ***************************Tozeur***************************

        switch (gov2.getSelectedIndex()) {
            case 21 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Tozeur");
            list_ville_arr.add("Nefta");
            list_ville_arr.add("Degache");
            list_ville_arr.add("ElHammaduJérid");
            list_ville_arr.add("Tamerza");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // *****************************Tunis**************************

        switch (gov2.getSelectedIndex()) {
            case 22 :
            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("Tunis");
            list_ville_arr.add("SidiHassine");
            list_ville_arr.add("LaMarsa");
            list_ville_arr.add("LeBardo");
            list_ville_arr.add("LeKram");
            list_ville_arr.add("LaGoulette");
            list_ville_arr.add("Carthage");
            list_ville_arr.add("SidiBouSaïd");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }
        // **************************Zaghouane****************************

        switch (gov2.getSelectedIndex()) {
            case 23 :

            list_ville_arr.clear();
            ville2.removeAllItems();

            list_ville_arr.add("ElFahs");
            list_ville_arr.add("Zaghouan");
            list_ville_arr.add("Zriba");
            list_ville_arr.add("BirMcherga");
            list_ville_arr.add("Nadhour");

            int blasa =0;
            for (int i = 0 ; i < list_ville_arr.size(); i++) {
                ville2.insertItemAt(list_ville_arr.get(i),blasa);
                blasa++;
            }
            break;
        }

        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_gov2ActionPerformed

    private void button_securiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_securiteActionPerformed
list_Emails= (ArrayList<String>) trajetDAO.DisplayAllEmails(ville2.getSelectedItem().toString(),jourCombo.getSelectedItem()+"/" +moisCombo.getSelectedItem()+"/"+anneeCombo.getSelectedItem());
     
 
   for(int i =0 ; i<list_Emails.size(); i++) {
  
    gmail.subject = "Equipe Administration Covoiturage--Prevention";
    gmail.contenu=e_mail_condition_securite;    
   gmail.adresse_destination=list_Emails.get(i);
   
   gmail.sendMail();
   }    
       
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_button_securiteActionPerformed

    private void embouteillage_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_embouteillage_mailActionPerformed
       
   list_Emails= (ArrayList<String>) trajetDAO.DisplayAllEmails(ville2.getSelectedItem().toString(),jourCombo.getSelectedItem()+"/" +moisCombo.getSelectedItem()+"/"+anneeCombo.getSelectedItem());
     
 
   for(int i =0 ; i<list_Emails.size(); i++) {
  
    gmail.subject = "Equipe Administration Covoiturage--Prevention";
    gmail.contenu=e_mail_condition_embouteillage;    
    gmail.adresse_destination=list_Emails.get(i);
   
   gmail.sendMail();
   }    
       
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_embouteillage_mailActionPerformed

    private void all_trajetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_trajetsActionPerformed

    jTable1.setModel(new TrajetModel());

    // cacher les champs inutiles 
    jTable1.getColumnModel().getColumn(14).setMinWidth(0);
           jTable1.getColumnModel().getColumn(14).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(14).setWidth(0);
jTable1.getColumnModel().getColumn(4).setMinWidth(0);
           jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(4).setWidth(0);
jTable1.getColumnModel().getColumn(5).setMinWidth(0);
           jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(5).setWidth(0);
jTable1.getColumnModel().getColumn(6).setMinWidth(0);
           jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(6).setWidth(0);
jTable1.getColumnModel().getColumn(7).setMinWidth(0);
           jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(7).setWidth(0);
jTable1.getColumnModel().getColumn(8).setMinWidth(0);
           jTable1.getColumnModel().getColumn(8).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(8).setWidth(0);
jTable1.getColumnModel().getColumn(9).setMinWidth(0);
           jTable1.getColumnModel().getColumn(9).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(9).setWidth(0);
    
    // TODO add your handling code here:
    }//GEN-LAST:event_all_trajetsActionPerformed

   
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
            java.util.logging.Logger.getLogger(Acceuil_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil_admin().setVisible(true);
                panel_general.setVisible(false);
                Main_panel.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Climat;
    private javax.swing.JPanel DemandeurPanel;
    private static javax.swing.JPanel Main_panel;
    private javax.swing.JPanel accusePanel;
    private javax.swing.JTable adhrentTable;
    private javax.swing.JButton all_trajets;
    private javax.swing.JComboBox anneeCombo;
    private javax.swing.JButton button_securite;
    private javax.swing.JButton consulter_DetailsBtn;
    private javax.swing.JPanel contexterecPanel;
    private javax.swing.JButton dcnxBtn;
    private javax.swing.JButton embouteillage_mail;
    private javax.swing.JComboBox gov2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox jourCombo;
    private javax.swing.JPanel leftSplitFAQ;
    private javax.swing.JPanel leftSplitPanel;
    private javax.swing.JTextField loginText;
    private javax.swing.JLabel login_label;
    private javax.swing.JTextField mailText;
    private javax.swing.JLabel mail_Label;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JComboBox moisCombo;
    private javax.swing.JTextField nomCompletText;
    private javax.swing.JLabel nomCompletlabel;
    private javax.swing.JPanel panelAdherent;
    private javax.swing.JPanel panelFAQ;
    private javax.swing.JPanel panelProfil;
    private javax.swing.JPanel panelRapport;
    private javax.swing.JPanel panelReclamations;
    private javax.swing.JPanel panelStatistique;
    private static javax.swing.JPanel panel_general;
    private javax.swing.JLabel passwdLabel;
    private javax.swing.JPasswordField passwdText;
    private javax.swing.JButton rafraichir;
    private javax.swing.JPanel reclamation_tab_panel;
    private javax.swing.JPanel rightSplitFAQ;
    private javax.swing.JPanel rightSplitPanel;
    private javax.swing.JButton searchFAQBtn;
    private javax.swing.JButton serachBtn;
    private javax.swing.JTextField serachText;
    private javax.swing.JTextField serachTextFAQ;
    private javax.swing.JPanel suggestion_tabPanel;
    private javax.swing.JButton supprimer_detailsBtn;
    private javax.swing.JTabbedPane tabDetailsReclamation;
    private javax.swing.JTabbedPane tab_general;
    private javax.swing.JTabbedPane tab_reclamation;
    private javax.swing.JTable tableau_FAQ;
    private javax.swing.JComboBox triComboFAQ;
    private javax.swing.JComboBox triCombox;
    private javax.swing.JComboBox ville2;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JMenu view;
    private  javax.swing.JMenu help;
}
