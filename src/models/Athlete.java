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
public class Athlete extends Human {

    @Override
    public void talks(String message) {
        System.out.println("Athlete's talk: " + message);
    }

    @Override
    public void sleeps() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
