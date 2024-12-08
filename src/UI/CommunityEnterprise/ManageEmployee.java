/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CommunityEnterprise;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chiragpatil
 */
public class ManageEmployee extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployee
     */
    private OrganizationDirectory orgdirectory;
    private JPanel userProcessContainer;

    public ManageEmployee(JPanel userProcessContainer, OrganizationDirectory orgdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orgdirectory = orgdirectory;
        populateComboOrganization();
        populateComboOrganizationEmp();
    }

    private void populateTbl(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeDirectory().getEmplist()) {
            Object[] row = new Object[5];
            row[0] = employee;
            row[2] = employee.getempId();
            row[1] = organization.getName();
            model.addRow(row);
        }
    }

    //populate organization combo box
    public void populateComboOrganization() {
        comboOrg.removeAllItems();

        for (Organization organization : orgdirectory.getOrganizationList()) {
            comboOrg.addItem(organization);
        }
    }

    //populate employee - community organization combo box
    public void populateComboOrganizationEmp() {
        comboOrgSelect.removeAllItems();

        for (Organization organization : orgdirectory.getOrganizationList()) {
            comboOrgSelect.addItem(organization);
        }
    }

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
        jLabel5 = new javax.swing.JLabel();
        comboOrg = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAddEmployee = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboOrgSelect = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Employee");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(196, 196, 196)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 980, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 175, 205, 45));

        comboOrg.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        comboOrg.setForeground(new java.awt.Color(153, 0, 153));
        comboOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrgActionPerformed(evt);
            }
        });
        add(comboOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 175, 300, 45));

        tblEmp.setBackground(new java.awt.Color(204, 204, 204));
        tblEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        tblEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblEmp.setForeground(new java.awt.Color(153, 0, 153));
        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmp.setOpaque(false);
        jScrollPane1.setViewportView(tblEmp);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 251, 563, 304));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Manage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N
        jPanel4.setOpaque(false);

        btnAddEmployee.setBackground(new java.awt.Color(102, 102, 102));
        btnAddEmployee.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Name");

        nametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nametxtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Organization");

        comboOrgSelect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOrgSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOrgSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 175, -1, -1));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 70, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void comboOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrgActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) comboOrg.getSelectedItem();
        if (organization != null) {
            populateTbl(organization);
        }
    }//GEN-LAST:event_comboOrgActionPerformed

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        // TODO add your handling code here:
        if (nametxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "FIELD CANNOT BE EMPTY");
        } else {

            Organization organization = (Organization) comboOrgSelect.getSelectedItem();
            String name = nametxt.getText();

            organization.getEmployeeDirectory().createEmployee(name);
            populateTbl(organization);

            nametxt.setText("");
        }
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void nametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxtKeyTyped
        // TODO add your handling code here:
        char typedName = evt.getKeyChar();
        if (!Character.isAlphabetic(typedName) && !Character.isWhitespace(typedName)) {
            evt.consume();
        }
        //Restrict the length to 256
        if (nametxt.getText().length() > 255) {
            evt.consume();
        }
    }//GEN-LAST:event_nametxtKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JComboBox comboOrg;
    private javax.swing.JComboBox comboOrgSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTable tblEmp;
    // End of variables declaration//GEN-END:variables
}
