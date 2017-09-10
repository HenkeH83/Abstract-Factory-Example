/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import interfaces.Decoration;
import interfaces.Room;
import ordinaryClasses.Kitchen;
import ordinaryClasses.Livingroom;

/**
 *
 * @author henke
 */
public class RoomFactory extends AbstractFactory{
    
    @Override
    public Room getRoom(int choice) {
        switch(choice){
            case 1:
                return new Livingroom();
            case 2:
                return new Kitchen();
            default:
                return null;
        }
    }

    @Override
    public Decoration getDecoration(int choice) {
        return null;
    }
    
}
