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
    
    
    
    /*
        METHOD MANUAL
    */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardPanel = new javax.swing.JPanel();
        topLeft = new javax.swing.JPanel();
        topLeft_img = new javax.swing.JLabel();
        top1 = new javax.swing.JPanel();
        top1_img = new javax.swing.JLabel();
        top2 = new javax.swing.JPanel();
        top2_img = new javax.swing.JLabel();
        top3 = new javax.swing.JPanel();
        top3_img = new javax.swing.JLabel();
        top4 = new javax.swing.JPanel();
        top4_img = new javax.swing.JLabel();
        top5 = new javax.swing.JPanel();
        top5_img = new javax.swing.JLabel();
        top6 = new javax.swing.JPanel();
        top6_img = new javax.swing.JLabel();
        top7 = new javax.swing.JPanel();
        top7_img = new javax.swing.JLabel();
        top8 = new javax.swing.JPanel();
        top8_img = new javax.swing.JLabel();
        top9 = new javax.swing.JPanel();
        top9_img = new javax.swing.JLabel();
        topRight = new javax.swing.JPanel();
        topRight_img = new javax.swing.JLabel();
        botLeft = new javax.swing.JPanel();
        botLeft_img = new javax.swing.JLabel();
        bot9 = new javax.swing.JPanel();
        bot9_img = new javax.swing.JLabel();
        bot8 = new javax.swing.JPanel();
        bot8_img = new javax.swing.JLabel();
        bot7 = new javax.swing.JPanel();
        bot7_img = new javax.swing.JLabel();
        bot6 = new javax.swing.JPanel();
        bot6_img = new javax.swing.JLabel();
        bot5 = new javax.swing.JPanel();
        bot5_img = new javax.swing.JLabel();
        bot4 = new javax.swing.JPanel();
        bot4_img = new javax.swing.JLabel();
        bot3 = new javax.swing.JPanel();
        bot3_img = new javax.swing.JLabel();
        bot2 = new javax.swing.JPanel();
        bot2_img = new javax.swing.JLabel();
        bot1 = new javax.swing.JPanel();
        bot1_img = new javax.swing.JLabel();
        botRight = new javax.swing.JPanel();
        botRight_img = new javax.swing.JLabel();
        left9 = new javax.swing.JPanel();
        left9_img = new javax.swing.JLabel();
        left8 = new javax.swing.JPanel();
        left8_img = new javax.swing.JLabel();
        left7 = new javax.swing.JPanel();
        left7_img = new javax.swing.JLabel();
        left6 = new javax.swing.JPanel();
        left6_img = new javax.swing.JLabel();
        left5 = new javax.swing.JPanel();
        left5_img = new javax.swing.JLabel();
        left4 = new javax.swing.JPanel();
        left4_img = new javax.swing.JLabel();
        left3 = new javax.swing.JPanel();
        left3_img = new javax.swing.JLabel();
        left2 = new javax.swing.JPanel();
        left2_img = new javax.swing.JLabel();
        left1 = new javax.swing.JPanel();
        left1_img = new javax.swing.JLabel();
        right1 = new javax.swing.JPanel();
        right1_img = new javax.swing.JLabel();
        right2 = new javax.swing.JPanel();
        right2_img = new javax.swing.JLabel();
        right3 = new javax.swing.JPanel();
        right3_img = new javax.swing.JLabel();
        right4 = new javax.swing.JPanel();
        right4_img = new javax.swing.JLabel();
        right5 = new javax.swing.JPanel();
        right5_img = new javax.swing.JLabel();
        right6 = new javax.swing.JPanel();
        right6_img = new javax.swing.JLabel();
        right7 = new javax.swing.JPanel();
        right7_img = new javax.swing.JLabel();
        right8 = new javax.swing.JPanel();
        right8_img = new javax.swing.JLabel();
        right9 = new javax.swing.JPanel();
        right9_img = new javax.swing.JLabel();
        playerPane = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rollButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        upgradeButton = new javax.swing.JButton();
        sellButton = new javax.swing.JButton();
        tickProgressBar = new javax.swing.JProgressBar();
        payButton = new javax.swing.JButton();
        giveUpButton = new javax.swing.JButton();

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

        topLeft.setBackground(new java.awt.Color(255, 51, 51));
        topLeft.setName("topLeft"); // NOI18N

        topLeft_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/topLeft.jpg"))); // NOI18N

        javax.swing.GroupLayout topLeftLayout = new javax.swing.GroupLayout(topLeft);
        topLeft.setLayout(topLeftLayout);
        topLeftLayout.setHorizontalGroup(
            topLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topLeft_img)
        );
        topLeftLayout.setVerticalGroup(
            topLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLeftLayout.createSequentialGroup()
                .addComponent(topLeft_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        top1.setAutoscrolls(true);
        top1.setPreferredSize(new java.awt.Dimension(80, 100));
        top1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                top1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                top1MouseExited(evt);
            }
        });

        top1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top1.jpg"))); // NOI18N

        javax.swing.GroupLayout top1Layout = new javax.swing.GroupLayout(top1);
        top1.setLayout(top1Layout);
        top1Layout.setHorizontalGroup(
            top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top1_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top1Layout.setVerticalGroup(
            top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top1_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        top2.setPreferredSize(new java.awt.Dimension(80, 100));

        top2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top2.jpg"))); // NOI18N

        javax.swing.GroupLayout top2Layout = new javax.swing.GroupLayout(top2);
        top2.setLayout(top2Layout);
        top2Layout.setHorizontalGroup(
            top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top2_img, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );
        top2Layout.setVerticalGroup(
            top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top2_img, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        top3.setPreferredSize(new java.awt.Dimension(80, 100));

        top3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top5.jpg"))); // NOI18N

        javax.swing.GroupLayout top3Layout = new javax.swing.GroupLayout(top3);
        top3.setLayout(top3Layout);
        top3Layout.setHorizontalGroup(
            top3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(top3_img))
        );
        top3Layout.setVerticalGroup(
            top3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(top3_img))
        );

        top4.setPreferredSize(new java.awt.Dimension(80, 100));

        top4_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top4.jpg"))); // NOI18N

        javax.swing.GroupLayout top4Layout = new javax.swing.GroupLayout(top4);
        top4.setLayout(top4Layout);
        top4Layout.setHorizontalGroup(
            top4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top4Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(top4_img))
        );
        top4Layout.setVerticalGroup(
            top4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(top4_img))
        );

        top5.setPreferredSize(new java.awt.Dimension(80, 100));

        top5_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top3.jpg"))); // NOI18N

        javax.swing.GroupLayout top5Layout = new javax.swing.GroupLayout(top5);
        top5.setLayout(top5Layout);
        top5Layout.setHorizontalGroup(
            top5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top5Layout.createSequentialGroup()
                .addComponent(top5_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        top5Layout.setVerticalGroup(
            top5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(top5_img))
        );

        top6.setPreferredSize(new java.awt.Dimension(80, 100));

        top6_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top6.jpg"))); // NOI18N

        javax.swing.GroupLayout top6Layout = new javax.swing.GroupLayout(top6);
        top6.setLayout(top6Layout);
        top6Layout.setHorizontalGroup(
            top6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top6Layout.createSequentialGroup()
                .addComponent(top6_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        top6Layout.setVerticalGroup(
            top6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top6Layout.createSequentialGroup()
                .addComponent(top6_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        top7.setPreferredSize(new java.awt.Dimension(80, 100));

        top7_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top7.jpg"))); // NOI18N

        javax.swing.GroupLayout top7Layout = new javax.swing.GroupLayout(top7);
        top7.setLayout(top7Layout);
        top7Layout.setHorizontalGroup(
            top7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top7Layout.createSequentialGroup()
                .addComponent(top7_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        top7Layout.setVerticalGroup(
            top7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top7Layout.createSequentialGroup()
                .addComponent(top7_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        top8.setPreferredSize(new java.awt.Dimension(80, 100));

        top8_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top8.jpg"))); // NOI18N

        javax.swing.GroupLayout top8Layout = new javax.swing.GroupLayout(top8);
        top8.setLayout(top8Layout);
        top8Layout.setHorizontalGroup(
            top8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top8_img, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );
        top8Layout.setVerticalGroup(
            top8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top8_img, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        top9.setPreferredSize(new java.awt.Dimension(80, 100));

        top9_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/top9.jpg"))); // NOI18N

        javax.swing.GroupLayout top9Layout = new javax.swing.GroupLayout(top9);
        top9.setLayout(top9Layout);
        top9Layout.setHorizontalGroup(
            top9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top9Layout.createSequentialGroup()
                .addComponent(top9_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        top9Layout.setVerticalGroup(
            top9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top9_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        topRight.setBackground(new java.awt.Color(255, 51, 51));
        topRight.setName("topLeft"); // NOI18N

        topRight_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/topRight.jpg"))); // NOI18N

        javax.swing.GroupLayout topRightLayout = new javax.swing.GroupLayout(topRight);
        topRight.setLayout(topRightLayout);
        topRightLayout.setHorizontalGroup(
            topRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topRight_img)
        );
        topRightLayout.setVerticalGroup(
            topRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topRight_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botLeft.setBackground(new java.awt.Color(102, 102, 102));
        botLeft.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botLeft.setName("topLeft"); // NOI18N

        botLeft_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/botLeft.jpg"))); // NOI18N

        javax.swing.GroupLayout botLeftLayout = new javax.swing.GroupLayout(botLeft);
        botLeft.setLayout(botLeftLayout);
        botLeftLayout.setHorizontalGroup(
            botLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botLeftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botLeft_img, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botLeftLayout.setVerticalGroup(
            botLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botLeft_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bot9.setPreferredSize(new java.awt.Dimension(80, 100));

        bot9_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot9.jpg"))); // NOI18N

        javax.swing.GroupLayout bot9Layout = new javax.swing.GroupLayout(bot9);
        bot9.setLayout(bot9Layout);
        bot9Layout.setHorizontalGroup(
            bot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot9Layout.createSequentialGroup()
                .addComponent(bot9_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bot9Layout.setVerticalGroup(
            bot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot9Layout.createSequentialGroup()
                .addComponent(bot9_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bot8.setPreferredSize(new java.awt.Dimension(80, 100));

        bot8_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot8.jpg"))); // NOI18N

        javax.swing.GroupLayout bot8Layout = new javax.swing.GroupLayout(bot8);
        bot8.setLayout(bot8Layout);
        bot8Layout.setHorizontalGroup(
            bot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot8Layout.createSequentialGroup()
                .addComponent(bot8_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        bot8Layout.setVerticalGroup(
            bot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot8Layout.createSequentialGroup()
                .addComponent(bot8_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bot7.setPreferredSize(new java.awt.Dimension(80, 100));

        bot7_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot7.jpg"))); // NOI18N

        javax.swing.GroupLayout bot7Layout = new javax.swing.GroupLayout(bot7);
        bot7.setLayout(bot7Layout);
        bot7Layout.setHorizontalGroup(
            bot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot7Layout.createSequentialGroup()
                .addComponent(bot7_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        bot7Layout.setVerticalGroup(
            bot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot7Layout.createSequentialGroup()
                .addComponent(bot7_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bot6.setPreferredSize(new java.awt.Dimension(80, 100));

        bot6_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot6.jpg"))); // NOI18N

        javax.swing.GroupLayout bot6Layout = new javax.swing.GroupLayout(bot6);
        bot6.setLayout(bot6Layout);
        bot6Layout.setHorizontalGroup(
            bot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot6Layout.createSequentialGroup()
                .addComponent(bot6_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bot6Layout.setVerticalGroup(
            bot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot6Layout.createSequentialGroup()
                .addComponent(bot6_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bot5.setPreferredSize(new java.awt.Dimension(80, 100));

        bot5_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot5.jpg"))); // NOI18N

        javax.swing.GroupLayout bot5Layout = new javax.swing.GroupLayout(bot5);
        bot5.setLayout(bot5Layout);
        bot5Layout.setHorizontalGroup(
            bot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot5Layout.createSequentialGroup()
                .addComponent(bot5_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        bot5Layout.setVerticalGroup(
            bot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot5Layout.createSequentialGroup()
                .addComponent(bot5_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bot4.setPreferredSize(new java.awt.Dimension(80, 100));

        bot4_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot4.jpg"))); // NOI18N

        javax.swing.GroupLayout bot4Layout = new javax.swing.GroupLayout(bot4);
        bot4.setLayout(bot4Layout);
        bot4Layout.setHorizontalGroup(
            bot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot4Layout.createSequentialGroup()
                .addComponent(bot4_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        bot4Layout.setVerticalGroup(
            bot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot4Layout.createSequentialGroup()
                .addComponent(bot4_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bot3.setPreferredSize(new java.awt.Dimension(80, 100));

        bot3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot3.jpg"))); // NOI18N

        javax.swing.GroupLayout bot3Layout = new javax.swing.GroupLayout(bot3);
        bot3.setLayout(bot3Layout);
        bot3Layout.setHorizontalGroup(
            bot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot3Layout.createSequentialGroup()
                .addComponent(bot3_img)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        bot3Layout.setVerticalGroup(
            bot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bot3Layout.createSequentialGroup()
                .addComponent(bot3_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bot2.setPreferredSize(new java.awt.Dimension(80, 100));

        bot2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot2.jpg"))); // NOI18N

        javax.swing.GroupLayout bot2Layout = new javax.swing.GroupLayout(bot2);
        bot2.setLayout(bot2Layout);
        bot2Layout.setHorizontalGroup(
            bot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot2_img, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );
        bot2Layout.setVerticalGroup(
            bot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bot2Layout.createSequentialGroup()
                .addComponent(bot2_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bot1.setPreferredSize(new java.awt.Dimension(80, 100));

        bot1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/bot1.jpg"))); // NOI18N

        javax.swing.GroupLayout bot1Layout = new javax.swing.GroupLayout(bot1);
        bot1.setLayout(bot1Layout);
        bot1Layout.setHorizontalGroup(
            bot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot1_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bot1Layout.setVerticalGroup(
            bot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bot1_img, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        botRight.setBackground(new java.awt.Color(255, 51, 51));
        botRight.setName("topLeft"); // NOI18N

        botRight_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/botRight.jpg"))); // NOI18N

        javax.swing.GroupLayout botRightLayout = new javax.swing.GroupLayout(botRight);
        botRight.setLayout(botRightLayout);
        botRightLayout.setHorizontalGroup(
            botRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botRight_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        botRightLayout.setVerticalGroup(
            botRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botRightLayout.createSequentialGroup()
                .addComponent(botRight_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        left9.setPreferredSize(new java.awt.Dimension(80, 100));

        left9_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left9.jpg"))); // NOI18N

        javax.swing.GroupLayout left9Layout = new javax.swing.GroupLayout(left9);
        left9.setLayout(left9Layout);
        left9Layout.setHorizontalGroup(
            left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, left9Layout.createSequentialGroup()
                .addComponent(left9_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        left9Layout.setVerticalGroup(
            left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left9Layout.createSequentialGroup()
                .addComponent(left9_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        left8.setPreferredSize(new java.awt.Dimension(80, 100));

        left8_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left8.jpg"))); // NOI18N

        javax.swing.GroupLayout left8Layout = new javax.swing.GroupLayout(left8);
        left8.setLayout(left8Layout);
        left8Layout.setHorizontalGroup(
            left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left8_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        left8Layout.setVerticalGroup(
            left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left8Layout.createSequentialGroup()
                .addComponent(left8_img)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        left7.setPreferredSize(new java.awt.Dimension(80, 100));

        left7_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left7.jpg"))); // NOI18N

        javax.swing.GroupLayout left7Layout = new javax.swing.GroupLayout(left7);
        left7.setLayout(left7Layout);
        left7Layout.setHorizontalGroup(
            left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left7Layout.createSequentialGroup()
                .addComponent(left7_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        left7Layout.setVerticalGroup(
            left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left7Layout.createSequentialGroup()
                .addComponent(left7_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        left6.setPreferredSize(new java.awt.Dimension(80, 100));

        left6_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left6.jpg"))); // NOI18N

        javax.swing.GroupLayout left6Layout = new javax.swing.GroupLayout(left6);
        left6.setLayout(left6Layout);
        left6Layout.setHorizontalGroup(
            left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left6Layout.createSequentialGroup()
                .addComponent(left6_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        left6Layout.setVerticalGroup(
            left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left6Layout.createSequentialGroup()
                .addComponent(left6_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        left5.setPreferredSize(new java.awt.Dimension(80, 100));

        left5_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left5.jpg"))); // NOI18N

        javax.swing.GroupLayout left5Layout = new javax.swing.GroupLayout(left5);
        left5.setLayout(left5Layout);
        left5Layout.setHorizontalGroup(
            left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left5Layout.createSequentialGroup()
                .addComponent(left5_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        left5Layout.setVerticalGroup(
            left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left5Layout.createSequentialGroup()
                .addComponent(left5_img)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        left4.setPreferredSize(new java.awt.Dimension(80, 100));

        left4_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left4.jpg"))); // NOI18N

        javax.swing.GroupLayout left4Layout = new javax.swing.GroupLayout(left4);
        left4.setLayout(left4Layout);
        left4Layout.setHorizontalGroup(
            left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left4Layout.createSequentialGroup()
                .addComponent(left4_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        left4Layout.setVerticalGroup(
            left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left4Layout.createSequentialGroup()
                .addComponent(left4_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        left3.setPreferredSize(new java.awt.Dimension(80, 100));

        left3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left3.jpg"))); // NOI18N

        javax.swing.GroupLayout left3Layout = new javax.swing.GroupLayout(left3);
        left3.setLayout(left3Layout);
        left3Layout.setHorizontalGroup(
            left3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left3Layout.createSequentialGroup()
                .addComponent(left3_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        left3Layout.setVerticalGroup(
            left3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left3Layout.createSequentialGroup()
                .addComponent(left3_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        left2.setPreferredSize(new java.awt.Dimension(80, 100));

        left2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left2.jpg"))); // NOI18N

        javax.swing.GroupLayout left2Layout = new javax.swing.GroupLayout(left2);
        left2.setLayout(left2Layout);
        left2Layout.setHorizontalGroup(
            left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left2Layout.createSequentialGroup()
                .addComponent(left2_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        left2Layout.setVerticalGroup(
            left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left2Layout.createSequentialGroup()
                .addComponent(left2_img)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        left1.setPreferredSize(new java.awt.Dimension(80, 100));

        left1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/left1.jpg"))); // NOI18N

        javax.swing.GroupLayout left1Layout = new javax.swing.GroupLayout(left1);
        left1.setLayout(left1Layout);
        left1Layout.setHorizontalGroup(
            left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left1Layout.createSequentialGroup()
                .addComponent(left1_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        left1Layout.setVerticalGroup(
            left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left1Layout.createSequentialGroup()
                .addComponent(left1_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        right1.setPreferredSize(new java.awt.Dimension(80, 100));

        right1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right1.jpg"))); // NOI18N

        javax.swing.GroupLayout right1Layout = new javax.swing.GroupLayout(right1);
        right1.setLayout(right1Layout);
        right1Layout.setHorizontalGroup(
            right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right1_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        right1Layout.setVerticalGroup(
            right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right1Layout.createSequentialGroup()
                .addComponent(right1_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        right2.setPreferredSize(new java.awt.Dimension(80, 100));

        right2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right2.jpg"))); // NOI18N

        javax.swing.GroupLayout right2Layout = new javax.swing.GroupLayout(right2);
        right2.setLayout(right2Layout);
        right2Layout.setHorizontalGroup(
            right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right2Layout.createSequentialGroup()
                .addComponent(right2_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        right2Layout.setVerticalGroup(
            right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right2Layout.createSequentialGroup()
                .addComponent(right2_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        right3.setPreferredSize(new java.awt.Dimension(80, 100));

        right3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right3.jpg"))); // NOI18N

        javax.swing.GroupLayout right3Layout = new javax.swing.GroupLayout(right3);
        right3.setLayout(right3Layout);
        right3Layout.setHorizontalGroup(
            right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right3Layout.createSequentialGroup()
                .addComponent(right3_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        right3Layout.setVerticalGroup(
            right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right3Layout.createSequentialGroup()
                .addComponent(right3_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        right4.setPreferredSize(new java.awt.Dimension(80, 100));

        right4_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right4.jpg"))); // NOI18N

        javax.swing.GroupLayout right4Layout = new javax.swing.GroupLayout(right4);
        right4.setLayout(right4Layout);
        right4Layout.setHorizontalGroup(
            right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right4Layout.createSequentialGroup()
                .addComponent(right4_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        right4Layout.setVerticalGroup(
            right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right4Layout.createSequentialGroup()
                .addComponent(right4_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        right5.setPreferredSize(new java.awt.Dimension(80, 100));

        right5_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right5.jpg"))); // NOI18N

        javax.swing.GroupLayout right5Layout = new javax.swing.GroupLayout(right5);
        right5.setLayout(right5Layout);
        right5Layout.setHorizontalGroup(
            right5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right5Layout.createSequentialGroup()
                .addComponent(right5_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        right5Layout.setVerticalGroup(
            right5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right5Layout.createSequentialGroup()
                .addComponent(right5_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        right6.setPreferredSize(new java.awt.Dimension(80, 100));

        right6_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right6.jpg"))); // NOI18N

        javax.swing.GroupLayout right6Layout = new javax.swing.GroupLayout(right6);
        right6.setLayout(right6Layout);
        right6Layout.setHorizontalGroup(
            right6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right6Layout.createSequentialGroup()
                .addComponent(right6_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        right6Layout.setVerticalGroup(
            right6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right6Layout.createSequentialGroup()
                .addComponent(right6_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        right7.setPreferredSize(new java.awt.Dimension(80, 100));

        right7_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right7.jpg"))); // NOI18N

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
            .addGroup(right7Layout.createSequentialGroup()
                .addComponent(right7_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        right8.setPreferredSize(new java.awt.Dimension(80, 100));

        right8_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right8.jpg"))); // NOI18N

        javax.swing.GroupLayout right8Layout = new javax.swing.GroupLayout(right8);
        right8.setLayout(right8Layout);
        right8Layout.setHorizontalGroup(
            right8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right8Layout.createSequentialGroup()
                .addComponent(right8_img, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        right8Layout.setVerticalGroup(
            right8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right8Layout.createSequentialGroup()
                .addComponent(right8_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        right9.setPreferredSize(new java.awt.Dimension(80, 100));

        right9_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Map/right9.jpg"))); // NOI18N

        javax.swing.GroupLayout right9Layout = new javax.swing.GroupLayout(right9);
        right9.setLayout(right9Layout);
        right9Layout.setHorizontalGroup(
            right9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right9Layout.createSequentialGroup()
                .addComponent(right9_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        right9Layout.setVerticalGroup(
            right9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right9Layout.createSequentialGroup()
                .addComponent(right9_img)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(left9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(top2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(top3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(top4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(top5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(top6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(top7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(top8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(top9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addComponent(bot9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(bot7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(right2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(right1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addComponent(topRight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(top8, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(top9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(top6, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(top5, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(top4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(top3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(top1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(top2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(top7, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(topLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addComponent(left9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(left8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(left1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addComponent(right1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bot9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bot1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bot2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        playerPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        startButton.setText("Start Game");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 1"));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout playerPaneLayout = new javax.swing.GroupLayout(playerPane);
        playerPane.setLayout(playerPaneLayout);
        playerPaneLayout.setHorizontalGroup(
            playerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(playerPaneLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(startButton)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        playerPaneLayout.setVerticalGroup(
            playerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPaneLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rollButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rollButton.setText("Roll");
        rollButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rollButtonMouseClicked(evt);
            }
        });

        buyButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buyButton.setText("Buy");
        buyButton.setMaximumSize(new java.awt.Dimension(85, 25));
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

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
        giveUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveUpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tickProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(giveUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(upgradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tickProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upgradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giveUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 442, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        //private int playerNum= newGameFrame.getPlayerNumber();
        // if playerNum == 2 then dataPlayer3.setVisible(false); dataPlayer4.setVisible(false);
        // 
        
        gameLog.append(">>Game has been started!\n");
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void top1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top1MouseEntered
        try {
	Image img = ImageIO.read(getClass().getResource("resources/left_4.jpg"));
	hoverCard.setIcon(new ImageIcon(img));
        hoverPanel.setVisible(true);
	hoverCard.setVisible(true);
	} catch (IOException ex) {
	}
    }//GEN-LAST:event_top1MouseEntered

    private void top1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top1MouseExited
        hoverCard.setVisible(false);
        hoverPanel.setVisible(false);
    }//GEN-LAST:event_top1MouseExited

    private void rollButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rollButtonMouseClicked
        int value = tickProgressBar.getValue();
        tickProgressBar.setValue(value - 1);
    }//GEN-LAST:event_rollButtonMouseClicked

    private void giveUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveUpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giveUpButtonActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyButtonActionPerformed

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
    private javax.swing.JPanel bot1;
    private javax.swing.JLabel bot1_img;
    private javax.swing.JPanel bot2;
    private javax.swing.JLabel bot2_img;
    private javax.swing.JPanel bot3;
    private javax.swing.JLabel bot3_img;
    private javax.swing.JPanel bot4;
    private javax.swing.JLabel bot4_img;
    private javax.swing.JPanel bot5;
    private javax.swing.JLabel bot5_img;
    private javax.swing.JPanel bot6;
    private javax.swing.JLabel bot6_img;
    private javax.swing.JPanel bot7;
    private javax.swing.JLabel bot7_img;
    private javax.swing.JPanel bot8;
    private javax.swing.JLabel bot8_img;
    private javax.swing.JPanel bot9;
    private javax.swing.JLabel bot9_img;
    private javax.swing.JPanel botLeft;
    private javax.swing.JLabel botLeft_img;
    private javax.swing.JPanel botRight;
    private javax.swing.JLabel botRight_img;
    private javax.swing.JButton buyButton;
    private javax.swing.JButton giveUpButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel left1;
    private javax.swing.JLabel left1_img;
    private javax.swing.JPanel left2;
    private javax.swing.JLabel left2_img;
    private javax.swing.JPanel left3;
    private javax.swing.JLabel left3_img;
    private javax.swing.JPanel left4;
    private javax.swing.JLabel left4_img;
    private javax.swing.JPanel left5;
    private javax.swing.JLabel left5_img;
    private javax.swing.JPanel left6;
    private javax.swing.JLabel left6_img;
    private javax.swing.JPanel left7;
    private javax.swing.JLabel left7_img;
    private javax.swing.JPanel left8;
    private javax.swing.JLabel left8_img;
    private javax.swing.JPanel left9;
    private javax.swing.JLabel left9_img;
    private javax.swing.JButton payButton;
    private javax.swing.JPanel playerPane;
    private javax.swing.JPanel right1;
    private javax.swing.JLabel right1_img;
    private javax.swing.JPanel right2;
    private javax.swing.JLabel right2_img;
    private javax.swing.JPanel right3;
    private javax.swing.JLabel right3_img;
    private javax.swing.JPanel right4;
    private javax.swing.JLabel right4_img;
    private javax.swing.JPanel right5;
    private javax.swing.JLabel right5_img;
    private javax.swing.JPanel right6;
    private javax.swing.JLabel right6_img;
    private javax.swing.JPanel right7;
    private javax.swing.JLabel right7_img;
    private javax.swing.JPanel right8;
    private javax.swing.JLabel right8_img;
    private javax.swing.JPanel right9;
    private javax.swing.JLabel right9_img;
    private javax.swing.JButton rollButton;
    private javax.swing.JButton sellButton;
    private javax.swing.JButton startButton;
    private javax.swing.JProgressBar tickProgressBar;
    private javax.swing.JPanel top1;
    private javax.swing.JLabel top1_img;
    private javax.swing.JPanel top2;
    private javax.swing.JLabel top2_img;
    private javax.swing.JPanel top3;
    private javax.swing.JLabel top3_img;
    private javax.swing.JPanel top4;
    private javax.swing.JLabel top4_img;
    private javax.swing.JPanel top5;
    private javax.swing.JLabel top5_img;
    private javax.swing.JPanel top6;
    private javax.swing.JLabel top6_img;
    private javax.swing.JPanel top7;
    private javax.swing.JLabel top7_img;
    private javax.swing.JPanel top8;
    private javax.swing.JLabel top8_img;
    private javax.swing.JPanel top9;
    private javax.swing.JLabel top9_img;
    private javax.swing.JPanel topLeft;
    private javax.swing.JLabel topLeft_img;
    private javax.swing.JPanel topRight;
    private javax.swing.JLabel topRight_img;
    private javax.swing.JButton upgradeButton;
    // End of variables declaration//GEN-END:variables
}
