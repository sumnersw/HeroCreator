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
enum ability_Type{
    proficiency_Bonus,
    attack_Type,
    spell_Bonus,
    hitPoint_Bonus,
    resource_Type,
    armorClass_Mod_Type,
    archeType,
    move_Speed_Bonus,
    spellCasting_Type,
    fighting_Style,
    manuever_Type
}
public class Ability {
    
    private int ability_ID;
    private String ability_Name;
    private int ability_Type;
    private String[] proficiencies;
    private String[] spells;
    private int hp_Modifier_Value;
    private String resource_Name;
    private String resource_Die_Type;
    private int resource_Qty;
    private int base_AC;
    private String[] armorClass_Modifiers;
    private int speed_Bonus_Value;
    private int spellcasting_Type;
    private String[] fighting_Style_Names;
    private String[] manuever_Abilities;

    /**
     * @return the ability_ID
     */
    public int getAbility_ID() {
        return ability_ID;
    }

    /**
     * @param ability_ID the ability_ID to set
     */
    public void setAbility_ID(int ability_ID) {
        this.ability_ID = ability_ID;
    }

    /**
     * @return the ability_Name
     */
    public String getAbility_Name() {
        return ability_Name;
    }

    /**
     * @param ability_Name the ability_Name to set
     */
    public void setAbility_Name(String ability_Name) {
        this.ability_Name = ability_Name;
    }

    /**
     * @return the ability_Type
     */
    public int getAbility_Type() {
        return ability_Type;
    }

    /**
     * @param ability_Type the ability_Type to set
     */
    public void setAbility_Type(int ability_Type) {
        this.ability_Type = ability_Type;
    }

    /**
     * @return the proficiencies
     */
    public String[] getProficiencies() {
        return proficiencies;
    }

    /**
     * @param proficiencies the proficiencies to set
     */
    public void setProficiencies(String[] proficiencies) {
        this.proficiencies = proficiencies;
    }

    /**
     * @return the spells
     */
    public String[] getSpells() {
        return spells;
    }

    /**
     * @param spells the spells to set
     */
    public void setSpells(String[] spells) {
        this.spells = spells;
    }

    /**
     * @return the hp_Modifier_Value
     */
    public int getHp_Modifier_Value() {
        return hp_Modifier_Value;
    }

    /**
     * @param hp_Modifier_Value the hp_Modifier_Value to set
     */
    public void setHp_Modifier_Value(int hp_Modifier_Value) {
        this.hp_Modifier_Value = hp_Modifier_Value;
    }

    /**
     * @return the resource_Name
     */
    public String getResource_Name() {
        return resource_Name;
    }

    /**
     * @param resource_Name the resource_Name to set
     */
    public void setResource_Name(String resource_Name) {
        this.resource_Name = resource_Name;
    }

    /**
     * @return the resource_Die_Type
     */
    public String getResource_Die_Type() {
        return resource_Die_Type;
    }

    /**
     * @param resource_Die_Type the resource_Die_Type to set
     */
    public void setResource_Die_Type(String resource_Die_Type) {
        this.resource_Die_Type = resource_Die_Type;
    }

    /**
     * @return the resource_Qty
     */
    public int getResource_Qty() {
        return resource_Qty;
    }

    /**
     * @param resource_Qty the resource_Qty to set
     */
    public void setResource_Qty(int resource_Qty) {
        this.resource_Qty = resource_Qty;
    }

    /**
     * @return the base_AC
     */
    public int getBase_AC() {
        return base_AC;
    }

    /**
     * @param base_AC the base_AC to set
     */
    public void setBase_AC(int base_AC) {
        this.base_AC = base_AC;
    }

    /**
     * @return the armorClass_Modifiers
     */
    public String[] getArmorClass_Modifiers() {
        return armorClass_Modifiers;
    }

    /**
     * @param armorClass_Modifiers the armorClass_Modifiers to set
     */
    public void setArmorClass_Modifiers(String[] armorClass_Modifiers) {
        this.armorClass_Modifiers = armorClass_Modifiers;
    }

    /**
     * @return the speed_Bonus_Value
     */
    public int getSpeed_Bonus_Value() {
        return speed_Bonus_Value;
    }

    /**
     * @param speed_Bonus_Value the speed_Bonus_Value to set
     */
    public void setSpeed_Bonus_Value(int speed_Bonus_Value) {
        this.speed_Bonus_Value = speed_Bonus_Value;
    }

    /**
     * @return the spellcasting_Type
     */
    public int getSpellcasting_Type() {
        return spellcasting_Type;
    }

    /**
     * @param spellcasting_Type the spellcasting_Type to set
     */
    public void setSpellcasting_Type(int spellcasting_Type) {
        this.spellcasting_Type = spellcasting_Type;
    }

    /**
     * @return the fighting_Style_Names
     */
    public String[] getFighting_Style_Names() {
        return fighting_Style_Names;
    }

    /**
     * @param fighting_Style_Names the fighting_Style_Names to set
     */
    public void setFighting_Style_Names(String[] fighting_Style_Names) {
        this.fighting_Style_Names = fighting_Style_Names;
    }

    /**
     * @return the manuever_Abilities
     */
    public String[] getManuever_Abilities() {
        return manuever_Abilities;
    }

    /**
     * @param manuever_Abilities the manuever_Abilities to set
     */
    public void setManuever_Abilities(String[] manuever_Abilities) {
        this.manuever_Abilities = manuever_Abilities;
    }
    
    
    
}
