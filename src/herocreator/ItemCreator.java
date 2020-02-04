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
public class ItemCreator {
    
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
    public JLabel range_Normal_Label = new JLabel("Normal Range");
    public JLabel range_Maximum_Label = new JLabel("Maximum Range");
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
    public JComboBox add_Item_ComboBox;
    public JTextField item_Quantity_Field = new JTextField();
    
    
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
            GridBagConstraints gbc, int x, int y){
        gbc.gridx = x;
        gbc.gridy = y;
        jpanel.add(component, gbc);
    }
    
    public void construct_Main_Panel(){
        
    }
    
    public JPanel ItemCreator(){
        
        item_Creator_Panel.setLayout(new GridBagLayout());
        main_Panel.setLayout(new GridBagLayout());
        armor_Panel.setLayout(new GridBagLayout());
        weapon_Panel.setLayout(new GridBagLayout());
        pack_Panel.setLayout(new GridBagLayout());
        main_Panel.setBackground(murky);
        armor_Panel.setBackground(murky);
        weapon_Panel.setBackground(murky);
        pack_Panel.setBackground(murky);
        item_Creator_Panel.setBackground(sandstone);
        
         /**
         * Set the GridBagLayout constraints for the start panel
         */
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        
    }
    
    
}
