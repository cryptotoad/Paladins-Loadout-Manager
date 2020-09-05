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
    /*
    Here is the formula for diminishing returns for movement speed increases:

    x = total movement speed bonus
    m = highest single movement speed bonus
    y = final diminished value
    y = m+(1.5-m)*((x-m)/((x-.3)+1.36))

Here is the formula for diminishing returns for all other attributes:

    x = total attribute bonus
    m = highest single attribute bonus
    y = final diminished value
    y = m+(.95-m)*((x-m)/((x-.3)+.8))
    */
}
