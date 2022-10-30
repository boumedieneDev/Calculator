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

    private double calculationValue;

    public void add (String firstNumber, String secondNumber){
        calculationValue = Double.parseDouble(firstNumber)+Double.parseDouble(secondNumber);
    }
    public void sub (String firstNumber, String secondNumber){
        calculationValue = Double.parseDouble(firstNumber)-Double.parseDouble(secondNumber);
    }
    public void mul (String firstNumber, String secondNumber){
        calculationValue = Double.parseDouble(firstNumber)*Double.parseDouble(secondNumber);
    }
    public void dev (String firstNumber, String secondNumber){
        calculationValue = Double.parseDouble(firstNumber)/Double.parseDouble(secondNumber);
    }
    public void tan (String firstNumber){
        calculationValue = Math.tan(Double.parseDouble(firstNumber));
    }
    public void sin (String firstNumber){
        calculationValue = Math.sin(Double.parseDouble(firstNumber));
    }
    public void cos (String firstNumber){
        calculationValue = Math.cos(Double.parseDouble(firstNumber));
    }
    public void ln (String firstNumber){
        calculationValue = Math.log10(Double.parseDouble(firstNumber));
    }
    public void pow (String firstNumber){
        calculationValue = Math.pow(Double.parseDouble(firstNumber),2);
    }
    public void clear (String firstNumber){}
    public void log (String firstNumber){
        calculationValue = Math.log(Double.parseDouble(firstNumber));
    }
    public void rac (String firstNumber){
        calculationValue = Math.sqrt(Double.parseDouble(firstNumber));
    }
    public void ac() {
        calculationValue=0;
    }



    public double getCalculationValue(){
        return calculationValue;

    }

}
