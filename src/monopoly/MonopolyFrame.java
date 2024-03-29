/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.monopoly;

/*
    MVC : VIEW
*/

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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
    
    public MonopolyFrame(NewGame newGameFrame) {
        p1Name = newGameFrame.getPlayerName(1);
        p2Name = newGameFrame.getPlayerName(2);
        p3Name = newGameFrame.getPlayerName(3);
        p4Name = newGameFrame.getPlayerName(4);
        initComponents();
        initBoardGame();



        rollButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt0) {
                rollButton.setActionCommand("roll");
                command = 1;
                gameLog.append("Roll Button kepencet!!!\n");
            }
        });

        payButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt0) {
                payButton.setActionCommand("pay");
                command = 2;
                gameLog.append("Pay Button kepencet!!!\n");
            }
        });
        
        buyButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt0) {
                buyButton.setActionCommand("buy");
                command = 3;
                gameLog.append("Buy Button kepencet!!!\n");
            }
        });

        upgradeButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt0) {
                upgradeButton.setActionCommand("upgrade");
                command = 5;
                gameLog.append("upgrade Button !!\n");
            }
        });

        sellButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt0) {
                sellButton.setActionCommand("sell");
                command = 4;
                gameLog.append("Sell Button! \n");
            }
        });
        gameLog.setVisible(false);
    }

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardPanel = new javax.swing.JPanel();
        topLeft = new javax.swing.JLayeredPane();
        topRight = new javax.swing.JLayeredPane();
        botRight = new javax.swing.JLayeredPane();
        botLeft = new javax.swing.JLayeredPane();
        bot9 = new javax.swing.JLayeredPane();
        bot8 = new javax.swing.JLayeredPane();
        bot1 = new javax.swing.JLayeredPane();
        bot3 = new javax.swing.JLayeredPane();
        bot4 = new javax.swing.JLayeredPane();
        bot6 = new javax.swing.JLayeredPane();
        bot7 = new javax.swing.JLayeredPane();
        bot5 = new javax.swing.JLayeredPane();
        right1 = new javax.swing.JLayeredPane();
        right2 = new javax.swing.JLayeredPane();
        right3 = new javax.swing.JLayeredPane();
        right4 = new javax.swing.JLayeredPane();
        right5 = new javax.swing.JLayeredPane();
        right6 = new javax.swing.JLayeredPane();
        right7 = new javax.swing.JLayeredPane();
        right8 = new javax.swing.JLayeredPane();
        right9 = new javax.swing.JLayeredPane();
        top1 = new javax.swing.JLayeredPane();
        top2 = new javax.swing.JLayeredPane();
        top3 = new javax.swing.JLayeredPane();
        top4 = new javax.swing.JLayeredPane();
        top5 = new javax.swing.JLayeredPane();
        top6 = new javax.swing.JLayeredPane();
        top7 = new javax.swing.JLayeredPane();
        top8 = new javax.swing.JLayeredPane();
        top9 = new javax.swing.JLayeredPane();
        left9 = new javax.swing.JLayeredPane();
        left8 = new javax.swing.JLayeredPane();
        left7 = new javax.swing.JLayeredPane();
        left6 = new javax.swing.JLayeredPane();
        left5 = new javax.swing.JLayeredPane();
        left4 = new javax.swing.JLayeredPane();
        left3 = new javax.swing.JLayeredPane();
        left2 = new javax.swing.JLayeredPane();
        left1 = new javax.swing.JLayeredPane();
        bot2 = new javax.swing.JLayeredPane();
        panel_dice1 = new javax.swing.JPanel();
        dice1 = new javax.swing.JLabel();
        panel_dice2 = new javax.swing.JPanel();
        dice2 = new javax.swing.JLabel();
        playerPane = new javax.swing.JPanel();
        player1Panel = new javax.swing.JPanel();
        label_money_player1 = new javax.swing.JLabel();
        label_pos_player1 = new javax.swing.JLabel();
        label_prop1 = new javax.swing.JLabel();
        prop1PrintButton = new javax.swing.JButton();
        money_player1 = new javax.swing.JLabel();
        pos_player1 = new javax.swing.JLabel();
        player2Panel = new javax.swing.JPanel();
        label_money_player2 = new javax.swing.JLabel();
        label_pos_player2 = new javax.swing.JLabel();
        label_prop2 = new javax.swing.JLabel();
        prop2PrintButton = new javax.swing.JButton();
        money_player2 = new javax.swing.JLabel();
        pos_player2 = new javax.swing.JLabel();
        player3Panel = new javax.swing.JPanel();
        label_money_player3 = new javax.swing.JLabel();
        label_pos_player3 = new javax.swing.JLabel();
        label_prop3 = new javax.swing.JLabel();
        prop3PrintButton = new javax.swing.JButton();
        money_player3 = new javax.swing.JLabel();
        pos_player3 = new javax.swing.JLabel();
        player4Panel = new javax.swing.JPanel();
        label_money_player4 = new javax.swing.JLabel();
        label_pos_player4 = new javax.swing.JLabel();
        label_prop4 = new javax.swing.JLabel();
        prop4PrintButton = new javax.swing.JButton();
        money_player4 = new javax.swing.JLabel();
        pos_player4 = new javax.swing.JLabel();
        rollButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        upgradeButton = new javax.swing.JButton();
        sellButton = new javax.swing.JButton();
        tickProgressBar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        gameLog = new javax.swing.JTextArea();
        gameLogButton = new javax.swing.JToggleButton();
        payButton = new javax.swing.JButton();

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

        javax.swing.GroupLayout topLeftLayout = new javax.swing.GroupLayout(topLeft);
        topLeft.setLayout(topLeftLayout);
        topLeftLayout.setHorizontalGroup(
            topLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        topLeftLayout.setVerticalGroup(
            topLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout topRightLayout = new javax.swing.GroupLayout(topRight);
        topRight.setLayout(topRightLayout);
        topRightLayout.setHorizontalGroup(
            topRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        topRightLayout.setVerticalGroup(
            topRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botLeftLayout = new javax.swing.GroupLayout(botLeft);
        botLeft.setLayout(botLeftLayout);
        botLeftLayout.setHorizontalGroup(
            botLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        botLeftLayout.setVerticalGroup(
            botLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bot9Layout = new javax.swing.GroupLayout(bot9);
        bot9.setLayout(bot9Layout);
        bot9Layout.setHorizontalGroup(
            bot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        bot9Layout.setVerticalGroup(
            bot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bot8Layout = new javax.swing.GroupLayout(bot8);
        bot8.setLayout(bot8Layout);
        bot8Layout.setHorizontalGroup(
            bot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        bot8Layout.setVerticalGroup(
            bot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bot1Layout = new javax.swing.GroupLayout(bot1);
        bot1.setLayout(bot1Layout);
        bot1Layout.setHorizontalGroup(
            bot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        bot1Layout.setVerticalGroup(
            bot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bot3Layout = new javax.swing.GroupLayout(bot3);
        bot3.setLayout(bot3Layout);
        bot3Layout.setHorizontalGroup(
            bot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        bot3Layout.setVerticalGroup(
            bot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bot4Layout = new javax.swing.GroupLayout(bot4);
        bot4.setLayout(bot4Layout);
        bot4Layout.setHorizontalGroup(
            bot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        bot4Layout.setVerticalGroup(
            bot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bot6Layout = new javax.swing.GroupLayout(bot6);
        bot6.setLayout(bot6Layout);
        bot6Layout.setHorizontalGroup(
            bot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        bot6Layout.setVerticalGroup(
            bot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bot7Layout = new javax.swing.GroupLayout(bot7);
        bot7.setLayout(bot7Layout);
        bot7Layout.setHorizontalGroup(
            bot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        bot7Layout.setVerticalGroup(
            bot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bot5Layout = new javax.swing.GroupLayout(bot5);
        bot5.setLayout(bot5Layout);
        bot5Layout.setHorizontalGroup(
            bot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        bot5Layout.setVerticalGroup(
            bot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout right1Layout = new javax.swing.GroupLayout(right1);
        right1.setLayout(right1Layout);
        right1Layout.setHorizontalGroup(
            right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        right1Layout.setVerticalGroup(
            right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout right2Layout = new javax.swing.GroupLayout(right2);
        right2.setLayout(right2Layout);
        right2Layout.setHorizontalGroup(
            right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        right2Layout.setVerticalGroup(
            right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout right3Layout = new javax.swing.GroupLayout(right3);
        right3.setLayout(right3Layout);
        right3Layout.setHorizontalGroup(
            right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        right3Layout.setVerticalGroup(
            right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout right4Layout = new javax.swing.GroupLayout(right4);
        right4.setLayout(right4Layout);
        right4Layout.setHorizontalGroup(
            right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        right4Layout.setVerticalGroup(
            right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout right5Layout = new javax.swing.GroupLayout(right5);
        right5.setLayout(right5Layout);
        right5Layout.setHorizontalGroup(
            right5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        right5Layout.setVerticalGroup(
            right5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout right6Layout = new javax.swing.GroupLayout(right6);
        right6.setLayout(right6Layout);
        right6Layout.setHorizontalGroup(
            right6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        right6Layout.setVerticalGroup(
            right6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout right7Layout = new javax.swing.GroupLayout(right7);
        right7.setLayout(right7Layout);
        right7Layout.setHorizontalGroup(
            right7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        right7Layout.setVerticalGroup(
            right7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout right8Layout = new javax.swing.GroupLayout(right8);
        right8.setLayout(right8Layout);
        right8Layout.setHorizontalGroup(
            right8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        right8Layout.setVerticalGroup(
            right8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout right9Layout = new javax.swing.GroupLayout(right9);
        right9.setLayout(right9Layout);
        right9Layout.setHorizontalGroup(
            right9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        right9Layout.setVerticalGroup(
            right9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout top1Layout = new javax.swing.GroupLayout(top1);
        top1.setLayout(top1Layout);
        top1Layout.setHorizontalGroup(
            top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        top1Layout.setVerticalGroup(
            top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout top2Layout = new javax.swing.GroupLayout(top2);
        top2.setLayout(top2Layout);
        top2Layout.setHorizontalGroup(
            top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        top2Layout.setVerticalGroup(
            top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout top3Layout = new javax.swing.GroupLayout(top3);
        top3.setLayout(top3Layout);
        top3Layout.setHorizontalGroup(
            top3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        top3Layout.setVerticalGroup(
            top3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout top4Layout = new javax.swing.GroupLayout(top4);
        top4.setLayout(top4Layout);
        top4Layout.setHorizontalGroup(
            top4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        top4Layout.setVerticalGroup(
            top4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout top5Layout = new javax.swing.GroupLayout(top5);
        top5.setLayout(top5Layout);
        top5Layout.setHorizontalGroup(
            top5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        top5Layout.setVerticalGroup(
            top5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout top6Layout = new javax.swing.GroupLayout(top6);
        top6.setLayout(top6Layout);
        top6Layout.setHorizontalGroup(
            top6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        top6Layout.setVerticalGroup(
            top6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout top7Layout = new javax.swing.GroupLayout(top7);
        top7.setLayout(top7Layout);
        top7Layout.setHorizontalGroup(
            top7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        top7Layout.setVerticalGroup(
            top7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout top8Layout = new javax.swing.GroupLayout(top8);
        top8.setLayout(top8Layout);
        top8Layout.setHorizontalGroup(
            top8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        top8Layout.setVerticalGroup(
            top8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout top9Layout = new javax.swing.GroupLayout(top9);
        top9.setLayout(top9Layout);
        top9Layout.setHorizontalGroup(
            top9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        top9Layout.setVerticalGroup(
            top9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout left9Layout = new javax.swing.GroupLayout(left9);
        left9.setLayout(left9Layout);
        left9Layout.setHorizontalGroup(
            left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        left9Layout.setVerticalGroup(
            left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout left8Layout = new javax.swing.GroupLayout(left8);
        left8.setLayout(left8Layout);
        left8Layout.setHorizontalGroup(
            left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        left8Layout.setVerticalGroup(
            left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout left7Layout = new javax.swing.GroupLayout(left7);
        left7.setLayout(left7Layout);
        left7Layout.setHorizontalGroup(
            left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        left7Layout.setVerticalGroup(
            left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout left6Layout = new javax.swing.GroupLayout(left6);
        left6.setLayout(left6Layout);
        left6Layout.setHorizontalGroup(
            left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        left6Layout.setVerticalGroup(
            left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout left5Layout = new javax.swing.GroupLayout(left5);
        left5.setLayout(left5Layout);
        left5Layout.setHorizontalGroup(
            left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        left5Layout.setVerticalGroup(
            left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout left4Layout = new javax.swing.GroupLayout(left4);
        left4.setLayout(left4Layout);
        left4Layout.setHorizontalGroup(
            left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        left4Layout.setVerticalGroup(
            left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout left3Layout = new javax.swing.GroupLayout(left3);
        left3.setLayout(left3Layout);
        left3Layout.setHorizontalGroup(
            left3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        left3Layout.setVerticalGroup(
            left3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout left2Layout = new javax.swing.GroupLayout(left2);
        left2.setLayout(left2Layout);
        left2Layout.setHorizontalGroup(
            left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        left2Layout.setVerticalGroup(
            left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout left1Layout = new javax.swing.GroupLayout(left1);
        left1.setLayout(left1Layout);
        left1Layout.setHorizontalGroup(
            left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        left1Layout.setVerticalGroup(
            left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bot2Layout = new javax.swing.GroupLayout(bot2);
        bot2.setLayout(bot2Layout);
        bot2Layout.setHorizontalGroup(
            bot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );
        bot2Layout.setVerticalGroup(
            bot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_dice1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panel_dice1Layout = new javax.swing.GroupLayout(panel_dice1);
        panel_dice1.setLayout(panel_dice1Layout);
        panel_dice1Layout.setHorizontalGroup(
            panel_dice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dice1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_dice1Layout.setVerticalGroup(
            panel_dice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dice1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panel_dice2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panel_dice2Layout = new javax.swing.GroupLayout(panel_dice2);
        panel_dice2.setLayout(panel_dice2Layout);
        panel_dice2Layout.setHorizontalGroup(
            panel_dice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dice2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_dice2Layout.setVerticalGroup(
            panel_dice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dice2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
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
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardPanelLayout.createSequentialGroup()
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
                        .addComponent(top9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(panel_dice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_dice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
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
                    .addComponent(topRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(boardPanelLayout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botRight, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_dice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(left6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(left5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel_dice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(left1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot1)
                    .addComponent(bot6)
                    .addComponent(bot5)
                    .addComponent(bot7)
                    .addComponent(bot2)
                    .addComponent(bot3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bot4)
                    .addComponent(bot8)
                    .addComponent(bot9)
                    .addComponent(botRight))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        playerPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        player1Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(p1Name));

        label_money_player1.setText("Money :");

        label_pos_player1.setText("Position :");

        label_prop1.setText("Property :");

        prop1PrintButton.setText("Show Property");

        javax.swing.GroupLayout player1PanelLayout = new javax.swing.GroupLayout(player1Panel);
        player1Panel.setLayout(player1PanelLayout);
        player1PanelLayout.setHorizontalGroup(
            player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(player1PanelLayout.createSequentialGroup()
                        .addComponent(label_money_player1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(money_player1))
                    .addGroup(player1PanelLayout.createSequentialGroup()
                        .addComponent(label_pos_player1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos_player1))
                    .addComponent(label_prop1)
                    .addComponent(prop1PrintButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        player1PanelLayout.setVerticalGroup(
            player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_money_player1)
                    .addComponent(money_player1))
                .addGap(18, 18, 18)
                .addGroup(player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_pos_player1)
                    .addComponent(pos_player1))
                .addGap(18, 18, 18)
                .addComponent(label_prop1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prop1PrintButton)
                .addGap(10, 10, 10))
        );

        player2Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(p2Name));

        label_money_player2.setText("Money :");

        label_pos_player2.setText("Position :");

        label_prop2.setText("Property :");

        prop2PrintButton.setText("Show Property");

        javax.swing.GroupLayout player2PanelLayout = new javax.swing.GroupLayout(player2Panel);
        player2Panel.setLayout(player2PanelLayout);
        player2PanelLayout.setHorizontalGroup(
            player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(player2PanelLayout.createSequentialGroup()
                        .addComponent(label_money_player2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(money_player2))
                    .addGroup(player2PanelLayout.createSequentialGroup()
                        .addComponent(label_pos_player2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos_player2))
                    .addComponent(label_prop2)
                    .addComponent(prop2PrintButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        player2PanelLayout.setVerticalGroup(
            player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_money_player2)
                    .addComponent(money_player2))
                .addGap(18, 18, 18)
                .addGroup(player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_pos_player2)
                    .addComponent(pos_player2))
                .addGap(18, 18, 18)
                .addComponent(label_prop2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prop2PrintButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        player3Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(p3Name));

        label_money_player3.setText("Money :");

        label_pos_player3.setText("Position :");

        label_prop3.setText("Property :");

        prop3PrintButton.setText("Show Property");

        javax.swing.GroupLayout player3PanelLayout = new javax.swing.GroupLayout(player3Panel);
        player3Panel.setLayout(player3PanelLayout);
        player3PanelLayout.setHorizontalGroup(
            player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(player3PanelLayout.createSequentialGroup()
                        .addComponent(label_money_player3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(money_player3))
                    .addGroup(player3PanelLayout.createSequentialGroup()
                        .addComponent(label_pos_player3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos_player3))
                    .addComponent(label_prop3)
                    .addComponent(prop3PrintButton))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        player3PanelLayout.setVerticalGroup(
            player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_money_player3)
                    .addComponent(money_player3))
                .addGap(18, 18, 18)
                .addGroup(player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_pos_player3)
                    .addComponent(pos_player3))
                .addGap(18, 18, 18)
                .addComponent(label_prop3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prop3PrintButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        player4Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(p4Name));

        label_money_player4.setText("Money :");

        label_pos_player4.setText("Position :");

        label_prop4.setText("Property :");

        prop4PrintButton.setText("Show Property");

        javax.swing.GroupLayout player4PanelLayout = new javax.swing.GroupLayout(player4Panel);
        player4Panel.setLayout(player4PanelLayout);
        player4PanelLayout.setHorizontalGroup(
            player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(player4PanelLayout.createSequentialGroup()
                        .addComponent(label_money_player4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(money_player4))
                    .addGroup(player4PanelLayout.createSequentialGroup()
                        .addComponent(label_pos_player4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos_player4))
                    .addComponent(label_prop4))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(player4PanelLayout.createSequentialGroup()
                .addComponent(prop4PrintButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        player4PanelLayout.setVerticalGroup(
            player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_money_player4)
                    .addComponent(money_player4))
                .addGap(18, 18, 18)
                .addGroup(player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_pos_player4)
                    .addComponent(pos_player4))
                .addGap(18, 18, 18)
                .addComponent(label_prop4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prop4PrintButton)
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

        gameLog.setEditable(false);
        gameLog.setBackground(new java.awt.Color(0, 0, 0));
        gameLog.setColumns(20);
        gameLog.setForeground(new java.awt.Color(255, 255, 255));
        gameLog.setRows(5);
        gameLog.setText("===============================Game Log===============================\n");
        gameLog.setAutoscrolls(false);
        gameLog.setBorder(null);
        jScrollPane1.setViewportView(gameLog);

        gameLogButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gameLogButton.setText("Game Log");
        gameLogButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gameLogButtonItemStateChanged(evt);
            }
        });

        payButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        payButton.setText("Pay");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(playerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tickProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(318, 318, 318)
                                        .addComponent(gameLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(upgradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tickProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upgradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gameLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
    }//GEN-LAST:event_gameLogButtonItemStateChanged

    private void initBoardGame() {
        //Ambil token sama img Tilenya
        //add, setLayer, setBounds sesuai dengan Tilenya
        
        
        //setting token
        ImageIcon token1_img = new ImageIcon(Monopoly.class.getResource("resources/token1.png"));
        ImageIcon token2_img = new ImageIcon(Monopoly.class.getResource("resources/token2.png"));
        ImageIcon token3_img = new ImageIcon(Monopoly.class.getResource("resources/token3.png"));
        ImageIcon token4_img = new ImageIcon(Monopoly.class.getResource("resources/token4.png"));
        
        token1 = new JLabel();
        token2 = new JLabel();
        token3 = new JLabel();
        token4 = new JLabel();
        
        token1.setIcon(token1_img);
        token2.setIcon(token2_img);
        token3.setIcon(token3_img);
        token4.setIcon(token4_img);
        
        token1.setBounds(0,0,128,128);
        token2.setBounds(40,0,128,128);
        token3.setBounds(0,40,128,128);
        token4.setBounds(40,40,128,128);
        
        //===================setting Tile
        /*
        Intinya:
                Construct JLabel
                Construct ImageIconnya
                setIcon, setBounds, setLayer si JLabel
                add ke Componentnya
        */
        //setting JLabel
        
        
        JLabel label_botRight = new JLabel();
        ImageIcon image_botRight = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/botRight.jpg"));
        label_botRight.setIcon(image_botRight);
        label_botRight.setBounds(0,0,128,128);
        botRight.add(label_botRight);
        botRight.setLayer(label_botRight, -1);

        JLabel label_botLeft = new JLabel();
        ImageIcon image_botLeft = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/botLeft.jpg"));
        label_botLeft.setIcon(image_botLeft);
        label_botLeft.setBounds(0,0,128,128);
        botLeft.add(label_botLeft);
        botLeft.setLayer(label_botLeft, -1);

        JLabel label_topLeft = new JLabel();
        ImageIcon image_topLeft = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/topLeft.jpg"));
        label_topLeft.setIcon(image_topLeft);
        label_topLeft.setBounds(0,0,128,128);
        topLeft.add(label_topLeft);
        topLeft.setLayer(label_topLeft, -1);

        JLabel label_topRight = new JLabel();
        ImageIcon image_topRight = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/topRight.jpg"));
        label_topRight.setIcon(image_topRight);
        label_topRight.setBounds(0,0,128,128);
        topRight.add(label_topRight);
        topRight.setLayer(label_topRight, -1);

        JLabel label_bot1 = new JLabel();
        ImageIcon image_bot1 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/bot1.jpg"));
        label_bot1.setIcon(image_bot1);
        label_bot1.setBounds(0,0,76,128);
        bot1.add(label_bot1);
        bot1.setLayer(label_bot1, -1);

        JLabel label_bot2 = new JLabel();
        ImageIcon image_bot2 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/bot2.jpg"));
        label_bot2.setIcon(image_bot2);
        label_bot2.setBounds(0,0,76,128);
        bot2.add(label_bot2);
        bot2.setLayer(label_bot2, -1);

        JLabel label_bot3 = new JLabel();
        ImageIcon image_bot3 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/bot3.jpg"));
        label_bot3.setIcon(image_bot3);
        label_bot3.setBounds(0,0,76,128);
        bot3.add(label_bot3);
        bot3.setLayer(label_bot3, -1);

        JLabel label_bot4 = new JLabel();
        ImageIcon image_bot4 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/bot4.jpg"));
        label_bot4.setIcon(image_bot4);
        label_bot4.setBounds(0,0,76,128);
        bot4.add(label_bot4);
        bot4.setLayer(label_bot4, -1);

        JLabel label_bot5 = new JLabel();
        ImageIcon image_bot5 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/bot5.jpg"));
        label_bot5.setIcon(image_bot5);
        label_bot5.setBounds(0,0,76,128);
        bot5.add(label_bot5);
        bot5.setLayer(label_bot5, -1);

        JLabel label_bot6 = new JLabel();
        ImageIcon image_bot6 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/bot6.jpg"));
        label_bot6.setIcon(image_bot6);
        label_bot6.setBounds(0,0,76,128);
        bot6.add(label_bot6);
        bot6.setLayer(label_bot6, -1);

        JLabel label_bot7 = new JLabel();
        ImageIcon image_bot7 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/bot7.jpg"));
        label_bot7.setIcon(image_bot7);
        label_bot7.setBounds(0,0,76,128);
        bot7.add(label_bot7);
        bot7.setLayer(label_bot7, -1);

        JLabel label_bot8 = new JLabel();
        ImageIcon image_bot8 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/bot8.jpg"));
        label_bot8.setIcon(image_bot8);
        label_bot8.setBounds(0,0,76,128);
        bot8.add(label_bot8);
        bot8.setLayer(label_bot8, -1);

        JLabel label_bot9 = new JLabel();
        ImageIcon image_bot9 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/bot9.jpg"));
        label_bot9.setIcon(image_bot9);
        label_bot9.setBounds(0,0,76,128);
        bot9.add(label_bot9);
        bot9.setLayer(label_bot9, -1);

        JLabel label_top1 = new JLabel();
        ImageIcon image_top1 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/top1.jpg"));
        label_top1.setIcon(image_top1);
        label_top1.setBounds(0,0,76,128);
        top1.add(label_top1);
        top1.setLayer(label_top1, -1);

        JLabel label_top2 = new JLabel();
        ImageIcon image_top2 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/top2.jpg"));
        label_top2.setIcon(image_top2);
        label_top2.setBounds(0,0,76,128);
        top2.add(label_top2);
        top2.setLayer(label_top2, -1);

        JLabel label_top3 = new JLabel();
        ImageIcon image_top3 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/top3.jpg"));
        label_top3.setIcon(image_top3);
        label_top3.setBounds(0,0,76,128);
        top3.add(label_top3);
        top3.setLayer(label_top3, -1);

        JLabel label_top4 = new JLabel();
        ImageIcon image_top4 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/top4.jpg"));
        label_top4.setIcon(image_top4);
        label_top4.setBounds(0,0,76,128);
        top4.add(label_top4);
        top4.setLayer(label_top4, -1);

        JLabel label_top5 = new JLabel();
        ImageIcon image_top5 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/top5.jpg"));
        label_top5.setIcon(image_top5);
        label_top5.setBounds(0,0,76,128);
        top5.add(label_top5);
        top5.setLayer(label_top5, -1);

        JLabel label_top6 = new JLabel();
        ImageIcon image_top6 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/top6.jpg"));
        label_top6.setIcon(image_top6);
        label_top6.setBounds(0,0,76,128);
        top6.add(label_top6);
        top6.setLayer(label_top6, -1);

        JLabel label_top7 = new JLabel();
        ImageIcon image_top7 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/top7.jpg"));
        label_top7.setIcon(image_top7);
        label_top7.setBounds(0,0,76,128);
        top7.add(label_top7);
        top7.setLayer(label_top7, -1);

        JLabel label_top8 = new JLabel();
        ImageIcon image_top8 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/top8.jpg"));
        label_top8.setIcon(image_top8);
        label_top8.setBounds(0,0,76,128);
        top8.add(label_top8);
        top8.setLayer(label_top8, -1);

        JLabel label_top9 = new JLabel();
        ImageIcon image_top9 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/top9.jpg"));
        label_top9.setIcon(image_top9);
        label_top9.setBounds(0,0,76,128);
        top9.add(label_top9);
        top9.setLayer(label_top9, -1);

        //Right Left
        JLabel label_left1 = new JLabel();
        ImageIcon image_left1 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/left1.jpg"));
        label_left1.setIcon(image_left1);
        label_left1.setBounds(0,0,128,76);
        left1.add(label_left1);
        left1.setLayer(label_left1, -1);

        JLabel label_left2 = new JLabel();
        ImageIcon image_left2 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/left2.jpg"));
        label_left2.setIcon(image_left2);
        label_left2.setBounds(0,0,128,76);
        left2.add(label_left2);
        left2.setLayer(label_left2, -1);

        JLabel label_left3 = new JLabel();
        ImageIcon image_left3 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/left3.jpg"));
        label_left3.setIcon(image_left3);
        label_left3.setBounds(0,0,128,76);
        left3.add(label_left3);
        left3.setLayer(label_left3, -1);

        JLabel label_left4 = new JLabel();
        ImageIcon image_left4 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/left4.jpg"));
        label_left4.setIcon(image_left4);
        label_left4.setBounds(0,0,128,76);
        left4.add(label_left4);
        left4.setLayer(label_left4, -1);

        JLabel label_left5 = new JLabel();
        ImageIcon image_left5 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/left5.jpg"));
        label_left5.setIcon(image_left5);
        label_left5.setBounds(0,0,128,76);
        left5.add(label_left5);
        left5.setLayer(label_left5, -1);

        JLabel label_left6 = new JLabel();
        ImageIcon image_left6 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/left6.jpg"));
        label_left6.setIcon(image_left6);
        label_left6.setBounds(0,0,128,76);
        left6.add(label_left6);
        left6.setLayer(label_left6, -1);

        JLabel label_left7 = new JLabel();
        ImageIcon image_left7 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/left7.jpg"));
        label_left7.setIcon(image_left7);
        label_left7.setBounds(0,0,128,76);
        left7.add(label_left7);
        left7.setLayer(label_left7, -1);

        JLabel label_left8 = new JLabel();
        ImageIcon image_left8 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/left8.jpg"));
        label_left8.setIcon(image_left8);
        label_left8.setBounds(0,0,128,76);
        left8.add(label_left8);
        left8.setLayer(label_left8, -1);

        JLabel label_left9 = new JLabel();
        ImageIcon image_left9 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/left9.jpg"));
        label_left9.setIcon(image_left9);
        label_left9.setBounds(0,0,128,76);
        left9.add(label_left9);
        left9.setLayer(label_left9, -1);

        JLabel label_right1 = new JLabel();
        ImageIcon image_right1 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/right1.jpg"));
        label_right1.setIcon(image_right1);
        label_right1.setBounds(0,0,128,76);
        right1.add(label_right1);
        right1.setLayer(label_right1, -1);

        JLabel label_right2 = new JLabel();
        ImageIcon image_right2 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/right2.jpg"));
        label_right2.setIcon(image_right2);
        label_right2.setBounds(0,0,128,76);
        right2.add(label_right2);
        right2.setLayer(label_right2, -1);

        JLabel label_right3 = new JLabel();
        ImageIcon image_right3 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/right3.jpg"));
        label_right3.setIcon(image_right3);
        label_right3.setBounds(0,0,128,76);
        right3.add(label_right3);
        right3.setLayer(label_right3, -1);

        JLabel label_right4 = new JLabel();
        ImageIcon image_right4 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/right4.jpg"));
        label_right4.setIcon(image_right4);
        label_right4.setBounds(0,0,128,76);
        right4.add(label_right4);
        right4.setLayer(label_right4, -1);

        JLabel label_right5 = new JLabel();
        ImageIcon image_right5 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/right5.jpg"));
        label_right5.setIcon(image_right5);
        label_right5.setBounds(0,0,128,76);
        right5.add(label_right5);
        right5.setLayer(label_right5, -1);

        JLabel label_right6 = new JLabel();
        ImageIcon image_right6 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/right6.jpg"));
        label_right6.setIcon(image_right6);
        label_right6.setBounds(0,0,128,76);
        right6.add(label_right6);
        right6.setLayer(label_right6, -1);

        JLabel label_right7 = new JLabel();
        ImageIcon image_right7 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/right7.jpg"));
        label_right7.setIcon(image_right7);
        label_right7.setBounds(0,0,128,76);
        right7.add(label_right7);
        right7.setLayer(label_right7, -1);

        JLabel label_right8 = new JLabel();
        ImageIcon image_right8 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/right8.jpg"));
        label_right8.setIcon(image_right8);
        label_right8.setBounds(0,0,128,76);
        right8.add(label_right8);
        right8.setLayer(label_right8, -1);

        JLabel label_right9 = new JLabel();
        ImageIcon image_right9 = new ImageIcon(Monopoly.class.getResource("/src/monopoly/resources/Map/right9.jpg"));
        label_right9.setIcon(image_right9);
        label_right9.setBounds(0,0,128,76);
        right9.add(label_right9);
        right9.setLayer(label_right9, -1);
        
        
        

    }
    
    
    /**
     * @param args the command line arguments
     */

    private javax.swing.JLabel token1;
    private javax.swing.JLabel token2;
    private javax.swing.JLabel token3;
    private javax.swing.JLabel token4;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardPanel;
    private javax.swing.JLayeredPane bot1;
    private javax.swing.JLayeredPane bot2;
    private javax.swing.JLayeredPane bot3;
    private javax.swing.JLayeredPane bot4;
    private javax.swing.JLayeredPane bot5;
    private javax.swing.JLayeredPane bot6;
    private javax.swing.JLayeredPane bot7;
    private javax.swing.JLayeredPane bot8;
    private javax.swing.JLayeredPane bot9;
    private javax.swing.JLayeredPane botLeft;
    private javax.swing.JLayeredPane botRight;
    private javax.swing.JButton buyButton;
    private javax.swing.JLabel dice1;
    private javax.swing.JLabel dice2;
    private javax.swing.JTextArea gameLog;
    private javax.swing.JToggleButton gameLogButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_money_player1;
    private javax.swing.JLabel label_money_player2;
    private javax.swing.JLabel label_money_player3;
    private javax.swing.JLabel label_money_player4;
    private javax.swing.JLabel label_pos_player1;
    private javax.swing.JLabel label_pos_player2;
    private javax.swing.JLabel label_pos_player3;
    private javax.swing.JLabel label_pos_player4;
    private javax.swing.JLabel label_prop1;
    private javax.swing.JLabel label_prop2;
    private javax.swing.JLabel label_prop3;
    private javax.swing.JLabel label_prop4;
    private javax.swing.JLayeredPane left1;
    private javax.swing.JLayeredPane left2;
    private javax.swing.JLayeredPane left3;
    private javax.swing.JLayeredPane left4;
    private javax.swing.JLayeredPane left5;
    private javax.swing.JLayeredPane left6;
    private javax.swing.JLayeredPane left7;
    private javax.swing.JLayeredPane left8;
    private javax.swing.JLayeredPane left9;
    private javax.swing.JLabel money_player1;
    private javax.swing.JLabel money_player2;
    private javax.swing.JLabel money_player3;
    private javax.swing.JLabel money_player4;
    private javax.swing.JPanel panel_dice1;
    private javax.swing.JPanel panel_dice2;
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
    private javax.swing.JButton prop1PrintButton;
    private javax.swing.JButton prop2PrintButton;
    private javax.swing.JButton prop3PrintButton;
    private javax.swing.JButton prop4PrintButton;
    private javax.swing.JLayeredPane right1;
    private javax.swing.JLayeredPane right2;
    private javax.swing.JLayeredPane right3;
    private javax.swing.JLayeredPane right4;
    private javax.swing.JLayeredPane right5;
    private javax.swing.JLayeredPane right6;
    private javax.swing.JLayeredPane right7;
    private javax.swing.JLayeredPane right8;
    private javax.swing.JLayeredPane right9;
    private javax.swing.JButton rollButton;
    private javax.swing.JButton sellButton;
    private javax.swing.JProgressBar tickProgressBar;
    private javax.swing.JLayeredPane top1;
    private javax.swing.JLayeredPane top2;
    private javax.swing.JLayeredPane top3;
    private javax.swing.JLayeredPane top4;
    private javax.swing.JLayeredPane top5;
    private javax.swing.JLayeredPane top6;
    private javax.swing.JLayeredPane top7;
    private javax.swing.JLayeredPane top8;
    private javax.swing.JLayeredPane top9;
    private javax.swing.JLayeredPane topLeft;
    private javax.swing.JLayeredPane topRight;
    private javax.swing.JButton upgradeButton;
    // End of variables declaration//GEN-END:variables
    private int command;
    private String p1Name;
    private String p2Name;
    private String p3Name;
    private String p4Name;

    
    
    /*
        METHOD MANUAL
    */

    //Diubah jadi public int
    public void actionPerformed(ActionEvent evt0) {
        if ("roll".equals(evt0.getActionCommand())) {
            command = 1;
            gameLog.append("roll si ActionCommand berhasil bre\n");
        } else if ("pay".equals(evt0.getActionCommand())) {
            command = 2;
        } else if ("buy".equals(evt0.getActionCommand())) {
            command = 3;
        } else if ("sell".equals(evt0.getActionCommand())) {
            command = 4;
        } else if ("upgrade".equals(evt0.getActionCommand())) {
            command = 5;
        }
    }
    
    public int getCommand() {
        //Memanggil ActionPerformed
        return command;
    }

    public void clearCommand() {
        this.command = 0;
    }
    
    public void setLog(String text) {
        gameLog.append(text + "\n");
    }
    
    public void clearLog() {
        gameLog.setText("");
    }
    
    
    public void showPlayerPos(int playerNum, int moveTo) {

        //
        //fungsi : update token per player
        //  Jlabel tokenPlayer1 = new JLabel(ambil file token1.jpg); ==> taro di Consturctor
        
        switch (playerNum) {
            case 0:
                switch (moveTo) {
                    case 0:
                        botRight.add(token1);
                        break;
                    case 1:
                        bot1.add(token1);
                        break;
                    case 2:
                        bot2.add(token1);
                        break;
                    case 3:
                        bot3.add(token1);
                        break;
                    case 4:
                        bot4.add(token1);
                        break;
                    case 5:
                        bot5.add(token1);
                        break;
                    case 6:
                        bot6.add(token1);
                        break;

                    case 7:
                        bot7.add(token1);
                        break;
                    case 8:
                        bot8.add(token1);
                        break;
                    case 9:
                        bot9.add(token1);
                        break;
                    case 10:
                        botLeft.add(token1);
                        break;  
                    case 11:
                        left1.add(token1);
                        break;

                    case 12:
                        left2.add(token1);
                        break;

                    case 13:
                        left3.add(token1);
                        break;

                    case 14:
                        left4.add(token1);
                        break;

                    case 15:
                        left5.add(token1);
                        break;

                    case 16:
                        left6.add(token1);
                        break;

                    case 17:
                        left7.add(token1);
                        break;

                    case 18:
                        left8.add(token1);
                        break;

                    case 19:
                        left9.add(token1);
                        break;

                    case 20:
                        topLeft.add(token1);
                        break;

                    case 21:
                        top1.add(token1);
                        break;

                    case 22:
                        top2.add(token1);
                        break;

                    case 23:
                        top3.add(token1);
                        break;

                    case 24:
                        top4.add(token1);
                        break;

                    case 25:
                        top5.add(token1);
                        break;

                    case 26:
                        top6.add(token1);
                        break;

                    case 27:
                        top7.add(token1);
                        break;

                    case 28:
                        top8.add(token1);
                        break;

                    case 29:
                        top9.add(token1);
                        break;

                    case 30:
                        topRight.add(token1);
                        break;

                    case 31:
                        right1.add(token1);
                        break;

                    case 32:
                        right2.add(token1);
                        break;

                    case 33:
                        right3.add(token1);
                        break;

                    case 34:
                        right4.add(token1);
                        break;

                    case 35:
                        right5.add(token1);
                        break;

                    case 36:
                        right6.add(token1);
                        break;

                    case 37:
                        right7.add(token1);
                        break;

                    case 38:
                        right8.add(token1);
                        break;

                    case 39:
                        right9.add(token1);
                        break;
                    default:
                        break;
                }
                break;
                
            case 1:
                switch (moveTo) {
                    case 0:
                        botRight.add(token2);
                        break;
                    case 1:
                        bot1.add(token2);
                        break;
                    case 2:
                        bot2.add(token2);
                        break;
                    case 3:
                        bot3.add(token2);
                        break;
                    case 4:
                        bot4.add(token2);
                        break;
                    case 5:
                        bot5.add(token2);
                        break;
                    case 6:
                        bot6.add(token2);
                        break;

                    case 7:
                        bot7.add(token2);
                        break;
                    case 8:
                        bot8.add(token2);
                        break;
                    case 9:
                        bot9.add(token2);
                        break;
                    case 10:
                        botLeft.add(token2);
                        break;
                    case 11:
                        left1.add(token2);
                        break;

                    case 12:
                        left2.add(token2);
                        break;

                    case 13:
                        left3.add(token2);
                        break;

                    case 14:
                        left4.add(token2);
                        break;

                    case 15:
                        left5.add(token2);
                        break;

                    case 16:
                        left6.add(token2);
                        break;

                    case 17:
                        left7.add(token2);
                        break;

                    case 18:
                        left8.add(token2);
                        break;

                    case 19:
                        left9.add(token2);
                        break;

                    case 20:
                        topLeft.add(token2);
                        break;

                    case 21:
                        top1.add(token2);
                        break;

                    case 22:
                        top2.add(token2);
                        break;

                    case 23:
                        top3.add(token2);
                        break;

                    case 24:
                        top4.add(token2);
                        break;

                    case 25:
                        top5.add(token2);
                        break;

                    case 26:
                        top6.add(token2);
                        break;

                    case 27:
                        top7.add(token2);
                        break;

                    case 28:
                        top8.add(token2);
                        break;

                    case 29:
                        top9.add(token2);
                        break;

                    case 30:
                        topRight.add(token2);
                        break;

                    case 31:
                        right1.add(token2);
                        break;

                    case 32:
                        right2.add(token2);
                        break;

                    case 33:
                        right3.add(token2);
                        break;

                    case 34:
                        right4.add(token2);
                        break;

                    case 35:
                        right5.add(token2);
                        break;

                    case 36:
                        right6.add(token2);
                        break;

                    case 37:
                        right7.add(token2);
                        break;

                    case 38:
                        right8.add(token2);
                        break;

                    case 39:
                        right9.add(token2);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (moveTo) {
                    case 0:
                        botRight.add(token3);
                        break;
                    case 1:
                        bot1.add(token3);
                        break;
                    case 2:
                        bot2.add(token3);
                        break;
                    case 3:
                        bot3.add(token3);
                        break;
                    case 4:
                        bot4.add(token3);
                        break;
                    case 5:
                        bot5.add(token3);
                        break;
                    case 6:
                        bot6.add(token3);
                        break;

                    case 7:
                        bot7.add(token3);
                        break;
                    case 8:
                        bot8.add(token3);
                        break;
                    case 9:
                        bot9.add(token3);
                        break;
                    case 10:
                        botLeft.add(token3);
                        break;
                    case 11:
                        left1.add(token3);
                        break;

                    case 12:
                        left2.add(token3);
                        break;

                    case 13:
                        left3.add(token3);
                        break;

                    case 14:
                        left4.add(token3);
                        break;

                    case 15:
                        left5.add(token3);
                        break;

                    case 16:
                        left6.add(token3);
                        break;

                    case 17:
                        left7.add(token3);
                        break;

                    case 18:
                        left8.add(token3);
                        break;

                    case 19:
                        left9.add(token3);
                        break;

                    case 20:
                        topLeft.add(token3);
                        break;

                    case 21:
                        top1.add(token3);
                        break;

                    case 22:
                        top2.add(token3);
                        break;

                    case 23:
                        top3.add(token3);
                        break;

                    case 24:
                        top4.add(token3);
                        break;

                    case 25:
                        top5.add(token3);
                        break;

                    case 26:
                        top6.add(token3);
                        break;

                    case 27:
                        top7.add(token3);
                        break;

                    case 28:
                        top8.add(token3);
                        break;

                    case 29:
                        top9.add(token3);
                        break;

                    case 30:
                        topRight.add(token3);
                        break;

                    case 31:
                        right1.add(token3);
                        break;

                    case 32:
                        right2.add(token3);
                        break;

                    case 33:
                        right3.add(token3);
                        break;

                    case 34:
                        right4.add(token3);
                        break;

                    case 35:
                        right5.add(token3);
                        break;

                    case 36:
                        right6.add(token3);
                        break;

                    case 37:
                        right7.add(token3);
                        break;

                    case 38:
                        right8.add(token3);
                        break;

                    case 39:
                        right9.add(token3);
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (moveTo) {
                    case 0:
                        botRight.add(token4);
                        break;
                    case 1:
                        bot1.add(token4);
                        break;
                    case 2:
                        bot2.add(token4);
                        break;
                    case 3:
                        bot3.add(token4);
                        break;
                    case 4:
                        bot4.add(token4);
                        break;
                    case 5:
                        bot5.add(token4);
                        break;
                    case 6:
                        bot6.add(token4);
                        break;

                    case 7:
                        bot7.add(token4);
                        break;
                    case 8:
                        bot8.add(token4);
                        break;
                    case 9:
                        bot9.add(token4);
                        break;
                    case 10:
                        botLeft.add(token4);
                        break;
                    case 11:
                        left1.add(token4);
                        break;

                    case 12:
                        left2.add(token4);
                        break;

                    case 13:
                        left3.add(token4);
                        break;

                    case 14:
                        left4.add(token4);
                        break;

                    case 15:
                        left5.add(token4);
                        break;

                    case 16:
                        left6.add(token4);
                        break;

                    case 17:
                        left7.add(token4);
                        break;

                    case 18:
                        left8.add(token4);
                        break;

                    case 19:
                        left9.add(token4);
                        break;

                    case 20:
                        topLeft.add(token4);
                        break;

                    case 21:
                        top1.add(token4);
                        break;

                    case 22:
                        top2.add(token4);
                        break;

                    case 23:
                        top3.add(token4);
                        break;

                    case 24:
                        top4.add(token4);
                        break;

                    case 25:
                        top5.add(token4);
                        break;

                    case 26:
                        top6.add(token4);
                        break;

                    case 27:
                        top7.add(token4);
                        break;

                    case 28:
                        top8.add(token4);
                        break;

                    case 29:
                        top9.add(token4);
                        break;

                    case 30:
                        topRight.add(token4);
                        break;

                    case 31:
                        right1.add(token4);
                        break;

                    case 32:
                        right2.add(token4);
                        break;

                    case 33:
                        right3.add(token4);
                        break;

                    case 34:
                        right4.add(token4);
                        break;

                    case 35:
                        right5.add(token4);
                        break;

                    case 36:
                        right6.add(token4);
                        break;

                    case 37:
                        right7.add(token4);
                        break;

                    case 38:
                        right8.add(token4);
                        break;

                    case 39:
                        right9.add(token4);
                        break;
                    default:
                        break;
                }
                break;
        }
    }
    
    public void removePlayerPos(int playerNum) {

        //
        //fungsi : update token per player
        //  Jlabel tokenPlayer1 = new JLabel(ambil file token1.jpg); ==> taro di Consturctor
        Container parent;
        parent = this.getParent();
        
        switch (playerNum) {
            case 0:
                parent = token1.getParent();
                parent.remove(token1);
                parent.validate();
                parent.repaint();
                break;
                
            case 1:
                parent = token2.getParent();
                parent.remove(token2);
                parent.validate();
                parent.repaint();
                break;
            case 2:
                parent = token3.getParent();
                parent.remove(token3);
                parent.validate();
                parent.repaint();
                break;
            case 3:
                parent = token4.getParent();
                parent.remove(token4);
                parent.validate();
                parent.repaint();
                break;
            default:
                gameLog.append("Unexpected value: " + playerNum + "\n");
        }
    }


	//GETTER
    
	public javax.swing.JLayeredPane getBot1(){  
            return bot1;
	}
	public javax.swing.JLayeredPane getBot2(){
		return bot2;
	}
	public javax.swing.JLayeredPane getBot3(){
		return bot3;
	}
	public javax.swing.JLayeredPane getBot4(){
		return bot4;
	}
	public javax.swing.JLayeredPane getBot5(){
		return bot5;
	}
	public javax.swing.JLayeredPane getBot6(){
		return bot6;
	}
	public javax.swing.JLayeredPane getBot7(){
		return bot7;
	}
	public javax.swing.JLayeredPane getBot8(){
		return bot8;
	}
	public javax.swing.JLayeredPane getBot9(){
		return bot9;
	}
	public javax.swing.JLayeredPane getBotLeft(){
		return botLeft;
	}
	public javax.swing.JLayeredPane getBotRight(){
		return botRight;
	}
	public javax.swing.JButton getBuyButton(){
		return buyButton;
	}
	public javax.swing.JLayeredPane getLeft1(){
		return left1;
	}
	public javax.swing.JLayeredPane getLeft2(){
		return left2;
	}
	public javax.swing.JLayeredPane getLeft3(){
		return left3;
	}
	public javax.swing.JLayeredPane getLeft4(){
		return left4;
	}
	public javax.swing.JLayeredPane getLeft5(){
		return left5;
	}
	public javax.swing.JLayeredPane getLeft6(){
		return left6;
	}
	public javax.swing.JLayeredPane getLeft7(){
		return left7;
	}
	public javax.swing.JLayeredPane getLeft8(){
		return left8;
	}
	public javax.swing.JLayeredPane getLeft9(){
		return left9;
	}
	public javax.swing.JLayeredPane getRight1(){
		return right1;
	}
	public javax.swing.JLayeredPane getRight2(){
		return right2;
	}
	public javax.swing.JLayeredPane getRight3(){
		return right3;
	}
	public javax.swing.JLayeredPane getRight4(){
		return right4;
	}
	public javax.swing.JLayeredPane getRight5(){
		return right5;
	}
	public javax.swing.JLayeredPane getRight6(){
		return right6;
	}
	public javax.swing.JLayeredPane getRight7(){
		return right7;
	}
	public javax.swing.JLayeredPane getRight8(){
		return right8;
	}
	public javax.swing.JLayeredPane getRight9(){
		return right9;
	}
	public javax.swing.JLabel getMoney_player1(){
		return money_player1;
	}
	public javax.swing.JLabel getMoney_player2(){
		return money_player2;
	}	
	public javax.swing.JLabel getMoney_player3(){
		return money_player3;
	}
	public javax.swing.JLabel getMoney_player4(){
		return money_player4;
	}
    public javax.swing.JButton getPayButton(){
		return payButton;
	}
	public javax.swing.JLabel getPos_player1(){
		return pos_player1;
	}
    public javax.swing.JLabel getPos_player2(){
		return pos_player2;
	}
	public javax.swing.JLabel getPos_player3(){
		return pos_player3;
	}
	public javax.swing.JLabel getPos_player4(){
		return pos_player4;
	}
    public javax.swing.JLabel getProp1(){
		return label_prop1;
	}
    public javax.swing.JLabel getProp2(){
		return label_prop2;
	}
	public javax.swing.JLabel getProp3(){
		return label_prop3;
	}
	public javax.swing.JLabel getProp4(){
		return label_prop4;
	}
	public javax.swing.JButton getRollButton(){
		return rollButton;
	}
    public javax.swing.JButton getSellButton(){
		return sellButton;
	}
    public javax.swing.JProgressBar getTickProgressBar(){
		return tickProgressBar;
	}
    public javax.swing.JLayeredPane getTop1(){
		return top1;
	}
	public javax.swing.JLayeredPane getTop2(){
		return top2;
	}
	public javax.swing.JLayeredPane getTop3(){
		return top3;
	}
	public javax.swing.JLayeredPane getTop4(){
		return top4;
	}
	public javax.swing.JLayeredPane getTop5(){
		return top5;
	}
	public javax.swing.JLayeredPane getTop6(){
		return top6;
	}
	public javax.swing.JLayeredPane getTop7(){
		return top7;
	}
	public javax.swing.JLayeredPane getTop8(){
		return top8;
	}
	public javax.swing.JLayeredPane getTop9(){
		return top9;
	}
	public javax.swing.JLayeredPane getTopLeft(){
		return topLeft;
	}
	public javax.swing.JLayeredPane getTopRight(){
		return topRight;
	}
	public javax.swing.JButton getUpgradeButton(){
		return upgradeButton;
	}
        
        public javax.swing.JButton getProp1Button() {
            return prop1PrintButton;
        }
        public javax.swing.JButton getProp2Button() {
            return prop2PrintButton;
        }
        public javax.swing.JButton getProp3Button() {
            return prop3PrintButton;
        }
        public javax.swing.JButton getProp4Button() {
            return prop4PrintButton;
        }
        
        public javax.swing.JTextArea getGameLog() {
            return gameLog;
        }
        
        public javax.swing.JLabel getDice1() {
            return dice1;
        }
        public javax.swing.JLabel getDice2() {
            return dice2;
        }
	
	//SETTER
	public void setBot1(javax.swing.JLayeredPane botl) {
		this.bot1 = botl;
	}
	public void setBot2(javax.swing.JLayeredPane bot2) {
		this.bot2 = bot2;
	}
	public void setBot3(javax.swing.JLayeredPane bot3) {
		this.bot3 = bot3;
	}
	public void setBot4(javax.swing.JLayeredPane bot4) {
		this.bot4 = bot4;
	}
	public void setBot5(javax.swing.JLayeredPane bot5) {
		this.bot5 = bot5;
	}
	public void setBot6(javax.swing.JLayeredPane bot6) {
		this.bot6 = bot6;
	}
	public void setBot7(javax.swing.JLayeredPane bot7) {
		this.bot7 = bot7;
	}
	public void setBot8(javax.swing.JLayeredPane bot8) {
		this.bot8 = bot8;
	}
	public void setBot9(javax.swing.JLayeredPane bot9) {
		this.bot9 = bot9;
	}
	public void setBotLeft(javax.swing.JLayeredPane botLeft) {
		this.botLeft = botLeft;
	}
	public void setBotRight(javax.swing.JLayeredPane botRight) {
		this.botRight = botRight;
	}
	public void setBuyButton(javax.swing.JButton buyButton){
		this.buyButton = buyButton;
	}
	public void setLeft1(javax.swing.JLayeredPane left1){
		this.left1 = left1;
	}
	public void setLeft2(javax.swing.JLayeredPane left2){
		this.left2 = left2;
	}
	public void setLeft3(javax.swing.JLayeredPane left3){
		this.left3 = left3;
	}
	public void setLeft4(javax.swing.JLayeredPane left4){
		this.left4 = left4;
	}
	public void setLeft5(javax.swing.JLayeredPane left5){
		this.left5 = left5;
	}
	public void setLeft6(javax.swing.JLayeredPane left6){
		this.left6 = left6;
	}
	public void setLeft7(javax.swing.JLayeredPane left7){
		this.left7 = left7;
	}
	public void setLeft8(javax.swing.JLayeredPane left8){
		this.left8 = left8;
	}
	public void setLeft9(javax.swing.JLayeredPane left9){
		this.left9 = left9;
	}
	public void setRight1(javax.swing.JLayeredPane right1){
		this.right1 = right1;
	}
	public void setRight2(javax.swing.JLayeredPane right2){
		this.right2 = right2;
	}
	public void setRight3(javax.swing.JLayeredPane right3){
		this.right3 = right3;
	}
	public void setRight4(javax.swing.JLayeredPane right4){
		this.right4 = right4;
	}
	public void setRight5(javax.swing.JLayeredPane right5){
		this.right5 = right5;
	}
	public void setRight6(javax.swing.JLayeredPane right6){
		this.right6 = right6;
	}
	public void setRight7(javax.swing.JLayeredPane right7){
		this.right7 = right7;
	}
	public void setRight8(javax.swing.JLayeredPane right8){
		this.right8 = right8;
	}
	public void setRight9(javax.swing.JLayeredPane right9){
		this.right9 = right9;
	}
	public void setMoney_player1(javax.swing.JLabel money_player1){
		this.label_money_player1 = money_player1;
	}
	public void setMoney_player2(javax.swing.JLabel money_player2){
		this.label_money_player2 = money_player2;
	}	
	public void setMoney_player3(javax.swing.JLabel money_player3){
		this.label_money_player3 = money_player3;
	}
	public void setMoney_player4(javax.swing.JLabel money_player4){
		this.label_money_player4 = money_player4;
	}
    public void setPayButton(javax.swing.JButton payButton){
		this.payButton = payButton;
	}
	public void setPos_player1(javax.swing.JLabel pos_player1){
		this.label_pos_player1 = pos_player1;
	}
    public void setPos_player2(javax.swing.JLabel pos_player2){
		this.label_pos_player2 = pos_player2;
	}
	public void setPos_player3(javax.swing.JLabel pos_player3){
		this.label_pos_player3 = pos_player3;
	}
	public void setPos_player4(javax.swing.JLabel pos_player4){
		this.label_pos_player4 = pos_player4;
	}
    public void setProp1(javax.swing.JLabel prop1){
		this.label_prop1 = prop1;
	}
    public void setProp2(javax.swing.JLabel prop2){
		this.label_prop2 = prop2;
	}
	public void setProp3(javax.swing.JLabel prop3){
		this.label_prop3 = prop3;
	}
	public void setProp4(javax.swing.JLabel prop4){
		this.label_prop4 = prop4;
	}
    public void setRollButton(javax.swing.JButton rollButton){
	this.rollButton = rollButton;
    }
    public void setSellButton(javax.swing.JButton sellButton){
		this.sellButton = sellButton;
    }
    public void setTickProgressBar(javax.swing.JProgressBar tickProgressBar){
		this.tickProgressBar = tickProgressBar;
	}
    public void setTop1(javax.swing.JLayeredPane top1){
		this.top1 = top1;
	}
	public void setTop2(javax.swing.JLayeredPane top2){
		this.top2 = top2;
	}
	public void setTop3(javax.swing.JLayeredPane top3){
		this.top3 = top3;
	}
	public void setTop4(javax.swing.JLayeredPane top4){
		this.top4 = top4;
	}
	public void setTop5(javax.swing.JLayeredPane top5){
		this.top5 = top5;
	}
	public void setTop6(javax.swing.JLayeredPane top6){
		this.top6 = top6;
	}
	public void setTop7(javax.swing.JLayeredPane top7){
		this.top7 = top7;
	}
	public void setTop8(javax.swing.JLayeredPane top8){
		this.top8 = top8;
	}
	public void setTop9(javax.swing.JLayeredPane top9){
		this.top9 = top9;
	}
	public void setTopLeft(javax.swing.JLayeredPane topLeft){
		this.topLeft = topLeft;
	}
	public void setTopRight(javax.swing.JLayeredPane topRight){
		this.topRight = topRight;
	}
	public void setUpgradeButton(javax.swing.JButton upgradeButton){
		this.upgradeButton = upgradeButton;
	}
    /*
    METHOD MANUAL
    */
        
        public void showDice(int d1, int d2) {
            //ganti gambar dice di layar
            switch (d1) {
                case 1:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice1.jpg"));
			dice1.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                case 2:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice2.jpg"));
			dice1.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                case 3:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice3.jpg"));
			dice1.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                case 4:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice4.jpg"));
			dice1.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                case 5:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice5.jpg"));
			dice1.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                case 6:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice6.jpg"));
			dice1.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                default:
                    break;
            }
        switch (d2) {
                case 1:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice1.jpg"));
			dice2.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                case 2:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice2.jpg"));
			dice2.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                case 3:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice3.jpg"));
			dice2.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                case 4:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice4.jpg"));
			dice2.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                case 5:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice5.jpg"));
			dice2.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                case 6:
                    try {
			Image img = ImageIO.read(getClass().getResource("resources/dice6.jpg"));
			dice2.setIcon(new ImageIcon(img));
                    } catch (IOException ex) {
                    }
                    break;
                default:
                    break;
            }
        }

    public void removePlayerPos(int playerNum, int pos) {
        switch (playerNum) {
            case 0:
                switch (pos) {
                    case 0:
                        botRight.remove(token1);
                        botRight.validate();
                        botRight.repaint();
                        break;
                    case 1:
                        bot1.remove(token1);
                        bot1.validate();
                        bot1.repaint();
                        break;
                    case 2:
                        bot2.remove(token1);
                        bot2.validate();
                        bot2.repaint();
                        break;
                    case 3:
                        bot3.remove(token1);
                        bot3.validate();
                        bot3.repaint();
                        break;
                    case 4:
                        bot4.remove(token1);
                        bot4.validate();
                        bot4.repaint();
                        break;
                    case 5:
                        bot5.remove(token1);
                        bot5.validate();
                        bot5.repaint();
                        break;
                    case 6:
                        bot6.remove(token1);
                        bot6.validate();
                        bot6.repaint();
                        break;

                    case 7:
                        bot7.remove(token1);
                        bot7.validate();
                        bot7.repaint();
                        break;
                    case 8:
                        bot8.remove(token1);
                        bot8.validate();
                        bot8.repaint();
                        break;
                    case 9:
                        bot9.remove(token1);
                        bot9.validate();
                        bot9.repaint();
                        break;
                    case 10:
                        botLeft.remove(token1);
                        botLeft.validate();
                        botLeft.repaint();
                        break;
                    case 11:
                        left1.remove(token1);
                        left1.validate();
                        left1.repaint();
                        break;

                    case 12:
                        left2.remove(token1);
                        left2.validate();
                        left2.repaint();
                        break;

                    case 13:
                        left3.remove(token1);
                        left3.validate();
                        left3.repaint();
                        break;

                    case 14:
                        left4.remove(token1);
                        left4.validate();
                        left4.repaint();
                        break;

                    case 15:
                        left5.remove(token1);
                        left5.validate();
                        left5.repaint();
                        break;

                    case 16:
                        left6.remove(token1);
                        left6.validate();
                        left6.repaint();
                        break;

                    case 17:
                        left7.remove(token1);
                        left7.validate();
                        left7.repaint();
                        break;

                    case 18:
                        left8.remove(token1);
                        left8.validate();
                        left8.repaint();
                        break;

                    case 19:
                        left9.remove(token1);
                        left9.validate();
                        left9.repaint();
                        break;

                    case 20:
                        topLeft.remove(token1);
                        topLeft.validate();
                        topLeft.repaint();
                        break;

                    case 21:
                        top1.remove(token1);
                        top1.validate();
                        top1.repaint();
                        break;

                    case 22:
                        top2.remove(token1);
                        top2.validate();
                        top2.repaint();
                        break;

                    case 23:
                        top3.remove(token1);
                        top3.validate();
                        top3.repaint();
                        break;

                    case 24:
                        top4.remove(token1);
                        top4.validate();
                        top4.repaint();
                        break;

                    case 25:
                        top5.remove(token1);
                        top5.validate();
                        top5.repaint();
                        break;

                    case 26:
                        top6.remove(token1);
                        top6.validate();
                        top6.repaint();
                        break;

                    case 27:
                        top7.remove(token1);
                        top7.validate();
                        top7.repaint();
                        break;

                    case 28:
                        top8.remove(token1);
                        top8.validate();
                        top8.repaint();
                        break;

                    case 29:
                        top9.remove(token1);
                        top9.validate();
                        top9.repaint();
                        break;

                    case 30:
                        topRight.remove(token1);
                        topRight.validate();
                        topRight.repaint();
                        break;

                    case 31:
                        right1.remove(token1);
                        right1.validate();
                        right1.repaint();
                        break;

                    case 32:
                        right2.remove(token1);
                        right2.validate();
                        right2.repaint();
                        break;

                    case 33:
                        right3.remove(token1);
                        right3.validate();
                        right3.repaint();
                        break;

                    case 34:
                        right4.remove(token1);
                        right4.validate();
                        right4.repaint();
                        break;

                    case 35:
                        right5.remove(token1);
                        right5.validate();
                        right5.repaint();
                        break;

                    case 36:
                        right6.remove(token1);
                        right6.validate();
                        right6.repaint();
                        break;

                    case 37:
                        right7.remove(token1);
                        right7.validate();
                        right7.repaint();
                        break;

                    case 38:
                        right8.remove(token1);
                        right8.validate();
                        right8.repaint();
                        break;

                    case 39:
                        right9.remove(token1);
                        right9.validate();
                        right9.repaint();
                        break;
                    default:
                        break;
                }
                break;

            case 1:
                switch (pos) {
                    case 0:
                        botRight.remove(token2);
                        botRight.validate();
                        botRight.repaint();
                        break;
                    case 1:
                        bot1.remove(token2);
                        bot1.validate();
                        bot1.repaint();
                        break;
                    case 2:
                        bot2.remove(token2);
                        bot2.validate();
                        bot2.repaint();
                        break;
                    case 3:
                        bot3.remove(token2);
                        bot3.validate();
                        bot3.repaint();
                        break;
                    case 4:
                        bot4.remove(token2);
                        bot4.validate();
                        bot4.repaint();
                        break;
                    case 5:
                        bot5.remove(token2);
                        bot5.validate();
                        bot5.repaint();
                        break;
                    case 6:
                        bot6.remove(token2);
                        bot6.validate();
                        bot6.repaint();
                        break;

                    case 7:
                        bot7.remove(token2);
                        bot7.validate();
                        bot7.repaint();
                        break;
                    case 8:
                        bot8.remove(token2);
                        bot8.validate();
                        bot8.repaint();
                        break;
                    case 9:
                        bot9.remove(token2);
                        bot9.validate();
                        bot9.repaint();
                        break;
                    case 10:
                        botLeft.remove(token2);
                        botLeft.validate();
                        botLeft.repaint();
                        break;
                    case 11:
                        left1.remove(token2);
                        left1.validate();
                        left1.repaint();
                        break;

                    case 12:
                        left2.remove(token2);
                        left2.validate();
                        left2.repaint();
                        break;

                    case 13:
                        left3.remove(token2);
                        left3.validate();
                        left3.repaint();
                        break;

                    case 14:
                        left4.remove(token2);
                        left4.validate();
                        left4.repaint();
                        break;

                    case 15:
                        left5.remove(token2);
                        left5.validate();
                        left5.repaint();
                        break;

                    case 16:
                        left6.remove(token2);
                        left6.validate();
                        left6.repaint();
                        break;

                    case 17:
                        left7.remove(token2);
                        left7.validate();
                        left7.repaint();
                        break;

                    case 18:
                        left8.remove(token2);
                        left8.validate();
                        left8.repaint();
                        break;

                    case 19:
                        left9.remove(token2);
                        left9.validate();
                        left9.repaint();
                        break;

                    case 20:
                        topLeft.remove(token2);
                        topLeft.validate();
                        topLeft.repaint();
                        break;

                    case 21:
                        top1.remove(token2);
                        top1.validate();
                        top1.repaint();
                        break;

                    case 22:
                        top2.remove(token2);
                        top2.validate();
                        top2.repaint();
                        break;

                    case 23:
                        top3.remove(token2);
                        top3.validate();
                        top3.repaint();
                        break;

                    case 24:
                        top4.remove(token2);
                        top4.validate();
                        top4.repaint();
                        break;

                    case 25:
                        top5.remove(token2);
                        top5.validate();
                        top5.repaint();
                        break;

                    case 26:
                        top6.remove(token2);
                        top6.validate();
                        top6.repaint();
                        break;

                    case 27:
                        top7.remove(token2);
                        top7.validate();
                        top7.repaint();
                        break;

                    case 28:
                        top8.remove(token2);
                        top8.validate();
                        top8.repaint();
                        break;

                    case 29:
                        top9.remove(token2);
                        top9.validate();
                        top9.repaint();
                        break;

                    case 30:
                        topRight.remove(token2);
                        topRight.validate();
                        topRight.repaint();
                        break;

                    case 31:
                        right1.remove(token2);
                        right1.validate();
                        right1.repaint();
                        break;

                    case 32:
                        right2.remove(token2);
                        right2.validate();
                        right2.repaint();
                        break;

                    case 33:
                        right3.remove(token2);
                        right3.validate();
                        right3.repaint();
                        break;

                    case 34:
                        right4.remove(token2);
                        right4.validate();
                        right4.repaint();
                        break;

                    case 35:
                        right5.remove(token2);
                        right5.validate();
                        right5.repaint();
                        break;

                    case 36:
                        right6.remove(token2);
                        right6.validate();
                        right6.repaint();
                        break;

                    case 37:
                        right7.remove(token2);
                        right7.validate();
                        right7.repaint();
                        break;

                    case 38:
                        right8.remove(token2);
                        right8.validate();
                        right8.repaint();
                        break;

                    case 39:
                        right9.remove(token2);
                        right9.validate();
                        right9.repaint();
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (pos) {
                    case 0:
                        botRight.remove(token3);
                        botRight.validate();
                        botRight.repaint();
                        break;
                    case 1:
                        bot1.remove(token3);
                        bot1.validate();
                        bot1.repaint();
                        break;
                    case 2:
                        bot2.remove(token3);
                        bot2.validate();
                        bot2.repaint();
                        break;
                    case 3:
                        bot3.remove(token3);
                        bot3.validate();
                        bot3.repaint();
                        break;
                    case 4:
                        bot4.remove(token3);
                        bot4.validate();
                        bot4.repaint();
                        break;
                    case 5:
                        bot5.remove(token3);
                        bot5.validate();
                        bot5.repaint();
                        break;
                    case 6:
                        bot6.remove(token3);
                        bot6.validate();
                        bot6.repaint();
                        break;

                    case 7:
                        bot7.remove(token3);
                        bot7.validate();
                        bot7.repaint();
                        break;
                    case 8:
                        bot8.remove(token3);
                        bot8.validate();
                        bot8.repaint();
                        break;
                    case 9:
                        bot9.remove(token3);
                        bot9.validate();
                        bot9.repaint();
                        break;
                    case 10:
                        botLeft.remove(token3);
                        botLeft.validate();
                        botLeft.repaint();
                        break;
                    case 11:
                        left1.remove(token3);
                        left1.validate();
                        left1.repaint();
                        break;

                    case 12:
                        left2.remove(token3);
                        left2.validate();
                        left2.repaint();
                        break;

                    case 13:
                        left3.remove(token3);
                        left3.validate();
                        left3.repaint();
                        break;

                    case 14:
                        left4.remove(token3);
                        left4.validate();
                        left4.repaint();
                        break;

                    case 15:
                        left5.remove(token3);
                        left5.validate();
                        left5.repaint();
                        break;

                    case 16:
                        left6.remove(token3);
                        left6.validate();
                        left6.repaint();
                        break;

                    case 17:
                        left7.remove(token3);
                        left7.validate();
                        left7.repaint();
                        break;

                    case 18:
                        left8.remove(token3);
                        left8.validate();
                        left8.repaint();
                        break;

                    case 19:
                        left9.remove(token3);
                        left9.validate();
                        left9.repaint();
                        break;

                    case 20:
                        topLeft.remove(token3);
                        topLeft.validate();
                        topLeft.repaint();
                        break;

                    case 21:
                        top1.remove(token3);
                        top1.validate();
                        top1.repaint();
                        break;

                    case 22:
                        top2.remove(token3);
                        top2.validate();
                        top2.repaint();
                        break;

                    case 23:
                        top3.remove(token3);
                        top3.validate();
                        top3.repaint();
                        break;

                    case 24:
                        top4.add(token3);
                        top4.validate();
                        top4.repaint();
                        break;

                    case 25:
                        top5.add(token3);
                        top5.validate();
                        top5.repaint();
                        break;

                    case 26:
                        top6.add(token3);
                        top6.validate();
                        top6.repaint();
                        break;

                    case 27:
                        top7.add(token3);
                        top7.validate();
                        top7.repaint();
                        break;

                    case 28:
                        top8.add(token3);
                        top8.validate();
                        top8.repaint();
                        break;

                    case 29:
                        top9.add(token3);
                        top9.validate();
                        top9.repaint();
                        break;

                    case 30:
                        topRight.add(token3);
                        topRight.validate();
                        topRight.repaint();
                        break;

                    case 31:
                        right1.add(token3);
                        right1.validate();
                        right1.repaint();
                        break;

                    case 32:
                        right2.add(token3);
                        right2.validate();
                        right2.repaint();
                        break;

                    case 33:
                        right3.add(token3);
                        right3.validate();
                        right3.repaint();
                        break;

                    case 34:
                        right4.add(token3);
                        right4.validate();
                        right4.repaint();
                        break;

                    case 35:
                        right5.add(token3);
                        right5.validate();
                        right5.repaint();
                        break;

                    case 36:
                        right6.add(token3);
                        right6.validate();
                        right6.repaint();
                        break;

                    case 37:
                        right7.add(token3);
                        right7.validate();
                        right7.repaint();
                        break;

                    case 38:
                        right8.add(token3);
                        right8.validate();
                        right8.repaint();
                        break;

                    case 39:
                        right9.add(token3);
                        right9.validate();
                        right9.repaint();
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (pos) {
                    case 0:
                        botRight.add(token4);
                        botRight.validate();
                        botRight.repaint();
                        break;
                    case 1:
                        bot1.add(token4);
                        bot1.validate();
                        bot1.repaint();
                        break;
                    case 2:
                        bot2.add(token4);
                        bot2.validate();
                        bot2.repaint();
                        break;
                    case 3:
                        bot3.add(token4);
                        bot3.validate();
                        bot3.repaint();
                        break;
                    case 4:
                        bot4.add(token4);
                        bot4.validate();
                        bot4.repaint();
                        break;
                    case 5:
                        bot5.add(token4);
                        bot5.validate();
                        bot5.repaint();
                        break;
                    case 6:
                        bot6.add(token4);
                        bot6.validate();
                        bot6.repaint();
                        break;

                    case 7:
                        bot7.add(token4);
                        bot7.validate();
                        bot7.repaint();
                        break;
                    case 8:
                        bot8.add(token4);
                        bot8.validate();
                        bot8.repaint();
                        break;
                    case 9:
                        bot9.add(token4);
                        bot9.validate();
                        bot9.repaint();
                        break;
                    case 10:
                        botLeft.add(token4);
                        botLeft.validate();
                        botLeft.repaint();
                        break;
                    case 11:
                        left1.add(token4);
                        left1.validate();
                        left1.repaint();
                        break;

                    case 12:
                        left2.add(token4);
                        left2.validate();
                        left2.repaint();
                        break;

                    case 13:
                        left3.add(token4);
                        left3.validate();
                        left3.repaint();
                        break;

                    case 14:
                        left4.add(token4);
                        left4.validate();
                        left4.repaint();
                        break;

                    case 15:
                        left5.add(token4);
                        left5.validate();
                        left5.repaint();
                        break;

                    case 16:
                        left6.add(token4);
                        left6.validate();
                        left6.repaint();
                        break;

                    case 17:
                        left7.add(token4);
                        left7.validate();
                        left7.repaint();
                        break;

                    case 18:
                        left8.add(token4);
                        left8.validate();
                        left8.repaint();
                        break;

                    case 19:
                        left9.add(token4);
                        left9.validate();
                        left9.repaint();
                        break;

                    case 20:
                        topLeft.add(token4);
                        topLeft.validate();
                        topLeft.repaint();
                        break;

                    case 21:
                        top1.add(token4);
                        top1.validate();
                        top1.repaint();
                        break;

                    case 22:
                        top2.add(token4);
                        top2.validate();
                        top2.repaint();
                        break;

                    case 23:
                        top3.add(token4);
                        top3.validate();
                        top3.repaint();
                        break;

                    case 24:
                        top4.add(token4);
                        top4.validate();
                        top4.repaint();
                        break;

                    case 25:
                        top5.add(token4);
                        top5.validate();
                        top5.repaint();
                        break;

                    case 26:
                        top6.add(token4);
                        top6.validate();
                        top6.repaint();
                        break;

                    case 27:
                        top7.add(token4);
                        top7.validate();
                        top7.repaint();
                        break;

                    case 28:
                        top8.add(token4);
                        top8.validate();
                        top8.repaint();
                        break;

                    case 29:
                        top9.add(token4);
                        top9.validate();
                        top9.repaint();
                        break;

                    case 30:
                        topRight.add(token4);
                        topRight.validate();
                        topRight.repaint();
                        break;

                    case 31:
                        right1.add(token4);
                        right1.validate();
                        right1.repaint();
                        break;

                    case 32:
                        right2.add(token4);
                        right2.validate();
                        right2.repaint();
                        break;

                    case 33:
                        right3.add(token4);
                        right3.validate();
                        right3.repaint();
                        break;

                    case 34:
                        right4.add(token4);
                        right4.validate();
                        right4.repaint();
                        break;

                    case 35:
                        right5.add(token4);
                        right5.validate();
                        right5.repaint();
                        break;

                    case 36:
                        right6.add(token4);
                        right6.validate();
                        right6.repaint();
                        break;

                    case 37:
                        right7.add(token4);
                        right7.validate();
                        right7.repaint();
                        break;

                    case 38:
                        right8.add(token4);
                        right8.validate();
                        right8.repaint();
                        break;

                    case 39:
                        right9.add(token4);
                        right9.validate();
                        right9.repaint();
                        break;
                    default:
                        break;
                }
                break;
        }
    }
}