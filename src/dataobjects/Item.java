/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataobjects;

/**
 *
 * @author stephen
 */
enum item_Type {
    Armor, 
    Weapon, 
    Gear, 
    Pack, 
    Tool
}

enum armor_Type{
    Light,
    Medium,
    Heavy,
    Shield
}

enum weapon_Type{
    simple_Melee_Weapon,
    simple_Ranged_Weapon,
    martial_Melee_Weapon,
    martial_Ranged_Weapon
}

public class Item {
         
    private int item_Id;
    private String item_Name;
    private String[] item_Description;
    private String item_Type;
    private int item_Cost;
    private int item_Weight;
    private int item_AC;
    private String item_Armor_Type;
    private int item_Armor_Min_Str;
    private boolean item_Armor_Stealth_Disadvantage;
    private String item_Weapon_Type;
    private String item_Weapon_Damage_Die;
    private String item_Weapon_Damage_Type;
    private String[] item_Weapon_Properties;
    private String item_Weapon_Range_Property;
    private String[] item_Pack_items;
    

    /**
     * @return the item_Id
     */
    public int getItem_Id() {
        return item_Id;
    }

    /**
     * @param item_Id the item_Id to set
     */
    public void setItem_Id(int item_Id) {
        this.item_Id = item_Id;
    }

    /**
     * @return the item_Name
     */
    public String getItem_Name() {
        return item_Name;
    }

    /**
     * @param item_Name the item_Name to set
     */
    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    /**
     * @return the item_Description
     */
    public String[] getItem_Description() {
        return item_Description;
    }

    /**
     * @param item_Description the item_Description to set
     */
    public void setItem_Description(String[] item_Description) {
        this.item_Description = item_Description;
    }

    /**
     * @return the item_Type
     */
    public String getItem_Type() {
        return item_Type;
    }

    /**
     * @param item_Type the item_Type to set
     */
    public void setItem_Type(String item_Type) {
        this.item_Type = item_Type;
    }

    /**
     * @return the item_Cost
     */
    public int getItem_Cost() {
        return item_Cost;
    }

    /**
     * @param item_Cost the item_Cost to set
     */
    public void setItem_Cost(int item_Cost) {
        this.item_Cost = item_Cost;
    }

    /**
     * @return the item_Weight
     */
    public int getItem_Weight() {
        return item_Weight;
    }

    /**
     * @param item_Weight the item_Weight to set
     */
    public void setItem_Weight(int item_Weight) {
        this.item_Weight = item_Weight;
    }

    /**
     * @return the item_AC
     */
    public int getItem_AC() {
        return item_AC;
    }

    /**
     * @param item_AC the item_AC to set
     */
    public void setItem_AC(int item_AC) {
        this.item_AC = item_AC;
    }

    /**
     * @return the item_Armor_Type
     */
    public String getItem_Armor_Type() {
        return item_Armor_Type;
    }

    /**
     * @param item_Armor_Type the item_Armor_Type to set
     */
    public void setItem_Armor_Type(String item_Armor_Type) {
        this.item_Armor_Type = item_Armor_Type;
    }

    /**
     * @return the item_Armor_Min_Str
     */
    public int getItem_Armor_Min_Str() {
        return item_Armor_Min_Str;
    }

    /**
     * @param item_Armor_Min_Str the item_Armor_Min_Str to set
     */
    public void setItem_Armor_Min_Str(int item_Armor_Min_Str) {
        this.item_Armor_Min_Str = item_Armor_Min_Str;
    }

    /**
     * @return the item_Armor_Stealth_Disadvantage
     */
    public boolean isItem_Armor_Stealth_Disadvantage() {
        return item_Armor_Stealth_Disadvantage;
    }

    /**
     * @param item_Armor_Stealth_Disadvantage the item_Armor_Stealth_Disadvantage to set
     */
    public void setItem_Armor_Stealth_Disadvantage(boolean item_Armor_Stealth_Disadvantage) {
        this.item_Armor_Stealth_Disadvantage = item_Armor_Stealth_Disadvantage;
    }

    /**
     * @return the item_Weapon_Type
     */
    public String getItem_Weapon_Type() {
        return item_Weapon_Type;
    }

    /**
     * @param item_Weapon_Type the item_Weapon_Type to set
     */
    public void setItem_Weapon_Type(String item_Weapon_Type) {
        this.item_Weapon_Type = item_Weapon_Type;
    }

    /**
     * @return the item_Weapon_Damage_Die
     */
    public String getItem_Weapon_Damage_Die() {
        return item_Weapon_Damage_Die;
    }

    /**
     * @param item_Weapon_Damage_Die the item_Weapon_Damage_Die to set
     */
    public void setItem_Weapon_Damage_Die(String item_Weapon_Damage_Die) {
        this.item_Weapon_Damage_Die = item_Weapon_Damage_Die;
    }

    /**
     * @return the item_Weapon_Damage_Type
     */
    public String getItem_Weapon_Damage_Type() {
        return item_Weapon_Damage_Type;
    }

    /**
     * @param item_Weapon_Damage_Type the item_Weapon_Damage_Type to set
     */
    public void setItem_Weapon_Damage_Type(String item_Weapon_Damage_Type) {
        this.item_Weapon_Damage_Type = item_Weapon_Damage_Type;
    }

    /**
     * @return the item_Weapon_Properties
     */
    public String[] getItem_Weapon_Properties() {
        return item_Weapon_Properties;
    }

    /**
     * @param item_Weapon_Properties the item_Weapon_Properties to set
     */
    public void setItem_Weapon_Properties(String[] item_Weapon_Properties) {
        this.item_Weapon_Properties = item_Weapon_Properties;
    }

    /**
     * @return the item_Weapon_Range_Property
     */
    public String getItem_Weapon_Range_Property() {
        return item_Weapon_Range_Property;
    }

    /**
     * @param normal_Range the item's normal range
     * @param max_Range the item's maximum possible range
     */
    public void setItem_Weapon_Range_Property(int normal_Range, int max_Range) {
        StringBuilder range_builder = new StringBuilder();
        range_builder.append("(");
        range_builder.append(Integer.toString(normal_Range));
        range_builder.append("/");
        range_builder.append(Integer.toString(max_Range));
        range_builder.append(")");
        this.item_Weapon_Range_Property = range_builder.toString();
    }

    /**
     * @return the item_Pack_items
     */
    public String[] getItem_Pack_items() {
        return item_Pack_items;
    }

    /**
     * @param item_Pack_items the item_Pack_items to set
     */
    public void setItem_Pack_items(String[] item_Pack_items) {
        this.item_Pack_items = item_Pack_items;
    }
    
    
}
