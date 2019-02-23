/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdemo;

import java.awt.FlowLayout;
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
        
        setLayout(new FlowLayout());
        JLabel jl = new JLabel("Hello World");
        JLabel jl2 = new JLabel("Welcome Esther");
        add(jl);
        add(jl2);
        
        // Always better to write your properties inside constructor
        setVisible(true);
        setSize(400, 400);
        
    }
    
}
