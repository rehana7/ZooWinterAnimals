/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoowinteranimals.java;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Rehana Naguru
 */
public class Image extends JFrame{
    private final ImageIcon harpi;
    private final JLabel HarpSeal;
    
    Image() {
        setLayout(new FlowLayout());
        
        harpi = new ImageIcon(getClass().getResource("harpi.jpg"));
        
        HarpSeal = new JLabel(harpi);
        add(HarpSeal); 
        System.out.println("I am HarpSeal: Please save animals.");
    } 
    
    public static void main(String args[]){
        Image im = new Image();
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setVisible(true);
        im.pack();
        im.setTitle("HarpSeal");
        
    }

    void image() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


