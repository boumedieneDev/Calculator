/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author AsmaPC
 */

// Le modèle effectue toutes les opérations nécessaires.
//Le modèle ne sait pas que la vue existe

public class CalculatorModel {

    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }
    
    public int getCalculationValue(){
        return calculationValue;        

    }   

}
