/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

/**
 * 
 * @author henke
 */
public class FactoryFactory {

    public static AbstractFactory getFactory(String choice){
        switch(choice){
            case "room":
                return new RoomFactory();
            case "decoration":
                return new DecorationFactory();
            default:
                return null;
        }
        
    }

}
