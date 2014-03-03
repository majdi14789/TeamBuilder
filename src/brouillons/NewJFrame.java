/*
  private JTabbedPane pane;

    public NewJFrame() {
        //http://www.camick.com/java/source/VerticalLabelUI.java
        VerticalLabelUI ui = new VerticalLabelUI();

        pane = new JTabbedPane();
        pane.setUI(new MyUI());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(pane, BorderLayout.CENTER);
        setSize(400, 300);
        setLocationRelativeTo(null);

        pane.addTab("tab1", new JLabel("Test1"));
        pane.addTab("tab2", new JLabel("Test2"));

        JLabel labelTab = new JLabel("<html><font color=red>Test");
        labelTab.setUI(ui);
        labelTab.setHorizontalAlignment(SwingConstants.LEFT);
        pane.setTabComponentAt(0, labelTab);

        labelTab = new JLabel("<html><font color=red>Test Test");
        labelTab.setUI(ui);
        labelTab.setHorizontalAlignment(SwingConstants.LEFT);
        pane.setTabComponentAt(1, labelTab);
    }
 
 


package Test;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import Test.VerticalLabelUI
public class NewJFrame extends javax.swing.JFrame {
private JTabbedPane pane;
    public NewJFrame() {
         http://www.camick.com/java/source/VerticalLabelUI.java
        VerticalLabelUI ui = new VerticalLabelUI();

        pane = new JTabbedPane();
         pane.setUI(new MyUI());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(pane, BorderLayout.CENTER);
        setSize(400, 300);
        setLocationRelativeTo(null);

        pane.addTab("tab1", new JLabel("Test1"));
        pane.addTab("tab2", new JLabel("Test2"));

        JLabel labelTab = new JLabel("<html><font color=red>Test");
        labelTab.setUI(ui);
        labelTab.setHorizontalAlignment(SwingConstants.LEFT);
        pane.setTabComponentAt(0, labelTab);

        labelTab = new JLabel("<html><font color=red>Test Test");
        labelTab.setUI(ui);
        labelTab.setHorizontalAlignment(SwingConstants.LEFT);
        pane.setTabComponentAt(1, labelTab);
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        
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

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
*/
