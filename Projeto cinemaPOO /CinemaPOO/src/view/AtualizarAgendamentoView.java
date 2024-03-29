/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AgendarDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.AgendarModel;

/**
 *
 * @author Particular
 */
public class AtualizarAgendamentoView extends javax.swing.JFrame {

    /**
     * Creates new form AtualizarAgendamentoView
     */
    public AtualizarAgendamentoView() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BAtuAgen = new javax.swing.JButton();
        txtAttID = new javax.swing.JTextField();
        txtAttData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Atualizar Agendamento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id do Agendamento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nova Data:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        BAtuAgen.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        BAtuAgen.setText("Atualizar");
        BAtuAgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtuAgenActionPerformed(evt);
            }
        });
        getContentPane().add(BAtuAgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, -1));

        txtAttID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtAttID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, -1));
        getContentPane().add(txtAttData, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 170, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/20200928141029447947i.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAttIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAttIDActionPerformed

    private void BAtuAgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtuAgenActionPerformed
        
        int idAgen = Integer.parseInt(txtAttID.getText());
        String data = txtAttData.getText();
        
        AgendarModel updateAgenda = new AgendarModel(idAgen, data);
        
        try {
            
            Connection conexao = new Conexao().getConnection();
            AgendarDAO agendarDao = new AgendarDAO(conexao);
            agendarDao.update(updateAgenda);
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(AtualizarAgendamentoView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BAtuAgenActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarAgendamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarAgendamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarAgendamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarAgendamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarAgendamentoView().setVisible(true);
            }
        });
    }

    public JTextField getTxtAttData() {
        return txtAttData;
    }

    public void setTxtAttData(JTextField txtAttData) {
        this.txtAttData = txtAttData;
    }

    public JTextField getTxtAttID() {
        return txtAttID;
    }

    public void setTxtAttID(JTextField txtAttID) {
        this.txtAttID = txtAttID;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAtuAgen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAttData;
    private javax.swing.JTextField txtAttID;
    // End of variables declaration//GEN-END:variables
}
