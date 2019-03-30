/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



/**
 *
 * @author Ismail F Aziz
 */
public class Monopoly{
    
    // Variables Declaration
    private JFrame mainFrame;
    private JFrame newGameFrame;
    
    // EO Variables Declaration
       
    public static void main(String[] args) {
        
        NewGame newGameFrame = new NewGame();
        MonopolyFrame mainFrame = new MonopolyFrame();
        
        
        //mainFrame
        ImageIcon img = new ImageIcon(Monopoly.class.getResource("/monopoly/resources/icon.jpg"));
        
        mainFrame.setIconImage(img.getImage());
        newGameFrame.setIconImage(img.getImage());
        mainFrame.setVisible(true);
        
        // New Game
        //newGame Frame harusnya didalem MonopolyFrame
        //biar bisa passing langsung
        newGameFrame.setLocationRelativeTo(null);
        newGameFrame.setTitle("Monopoly");
        newGameFrame.setVisible(true);
        
        
        
        //
        
        
        
        
    }
}