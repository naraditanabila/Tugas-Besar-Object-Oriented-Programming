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
        ImageIcon token2_img = new ImageIcon(Monopoly.class.getResource("/monopoly/resources/token2.png"));
        ImageIcon token3_img = new ImageIcon(Monopoly.class.getResource("/monopoly/resources/token3.png"));
        
        JLabel token1 = new JLabel();
        JLabel token2 = new JLabel();
        JLabel token3 = new JLabel();
        
        token1.setIcon(token1_img);
        token2.setIcon(token2_img);
        token3.setIcon(token3_img);
        
        mainFrame.setIconImage(img.getImage());
        newGameFrame.setIconImage(img.getImage());
        
        JLabel label_botRight = new JLabel();
        
        
        ImageIcon image_botRight = new ImageIcon(Monopoly.class.getResource("/monopoly/resources/Map/botRight.jpg"));
        label_botRight.setVisible(true);
        label_botRight.setIcon(image_botRight);
        // SET POSISI
        mainFrame.getBotRight().add(label_botRight);
        mainFrame.getBotRight().add(token1);
        mainFrame.getBotRight().add(token2);
        mainFrame.getBotRight().add(token3);
        mainFrame.getBotRight().setLayer(label_botRight, -1);
        mainFrame.getBotRight().setLayer(token1, 0);
        label_botRight.setBounds(0, 0, 128, 128);
        token1.setBounds(0, 0, 40, 40);
        token2.setBounds(40, 0, 40, 40);
        token3.setBounds(0, 40, 40, 40);
        // SET POSISI TOKEN
        
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