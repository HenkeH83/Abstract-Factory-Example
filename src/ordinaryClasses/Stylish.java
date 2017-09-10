/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinaryClasses;

import interfaces.Decoration;

/**
 *
 * @author henke
 */
public class Stylish implements Decoration{

    @Override
    public void decorate() {
        System.out.println("\nWell, this sure is fancy\n");
    }
    
}
