/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listing2_4;

/**
 *
 * @author belin
 */
import javax.swing.JOptionPane;	
public class DialogApp
{
    public static void main(String[] args)
    {
        String s;
        s = JOptionPane.showInputDialog	
                ("Enter an integer:");	
        int x = Integer.parseInt(s);	
        System.out.println("You entered " + x + ".");
    }
}
