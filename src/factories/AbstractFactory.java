/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import interfaces.Decoration;
import interfaces.Room;

/**
 *
 * @author henke
 */
public abstract class AbstractFactory {
    
    public abstract Room getRoom(int choice);
    public abstract Decoration getDecoration(int choice);
    
}
