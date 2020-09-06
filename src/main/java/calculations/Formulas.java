/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculations;

/**
 *
 * @author toad
 */
public class Formulas {
    //https://paladins.gamepedia.com/Diminishing_returns
    
    public static float calcTrueMoveSpeed(float totalBonus, float highestBonus) {
        return (float) (highestBonus+(1.5-highestBonus)*((totalBonus-highestBonus)/((totalBonus-.3)+1.36)));
    }
    
    public static float calcTrueBonus(float totalBonus, float highestBonus) {
        return (float) (highestBonus+(.95-highestBonus)*((totalBonus-highestBonus)/((totalBonus-.3)+.8)));
    }

}
