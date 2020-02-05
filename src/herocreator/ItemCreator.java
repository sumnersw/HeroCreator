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
public class ItemCreator{
    
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
    public JLabel panel_Title = new JLabel("Item Creation");
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
    public JButton back_To_Player_Options = new JButton("Back to Player Options");
    
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
        item_Creator_Panel.setBackground(sandstone);
        
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
        add_Component_GBC(main_Panel, panel_Title, gbc, 0, 0, 3);
        add_Component_GBC(main_Panel, save_Item, gbc, 0, 3, 1);
        add_Component_GBC(main_Panel, item_Name_Label, gbc, 1, 0, 1);
        add_Component_GBC(main_Panel, item_Name_Field, gbc, 1, 1, 3);
        add_Component_GBC(main_Panel, item_Type_Label, gbc, 2, 0, 1);
        add_Component_GBC(main_Panel, item_Type_ComboBox, gbc, 2, 1, 1);
        add_Component_GBC(main_Panel, item_ID_Label, gbc, 2, 2, 1);
        add_Component_GBC(main_Panel, item_ID_Number, gbc, 2, 3, 1);
        add_Component_GBC(main_Panel, item_Cost, gbc, 3, 0, 1);
        add_Component_GBC(main_Panel, item_Cost_Field, gbc, 3, 1, 1);
        add_Component_GBC(main_Panel, item_Weight, gbc, 3, 2, 1);
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
        add_Component_GBC(weapon_Panel, weapon_Type_ComboBox, gbc, 0, 1, 1);
        add_Component_GBC(weapon_Panel, damage_Type_Label, gbc, 0, 2, 1);
        add_Component_GBC(weapon_Panel, damage_Type_ComboBox, gbc, 0, 3, 1);
        add_Component_GBC(weapon_Panel, damage_Die_Label, gbc, 1, 0, 1);
        add_Component_GBC(weapon_Panel, damage_Die_ComboBox, gbc, 1, 1, 1);
        add_Component_GBC(weapon_Panel, versatility_Damage_Label, gbc, 1, 2, 1);
        add_Component_GBC(weapon_Panel, versatile_secondary_Damage_Die_ComboBox,gbc, 1, 3, 1);
        add_Component_GBC(weapon_Panel, range_Normal_Label, gbc, 2, 0, 1);
        add_Component_GBC(weapon_Panel, range_Normal_Field, gbc, 2, 1, 1);
        add_Component_GBC(weapon_Panel, range_Maximum_Label, gbc, 2, 2, 1);
        add_Component_GBC(weapon_Panel, range_Maximum_Field, gbc, 2, 3, 1);
        add_Component_GBC(weapon_Panel, properties_Label, gbc, 3, 0, 1);
        add_Component_GBC(weapon_Panel, ammunition_CheckBox, gbc, 4, 0, 1);
        add_Component_GBC(weapon_Panel, finesse_CheckBox, gbc, 4, 1, 1);
        add_Component_GBC(weapon_Panel, heavy_CheckBox, gbc, 4, 2, 1);
        add_Component_GBC(weapon_Panel, light_CheckBox, gbc, 4, 3, 1);
        add_Component_GBC(weapon_Panel, loading_CheckBox, gbc, 5, 0, 1);
        add_Component_GBC(weapon_Panel, reach_CheckBox, gbc, 5, 1, 1);
        add_Component_GBC(weapon_Panel, thrown_CheckBox, gbc, 5, 2, 1);
        add_Component_GBC(weapon_Panel, versatile_CheckBox, gbc, 5, 3, 1);
        add_Component_GBC(weapon_Panel, two_Handed_CheckBox, gbc, 6, 0, 1);
        
        /**
         * add components to the pack panel
         */
        add_Component_GBC(pack_Panel, pack_Contents_Label, gbc, 0, 0, 2);
        add_Component_GBC(pack_Panel, add_Item_To_Pack_Button, gbc, 0, 1, 2);
        add_Component_GBC(pack_Panel, pack_Contents_Listed, gbc, 1, 0, 4);
        add_Component_GBC(pack_Panel, add_Item_Label, gbc, 2, 0, 1);
        add_Component_GBC(pack_Panel, add_Item_ComboBox, gbc, 2, 1, 1);
        add_Component_GBC(pack_Panel, item_Quantity_Label, gbc, 2, 2, 1);
        add_Component_GBC(pack_Panel, item_Quantity_Field, gbc, 2, 3, 1);
        
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
        add_Component_GBC(item_Creator_Panel, gear_Panel, gbc, 1, 0, 1);
        
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
    
    
}
