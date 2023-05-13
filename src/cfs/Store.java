/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfs;

/**
 *
 * @author B
 */
public class Store {
    public int customerCapacity;
    public int employeeesPerDay;

    public Store() {
        customerCapacity = 0;
        employeeesPerDay = 0;
    }
    
    public Store(int c, int e) {
        customerCapacity = c;
        employeeesPerDay = e;
    }

    public int getCustomerCapacity() {
        return customerCapacity;
    }

    public void setCustomerCapacity(int c) {
        customerCapacity = c;
    }

    public int getEmployeeesPerDay() {
        return employeeesPerDay;
    }

    public void setEmployeeesPerDay(int e) {
        employeeesPerDay = e;
    }

    public String toString() {
        return "Customer capacity: " + customerCapacity + "\nWorking employeees per day: " + employeeesPerDay;
    }
    
    
}
