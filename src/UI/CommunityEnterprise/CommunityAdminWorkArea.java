/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CommunityEnterprise;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chiragpatil
 */
public class CommunityAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminWorkArea
     */
    private JPanel userProcessContainer;
    private Ecosystem system;
    private Enterprise enterprise;

    public CommunityAdminWorkArea(JPanel userProcessContainer, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageOrganization = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnManageUserAccount = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageOrganization.setBackground(new java.awt.Color(0, 0, 0));
        btnManageOrganization.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        btnManageOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrganization.setText("ORGANIZATION");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });
        add(btnManageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 196, 60));

        btnManageEmployee.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEmployee.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        btnManageEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmployee.setText("EMPLOYEE");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        add(btnManageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 196, 60));

        btnManageUserAccount.setBackground(new java.awt.Color(0, 0, 0));
        btnManageUserAccount.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        btnManageUserAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnManageUserAccount.setText("USER ACCOUNT ");
        btnManageUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserAccountActionPerformed(evt);
            }
        });
        add(btnManageUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 196, 60));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Community Enterprise");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1245, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, -1, -1));

        jLabel2.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 36)); // NOI18N
        jLabel2.setText(" You're logged in as Community Admin");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 127, 746, -1));

        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 306, 373, 339));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccountActionPerformed
        // TODO add your handling code here:
        ManageUserAccount mngUser = new ManageUserAccount(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccount", mngUser);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserAccountActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:
        ManageOrganization mngOrg = new ManageOrganization(userProcessContainer, enterprise.getOrganization_directory());
        userProcessContainer.add("ManageOrganization", mngOrg);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        // TODO add your handling code here:
        ManageEmployee mngEmp = new ManageEmployee(userProcessContainer, enterprise.getOrganization_directory());
        userProcessContainer.add("ManageEmployee", mngEmp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUserAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
