/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class belahKetupatLatihanSoal6 extends javax.swing.JPanel {

    /**
     * Creates new form belahKetupatLatihanSoal6
     */
    String cek;
    
    public belahKetupatLatihanSoal6() {
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

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 64, 105));
        setLayout(null);
        add(jTextField1);
        jTextField1.setBounds(750, 100, 210, 40);

        jButton1.setText("CEK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(820, 160, 77, 30);

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(750, 270, 210, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/LATIHAN SOAL 6.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 350);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/jawaban.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(680, 0, 350, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cek = jTextField1.getText();
        
        if(cek.equals("42")){
            jTextField2.setText("Jawaban Benar : 42 cm");
        } else {
            JOptionPane.showMessageDialog(this, "Jawabanmu belum tepat!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
