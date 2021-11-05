/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoowinteranimals.java;

import javax.swing.JFrame;

/**
 *
 * @author S545514
 */
public class ZooWinterAnimals {

     static String welcome = "Winter Animal welcomes you";
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(welcome.toUpperCase());
       HarpSeal hs= new HarpSeal();
        hs.funfacts();
        hs.location();
        hs.food(); 
        Image image = new Image();
        image.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        image.setVisible(true);
        image.pack();
        image.setTitle("HarpSeal");
        
        
       
    }
    
}
