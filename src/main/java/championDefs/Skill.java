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
    public float cooldown; //What is the base cooldown?
    public int damage; //how much damage does the skill do?
    public float duration; //how long does the skill last?
    public boolean overTime; //does the skill apply over time?
    public float tickRate = 1; //default to 1 tick per second for over time skills
    public boolean waitForDuration; //Do we wait for the duration to be over before cooldown starts?
}
