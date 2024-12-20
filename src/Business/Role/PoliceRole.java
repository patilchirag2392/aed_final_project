/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PoliceOrganization;
import Business.UserAccount.UserAccount;
import UI.PoliceWorkArea.PoliceWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author chiragpatil
 */
public class PoliceRole extends Role {

    //overriding main panel with police work area whenever police role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
        return new PoliceWorkArea(userProcessContainer, account, (PoliceOrganization) organization, enterprise, system);
    }

    @Override
    public String toString() {
        return Role.RoleType.PoliceRole.getValue();
    }

}
