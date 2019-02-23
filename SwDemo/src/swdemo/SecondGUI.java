/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdemo;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author koloh
 */
public class SecondGUI {
    public static void main(String[] args) {
        Abcs obj = new Abcs();
        
    }
    
}
class Abcs extends JFrame{
    
    // Create a constructor
    public Abcs(){
        
        JLabel jl = new JLabel("Hello World");
        add(jl);
        
        // Always better to write your properties inside constructor
        setVisible(true);
        setSize(400, 400);
        
    }
    
}
