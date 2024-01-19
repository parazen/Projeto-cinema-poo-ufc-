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
import javax.swing.JTextField;
import model.AgendarModel;

/**
 *
 * @author Particular
 */
public class BuscarAgendamentoView extends javax.swing.JFrame {

    /**
     * Creates new form BuscarAgendamentoView
     */
    public BuscarAgendamentoView() {
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
        BBucarAgen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFindAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar Agendameto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        BBucarAgen.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        BBucarAgen.setText("Buscar");
        BBucarAgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBucarAgenActionPerformed(evt);
            }
        });
        getContentPane().add(BBucarAgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 110, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id do Agendamento:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        getContentPane().add(txtFindAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balde-de-pipoca-no-cinema_23-2147698965.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -240, 630, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBucarAgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBucarAgenActionPerformed
        
        int idAgen = Integer.parseInt(txtFindAge.getText());
        AgendarModel findAgen = new AgendarModel(idAgen);
        
        try {
            
            Connection conexao = new Conexao().getConnection();
            AgendarDAO agendarDao = new AgendarDAO(conexao);
            AgendarModel agendaSelecionada = agendarDao.find(findAgen);
            System.out.println("Data: "+agendaSelecionada.getData()+" Cliente ID: "+agendaSelecionada.getIdCliente());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BuscarAgendamentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_BBucarAgenActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarAgendamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarAgendamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarAgendamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAgendamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarAgendamentoView().setVisible(true);
            }
        });
    }

    public JTextField getTxtFindAge() {
        return txtFindAge;
    }

    public void setTxtFindAge(JTextField txtFindAge) {
        this.txtFindAge = txtFindAge;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBucarAgen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtFindAge;
    // End of variables declaration//GEN-END:variables
}