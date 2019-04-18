/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/*
    MVC : VIEW
*/

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;





/**
 *
 * @author Ismail F Aziz
 */
/*
    THINGS TO NOTE:
    REMEMBER TO REMOVE
    UNUSED COMPONENTS
    
    AND
    CHANGE VARIABLE NAME to ease editing:
        TitledBorder for Players

*/



public class MonopolyFrame extends javax.swing.JFrame {

    /**
     * Creates new form MonopolyFrame
     */
    
    public MonopolyFrame() {
        initComponents();
        gameLog.setVisible(false);
    }

    /*
        METHOD MANUAL
    */

    public void setLog(String text) {
        gameLog.append(text);
    }
    
    public void clearLog() {
        gameLog.setText("");
    }
    
    //data Player
    public void setPlayer1Data(String text) {
        
    }
    
    public void adjustPlayerPos(int idPlayer, int move ) {
        
        //
        //fungsi : update token per player
        //  Jlabel tokenPlayer1 = new JLabel(ambil file token1.jpg); ==> taro di Consturctor
        
        
        /*
            if (idPlayer == 1) {
                
            }
        */
    }


    /*
        METHOD MANUAL
    */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardPanel = new javax.swing.JPanel();
        topLeft = new javax.swing.JLayeredPane();
        topLeft_img = new javax.swing.JLabel();
        topRight = new javax.swing.JLayeredPane();
        topRight_img = new javax.swing.JLabel();
        botRight = new javax.swing.JLayeredPane();
        botRight_img = new javax.swing.JLabel();
        botLeft = new javax.swing.JLayeredPane();
        botLeft_img = new javax.swing.JLabel();
        bot9 = new javax.swing.JLayeredPane();
        bot9_img = new javax.swing.JLabel();
        bot8 = new javax.swing.JLayeredPane();
        bot8_img = new javax.swing.JLabel();
        bot1 = new javax.swing.JLayeredPane();
        bot1_img = new javax.swing.JLabel();
        bot3 = new javax.swing.JLayeredPane();
        bot3_img = new javax.swing.JLabel();
        bot4 = new javax.swing.JLayeredPane();
        bot4_img = new javax.swing.JLabel();
        bot6 = new javax.swing.JLayeredPane();
        bot6_img = new javax.swing.JLabel();
        bot7 = new javax.swing.JLayeredPane();
        bot7_img = new javax.swing.JLabel();
        bot5 = new javax.swing.JLayeredPane();
        bot5_img = new javax.swing.JLabel();
        right1 = new javax.swing.JLayeredPane();
        right1_img = new javax.swing.JLabel();
        right2 = new javax.swing.JLayeredPane();
        right2_img = new javax.swing.JLabel();
        right3 = new javax.swing.JLayeredPane();
        right3_img = new javax.swing.JLabel();
        right4 = new javax.swing.JLayeredPane();
        right4_img = new javax.swing.JLabel();
        right5 = new javax.swing.JLayeredPane();
        right5_img = new javax.swing.JLabel();
        right6 = new javax.swing.JLayeredPane();
        right6_img = new javax.swing.JLabel();
        right7 = new javax.swing.JLayeredPane();
        right7_img = new javax.swing.JLabel();
        right8 = new javax.swing.JLayeredPane();
        right8_img = new javax.swing.JLabel();
        right9 = new javax.swing.JLayeredPane();
        right9_img = new javax.swing.JLabel();
        top1 = new javax.swing.JLayeredPane();
        top1_img = new javax.swing.JLabel();
        top2 = new javax.swing.JLayeredPane();
        top2_img = new javax.swing.JLabel();
        top3 = new javax.swing.JLayeredPane();
        top3_img = new javax.swing.JLabel();
        top4 = new javax.swing.JLayeredPane();
        top4_img = new javax.swing.JLabel();
        top5 = new javax.swing.JLayeredPane();
        top5_img = new javax.swing.JLabel();
        top6 = new javax.swing.JLayeredPane();
        top6_img = new javax.swing.JLabel();
        top7 = new javax.swing.JLayeredPane();
        top7_img = new javax.swing.JLabel();
        top8 = new javax.swing.JLayeredPane();
        top8_img = new javax.swing.JLabel();
        top9 = new javax.swing.JLayeredPane();
        top9_img = new javax.swing.JLabel();
        left9 = new javax.swing.JLayeredPane();
        left9_img = new javax.swing.JLabel();
        left8 = new javax.swing.JLayeredPane();
        left8_img = new javax.swing.JLabel();
        left7 = new javax.swing.JLayeredPane();
        left7_img = new javax.swing.JLabel();
        left6 = new javax.swing.JLayeredPane();
        left6_img = new javax.swing.JLabel();
        left5 = new javax.swing.JLayeredPane();
        left5_img = new javax.swing.JLabel();
        left4 = new javax.swing.JLayeredPane();
        left4_img = new javax.swing.JLabel();
        left3 = new javax.swing.JLayeredPane();
        left3_img = new javax.swing.JLabel();
        left2 = new javax.swing.JLayeredPane();
        left2_img = new javax.swing.JLabel();
        left1 = new javax.swing.JLayeredPane();
        left1_img = new javax.swing.JLabel();
        bot2 = new javax.swing.JLayeredPane();
        bot2_img = new javax.swing.JLabel();
        playerPane = new javax.swing.JPanel();
        player1Panel = new javax.swing.JPanel();
        money_player1 = new javax.swing.JLabel();
        pos_player1 = new javax.swing.JLabel();
        prop1 = new javax.swing.JLabel();
        player2Panel = new javax.swing.JPanel();
        money_player2 = new javax.swing.JLabel();
        pos_player2 = new javax.swing.JLabel();
        prop2 = new javax.swing.JLabel();
        player3Panel = new javax.swing.JPanel();
        money_player3 = new javax.swing.JLabel();
        pos_player3 = new javax.swing.JLabel();
        prop3 = new javax.swing.JLabel();
        player4Panel = new javax.swing.JPanel();
        money_player4 = new javax.swing.JLabel();
        pos_player4 = new javax.swing.JLabel();
        prop4 = new javax.swing.JLabel();
        rollButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        upgradeButton = new javax.swing.JButton();
        sellButton = new javax.swing.JButton();
        tickProgressBar = new javax.swing.JProgressBar();
        payButton = new javax.swing.JButton();
        giveUpButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gameLog = new javax.swing.JTextArea();
        gameLogButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monopoly");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        boardPanel.setBackground(new java.awt.Color(102, 102, 102));
        boardPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boardPanel.setAutoscrolls(true);
        boardPanel.setMaximumSize(new java.awt.Dimension(978, 978));
        boardPanel.setMinimumSize(new java.awt.Dimension(978, 978));
        boardPanel.setPreferredSize(new java.awt.Dimension(978, 978));

        topLeft_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/topLeft.jpg"))); // NOI18N

        topLeft.setLayer(topLeft_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout topLeftLayout = new javax.swing.GroupLayout(topLeft);
        topLeft.setLayout(topLeftLayout);
        topLeftLayout.setHorizontalGroup(
            topLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLeftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(topLeft_img))
        );
        topLeftLayout.setVerticalGroup(
            topLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLeftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(topLeft_img, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        topRight_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/topRight.jpg"))); // NOI18N

        topRight.setLayer(topRight_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout topRightLayout = new javax.swing.GroupLayout(topRight);
        topRight.setLayout(topRightLayout);
        topRightLayout.setHorizontalGroup(
            topRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topRightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topRight_img)
                .addContainerGap())
        );
        topRightLayout.setVerticalGroup(
            topRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topRightLayout.createSequentialGroup()
                .addComponent(topRight_img, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        botRight_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/botRight.jpg"))); // NOI18N

        botRight.setLayer(botRight_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout botRightLayout = new javax.swing.GroupLayout(botRight);
        botRight.setLayout(botRightLayout);
        botRightLayout.setHorizontalGroup(
            botRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botRightLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botRight_img))
        );
        botRightLayout.setVerticalGroup(
            botRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botRightLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botRight_img, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        botLeft_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/botLeft.jpg"))); // NOI18N

        botLeft.setLayer(botLeft_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout botLeftLayout = new javax.swing.GroupLayout(botLeft);
        botLeft.setLayout(botLeftLayout);
        botLeftLayout.setHorizontalGroup(
            botLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botLeftLayout.createSequentialGroup()
                .addComponent(botLeft_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        botLeftLayout.setVerticalGroup(
            botLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botLeftLayout.createSequentialGroup()
                .addComponent(botLeft_img)
                .addGap(0, 0, 0))
        );

        bot9_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot9.jpg"))); // NOI18N

        bot9.setLayer(bot9_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bot9Layout = new javax.swing.GroupLayout(bot9);
        bot9.setLayout(bot9Layout);
        bot9Layout.setHorizontalGroup(
            bot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bot9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bot9_img, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bot9Layout.setVerticalGroup(
            bot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot9Layout.createSequentialGroup()
                .addComponent(bot9_img, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bot8_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot8.jpg"))); // NOI18N

        bot8.setLayer(bot8_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bot8Layout = new javax.swing.GroupLayout(bot8);
        bot8.setLayout(bot8Layout);
        bot8Layout.setHorizontalGroup(
            bot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bot8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bot8_img, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bot8Layout.setVerticalGroup(
            bot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bot8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bot8_img, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bot1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot1.jpg"))); // NOI18N

        bot1.setLayer(bot1_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bot1Layout = new javax.swing.GroupLayout(bot1);
        bot1.setLayout(bot1Layout);
        bot1Layout.setHorizontalGroup(
            bot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bot1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bot1_img))
        );
        bot1Layout.setVerticalGroup(
            bot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bot1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bot1_img))
        );

        bot3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot3.jpg"))); // NOI18N

        bot3.setLayer(bot3_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bot3Layout = new javax.swing.GroupLayout(bot3);
        bot3.setLayout(bot3Layout);
        bot3Layout.setHorizontalGroup(
            bot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot3_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bot3Layout.setVerticalGroup(
            bot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot3_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bot4_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot4.jpg"))); // NOI18N

        bot4.setLayer(bot4_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bot4Layout = new javax.swing.GroupLayout(bot4);
        bot4.setLayout(bot4Layout);
        bot4Layout.setHorizontalGroup(
            bot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot4_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bot4Layout.setVerticalGroup(
            bot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot4_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bot6_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot6.jpg"))); // NOI18N

        bot6.setLayer(bot6_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bot6Layout = new javax.swing.GroupLayout(bot6);
        bot6.setLayout(bot6Layout);
        bot6Layout.setHorizontalGroup(
            bot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot6_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bot6Layout.setVerticalGroup(
            bot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot6_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bot7_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot7.jpg"))); // NOI18N

        bot7.setLayer(bot7_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bot7Layout = new javax.swing.GroupLayout(bot7);
        bot7.setLayout(bot7Layout);
        bot7Layout.setHorizontalGroup(
            bot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot7_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bot7Layout.setVerticalGroup(
            bot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot7_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bot5_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot5.jpg"))); // NOI18N

        bot5.setLayer(bot5_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bot5Layout = new javax.swing.GroupLayout(bot5);
        bot5.setLayout(bot5Layout);
        bot5Layout.setHorizontalGroup(
            bot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot5_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bot5Layout.setVerticalGroup(
            bot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot5_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        right1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right1.jpg"))); // NOI18N

        right1.setLayer(right1_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout right1Layout = new javax.swing.GroupLayout(right1);
        right1.setLayout(right1Layout);
        right1Layout.setHorizontalGroup(
            right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right1Layout.createSequentialGroup()
                .addComponent(right1_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        right1Layout.setVerticalGroup(
            right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right1_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        right2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right2.jpg"))); // NOI18N

        right2.setLayer(right2_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout right2Layout = new javax.swing.GroupLayout(right2);
        right2.setLayout(right2Layout);
        right2Layout.setHorizontalGroup(
            right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right2Layout.createSequentialGroup()
                .addComponent(right2_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        right2Layout.setVerticalGroup(
            right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right2_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        right3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right3.jpg"))); // NOI18N

        right3.setLayer(right3_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout right3Layout = new javax.swing.GroupLayout(right3);
        right3.setLayout(right3Layout);
        right3Layout.setHorizontalGroup(
            right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right3Layout.createSequentialGroup()
                .addComponent(right3_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        right3Layout.setVerticalGroup(
            right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right3_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        right4_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right4.jpg"))); // NOI18N

        right4.setLayer(right4_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout right4Layout = new javax.swing.GroupLayout(right4);
        right4.setLayout(right4Layout);
        right4Layout.setHorizontalGroup(
            right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right4_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        right4Layout.setVerticalGroup(
            right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right4_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        right5_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right5.jpg"))); // NOI18N

        right5.setLayer(right5_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout right5Layout = new javax.swing.GroupLayout(right5);
        right5.setLayout(right5Layout);
        right5Layout.setHorizontalGroup(
            right5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right5_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        right5Layout.setVerticalGroup(
            right5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right5_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        right6_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right6.jpg"))); // NOI18N

        right6.setLayer(right6_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout right6Layout = new javax.swing.GroupLayout(right6);
        right6.setLayout(right6Layout);
        right6Layout.setHorizontalGroup(
            right6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right6_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        right6Layout.setVerticalGroup(
            right6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right6_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        right7_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right7.jpg"))); // NOI18N

        right7.setLayer(right7_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout right7Layout = new javax.swing.GroupLayout(right7);
        right7.setLayout(right7Layout);
        right7Layout.setHorizontalGroup(
            right7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right7Layout.createSequentialGroup()
                .addComponent(right7_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        right7Layout.setVerticalGroup(
            right7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right7_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        right8_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right8.jpg"))); // NOI18N

        right8.setLayer(right8_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout right8Layout = new javax.swing.GroupLayout(right8);
        right8.setLayout(right8Layout);
        right8Layout.setHorizontalGroup(
            right8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right8Layout.createSequentialGroup()
                .addComponent(right8_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        right8Layout.setVerticalGroup(
            right8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right8_img, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        right9_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right9.jpg"))); // NOI18N

        right9.setLayer(right9_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout right9Layout = new javax.swing.GroupLayout(right9);
        right9.setLayout(right9Layout);
        right9Layout.setHorizontalGroup(
            right9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right9_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        right9Layout.setVerticalGroup(
            right9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right9_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        top1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top1.jpg"))); // NOI18N

        top1.setLayer(top1_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout top1Layout = new javax.swing.GroupLayout(top1);
        top1.setLayout(top1Layout);
        top1Layout.setHorizontalGroup(
            top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top1_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top1Layout.setVerticalGroup(
            top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top1_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        top2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top2.jpg"))); // NOI18N

        top2.setLayer(top2_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout top2Layout = new javax.swing.GroupLayout(top2);
        top2.setLayout(top2Layout);
        top2Layout.setHorizontalGroup(
            top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top2_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top2Layout.setVerticalGroup(
            top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top2_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        top3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top3.jpg"))); // NOI18N

        top3.setLayer(top3_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout top3Layout = new javax.swing.GroupLayout(top3);
        top3.setLayout(top3Layout);
        top3Layout.setHorizontalGroup(
            top3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top3_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top3Layout.setVerticalGroup(
            top3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top3_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        top4_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top4.jpg"))); // NOI18N

        top4.setLayer(top4_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout top4Layout = new javax.swing.GroupLayout(top4);
        top4.setLayout(top4Layout);
        top4Layout.setHorizontalGroup(
            top4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top4_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top4Layout.setVerticalGroup(
            top4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top4_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        top5_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top5.jpg"))); // NOI18N

        top5.setLayer(top5_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout top5Layout = new javax.swing.GroupLayout(top5);
        top5.setLayout(top5Layout);
        top5Layout.setHorizontalGroup(
            top5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top5_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top5Layout.setVerticalGroup(
            top5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top5_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        top6_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top6.jpg"))); // NOI18N

        top6.setLayer(top6_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout top6Layout = new javax.swing.GroupLayout(top6);
        top6.setLayout(top6Layout);
        top6Layout.setHorizontalGroup(
            top6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top6_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top6Layout.setVerticalGroup(
            top6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top6_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        top7_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top7.jpg"))); // NOI18N

        top7.setLayer(top7_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout top7Layout = new javax.swing.GroupLayout(top7);
        top7.setLayout(top7Layout);
        top7Layout.setHorizontalGroup(
            top7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top7_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top7Layout.setVerticalGroup(
            top7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top7_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        top8_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top8.jpg"))); // NOI18N

        top8.setLayer(top8_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout top8Layout = new javax.swing.GroupLayout(top8);
        top8.setLayout(top8Layout);
        top8Layout.setHorizontalGroup(
            top8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top8_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top8Layout.setVerticalGroup(
            top8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top8_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        top9_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top9.jpg"))); // NOI18N

        top9.setLayer(top9_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout top9Layout = new javax.swing.GroupLayout(top9);
        top9.setLayout(top9Layout);
        top9Layout.setHorizontalGroup(
            top9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top9_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top9Layout.setVerticalGroup(
            top9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top9_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        left9_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left9.jpg"))); // NOI18N

        left9.setLayer(left9_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout left9Layout = new javax.swing.GroupLayout(left9);
        left9.setLayout(left9Layout);
        left9Layout.setHorizontalGroup(
            left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left9_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        left9Layout.setVerticalGroup(
            left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left9_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        left8_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left8.jpg"))); // NOI18N

        left8.setLayer(left8_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout left8Layout = new javax.swing.GroupLayout(left8);
        left8.setLayout(left8Layout);
        left8Layout.setHorizontalGroup(
            left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left8_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        left8Layout.setVerticalGroup(
            left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left8_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        left7_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left7.jpg"))); // NOI18N

        left7.setLayer(left7_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout left7Layout = new javax.swing.GroupLayout(left7);
        left7.setLayout(left7Layout);
        left7Layout.setHorizontalGroup(
            left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left7_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        left7Layout.setVerticalGroup(
            left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left7_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        left6_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left6.jpg"))); // NOI18N

        left6.setLayer(left6_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout left6Layout = new javax.swing.GroupLayout(left6);
        left6.setLayout(left6Layout);
        left6Layout.setHorizontalGroup(
            left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left6_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        left6Layout.setVerticalGroup(
            left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left6_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        left5_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left5.jpg"))); // NOI18N

        left5.setLayer(left5_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout left5Layout = new javax.swing.GroupLayout(left5);
        left5.setLayout(left5Layout);
        left5Layout.setHorizontalGroup(
            left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left5_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        left5Layout.setVerticalGroup(
            left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left5_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        left4_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left4.jpg"))); // NOI18N

        left4.setLayer(left4_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout left4Layout = new javax.swing.GroupLayout(left4);
        left4.setLayout(left4Layout);
        left4Layout.setHorizontalGroup(
            left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left4_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        left4Layout.setVerticalGroup(
            left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left4_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        left3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left3.jpg"))); // NOI18N

        left3.setLayer(left3_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout left3Layout = new javax.swing.GroupLayout(left3);
        left3.setLayout(left3Layout);
        left3Layout.setHorizontalGroup(
            left3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left3_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        left3Layout.setVerticalGroup(
            left3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left3_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        left2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left2.jpg"))); // NOI18N

        left2.setLayer(left2_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout left2Layout = new javax.swing.GroupLayout(left2);
        left2.setLayout(left2Layout);
        left2Layout.setHorizontalGroup(
            left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left2_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        left2Layout.setVerticalGroup(
            left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left2_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        left1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left1.jpg"))); // NOI18N

        left1.setLayer(left1_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout left1Layout = new javax.swing.GroupLayout(left1);
        left1.setLayout(left1Layout);
        left1Layout.setHorizontalGroup(
            left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left1_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        left1Layout.setVerticalGroup(
            left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left1_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bot2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot2.jpg"))); // NOI18N

        bot2.setLayer(bot2_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bot2Layout = new javax.swing.GroupLayout(bot2);
        bot2.setLayout(bot2Layout);
        bot2Layout.setHorizontalGroup(
            bot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot2Layout.createSequentialGroup()
                .addComponent(bot2_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bot2Layout.setVerticalGroup(
            bot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bot2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bot2_img, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(top2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(top3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(top4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(top5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(top6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(top7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(top8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(top9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(right1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(right2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(right3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(right4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(right8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(right7)
                                            .addGroup(boardPanelLayout.createSequentialGroup()
                                                .addComponent(right6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(right9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(boardPanelLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(right5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(topRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(botLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(bot9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(bot8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(bot7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addComponent(topRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bot1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bot3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bot4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bot8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        playerPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        player1Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 1"));

        money_player1.setText("Money :");

        pos_player1.setText("Position :");

        prop1.setText("Property :");

        javax.swing.GroupLayout player1PanelLayout = new javax.swing.GroupLayout(player1Panel);
        player1Panel.setLayout(player1PanelLayout);
        player1PanelLayout.setHorizontalGroup(
            player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(money_player1)
                    .addComponent(pos_player1)
                    .addComponent(prop1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        player1PanelLayout.setVerticalGroup(
            player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(money_player1)
                .addGap(18, 18, 18)
                .addComponent(pos_player1)
                .addGap(18, 18, 18)
                .addComponent(prop1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        player2Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 2"));

        money_player2.setText("Money :");

        pos_player2.setText("Position :");

        prop2.setText("Property :");

        javax.swing.GroupLayout player2PanelLayout = new javax.swing.GroupLayout(player2Panel);
        player2Panel.setLayout(player2PanelLayout);
        player2PanelLayout.setHorizontalGroup(
            player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(money_player2)
                    .addComponent(pos_player2)
                    .addComponent(prop2))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        player2PanelLayout.setVerticalGroup(
            player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(money_player2)
                .addGap(18, 18, 18)
                .addComponent(pos_player2)
                .addGap(18, 18, 18)
                .addComponent(prop2)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        player3Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 3"));

        money_player3.setText("Money :");

        pos_player3.setText("Position :");

        prop3.setText("Property :");

        javax.swing.GroupLayout player3PanelLayout = new javax.swing.GroupLayout(player3Panel);
        player3Panel.setLayout(player3PanelLayout);
        player3PanelLayout.setHorizontalGroup(
            player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(money_player3)
                    .addComponent(pos_player3)
                    .addComponent(prop3))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        player3PanelLayout.setVerticalGroup(
            player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(money_player3)
                .addGap(18, 18, 18)
                .addComponent(pos_player3)
                .addGap(18, 18, 18)
                .addComponent(prop3)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        player4Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 4"));

        money_player4.setText("Money :");

        pos_player4.setText("Position :");

        prop4.setText("Property :");

        javax.swing.GroupLayout player4PanelLayout = new javax.swing.GroupLayout(player4Panel);
        player4Panel.setLayout(player4PanelLayout);
        player4PanelLayout.setHorizontalGroup(
            player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(money_player4)
                    .addComponent(pos_player4)
                    .addComponent(prop4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        player4PanelLayout.setVerticalGroup(
            player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(money_player4)
                .addGap(18, 18, 18)
                .addComponent(pos_player4)
                .addGap(18, 18, 18)
                .addComponent(prop4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout playerPaneLayout = new javax.swing.GroupLayout(playerPane);
        playerPane.setLayout(playerPaneLayout);
        playerPaneLayout.setHorizontalGroup(
            playerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(player3Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player1Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(playerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(player2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player4Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        playerPaneLayout.setVerticalGroup(
            playerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPaneLayout.createSequentialGroup()
                .addGroup(playerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(player2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player4Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        rollButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rollButton.setText("Roll");

        buyButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buyButton.setText("Buy");
        buyButton.setMaximumSize(new java.awt.Dimension(85, 25));

        upgradeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        upgradeButton.setText("Upgrade");

        sellButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sellButton.setText("Sell");
        sellButton.setMaximumSize(new java.awt.Dimension(57, 25));
        sellButton.setMinimumSize(new java.awt.Dimension(57, 25));
        sellButton.setPreferredSize(new java.awt.Dimension(53, 25));

        tickProgressBar.setMaximum(30);
        tickProgressBar.setToolTipText("");
        tickProgressBar.setValue(30);
        tickProgressBar.setString("30");
        tickProgressBar.setStringPainted(true);

        payButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        payButton.setText("Pay");
        payButton.setMaximumSize(new java.awt.Dimension(85, 25));

        giveUpButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        giveUpButton.setText("Give Up");
        giveUpButton.setMaximumSize(new java.awt.Dimension(85, 25));

        startButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startButton.setText("Start Game");

        gameLog.setEditable(false);
        gameLog.setBackground(new java.awt.Color(0, 0, 0));
        gameLog.setColumns(20);
        gameLog.setForeground(new java.awt.Color(255, 255, 255));
        gameLog.setRows(5);
        gameLog.setText("===============================Game Log===============================\n");
        gameLog.setBorder(null);
        jScrollPane1.setViewportView(gameLog);

        gameLogButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gameLogButton.setText("Game Log");
        gameLogButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gameLogButtonItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tickProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(rollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(startButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(payButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(giveUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(gameLogButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sellButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addComponent(upgradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tickProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(gameLogButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upgradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giveUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void gameLogButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gameLogButtonItemStateChanged
        
        if (gameLogButton.isSelected()) {
            gameLog.setVisible(true);
        } else {
            gameLog.setVisible(false);
        }
        
        JLabel player1token = new JLabel();
        player1token.setIcon(new ImageIcon(getClass().getResource("/monopoly/resources/Map/top1.jpg")));
        top1.add(player1token);
    }//GEN-LAST:event_gameLogButtonItemStateChanged

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MonopolyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonopolyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonopolyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonopolyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            
            
                new MonopolyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardPanel;
    private javax.swing.JLayeredPane bot1;
    private javax.swing.JLabel bot1_img;
    private javax.swing.JLayeredPane bot2;
    private javax.swing.JLabel bot2_img;
    private javax.swing.JLayeredPane bot3;
    private javax.swing.JLabel bot3_img;
    private javax.swing.JLayeredPane bot4;
    private javax.swing.JLabel bot4_img;
    private javax.swing.JLayeredPane bot5;
    private javax.swing.JLabel bot5_img;
    private javax.swing.JLayeredPane bot6;
    private javax.swing.JLabel bot6_img;
    private javax.swing.JLayeredPane bot7;
    private javax.swing.JLabel bot7_img;
    private javax.swing.JLayeredPane bot8;
    private javax.swing.JLabel bot8_img;
    private javax.swing.JLayeredPane bot9;
    private javax.swing.JLabel bot9_img;
    private javax.swing.JLayeredPane botLeft;
    private javax.swing.JLabel botLeft_img;
    private javax.swing.JLayeredPane botRight;
    private javax.swing.JLabel botRight_img;
    private javax.swing.JButton buyButton;
    private javax.swing.JTextArea gameLog;
    private javax.swing.JToggleButton gameLogButton;
    private javax.swing.JButton giveUpButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane left1;
    private javax.swing.JLabel left1_img;
    private javax.swing.JLayeredPane left2;
    private javax.swing.JLabel left2_img;
    private javax.swing.JLayeredPane left3;
    private javax.swing.JLabel left3_img;
    private javax.swing.JLayeredPane left4;
    private javax.swing.JLabel left4_img;
    private javax.swing.JLayeredPane left5;
    private javax.swing.JLabel left5_img;
    private javax.swing.JLayeredPane left6;
    private javax.swing.JLabel left6_img;
    private javax.swing.JLayeredPane left7;
    private javax.swing.JLabel left7_img;
    private javax.swing.JLayeredPane left8;
    private javax.swing.JLabel left8_img;
    private javax.swing.JLayeredPane left9;
    private javax.swing.JLabel left9_img;
    private javax.swing.JLabel money_player1;
    private javax.swing.JLabel money_player2;
    private javax.swing.JLabel money_player3;
    private javax.swing.JLabel money_player4;
    private javax.swing.JButton payButton;
    private javax.swing.JPanel player1Panel;
    private javax.swing.JPanel player2Panel;
    private javax.swing.JPanel player3Panel;
    private javax.swing.JPanel player4Panel;
    private javax.swing.JPanel playerPane;
    private javax.swing.JLabel pos_player1;
    private javax.swing.JLabel pos_player2;
    private javax.swing.JLabel pos_player3;
    private javax.swing.JLabel pos_player4;
    private javax.swing.JLabel prop1;
    private javax.swing.JLabel prop2;
    private javax.swing.JLabel prop3;
    private javax.swing.JLabel prop4;
    private javax.swing.JLayeredPane right1;
    private javax.swing.JLabel right1_img;
    private javax.swing.JLayeredPane right2;
    private javax.swing.JLabel right2_img;
    private javax.swing.JLayeredPane right3;
    private javax.swing.JLabel right3_img;
    private javax.swing.JLayeredPane right4;
    private javax.swing.JLabel right4_img;
    private javax.swing.JLayeredPane right5;
    private javax.swing.JLabel right5_img;
    private javax.swing.JLayeredPane right6;
    private javax.swing.JLabel right6_img;
    private javax.swing.JLayeredPane right7;
    private javax.swing.JLabel right7_img;
    private javax.swing.JLayeredPane right8;
    private javax.swing.JLabel right8_img;
    private javax.swing.JLayeredPane right9;
    private javax.swing.JLabel right9_img;
    private javax.swing.JButton rollButton;
    private javax.swing.JButton sellButton;
    private javax.swing.JButton startButton;
    private javax.swing.JProgressBar tickProgressBar;
    private javax.swing.JLayeredPane top1;
    private javax.swing.JLabel top1_img;
    private javax.swing.JLayeredPane top2;
    private javax.swing.JLabel top2_img;
    private javax.swing.JLayeredPane top3;
    private javax.swing.JLabel top3_img;
    private javax.swing.JLayeredPane top4;
    private javax.swing.JLabel top4_img;
    private javax.swing.JLayeredPane top5;
    private javax.swing.JLabel top5_img;
    private javax.swing.JLayeredPane top6;
    private javax.swing.JLabel top6_img;
    private javax.swing.JLayeredPane top7;
    private javax.swing.JLabel top7_img;
    private javax.swing.JLayeredPane top8;
    private javax.swing.JLabel top8_img;
    private javax.swing.JLayeredPane top9;
    private javax.swing.JLabel top9_img;
    private javax.swing.JLayeredPane topLeft;
    private javax.swing.JLabel topLeft_img;
    private javax.swing.JLayeredPane topRight;
    private javax.swing.JLabel topRight_img;
    private javax.swing.JButton upgradeButton;
    // End of variables declaration//GEN-END:variables
}
