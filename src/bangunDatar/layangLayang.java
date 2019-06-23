/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ui.app.pbo.TampilanUtama;
import ui.app.pbo.bangunDatarClass;
import ui.app.pbo.bangunRuangClass;

/**
 *
 * @author Asus
 */
public class layangLayang extends javax.swing.JFrame {

    /**
     * Creates new form layangLayang
     */
    layanglayangKeliling kel;
    layanglayangKelilingGambar gbr1;
    layanglayangLuas luas;
    layanglayangLuasGambar gbr2;
    layanglayangDiagonal diagon;
    layanglayangDiagonalGambar gbr3;
    layanglayangLatsol1 lat1;
    layanglayangLatsol2 lat2;
    layanglayangLatsol3 lat3;
    layanglayangLatsol4 lat4;
    layanglayangLatsol5 lat5;
    layanglayangLatsol6 lat6;
    
    public layangLayang() {
        initComponents();
        kel = new layanglayangKeliling();
        gbr1 = new layanglayangKelilingGambar();
        luas = new layanglayangLuas();
        gbr2 = new layanglayangLuasGambar();
        diagon = new layanglayangDiagonal();
        gbr3 = new layanglayangDiagonalGambar();
        lat1 = new layanglayangLatsol1();
        lat2 = new layanglayangLatsol2();
        lat3 = new layanglayangLatsol3();
        lat4 = new layanglayangLatsol4();
        lat5 = new layanglayangLatsol5();
        lat6 = new layanglayangLatsol6();
        
        panelGambar.add(gbr1);
        panelGambar.add(gbr2);
        panelGambar.add(gbr3);
        
        panelUtama.add(kel);
        panelUtama.add(luas);
        panelUtama.add(diagon);
        panelUtama.add(lat1);
        panelUtama.add(lat2);
        panelUtama.add(lat3);
        panelUtama.add(lat4);
        panelUtama.add(lat5);
        panelUtama.add(lat6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGambar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelUtama = new javax.swing.JPanel();
        buttonLatsol1 = new javax.swing.JLabel();
        buttonLatsol2 = new javax.swing.JLabel();
        buttonLatsol3 = new javax.swing.JLabel();
        buttonLatsol4 = new javax.swing.JLabel();
        buttonLatsol5 = new javax.swing.JLabel();
        buttonLatsol6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1304, 816));
        getContentPane().setLayout(null);

        panelGambar.setBackground(new java.awt.Color(8, 80, 116));
        panelGambar.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelGambar);
        panelGambar.setBounds(300, 60, 570, 380);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(820, 60, 470, 170);

        panelUtama.setBackground(new java.awt.Color(24, 64, 105));
        panelUtama.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelUtama);
        panelUtama.setBounds(300, 450, 990, 340);

        buttonLatsol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (7).png"))); // NOI18N
        buttonLatsol1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatsol1MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatsol1);
        buttonLatsol1.setBounds(880, 220, 130, 120);

        buttonLatsol2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (8).png"))); // NOI18N
        buttonLatsol2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatsol2MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatsol2);
        buttonLatsol2.setBounds(1020, 220, 130, 120);

        buttonLatsol3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (9).png"))); // NOI18N
        buttonLatsol3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatsol3MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatsol3);
        buttonLatsol3.setBounds(1160, 220, 130, 120);

        buttonLatsol4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (10).png"))); // NOI18N
        buttonLatsol4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatsol4MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatsol4);
        buttonLatsol4.setBounds(880, 350, 130, 110);

        buttonLatsol5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (11).png"))); // NOI18N
        buttonLatsol5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatsol5MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatsol5);
        buttonLatsol5.setBounds(1020, 350, 130, 110);

        buttonLatsol6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (12).png"))); // NOI18N
        buttonLatsol6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatsol6MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatsol6);
        buttonLatsol6.setBounds(1160, 350, 130, 110);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("O");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/home icon kecil.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1171, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel15)))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1310, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/layang/Keliling Layang-Layang.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 60, 240, 240);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/layang/Luas Layang-Layang.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 310, 240, 240);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarTrapesium/Diagonal Trapesium.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 560, 240, 247);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/abstract-blue-geometric-shapes-background-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-220, 0, 1530, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        TampilanUtama utama = new TampilanUtama();
        new TampilanUtama().setVisible(true);
        utama.pack();
        utama.setLocationRelativeTo(null);
        utama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        bangunDatarClass Datar = new bangunDatarClass();
        new bangunDatarClass().setVisible(true);
        Datar.pack();
        Datar.setLocationRelativeTo(null);
        Datar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int pilih = JOptionPane.showConfirmDialog(null, "Selesai Belajar?", "AMOBA", JOptionPane.YES_NO_OPTION);
        
        if(pilih == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        kel.setVisible(true);
        gbr1.setVisible(true);
        luas.setVisible(false);
        gbr2.setVisible(false);
        diagon.setVisible(false);
        gbr3.setVisible(false);
        lat1.setVisible(false);
        lat2.setVisible(false);
        lat3.setVisible(false);
        lat4.setVisible(false);
        lat5.setVisible(false);
        lat6.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        kel.setVisible(false);
        gbr1.setVisible(false);
        luas.setVisible(true);
        gbr2.setVisible(true);
        diagon.setVisible(false);
        gbr3.setVisible(false);
        lat1.setVisible(false);
        lat2.setVisible(false);
        lat3.setVisible(false);
        lat4.setVisible(false);
        lat5.setVisible(false);
        lat6.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        kel.setVisible(false);
        gbr1.setVisible(false);
        luas.setVisible(false);
        gbr2.setVisible(false);
        diagon.setVisible(true);
        gbr3.setVisible(true);
        lat1.setVisible(false);
        lat2.setVisible(false);
        lat3.setVisible(false);
        lat4.setVisible(false);
        lat5.setVisible(false);
        lat6.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void buttonLatsol1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatsol1MouseClicked
        // TODO add your handling code here:
        kel.setVisible(false);
        gbr1.setVisible(false);
        luas.setVisible(false);
        gbr2.setVisible(true);
        diagon.setVisible(false);
        gbr3.setVisible(false);
        lat1.setVisible(true);
        lat2.setVisible(false);
        lat3.setVisible(false);
        lat4.setVisible(false);
        lat5.setVisible(false);
        lat6.setVisible(false);
    }//GEN-LAST:event_buttonLatsol1MouseClicked

    private void buttonLatsol2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatsol2MouseClicked
        // TODO add your handling code here:
        kel.setVisible(false);
        gbr1.setVisible(true);
        luas.setVisible(false);
        gbr2.setVisible(false);
        diagon.setVisible(false);
        gbr3.setVisible(false);
        lat1.setVisible(false);
        lat2.setVisible(true);
        lat3.setVisible(false);
        lat4.setVisible(false);
        lat5.setVisible(false);
        lat6.setVisible(false);
    }//GEN-LAST:event_buttonLatsol2MouseClicked

    private void buttonLatsol3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatsol3MouseClicked
        // TODO add your handling code here:
        kel.setVisible(false);
        gbr1.setVisible(false);
        luas.setVisible(false);
        gbr2.setVisible(false);
        diagon.setVisible(false);
        gbr3.setVisible(true);
        lat1.setVisible(false);
        lat2.setVisible(false);
        lat3.setVisible(true);
        lat4.setVisible(false);
        lat5.setVisible(false);
        lat6.setVisible(false);
    }//GEN-LAST:event_buttonLatsol3MouseClicked

    private void buttonLatsol4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatsol4MouseClicked
        // TODO add your handling code here:
        kel.setVisible(false);
        gbr1.setVisible(false);
        luas.setVisible(false);
        gbr2.setVisible(false);
        diagon.setVisible(false);
        gbr3.setVisible(true);
        lat1.setVisible(false);
        lat2.setVisible(false);
        lat3.setVisible(false);
        lat4.setVisible(true);
        lat5.setVisible(false);
        lat6.setVisible(false);
    }//GEN-LAST:event_buttonLatsol4MouseClicked

    private void buttonLatsol5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatsol5MouseClicked
        // TODO add your handling code here:
        kel.setVisible(false);
        gbr1.setVisible(false);
        luas.setVisible(false);
        gbr2.setVisible(false);
        diagon.setVisible(false);
        gbr3.setVisible(true);
        lat1.setVisible(false);
        lat2.setVisible(false);
        lat3.setVisible(false);
        lat4.setVisible(false);
        lat5.setVisible(true);
        lat6.setVisible(false);
    }//GEN-LAST:event_buttonLatsol5MouseClicked

    private void buttonLatsol6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatsol6MouseClicked
        // TODO add your handling code here:
        kel.setVisible(false);
        gbr1.setVisible(false);
        luas.setVisible(false);
        gbr2.setVisible(true);
        diagon.setVisible(false);
        gbr3.setVisible(false);
        lat1.setVisible(false);
        lat2.setVisible(false);
        lat3.setVisible(false);
        lat4.setVisible(false);
        lat5.setVisible(false);
        lat6.setVisible(true);
    }//GEN-LAST:event_buttonLatsol6MouseClicked

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
            java.util.logging.Logger.getLogger(layangLayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layangLayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layangLayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layangLayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layangLayang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buttonLatsol1;
    private javax.swing.JLabel buttonLatsol2;
    private javax.swing.JLabel buttonLatsol3;
    private javax.swing.JLabel buttonLatsol4;
    private javax.swing.JLabel buttonLatsol5;
    private javax.swing.JLabel buttonLatsol6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelGambar;
    private javax.swing.JPanel panelUtama;
    // End of variables declaration//GEN-END:variables
}
