/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business1;

import Business1.Enterprise.Enterprise;
import Business1.Network.Network;
import Business1.Organization.Organization;
import Business1.Role.Role;
import Business1.Role.SystemAdminRole;
import Business1.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author chiragpatil
 */
public class Ecosystem {

    private static Ecosystem business;
    private ArrayList<Network> networkList;

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    //constructor for Ecosystem class
    private Ecosystem() {
        super(null);
        networkList = new ArrayList<>();

    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static void setInstance(Ecosystem system) {
        business = system;
    }

    //add a network
    public Network addNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        role.add(new SystemAdminRole());

        return role;
    }

    public static boolean checkIfUsernameIsUnique(String username) {
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterprise_list()) {
                for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(username)) {
                        return false;
                    }
                }

                for (Organization o : e.getOrganization_directory().getOrganizationList()) {
                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equals(username)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
