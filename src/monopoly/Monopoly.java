/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;




/**
 *
 * @author Ismail F Aziz
 */
public class Monopoly{
    
    // Variables Declaration
    private JFrame mainFrame;
    private JFrame newGameFrame;
    private JFrame winnerFrame;
    private JFrame logFrame;
    
    
    
    // EO Variables Declaration
       
    public static void main(String[] args) throws Exception {
        
        NewGame newGameFrame = new NewGame();
        MonopolyFrame mainFrame = new MonopolyFrame();
        WinnerGame winnerFrame = new WinnerGame();
        
        //mainFrame
        ImageIcon img = new ImageIcon(Monopoly.class.getResource("/monopoly/resources/icon.jpg"));
        ImageIcon token1_img = new ImageIcon(Monopoly.class.getResource("/monopoly/resources/token1.png"));
        JLabel token1 = new JLabel();
        token1.setIcon(token1_img);
        mainFrame.setIconImage(img.getImage());
        newGameFrame.setIconImage(img.getImage());
        mainFrame.getBot1().add(token1);
        mainFrame.setLog(Integer.toString(mainFrame.getBot1().getLayer(token1)) + "\n");
        
        
        
        
        mainFrame.setVisible(true);
        
        // New Game
        newGameFrame.setLocationRelativeTo(null);
        newGameFrame.setTitle("Monopoly");
        newGameFrame.setVisible(true);
        
        // Winner Frame
        winnerFrame.setLocationRelativeTo(null);
        winnerFrame.setTitle("Saha nu meunang beu");
        winnerFrame.setVisible(false);
        
        // Nyoba music
        //String cuteGirl = " /monopoly/resources/cuteGirl.mp3";
        //Media hit = new Media(new File(cuteGirl).toURI().toString());
        //MediaPlayer mediaPlayer = new MediaPlayer(hit);
        //mediaPlayer.play();
        
        
        
        
        //Nyoba2
        
        
        //testing new game
        
        
        
        
        
    }
}