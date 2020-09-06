/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championDefs;

import java.util.ArrayList;

/**
 *
 * @author toad
 */
public class Champion {
    
    public String name;
    public String talent;
    public Skill mainFire;
    public Skill ultimate;
    public Skill altFire;
    public Skill moveSkill;
    public Skill utilitySkill;
    public int health = 2200;
    public int ccReduction = 0;
    public int dmgReduction = 0;
    public int blastDamageReduction = 0;
    public int directDamageReduction = 0;
    public int healReduction = 0;
    public boolean formSwap = false;
    
    
    public float moveSpeed = 1; //All champions have the same base speed, this is just to store modifications
    
    public Champion() {
        
    }
}
