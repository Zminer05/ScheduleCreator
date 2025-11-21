/**
 * @author  Mahmmod Dhalai
 * Section  CSC 332 003
 * Date     11/10/25
 * Purpose  This class represents an employee in a workplace. It stores data
 *          such as name, role, permissions, pay rate, and hours they are allowed to work.
 *          Used to create employee objects.
 */

public class Employee {


    //name of the employee
    private String name;

    //whether the employee can open the store
    private boolean canOpen;

    //whether the employee can close the store
    private boolean canClose;

    //the hourly pay rate for the employee
    private double hourlyPay;

    //maximum hours this employee is allowed to work
    private int hoursWorkable;

    //employee's assigned role
    private String role;


    /**
     * Constructor to initialize all attributes of the Employee class.
     *
     * @param name           The employee's name
     * @param canOpen        Whether the employee can open the store
     * @param canClose       Whether the employee can close the store
     * @param hourlyPay      The hourly wage of the employee
     * @param hoursWorkable  The number of hours the employee is allowed to work
     * @param role           The role or position of the employee
     */
    public Employee(String name, boolean canOpen, boolean canClose, double hourlyPay, int hoursWorkable, String role){
        this.name = name;
        this.canOpen = canOpen;
        this.canClose = canClose;
        this.hourlyPay = hourlyPay;
        this.hoursWorkable = hoursWorkable;
        this.role = role;
    }


    /**
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return boolean canOpen
     */
    public boolean getCanOpen() {
        return canOpen;
    }

    /**
     *
     * @return boolean canClose
     */
    public boolean getCanClose() {
        return canClose;
    }

    /**
     *
     * @return double hourlyPay
     */
    public double getHourlyPay() {
        return hourlyPay;
    }

    /**
     *
     * @return int hoursWorkable
     */
    public int getHours() {
        return hoursWorkable;
    }

    /**
     *
     * @return String role
     */
    public String getRole() {
        return role;
    }


    /**
     * Used to update the employee's name.
     *
     * @param name  New employee name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Used to update if the employee can open the store.
     *
     * @param canOpen  New open permission
     */
    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    /**
     * Used to update if the employee can close the store.
     *
     * @param canClose  New close permission
     */
    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    /**
     * Updates the hourly pay rate.
     *
     * @param hourlyPay  New hourly pay amount
     */
    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    /**
     * Updates the number of hours this employee can work.
     *
     * @param hoursWorkable  New maximum hours
     */
    public void setHoursWorkable(int hoursWorkable) {
        this.hoursWorkable = hoursWorkable;
    }

    /**
     * Updates the employee's role.
     *
     * @param role  New role or title
     */
    public void setRole(String role) {
        this.role = role;
    }


    /**
     * Returns a message stating the employee has requested time off.
     *
     * @return String requestOff message
     */
    public String requestOff() {
        return name + " has requested time off.";
    }

}
