/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Kgothatso
 */
public class MyFirstFrame extends JFrame{
    
    public MyFirstFrame(){
        setTitle("Charmaine");
        setSize(400, 450);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
    
}
