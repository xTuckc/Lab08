/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectcontract;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tuckw
 */
public class AddContract extends javax.swing.JDialog {

    /**
     * Creates new form AddContract
     *
     * @param f
     * @param m
     * @param theContract
     */
    public AddContract(JFrame f, boolean m, Contract theContract) {
        super(f, m);
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextContractID = new javax.swing.JTextField();
        jTextOrigin = new javax.swing.JTextField();
        jTextDestination = new javax.swing.JTextField();
        jTextOrderItem = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setText("Origin");

        jLabel5.setText("Destination");

        jLabel6.setText("Order");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("You are adding a contract. Please enter the following information");

        jLabel3.setText("ContractID");

        jTextContractID.setToolTipText("Must be in the format \"1ABC\"");
        jTextContractID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContractIDActionPerformed(evt);
            }
        });

        jTextOrigin.setToolTipText("<html>Valid origin cities are: Victoria, Vancouer, Seattle, Nanaimo or Prince George.<br/>Cannot be the same as destination city.</html>");

        jTextDestination.setToolTipText("<html>Valid destination cities are: Victoria, Vancouer, Seattle, Nanaimo or Prince George.<br/>Cannot be the same as origin city.</html>");
        jTextDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDestinationActionPerformed(evt);
            }
        });

        jTextOrderItem.setToolTipText("Order Item cannot be all numbers and must contain no commas");

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextContractID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jTextDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jTextOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancel)
                        .addGap(70, 70, 70)))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextContractID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jTextDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonReset))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        String contractID = jTextContractID.getText().toUpperCase();
        // contractID = contractID.toUpperCase();
        String origin = jTextOrigin.getText();
        String destination = jTextDestination.getText();
        String order = jTextOrderItem.getText();
        String printout = contractID + "," + origin + "," + destination + "," + order;
        JFrame frame = new JFrame();

        if (!contractID.isEmpty() && contractID.matches("^[0-9][a-zA-Z]{3}$")) {
            if (!origin.isEmpty() && origin.matches("Victoria") || origin.matches("Vancouver") || origin.matches("Seattle") || origin.matches("Nanaimo") || origin.matches("Prince George")) {
                if (!destination.isEmpty() && destination.matches("Victoria") || destination.matches("Vancouver") || destination.matches("Seattle") || destination.matches("Nanaimo") || destination.matches("Prince George")) {
                    if ((!origin.equals(destination))) {
                        if (!order.isEmpty() && order.matches("^[a-zA-Z0-9]*$") && (!order.matches("[0-9]*")) && (order.matches("^[^,]+"))) {
                            try {
                                ContractOracle.saveContract(new Contract(jTextContractID.getText(), jTextOrigin.getText(), jTextDestination.getText(), jTextOrderItem.getText()));
                            } catch (SQLException s) {
                                System.out.println(s.getMessage());
                            }
                            JOptionPane.showMessageDialog(frame, "Your order of: " + order + ", from " + origin + " to " + destination + " has been successfully been placed.\nYour Contract ID is: " + contractID);
                            jTextContractID.setText("");
                            jTextOrigin.setText("");
                            jTextDestination.setText("");
                            jTextOrderItem.setText("");
                        } else {
                            JOptionPane.showMessageDialog(frame, "Invalid Order item");
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Origin cannot match destination");
                    }
                } else {
                    if (origin.equals(destination)) {
                        JOptionPane.showMessageDialog(frame, "Invalid Destination entry");
                    } else if (!(destination.matches("Victoria") || destination.matches("Vancouver") || destination.matches("Seattle") || destination.matches("Nanaimo") || destination.matches("Prince George"))) {
                        JOptionPane.showMessageDialog(frame, "Invalid Destination entry");
                    }
                }
            } else {
                if (origin.equals(destination)) {
                    JOptionPane.showMessageDialog(frame, "Origin cannot match destination");
                } else if (!(origin.matches("Victoria") || origin.matches("Vancouver") || origin.matches("Seattle") || origin.matches("Nanaimo") || origin.matches("Prince George"))) {
                    JOptionPane.showMessageDialog(frame, "Invalid Origin entry");
                }
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid ContractID entry");
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextContractIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContractIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextContractIDActionPerformed

    private void jTextDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDestinationActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jTextContractID.setText("");
        jTextOrigin.setText("");
        jTextDestination.setText("");
        jTextOrderItem.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextContractID;
    private javax.swing.JTextField jTextDestination;
    private javax.swing.JTextField jTextOrderItem;
    private javax.swing.JTextField jTextOrigin;
    // End of variables declaration//GEN-END:variables
}
