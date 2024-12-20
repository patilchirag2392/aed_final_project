/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.EventMaker;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.EventMaker.EventMaker;
import Business.Organization.EventMakerOrganization;
import Business.Organization.Organization;
import Business.Role.EventMakerRole;
import Business.Role.Role;
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
        selectCombo();
        displayCombo();
    }

    //populate respective roles
    private void populateComboRole(Enterprise e) {
        comboRole.removeAllItems();
        Organization organization = (Organization) comboOrg.getSelectedItem();
        if (organization instanceof EventMakerOrganization) {
            comboRole.addItem(new EventMakerRole());

        }

    }

    public void populateComboEmployee(Organization organization) {
        comboEmp.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmplist()) {
            comboEmp.addItem(employee);
        }
    }

    public void selectCombo() {
        comboOrg.removeAllItems();

        for (Organization organization : enterprise.getOrganization_directory().getOrganizationList()) {
            if (organization instanceof EventMakerOrganization) {
                comboOrg.addItem(organization);
            }

        }
    }

    public void displayCombo() {

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

    //populate respective employees
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
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
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Organization");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 980, -1));

        tblUser.setBackground(new java.awt.Color(204, 204, 204));
        tblUser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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
        jScrollPane1.setViewportView(tblUser);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Manage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 28))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddUser.setBackground(new java.awt.Color(102, 102, 102));
        btnAddUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        jPanel4.add(btnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 163, 58));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel2.setText("Username");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 241, 250, 45));

        uname.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        uname.setForeground(new java.awt.Color(153, 0, 153));
        jPanel4.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 241, 250, 45));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel3.setText("Organization");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 61, 250, 45));

        comboOrg.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        comboOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrgActionPerformed(evt);
            }
        });
        jPanel4.add(comboOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 61, 250, 45));

        pword.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        pword.setForeground(new java.awt.Color(153, 0, 153));
        jPanel4.add(pword, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 301, 250, 45));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lblPassword.setText("Password");
        jPanel4.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 301, 250, 45));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel4.setText("Employee");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 121, 250, 45));

        comboEmp.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jPanel4.add(comboEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 121, 250, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel5.setText("Role");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 181, 250, 45));

        comboRole.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jPanel4.add(comboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 181, 250, 45));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 190, 620, 446));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/ezgif.com-gif-maker-3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, 50, 50));
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

                if (organization instanceof EventMakerOrganization) {
                    EventMaker cm = new EventMaker();

                    cm.setevenName(employee.getempName());

                    ((EventMakerOrganization) organization).getChangemakerlist().getChangeMakerDirectory().add(cm);

                }
                organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                displayCombo();
                uname.setText("");
                pword.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
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
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
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
