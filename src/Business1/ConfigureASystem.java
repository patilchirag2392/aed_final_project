/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business1;
import Business1.Employee.Employee;
import Business1.Role.SystemAdminRole;
import Business1.UserAccount.UserAccount;

/**
 *
 * @author chiragpatil
 */
public class ConfigureASystem {
    public static Ecosystem configure(){
    Ecosystem system= Ecosystem.getInstance();
   
     Employee employee= system.getEmployeeDirectory().createEmployee("SYSTEM ADMIN");
     //making defualt username, password for application admin role
     UserAccount ua= system.getUserAccountDirectory().createUserAccount("cadmin","cadmin", employee, new SystemAdminRole());
    
    return system;
    }
}