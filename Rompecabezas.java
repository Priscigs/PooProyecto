
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Rompecabezas extends javax.swing.JFrame {

    /**
     * Creates new form Rompecabezas
     */
    public Rompecabezas() {
        initComponents();
        //this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        B9.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno.jpg"))); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1);

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dos.jpg"))); // NOI18N
        B2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2);

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tres.jpg"))); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3);

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuatro.jpg"))); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4);

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinco.jpg"))); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5);

        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seis.jpg"))); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        getContentPane().add(B6);

        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siete.jpg"))); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        getContentPane().add(B7);

        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ocho.jpg"))); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        getContentPane().add(B8);

        B9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nueve.jpg"))); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        getContentPane().add(B9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
    if(B9.isVisible()==false){
        B9.setIcon(B6.getIcon());
        B6.setVisible(false);
        B9.setVisible(true);
    }
    else if(B3.isVisible()==false){
        B3.setIcon(B6.getIcon());
        B6.setVisible(false);
        B3.setVisible(true);
    }
    else if(B5.isVisible()==false){
        B5.setIcon(B6.getIcon());
        B6.setVisible(false);
        B5.setVisible(true);
    }
    }//GEN-LAST:event_B6ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
    if(B6.isVisible()==false){
        B6.setIcon(B9.getIcon());
        B9.setVisible(false);
        B6.setVisible(true);
    }
    else if(B8.isVisible()==false){
        B8.setIcon(B9.getIcon());
        B9.setVisible(false);
        B8.setVisible(true);
    }
    }//GEN-LAST:event_B9ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
    if(B9.isVisible()==false){
        B9.setIcon(B8.getIcon());
        B8.setVisible(false);
        B9.setVisible(true);
    }
    else if(B7.isVisible()==false){
        B7.setIcon(B8.getIcon());
        B8.setVisible(false);
        B7.setVisible(true);
    }
    else if(B5.isVisible()==false){
        B5.setIcon(B8.getIcon());
        B8.setVisible(false);
        B5.setVisible(true);
    }
    }//GEN-LAST:event_B8ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
    if(B8.isVisible()==false){
        B8.setIcon(B7.getIcon());
        B7.setVisible(false);
        B8.setVisible(true);
    }
    if(B4.isVisible()==false){
        B4.setIcon(B7.getIcon());
        B7.setVisible(false);
        B4.setVisible(true);
    }
    }//GEN-LAST:event_B7ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
    if(B2.isVisible()==false){
        B2.setIcon(B1.getIcon());
        B1.setVisible(false);
        B2.setVisible(true);
    }
    else if(B4.isVisible()==false){
        B4.setIcon(B1.getIcon());
        B1.setVisible(false);
        B4.setVisible(true);
    }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
    if(B1.isVisible()==false){
        B1.setIcon(B2.getIcon());
        B2.setVisible(false);
        B1.setVisible(true);
    }
    else if(B3.isVisible()==false){
        B3.setIcon(B2.getIcon());
        B2.setVisible(false);
        B3.setVisible(true);
    }
    else if(B5.isVisible()==false){
        B5.setIcon(B2.getIcon());
        B2.setVisible(false);
        B5.setVisible(true);
    }

    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
     if(B2.isVisible()==false){
        B2.setIcon(B3.getIcon());
        B3.setVisible(false);
        B2.setVisible(true);
    }
     else if(B6.isVisible()==false){
        B6.setIcon(B3.getIcon());
        B3.setVisible(false);
        B6.setVisible(true);
    }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
    if(B1.isVisible()==false){
        B1.setIcon(B4.getIcon());
        B4.setVisible(false);
        B1.setVisible(true);
    }
    else if(B5.isVisible()==false){
        B5.setIcon(B4.getIcon());
        B4.setVisible(false);
        B5.setVisible(true);
    }
    else if(B7.isVisible()==false){
        B7.setIcon(B4.getIcon());
        B4.setVisible(false);
        B7.setVisible(true);
    }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
    if(B2.isVisible()==false){
        B2.setIcon(B5.getIcon());
        B5.setVisible(false);
        B2.setVisible(true);
    }
    else if(B4.isVisible()==false){
        B4.setIcon(B5.getIcon());
        B5.setVisible(false);
        B4.setVisible(true);
    }
    else if(B6.isVisible()==false){
        B6.setIcon(B5.getIcon());
        B5.setVisible(false);
        B6.setVisible(true);
    }
    else if(B8.isVisible()==false){
        B8.setIcon(B5.getIcon());
        B5.setVisible(false);
        B8.setVisible(true);
    }
    }//GEN-LAST:event_B5ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    // End of variables declaration//GEN-END:variables
}