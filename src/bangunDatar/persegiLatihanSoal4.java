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
public class persegiLatihanSoal4 extends javax.swing.JPanel implements interfaceBangunDatar {

    /**
     * Creates new form persegiLatihanSoal4
     */
    public persegiLatihanSoal4() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 64, 105));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("Hitung diagonal persegi tersebut jika");
        add(jLabel6);
        jLabel6.setBounds(120, 60, 800, 50);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 255));
        jLabel5.setText("diketahui luasnya adalah 81 cm");
        add(jLabel5);
        jLabel5.setBounds(120, 100, 390, 50);

        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("2");
        add(jLabel8);
        jLabel8.setBounds(390, 100, 140, 24);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/persegi/soal gambar kososng diagonal.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 40, 150, 130);

        add(jPanel1);
        jPanel1.setBounds(640, 60, 220, 210);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setText("Jawabanmu : ");
        add(jLabel9);
        jLabel9.setBounds(150, 200, 140, 24);

        jButton1.setText("Cek");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(190, 240, 52, 32);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(280, 240, 170, 40);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(280, 190, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/persegi/soal.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-1, -1, 1000, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jawaban();
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void jawaban() {
        String jawaban = jTextField1.getText();

        if(jawaban.equals("9√2")){
            jTextField2.setText("Jawaban Benar : 9√2 cm");
        }else if(jawaban.equals("9 akar 2 cm")){
            jTextField2.setText("Jawaban Benar : 9√2 cm");
        } else {
            JOptionPane.showMessageDialog(this, "Jawabanmu belum tepat!");
        }
    }
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
