/*
 * SplitButtonDemo.java
 *
 * Created on Nov 12, 2010, 7:06:28 PM
 */
package org.gpl.demo;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Naveed Quadri
 */
public class SplitButtonDemo extends javax.swing.JFrame {

    private ButtonGroup bg;

    /** Creates new form SplitButtonDemo */
    public SplitButtonDemo() {
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSplitButton1 = new org.gpl.JSplitButton.JSplitButton();

        jMenuItem1.setText("Always drop down");
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Menu Item 1");
        jPopupMenu2.add(jMenuItem2);

        jMenuItem3.setText("Menu Item 2");
        jPopupMenu2.add(jMenuItem3);

        jMenuItem4.setText("Menu Item 3");
        jPopupMenu2.add(jMenuItem4);

        jMenuItem5.setText("Menu Item 4");
        jPopupMenu2.add(jMenuItem5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitButton1.setPopupMenu(jPopupMenu2);
        jSplitButton1.setText("jSplitButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jSplitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSplitButton1ButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSplitButton1ButtonClicked
        JOptionPane.showMessageDialog(rootPane, "I have no popup attached");        // TODO add your handling code here:
    }//GEN-LAST:event_jSplitButton1ButtonClicked

    private void jSplitButton2ButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSplitButton2ButtonClicked
        // JOptionPane.showMessageDialog(rootPane, "I will show you popup, no matter where u click.");
    }//GEN-LAST:event_jSplitButton2ButtonClicked

    private void jSplitButton2SplitButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSplitButton2SplitButtonClicked
        JOptionPane.showMessageDialog(rootPane, "I will never be caught");        // TODO add your handling code here:
    }//GEN-LAST:event_jSplitButton2SplitButtonClicked

    private void jSplitButton3ButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSplitButton3ButtonClicked
 JOptionPane.showMessageDialog(rootPane, "click on the split part to see the popup");        // TODO add your handling code here:
    }//GEN-LAST:event_jSplitButton3ButtonClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SplitButtonDemo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private org.gpl.JSplitButton.JSplitButton jSplitButton1;
    // End of variables declaration//GEN-END:variables

}