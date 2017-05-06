/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agemessages3;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class AgeMessages3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        
        System.out.print("Whats your name? ");
        name = keyboard.next();
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        
        if(age < 16){
            System.out.println(name + " you can't even drive");
        }
        if(age >= 16 && age <= 17){
            System.out.println(name + " you can't even vote");
        } 
        if(age >= 18 && age <= 24){
            System.out.println(name + " you can vote but can't rent a car");
        }
        if(age >= 25){
            System.out.println(name + " you pretty much do anything");
        }
    }
    
}
