/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championDefs;

/**
 *
 * @author toad
 */
public class Skill {
    enum DamageType {
        DIRECT,
        AREA,
        NONE,
        HEALING
    }
    public String name;
    public float cooldown; //What is the base cooldown?
    public int damage; //how much damage does the skill do?
    public float duration; //how long does the skill last?
    public boolean overTime = false; //does the skill apply over time?
    public int overTimeDamage = 0; //damage per second over time
    public int overTimeHealing = 0; //healing per second over time
    public float tickRate = 1; //default to 1 tick per second for over time skills
    public boolean waitForDuration; //Do we wait for the duration to be over before cooldown starts?
    public int charges = -1; //If the skill has charges or ammo, set this to a positive value
    public int teamHealing = 0; //Burst team healing
    public int selfHealing = 0; //Burst self healing
    public int dmgReduction = 0; //Damage reduction effect
    public int ccReduction = 0; //Added CC reduction
    public int moveSpeed = 0; //Added move speed
    public float stunDuration = 0; //How long the target is stunned for on use
    public DamageType damageType = DamageType.DIRECT; //damage type, for calculating reductions
    
}
