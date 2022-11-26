package mvc;

import java.awt.event.ActionEvent;

/**
 *
 * @author AsmaPC
 */


// Le seul travail de la vue est d'afficher ce que l'utilisateur voit
// La vue n'effectue pas d'opérations

import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class CalculatorView extends JFrame implements ActionListener{

	private JTextField firstNumber  = new JTextField(10);
	public void setFirstNumber(String firstNumber) {
		this.firstNumber.setText(firstNumber);;
	}
	public String getFirstNumber() {
		return firstNumber.getText();
	}

	private JTextField secondNumber = new JTextField(10);
	public void setSecondNumber(String secondNumber) {
		this.secondNumber.setText(secondNumber);;
	}
	public String getSecondNumber() {
		return secondNumber.getText();
	}

	private JTextField calcSolution = new JTextField(15);
	public String getCalcSolution(){
		return calcSolution.getText();
	}
	public void setCalcSolution(String solution){
		calcSolution.setText(solution);
	}

	// JFrame frame =  new JFrame();
	JPanel head = new JPanel();
	Container number = new Container();
	Container opp = new Container();
	Container binopp = new Container();



	JButton ac = new JButton("C");
	JButton minus = new JButton("(-)");
	JButton modulo = new JButton("%");
	JButton devision = new JButton("/");

	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton multiple = new JButton("x");

	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton substract = new JButton("-");

	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton plus = new JButton("+");

	JButton zero = new JButton("0");
	JButton dot = new JButton(".");
	JButton equal = new JButton("=");

	JButton care = new JButton("x2");
	JButton pow = new JButton("xy");
	JButton parenthese = new JButton("()");

	JButton e = new JButton("ex");
	JButton pow_ten = new JButton("10x");
	JButton invert = new JButton("1/x");

	JButton racine = new JButton("rx");
	JButton racinex = new JButton("yrx");
	JButton ln = new JButton("ln");

	JButton log = new JButton("log");
	JButton fact = new JButton("x!");
	JButton sin = new JButton("sin");

	JButton cos = new JButton("cos");
	JButton tan = new JButton("tan");
	JButton pi = new JButton("pi");

	JButton binSum = new JButton("bsum");
	JButton binDiff = new JButton("bdif");
	JButton binProd = new JButton("bprod");
	JButton binQuot = new JButton("bquot");

	CalculatorView(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
		this.setSize(600, 250);

		head.setSize(550, 90);
		head.add(firstNumber);
		head.add(secondNumber);
		head.add(new JLabel("="));
		calcSolution.setText("0");
		head.add(calcSolution);


		opp.setLayout(new GridLayout(5,7));
		opp.add(devision);
		devision.setActionCommand("devision");

		opp.add(care);
		care.setActionCommand("care");
		opp.add(ac);
		ac.setActionCommand("ac");

		opp.add(multiple);
		multiple.setActionCommand("multiple");

		opp.add(racine);
		racine.setActionCommand("racine");
		opp.add(ln);
		ln.setActionCommand("ln");
		opp.add(substract);
		substract.setActionCommand("substract");

		opp.add(log);
		log.setActionCommand("log");
		opp.add(sin);
		sin.setActionCommand("sin");
		opp.add(plus);
		plus.setActionCommand("plus");

		opp.add(cos);
		cos.setActionCommand("cos");
		opp.add(tan);
		tan.setActionCommand("tan");

		binopp.setLayout(new GridLayout(2,2));
		binopp.add(binSum);
		binSum.setActionCommand("binSum");
		binopp.add(binDiff);
		binDiff.setActionCommand("binDiff");

		binopp.add(binProd);
		binProd.setActionCommand("binProd");
		binopp.add(binQuot);
		binQuot.setActionCommand("binQuot");

		this.add(head);
		this.add(opp);
		this.add(binopp);

		setVisible(true);


	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	// Si on clique sur le bouton, on execute une méthode dans le controlleur
    void addCalculateListener(ActionListener listenForCalcButton){
		plus.addActionListener(listenForCalcButton);
		substract.addActionListener(listenForCalcButton);
		devision.addActionListener(listenForCalcButton);
		multiple.addActionListener(listenForCalcButton);
		ac.addActionListener(listenForCalcButton);
		care.addActionListener(listenForCalcButton);
		racine.addActionListener(listenForCalcButton);
		log.addActionListener(listenForCalcButton);
		ln.addActionListener(listenForCalcButton);
		tan.addActionListener(listenForCalcButton);
		sin.addActionListener(listenForCalcButton);
		cos.addActionListener(listenForCalcButton);
	}
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}