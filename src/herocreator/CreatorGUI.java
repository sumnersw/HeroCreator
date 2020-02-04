/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herocreator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author stephen
 */
public class CreatorGUI {
    
    /**
     * The main JFrame or Window the application will run in
     */
    public JFrame window = new JFrame("Hero Creator");
    
    /**
     * Buttons for the start panel
     */
    public JButton open_DM_Options_Button = new JButton("Open DM Options");
    public JButton create_Character_Button = new JButton("Create Character");
    public JButton edit_Character_Button = new JButton("Edit Character");
    public JButton level_Up_Character_Button = new JButton("Level Up Character");

    /**
     * Buttons for the DM Options Panel
     */
    public JButton create_Ability_Button = new JButton("Create Ability");
    public JButton create_Background_Button = new JButton("Create Background");
    public JButton create_Class_Button = new JButton("Create Class");
    public JButton create_Feat_Button = new JButton("Create Feat");
    public JButton create_Item_Button = new JButton("Create Item");
    public JButton create_Race_Button = new JButton("Cretae Race");
    public JButton create_Setting_Button = new JButton("Create Setting");
    public JButton create_Spell_Button = new JButton("Create Spell");
    public JButton edit_Ability_Button = new JButton("Edit Ability");
    public JButton edit_Background_Button = new JButton("Edit Background");
    public JButton edit_Class_Button = new JButton("Edit Class");
    public JButton edit_Feat_Button = new JButton("Edit Feat");
    public JButton edit_Item_Button = new JButton("Edit Item");
    public JButton edit_Race_Button = new JButton("Edit Race");
    public JButton edit_Setting_Button = new JButton("Edit Setting");
    public JButton edit_Spell_Button = new JButton("Edit Spell");
    public JButton back_To_Player_Options = new JButton("Back to Player Options");
    
    
    /**
     * Panels for the starting GUI
     */
    public JPanel start_Panel = new JPanel();
    public JPanel dm_Options_Panel = new JPanel();
    public JPanel ability_Panel = new JPanel();
    public JPanel setting_Panel = new JPanel();
    public JPanel class_Panel = new JPanel();
    public JPanel race_Panel = new JPanel();
    public JPanel background_Panel = new JPanel();
    public JPanel feat_Panel = new JPanel();
    public JPanel spell_Panel = new JPanel();
    public JPanel item_Panel = new JPanel();
    public JPanel character_Panel = new JPanel();
    public JPanel level_Up_Panel = new JPanel();
    
    /**
     * define the color palette used
     */
    
    public Color crimson = new Color(197, 40, 61);
    public Color offWhite = new Color(255, 255, 252);
    public Color murky = new Color(0, 26, 35);
    public Color sandstone = new Color(238, 198, 67);
    
    /**
     * 
     * @param jpanel
     * @param jbutton
     * @param gbc
     * @param x
     * @param y 
     */
    
    public static void add_Button_GBC(JPanel jpanel, JButton jbutton, GridBagConstraints gbc, int x, int y){
        gbc.gridx = x;
        gbc.gridy = y;
        jpanel.add(jbutton, gbc);
    }
    
    public static void add_Panel_GBC(JFrame jframe, JPanel jpanel, GridBagConstraints gbc, int x, int y){
        gbc.gridx = x;
        gbc.gridy = y;
        jframe.add(jpanel, gbc);
    }
    
    public void set_Panel_Parameters(){
        /**
         * set parameters for the panels
         */
        start_Panel.setBackground(murky);
        dm_Options_Panel.setBackground(murky);
        
    }
    
    public void set_Button_Parameters(){
        /**
         * set parameters for the buttons
         */
        open_DM_Options_Button.setBackground(crimson);
        open_DM_Options_Button.setForeground(offWhite);
        
        create_Character_Button.setBackground(crimson);
        create_Character_Button.setForeground(offWhite);
        
        edit_Character_Button.setBackground(crimson);
        edit_Character_Button.setForeground(offWhite);
        
        level_Up_Character_Button.setBackground(crimson);
        level_Up_Character_Button.setForeground(offWhite);
        
        create_Setting_Button.setBackground(crimson);
        create_Setting_Button.setForeground(offWhite);
        
        create_Class_Button.setBackground(crimson);
        create_Class_Button.setForeground(offWhite);
        
        create_Race_Button.setBackground(crimson);
        create_Race_Button.setForeground(offWhite);
        
        create_Background_Button.setBackground(crimson);
        create_Background_Button.setForeground(offWhite);
        
        create_Ability_Button.setBackground(crimson);
        create_Ability_Button.setForeground(offWhite);
        
        create_Feat_Button.setBackground(crimson);
        create_Feat_Button.setForeground(offWhite);
        
        create_Spell_Button.setBackground(crimson);
        create_Spell_Button.setForeground(offWhite);
        
        create_Item_Button.setBackground(crimson);
        create_Item_Button.setForeground(offWhite);
        
        edit_Setting_Button.setBackground(crimson);
        edit_Setting_Button.setForeground(offWhite);
        
        edit_Class_Button.setBackground(crimson);
        edit_Class_Button.setForeground(offWhite);
        
        edit_Race_Button.setBackground(crimson);
        edit_Race_Button.setForeground(offWhite);
        
        edit_Background_Button.setBackground(crimson);
        edit_Background_Button.setForeground(offWhite);
        
        edit_Ability_Button.setBackground(crimson);
        edit_Ability_Button.setForeground(offWhite);
        
        edit_Feat_Button.setBackground(crimson);
        edit_Feat_Button.setForeground(offWhite);
        
        edit_Spell_Button.setBackground(crimson);
        edit_Spell_Button.setForeground(offWhite);
        
        edit_Item_Button.setBackground(crimson);
        edit_Item_Button.setForeground(offWhite);
        
        back_To_Player_Options.setBackground(crimson);
        back_To_Player_Options.setForeground(offWhite);
        
    }
    
    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == open_DM_Options_Button){
                start_Panel.setVisible(false);
                dm_Options_Panel.setVisible(true);
            } else if (e.getSource() == back_To_Player_Options){
                dm_Options_Panel.setVisible(false);
                start_Panel.setVisible(true);
            }
        }
        
    }
       
    public CreatorGUI() {
        
        /**
         * set window defaults
         */        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800,600);
        window.setLocationRelativeTo(null);
        window.setLayout(new CardLayout());
        
        
        /**
         * Set layouts for the panels
         */
        start_Panel.setLayout(new GridBagLayout());
        start_Panel.setVisible(true);
        dm_Options_Panel.setLayout(new GridBagLayout());
        dm_Options_Panel.setVisible(false);
        
        /**
         * Set the GridBagLayout constraints for the start panel
         */
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        /**
         * add buttons to start_panel
         */
        add_Button_GBC(start_Panel, open_DM_Options_Button, gbc, 0, 0);
        add_Button_GBC(start_Panel, create_Character_Button, gbc, 0, 1);
        add_Button_GBC(start_Panel, edit_Character_Button, gbc, 0, 2);
        add_Button_GBC(start_Panel, level_Up_Character_Button, gbc, 0, 3);
        
        /**
         * add buttons to dm options panel
         */
        add_Button_GBC(dm_Options_Panel, create_Setting_Button, gbc, 0, 0);
        add_Button_GBC(dm_Options_Panel, create_Class_Button, gbc, 0, 1);
        add_Button_GBC(dm_Options_Panel, create_Race_Button, gbc, 0, 2);
        add_Button_GBC(dm_Options_Panel, create_Background_Button, gbc, 0, 3);
        add_Button_GBC(dm_Options_Panel, create_Ability_Button, gbc, 0, 4);
        add_Button_GBC(dm_Options_Panel, create_Feat_Button, gbc, 0, 5);
        add_Button_GBC(dm_Options_Panel, create_Spell_Button, gbc, 0, 6);
        add_Button_GBC(dm_Options_Panel, create_Item_Button, gbc, 0, 7);

        add_Button_GBC(dm_Options_Panel, edit_Setting_Button, gbc, 1, 0);
        add_Button_GBC(dm_Options_Panel, edit_Class_Button, gbc, 1, 1);
        add_Button_GBC(dm_Options_Panel, edit_Race_Button, gbc, 1, 2);
        add_Button_GBC(dm_Options_Panel, edit_Background_Button, gbc, 1, 3);
        add_Button_GBC(dm_Options_Panel, edit_Ability_Button, gbc, 1, 4);
        add_Button_GBC(dm_Options_Panel, edit_Feat_Button, gbc, 1, 5);
        add_Button_GBC(dm_Options_Panel, edit_Spell_Button, gbc, 1, 6);
        add_Button_GBC(dm_Options_Panel, edit_Item_Button, gbc, 1, 7);
        
        add_Button_GBC(dm_Options_Panel, back_To_Player_Options, gbc, 1, 8);
        
        /**
         * Create action listener and add it to the buttons
         */
        ButtonListener button_Listener = new ButtonListener();
        open_DM_Options_Button.addActionListener(button_Listener);
        back_To_Player_Options.addActionListener(button_Listener);
        
        set_Panel_Parameters();
        set_Button_Parameters();
        window.add(start_Panel);
        window.add(dm_Options_Panel);
        window.setVisible(true);
    
    }
    
    
}
