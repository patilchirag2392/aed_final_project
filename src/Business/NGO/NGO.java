/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGO;

/**
 *
 * @author Reema
 */
public class NGO {

    private String ngName;
    private String ngId;
    private static int c;

    //NGO constructor to autogenerated ids
    public NGO() {

        ngId = "ORG" + (++c);

    }

    public String getId() {
        return ngId;
    }

    public void setId(String ngId) {
        this.ngId = ngId;
    }

    public String getName() {
        return ngName;
    }

    public void setName(String ngName) {
        this.ngName = ngName;
    }

    @Override
    public String toString() {

        return ngName;
    }

}
