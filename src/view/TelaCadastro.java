/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Component;
import javax.swing.JOptionPane;
import controller.ManipulaDados;

/**
 *
 * @author djairtb
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
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

        pnGravar = new javax.swing.JPanel();
        lbPapel = new javax.swing.JLabel();
        lbVidro = new javax.swing.JLabel();
        lbNaoReciclavel = new javax.swing.JLabel();
        txMetal = new javax.swing.JTextField();
        txPlastico = new javax.swing.JTextField();
        txPapel = new javax.swing.JTextField();
        txVidro = new javax.swing.JTextField();
        lbMetal = new javax.swing.JLabel();
        txNaoReciclavel = new javax.swing.JTextField();
        lbPlastico = new javax.swing.JLabel();
        btGravar = new javax.swing.JButton();
        cbEstado = new javax.swing.JComboBox();
        lbCadastrarNovoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnGravar.setBorder(javax.swing.BorderFactory.createTitledBorder("Gravar"));

        lbPapel.setText("Papel:");

        lbVidro.setText("Vidro:");

        lbNaoReciclavel.setText("Não Reciclável:");

        txMetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMetalActionPerformed(evt);
            }
        });

        txPlastico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPlasticoActionPerformed(evt);
            }
        });

        txPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPapelActionPerformed(evt);
            }
        });

        txVidro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txVidroActionPerformed(evt);
            }
        });

        lbMetal.setText("Metal:");

        txNaoReciclavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNaoReciclavelActionPerformed(evt);
            }
        });

        lbPlastico.setText("Plástico:");

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "BA", "MG" }));
        cbEstado.setAutoscrolls(true);

        javax.swing.GroupLayout pnGravarLayout = new javax.swing.GroupLayout(pnGravar);
        pnGravar.setLayout(pnGravarLayout);
        pnGravarLayout.setHorizontalGroup(
            pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGravarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPapel)
                    .addComponent(lbPlastico)
                    .addComponent(lbMetal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txMetal)
                    .addComponent(txPlastico)
                    .addComponent(txPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGravarLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btGravar))
                    .addGroup(pnGravarLayout.createSequentialGroup()
                        .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNaoReciclavel)
                            .addComponent(lbVidro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txVidro)
                            .addComponent(txNaoReciclavel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGravarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnGravarLayout.setVerticalGroup(
            pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGravarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMetal)
                    .addComponent(lbVidro)
                    .addComponent(txMetal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txVidro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlastico)
                    .addComponent(lbNaoReciclavel)
                    .addComponent(txPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNaoReciclavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPapel)
                    .addComponent(txPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGravar))
                .addContainerGap())
        );

        lbCadastrarNovoRegistro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCadastrarNovoRegistro.setText("CADASTRAR NOVO REGISTRO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lbCadastrarNovoRegistro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(pnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lbCadastrarNovoRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txMetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMetalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMetalActionPerformed

    private void txPlasticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPlasticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPlasticoActionPerformed

    private void txPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPapelActionPerformed

    private void txVidroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txVidroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txVidroActionPerformed

    private void txNaoReciclavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNaoReciclavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNaoReciclavelActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        boolean erro = false;
        try{
            double metal = Double.parseDouble(txMetal.getText());
            double plastico = Double.parseDouble(txPlastico.getText());
            double vidro = Double.parseDouble(txVidro.getText());
            double papel = Double.parseDouble(txPapel.getText());
            double naoReciclavel =Double.parseDouble(txNaoReciclavel.getText());
            String estado = String.valueOf(cbEstado.getSelectedItem());
            ManipulaDados.novoRegistro(metal, vidro, plastico, papel, naoReciclavel, estado);
        }catch(java.lang.NumberFormatException t){
            Component view = null;
            JOptionPane.showMessageDialog(view, "Insira valores válidos!");
            erro = true;
        }
        if (erro != true){
            Component view = null;
            JOptionPane.showMessageDialog(view, "Valores Cadastrados com Sucesso!");
            dispose();
        }
    }//GEN-LAST:event_btGravarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGravar;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JLabel lbCadastrarNovoRegistro;
    private javax.swing.JLabel lbMetal;
    private javax.swing.JLabel lbNaoReciclavel;
    private javax.swing.JLabel lbPapel;
    private javax.swing.JLabel lbPlastico;
    private javax.swing.JLabel lbVidro;
    private javax.swing.JPanel pnGravar;
    private javax.swing.JTextField txMetal;
    private javax.swing.JTextField txNaoReciclavel;
    private javax.swing.JTextField txPapel;
    private javax.swing.JTextField txPlastico;
    private javax.swing.JTextField txVidro;
    // End of variables declaration//GEN-END:variables
}
