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
public class lingkaranLatihanSoal1 extends javax.swing.JPanel implements interfaceBangunDatar {

    /**
     * Creates new form lingkaranLatihanSoal1
     */
    public lingkaranLatihanSoal1() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("14 cm");
        add(jLabel2);
        jLabel2.setBounds(840, 150, 41, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lingkaran/soal gambar kososng2.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(680, 40, 250, 270);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 255));
        jLabel7.setText("Diketahui lingkaran dengan jari jari 14 cm");
        add(jLabel7);
        jLabel7.setBounds(30, 30, 510, 50);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("Hitungkah luasnya!");
        add(jLabel8);
        jLabel8.setBounds(30, 80, 510, 50);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setText("Jawabanmu : ");
        add(jLabel9);
        jLabel9.setBounds(30, 200, 140, 24);

        jButton1.setText("Cek");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(70, 240, 51, 23);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(170, 250, 170, 40);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(170, 200, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lingkaran/soal.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 990, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jawaban();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void jawaban() {
        String jawaban = jTextField1.getText();
        
        if(jawaban.equals("616")){
            jTextField2.setText("Jawaban Benar : 616 cm2");}
        else if(jawaban.equals("616 cm2")){
            jTextField2.setText("Jawaban Benar : 616 cm2");}
        else {
            jTextField2.setText("Jawabanmu belum tepat");
        }
    }
}
