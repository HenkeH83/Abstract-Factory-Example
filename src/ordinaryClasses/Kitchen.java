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
public class Kitchen implements Room{

    @Override
    public void build() {
        System.out.println("\nNice, you built a kitchen.\n");
    }
    
}
