/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CommunityEnterprise;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.EventMakerOrganization;
import Business.Organization.Organization;
import Business.Organization.VictimOrganization;
import Business.Organization.VolunteerOrganization;
import Business.Role.EventMakerAdminRole;
import Business.Role.Role;
import Business.Role.VictimAdminRole;
import Business.Role.VolunteerAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chiragpatil
 */
public class ManageUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccount
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public ManageUserAccount(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        displayCombo();
        selectCombo();

    }

    //populate respective employees
    public void populateComboEmployee(Organization organization) {
        comboEmp.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmplist()) {
            comboEmp.addItem(employee);
        }
    }

    public void displayCombo() {
        comboOrg.removeAllItems();

        for (Organization organization : enterprise.getOrganization_directory().getOrganizationList()) {
            comboOrg.addItem(organization);
        }
    }

    public void selectCombo() {

        DefaultTableModel model = (DefaultTableModel) tblUser.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganization_directory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tblUser.getModel()).addRow(row);
            }
        }
    }

    //populate respective roles
    private void populateComboRole(Enterprise e) {
        comboRole.removeAllItems();
        Organization organization = (Organization) comboOrg.getSelectedItem();
        if (organization instanceof EventMakerOrganization) {
            comboRole.addItem(new EventMakerAdminRole());
        } else if (organization instanceof VictimOrganization) {
            comboRole.addItem(new VictimAdminRole());
        } else if (organization instanceof VolunteerOrganization) {
            comboRole.addItem(new VolunteerAdminRole());
        }

    }
    //populate username and roles in table

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnAddUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboOrg = new javax.swing.JComboBox();
        pword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboEmp = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Manage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N
        jPanel4.setOpaque(false);

        btnAddUser.setBackground(new java.awt.Color(102, 102, 102));
        btnAddUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Username");

        uname.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        uname.setForeground(new java.awt.Color(153, 0, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Organization");

        comboOrg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        comboOrg.setForeground(new java.awt.Color(153, 0, 153));
        comboOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrgActionPerformed(evt);
            }
        });

        pword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pword.setForeground(new java.awt.Color(153, 0, 153));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPassword.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Employee");

        comboEmp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        comboEmp.setForeground(new java.awt.Color(153, 0, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Role");

        comboRole.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        comboRole.setForeground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboOrg, 0, 250, Short.MAX_VALUE)
                            .addComponent(comboEmp, 0, 250, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(53, 53, 53))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 209, -1, -1));

        tblUser.setBackground(new java.awt.Color(204, 204, 204));
        tblUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUser.setOpaque(false);
        jScrollPane1.setViewportView(tblUser);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 209, 497, 439));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage User Account");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 6, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/ezgif.com-gif-maker-3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 17, -1, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
        if (uname.getText().isEmpty() || pword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "FIELD CANNOT BE EMPTY");
        } else {
            String userName = uname.getText();
            String password = pword.getText();
            if (Ecosystem.checkIfUsernameIsUnique(userName)) {
                Organization organization = (Organization) comboOrg.getSelectedItem();
                Employee employee = (Employee) comboEmp.getSelectedItem();
                Role role = (Role) comboRole.getSelectedItem();

                organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                displayCombo();
                uname.setText("");
                pword.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Enter unique name", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void comboOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrgActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) comboOrg.getSelectedItem();
        if (organization != null) {
            populateComboEmployee(organization);
            populateComboRole(enterprise);
        }
    }//GEN-LAST:event_comboOrgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JComboBox comboEmp;
    private javax.swing.JComboBox comboOrg;
    private javax.swing.JComboBox comboRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPasswordField pword;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
