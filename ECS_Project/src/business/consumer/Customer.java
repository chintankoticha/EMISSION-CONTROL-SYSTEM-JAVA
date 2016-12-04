/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

import business.employee.Employee;

/**
 *
 * @author Chintan
 */
public class Customer{
    private String firstName;
    private String lastName;
    private String customerId;
    private String currentAddress;
    private String currentAreaCode;
    private ApplianceDirectory applianceDirectory;
    private AutomobileDirectory automobileDirectory;
    
    public Customer(){
        applianceDirectory = new ApplianceDirectory();
        automobileDirectory = new AutomobileDirectory();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getCurrentAreaCode() {
        return currentAreaCode;
    }

    public void setCurrentAreaCode(String currentAreaCode) {
        this.currentAreaCode = currentAreaCode;
    }

    public ApplianceDirectory getApplianceDirectory() {
        return applianceDirectory;
    }

    public void setApplianceDirectory(ApplianceDirectory applianceDirectory) {
        this.applianceDirectory = applianceDirectory;
    }

    public AutomobileDirectory getAutomobileDirectory() {
        return automobileDirectory;
    }

    public void setAutomobileDirectory(AutomobileDirectory automobileDirectory) {
        this.automobileDirectory = automobileDirectory;
    }    
}