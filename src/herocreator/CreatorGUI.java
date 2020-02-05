/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herocreator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import herocreator.ItemCreator;

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
    
    
    public JPanel item_Creator_Panel = new JPanel();
    public JPanel main_Panel = new JPanel();
    public JPanel armor_Panel = new JPanel();
    public JPanel weapon_Panel = new JPanel();
    public JPanel gear_Panel = new JPanel();
    public JPanel pack_Panel = new JPanel();
    public JPanel tool_Panel = new JPanel();
    
    /**
     * components for the main panel
     */
    public JLabel item_Panel_Title = new JLabel("Item Creation");
    public JLabel item_ID_Label = new JLabel("Item ID");
    public JLabel item_ID_Number = new JLabel();
    public JLabel item_Name_Label = new JLabel("Item Name");
    public JLabel item_Description_Label = new JLabel("Item Description");
    public JLabel item_Type_Label = new JLabel("Item Type");
    public JLabel item_Cost = new JLabel("Item Cost");
    public JLabel item_Weight = new JLabel("Item Weight");
    public JTextField item_Name_Field = new JTextField();
    public JTextField item_Cost_Field = new JTextField();
    public JTextField item_Weight_Field = new JTextField();
    public JTextArea item_Description_Area = new JTextArea();
    public JButton save_Item = new JButton("Save Item");
    public JComboBox item_Type_ComboBox;
    
    /**
     * components for the armor panel
     */
    public JLabel armor_Type_Label = new JLabel("Armor Type");
    public JLabel base_AC_Label = new JLabel("Base AC");
    public JLabel min_Str_Label = new JLabel("Min Str");
    public JCheckBox stealth_Disad_CheckBox = new JCheckBox("Disadvantage on Stealth");
    public JComboBox armor_Type_ComboBox;
    public JTextField base_AC_Field = new JTextField();
    public JTextField min_Str_Field = new JTextField();
    
    /**
     * components for the weapon panel
     */
    public JLabel weapon_Type_Label = new JLabel("Weapon Type");
    public JLabel damage_Type_Label = new JLabel("Damage Type");
    public JLabel damage_Die_Label = new JLabel("Damage Die");
    public JLabel versatility_Damage_Label = new JLabel("Versatile Damage");
    public JLabel range_Normal_Label = new JLabel("Normal Range");
    public JLabel range_Maximum_Label = new JLabel("Maximum Range");
    public JLabel properties_Label = new JLabel("Properties");
    public JCheckBox ammunition_CheckBox = new JCheckBox("Ammunition");
    public JCheckBox finesse_CheckBox = new JCheckBox("Finesse");
    public JCheckBox heavy_CheckBox = new JCheckBox("Heavy");
    public JCheckBox light_CheckBox = new JCheckBox("Light");
    public JCheckBox loading_CheckBox = new JCheckBox("Loading");
    public JCheckBox reach_CheckBox = new JCheckBox("Reach");
    public JCheckBox thrown_CheckBox = new JCheckBox("Thrown");
    public JCheckBox two_Handed_CheckBox = new JCheckBox("Two Handed");
    public JCheckBox versatile_CheckBox = new JCheckBox("Versatile");
    public JComboBox weapon_Type_ComboBox;
    public JComboBox damage_Die_ComboBox;
    public JComboBox versatile_secondary_Damage_Die_ComboBox;
    public JComboBox damage_Type_ComboBox;
    public JTextField range_Normal_Field = new JTextField();
    public JTextField range_Maximum_Field = new JTextField();
    
    /**
     * components for the pack panel
     */
    public JLabel pack_Contents_Label = new JLabel("Pack Contents");
    public JLabel item_Quantity_Label = new JLabel("Quantity");
    public JLabel add_Item_Label = new JLabel("Add Item");
    public JComboBox add_Item_ComboBox;
    public JTextField item_Quantity_Field = new JTextField();
    public JLabel pack_Contents_Listed = new JLabel();
    public JButton add_Item_To_Pack_Button = new JButton("Add Item to Pack");
    
    
    /**
     * define the color palette used
     */    
    public Color crimson = new Color(197, 40, 61);
    public Color offWhite = new Color(255, 255, 252);
    public Color murky = new Color(0, 26, 35);
    public Color sandstone = new Color(238, 198, 67);
    
     /**
     * 
     * @param jpanel panel to add the components to
     * @param component component to add to the panel
     * @param gbc GridBagConstraints object
     * @param x grid x value for the GridBagConstraints
     * @param y grid y value for the GridBagConstraints
     */
    public void add_Component_GBC(JPanel jpanel, Component component, 
            GridBagConstraints gbc, int x, int y, int width){
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = width;
        jpanel.add(component, gbc);
    }
    
    public void fill_Combo_Boxes(){
        String item_Types[] = {"Armor", "Weapon", "Gear", "Pack", "Tool"};
        String armor_Types[] = {"Light", "Medium", "Heavy", "Shield"};
        String weapon_Types [] = {"Simple Melee", "Simple Ranged", "Martial Melee", "Martial Ranged"};
        String damage_Dice[] = {"1d4", "1d6", "1d8", "1d10", "1d12", "2d6"};
        String damage_Types[] = {"Bludgeoning", "Piercing", "Slashing"};
        item_Type_ComboBox = new JComboBox(item_Types);
        armor_Type_ComboBox = new JComboBox(armor_Types);
        weapon_Type_ComboBox = new JComboBox(weapon_Types);
        damage_Die_ComboBox = new JComboBox(damage_Dice);
        versatile_secondary_Damage_Die_ComboBox = new JComboBox(damage_Dice);
        damage_Type_ComboBox = new JComboBox(damage_Types);
        add_Item_ComboBox = new JComboBox();
    }
    
    public JPanel ItemCreator(){
        
        item_Creator_Panel.setLayout(new GridBagLayout());
        main_Panel.setLayout(new GridBagLayout());
        armor_Panel.setLayout(new GridBagLayout());
        weapon_Panel.setLayout(new GridBagLayout());
        pack_Panel.setLayout(new GridBagLayout());
        gear_Panel.setLayout(new CardLayout());
        tool_Panel.setBackground(murky);
        main_Panel.setBackground(murky);
        armor_Panel.setBackground(murky);
        weapon_Panel.setBackground(murky);
        pack_Panel.setBackground(murky);
        gear_Panel.setBackground(murky);
        item_Creator_Panel.setBackground(murky);
        
        fill_Combo_Boxes();
        
         /**
         * Set the GridBagLayout constraints for the start panel
         */
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        /**
         * add components to the main panel
         */
        add_Component_GBC(main_Panel, item_Panel_Title, gbc, 0, 0, 3);
        add_Component_GBC(main_Panel, save_Item, gbc, 3, 0, 1);
        add_Component_GBC(main_Panel, item_Name_Label, gbc, 0, 1, 1);
        add_Component_GBC(main_Panel, item_Name_Field, gbc, 1, 1, 3);
        add_Component_GBC(main_Panel, item_Type_Label, gbc, 0, 2, 1);
        add_Component_GBC(main_Panel, item_Type_ComboBox, gbc, 1, 2, 1);
        add_Component_GBC(main_Panel, item_ID_Label, gbc, 2, 2, 1);
        add_Component_GBC(main_Panel, item_ID_Number, gbc, 3, 2, 1);
        add_Component_GBC(main_Panel, item_Cost, gbc, 0, 3, 1);
        add_Component_GBC(main_Panel, item_Cost_Field, gbc, 1, 3, 1);
        add_Component_GBC(main_Panel, item_Weight, gbc, 2, 3, 1);
        add_Component_GBC(main_Panel, item_Weight_Field, gbc, 3, 3, 1);
        
        /**
         * add components to the armor panel
         */
        add_Component_GBC(armor_Panel, armor_Type_Label, gbc, 0, 0, 1);
        add_Component_GBC(armor_Panel, armor_Type_ComboBox, gbc, 0, 1, 1);
        add_Component_GBC(armor_Panel, base_AC_Label, gbc, 0, 2, 1);
        add_Component_GBC(armor_Panel, base_AC_Field, gbc, 0, 3, 1);
        add_Component_GBC(armor_Panel, stealth_Disad_CheckBox, gbc, 1, 0, 2);
        add_Component_GBC(armor_Panel, min_Str_Label, gbc, 1, 2, 1);
        add_Component_GBC(armor_Panel, min_Str_Field, gbc, 1, 3, 1);
        
        /**
         * add components to the weapon panel
         */
        add_Component_GBC(weapon_Panel, weapon_Type_Label, gbc, 0, 0, 1);
        add_Component_GBC(weapon_Panel, weapon_Type_ComboBox, gbc, 1, 0, 1);
        add_Component_GBC(weapon_Panel, damage_Type_Label, gbc, 2, 0, 1);
        add_Component_GBC(weapon_Panel, damage_Type_ComboBox, gbc, 3, 0, 1);
        add_Component_GBC(weapon_Panel, damage_Die_Label, gbc, 0, 1, 1);
        add_Component_GBC(weapon_Panel, damage_Die_ComboBox, gbc, 1, 1, 1);
        add_Component_GBC(weapon_Panel, versatility_Damage_Label, gbc, 2, 1, 1);
        add_Component_GBC(weapon_Panel, versatile_secondary_Damage_Die_ComboBox,gbc, 3, 1, 1);
        add_Component_GBC(weapon_Panel, range_Normal_Label, gbc, 0, 2, 1);
        add_Component_GBC(weapon_Panel, range_Normal_Field, gbc, 1, 2, 1);
        add_Component_GBC(weapon_Panel, range_Maximum_Label, gbc, 2, 2, 1);
        add_Component_GBC(weapon_Panel, range_Maximum_Field, gbc, 3, 2, 1);
        add_Component_GBC(weapon_Panel, properties_Label, gbc, 0, 3, 1);
        add_Component_GBC(weapon_Panel, ammunition_CheckBox, gbc, 0, 4, 1);
        add_Component_GBC(weapon_Panel, finesse_CheckBox, gbc, 1, 4, 1);
        add_Component_GBC(weapon_Panel, heavy_CheckBox, gbc, 2, 4, 1);
        add_Component_GBC(weapon_Panel, light_CheckBox, gbc, 3, 4, 1);
        add_Component_GBC(weapon_Panel, loading_CheckBox, gbc, 0, 5, 1);
        add_Component_GBC(weapon_Panel, reach_CheckBox, gbc, 1, 5, 1);
        add_Component_GBC(weapon_Panel, thrown_CheckBox, gbc, 2, 5, 1);
        add_Component_GBC(weapon_Panel, versatile_CheckBox, gbc, 3, 5, 1);
        add_Component_GBC(weapon_Panel, two_Handed_CheckBox, gbc, 0, 6, 1);
        
        /**
         * add components to the pack panel
         */
        add_Component_GBC(pack_Panel, pack_Contents_Label, gbc, 0, 0, 2);
        add_Component_GBC(pack_Panel, add_Item_To_Pack_Button, gbc, 1, 0, 2);
        add_Component_GBC(pack_Panel, pack_Contents_Listed, gbc, 0, 1, 4);
        add_Component_GBC(pack_Panel, add_Item_Label, gbc, 0, 2, 1);
        add_Component_GBC(pack_Panel, add_Item_ComboBox, gbc, 1, 2, 1);
        add_Component_GBC(pack_Panel, item_Quantity_Label, gbc, 2, 2, 1);
        add_Component_GBC(pack_Panel, item_Quantity_Field, gbc, 3, 2, 1);
        
        /**
         * add components to the gear panel in card layout
         */
        gear_Panel.add(armor_Panel);
        gear_Panel.add(weapon_Panel);
        gear_Panel.add(pack_Panel);
        gear_Panel.add(tool_Panel);
        
        /**
         * add components to the creator panel
         */
        add_Component_GBC(item_Creator_Panel, main_Panel, gbc, 0, 0, 1);
        add_Component_GBC(item_Creator_Panel, gear_Panel, gbc, 0, 1, 1);
        
        /**
         * set default visibility
         */
        main_Panel.setVisible(true);
        gear_Panel.setVisible(true);
        armor_Panel.setVisible(false);
        weapon_Panel.setVisible(true);
        pack_Panel.setVisible(false);
        tool_Panel.setVisible(false);        
        
        return item_Creator_Panel;
    }
    
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
    
    public void set_Label_Parameters(){
        item_Panel_Title.setForeground(offWhite);
        item_Name_Label.setForeground(offWhite);
        item_Type_Label.setForeground(offWhite);
        item_ID_Label.setForeground(offWhite);
        item_ID_Number.setForeground(offWhite);
        item_Cost.setForeground(offWhite);
        item_Weight.setForeground(offWhite);
        armor_Type_Label.setForeground(offWhite);
        base_AC_Label.setForeground(offWhite);
        min_Str_Label.setForeground(offWhite);
        stealth_Disad_CheckBox.setForeground(offWhite);
        weapon_Type_Label.setForeground(offWhite);
        properties_Label.setForeground(offWhite);
        damage_Die_Label.setForeground(offWhite);
        damage_Type_Label.setForeground(offWhite);
        range_Normal_Label.setForeground(offWhite);
        range_Maximum_Label.setForeground(offWhite);
        versatility_Damage_Label.setForeground(offWhite);
        ammunition_CheckBox.setForeground(offWhite);
        finesse_CheckBox.setForeground(offWhite);
        heavy_CheckBox.setForeground(offWhite);
        light_CheckBox.setForeground(offWhite);
        loading_CheckBox.setForeground(offWhite);
        reach_CheckBox.setForeground(offWhite);
        thrown_CheckBox.setForeground(offWhite);
        versatile_CheckBox.setForeground(offWhite);
        two_Handed_CheckBox.setForeground(offWhite);
        pack_Contents_Label.setForeground(offWhite);
        add_Item_Label.setForeground(offWhite);
        item_Quantity_Label.setForeground(offWhite);
        pack_Contents_Listed.setForeground(offWhite);
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
        
        save_Item.setBackground(crimson);
        save_Item.setForeground(offWhite);
        
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
            } else if (e.getSource() == create_Item_Button){
                dm_Options_Panel.setVisible(false);
                item_Panel.setVisible(true);
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
        item_Panel = ItemCreator();
        item_Panel.setVisible(false);
        
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
        create_Item_Button.addActionListener(button_Listener);
        
        set_Panel_Parameters();
        set_Button_Parameters();
        set_Label_Parameters();
        window.add(start_Panel);
        window.add(dm_Options_Panel);
        window.add(item_Panel);
        window.setVisible(true);
    
    }
    
    
}
