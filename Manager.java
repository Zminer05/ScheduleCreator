package com.example.groupproject;

/**
 * @author  Mahmmod Dhalai
 * Section  CSC 332 003
 * Date     10/19/25
 * Purpose  This class represents a manager, which is a subclass of Employee.
 *          Includes data such as managerial type, key permissions,
 *          and the number of employees supervised.
 */

public class Manager extends Employee {

    //the specific type of manager
    private String type;

    //whether the manager has access to store keys
    private boolean hasKeys;

    //number of employees this manager supervises
    private int employeesSupervised;


    /**
     * Constructor to initialize all attributes of the Manager class.
     * @param name                  Employee name
     * @param canOpen               Whether the manager can open the store
     * @param canClose              Whether the manager can close the store
     * @param hourlyPay             Hourly pay rate
     * @param hoursWorkable         Maximum hours the manager can work
     * @param role                  Role/title of the manager
     * @param type                  Type of manager
     * @param hasKeys               Whether the manager holds store keys
     * @param employeesSupervised   Number of employees supervised
     */
    public Manager(String name, boolean canOpen, boolean canClose,
                   double hourlyPay, int hoursWorkable, String role,
                   String type, boolean hasKeys, int employeesSupervised) {

        super(name, canOpen, canClose, hourlyPay, hoursWorkable, role);
        this.type = type;
        this.hasKeys = hasKeys;
        this.employeesSupervised = employeesSupervised;
    }

    /**
     *
     * @return String type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return boolean hasKeys
     */
    public boolean getHasKeys() {
        return hasKeys;
    }

    /**
     *
     * @return int employeesSupervised
     */
    public int getEmployeesSupervised() {
        return employeesSupervised;
    }


    /**
     * Used to update the manager type.
     * @param type  New manager type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Used to update whether the manager has keys.
     * @param hasKeys  New key access status
     */
    public void setHasKeys(boolean hasKeys) {
        this.hasKeys = hasKeys;
    }

    /**
     * Used to update the number of employees supervised.
     * @param employeesSupervised  New number supervised
     */
    public void setEmployeesSupervised(int employeesSupervised) {
        this.employeesSupervised = employeesSupervised;
    }

    @Override
    public String toString() {
        return getName() + " (" + type + " " + getRole() + ")";
    }


}

