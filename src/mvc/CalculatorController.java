/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
// package mvc;

/**
 *
 * @author AsmaPC
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Le Controlleur fait la coordination des interactions entre la vue et le modèle
//
public class CalculatorController {

	private CalculatorView theView;
	private CalculatorModel theModel;

	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;

		this.theView.addCalculateListener(new CalculateListener());
	}

	class CalculateListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String firstNumber, secondNumber;

			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				if (e.getActionCommand().equals("plus")) {
					theModel.add(firstNumber, secondNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				if (e.getActionCommand().equals("substract")) {
					theModel.sub(firstNumber, secondNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				if (e.getActionCommand().equals("devision")) {
					theModel.dev(firstNumber, secondNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				if (e.getActionCommand().equals("multiple")) {
					theModel.mul(firstNumber, secondNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				if (e.getActionCommand().equals("ac")) {
					theModel.ac();
					theView.setCalcSolution(theModel.getCalculationValue());
					theView.setFirstNumber("0");
					theView.setSecondNumber("0");
				}
				if (e.getActionCommand().equals("care")) {
					theModel.pow(firstNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				if (e.getActionCommand().equals("racine")) {
					theModel.rac(firstNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				if (e.getActionCommand().equals("log")) {
					theModel.log(firstNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				if (e.getActionCommand().equals("ln")) {
					theModel.ln(firstNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				if (e.getActionCommand().equals("tan")) {
					theModel.tan(firstNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				if (e.getActionCommand().equals("sin")) {
					theModel.sin(firstNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				if (e.getActionCommand().equals("cos")) {
					theModel.cos(firstNumber);
					theView.setCalcSolution(theModel.getCalculationValue());
				}
			} catch (NumberFormatException ex) {
				System.out.println(ex);
				theView.displayErrorMessage("You Need to Enter 2 Integers");
			}
		}

	}

}