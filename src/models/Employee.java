/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javacollectionsexamples.abstracts.Human;

/**
 *
 * @author mac
 */
public class Employee extends Human {
    public String empId;
    
    @Override
    public void talks(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void blabla() {
        
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
    
    
}
