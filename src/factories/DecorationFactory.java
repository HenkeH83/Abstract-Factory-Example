/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import interfaces.Decoration;
import interfaces.Room;
import ordinaryClasses.Stylish;
import ordinaryClasses.Tacky;

/**
 *
 * @author henke
 */
public class DecorationFactory extends AbstractFactory{

    @Override
    public Decoration getDecoration(int choice) {
        switch(choice){
            case 1:
                return new Tacky();
            case 2:
                return new Stylish();
            default:
                return null;
        }
    }

    @Override
    public Room getRoom(int choice) {
        return null;
    }
    
}
