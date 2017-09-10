/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryexample;

import factories.AbstractFactory;
import factories.FactoryFactory;
import interfaces.Decoration;
import interfaces.Room;
import java.util.Scanner;

/**
 *
 * @author henke
 */
public class AbstractFactoryExample {

    private static int choice;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        AbstractFactory roomFactory = FactoryFactory.getFactory("room");
        AbstractFactory decorationFactory = FactoryFactory.getFactory("decoration");

        while (true) {

            System.out.println("\nMeny:\n\n"
                    + "Welcome to room builder!\n\n"
                    + "choose a room to build.\n"
                    + "1: Livingroom\n"
                    + "2: kitchen\n"
                    + "3: exit\n");

            choice = sc.nextInt();
            
            if(choice == 3)
                System.exit(0);

            Room room = roomFactory.getRoom(choice);
            room.build();

            System.out.println("\nChoose decoration\n\n"
                    + "1: Tacky\n"
                    + "2: Stylish\n");

            choice = sc.nextInt();

            Decoration decoration = decorationFactory.getDecoration(choice);
            decoration.decorate();

            Thread.sleep(2000);
        }
    }

}
