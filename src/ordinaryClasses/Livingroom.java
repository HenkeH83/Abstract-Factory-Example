/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinaryClasses;

import interfaces.Room;

/**
 *
 * @author henke
 */
public class Livingroom implements Room{

    @Override
    public void build() {
        System.out.println("\nYou have built a  livingroom, not bad.\n");
    }
    
}
