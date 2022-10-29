/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

	// private JTextField firstNumber  = new JTextField(10);
	// private JLabel additionLabel = new JLabel("+");
	// private JTextField secondNumber = new JTextField(10);
	// private JButton calculateButton = new JButton("Calculate");
	// private JTextField calcSolution = new JTextField(10);
	
	// JFrame frame =  new JFrame();
	JPanel head = new JPanel();
	Container number = new Container();
	Container opp = new Container();

	JTextField result = new JTextField(25);

	// JButton[][] buttons = new JButton[4][5];
 
	// buttons[0][0] = new JButton("C");
	// buttons[1][0] = new JButton("(-)");
	// buttons[2][0] = new JButton("%");
	// buttons[3][0] = new JButton("/");

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



	CalculatorView(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
		this.setSize(600, 250);
		
		head.setSize(550, 90);
		head.add(result);
		
		// oop.setSize(350, 150);
		// number.setSize(240, 150);

		opp.setLayout(new GridLayout(5,7));
		care.addActionListener(this);
		opp.add(care);
		pow.addActionListener(this);
		opp.add(pow);
		parenthese.addActionListener(this);
		opp.add(parenthese);
		ac.addActionListener(this);
		opp.add(ac);
		minus.addActionListener(this);
		opp.add(minus);
		modulo.addActionListener(this);
		opp.add(modulo);
		devision.addActionListener(this);
		opp.add(devision);

		e.addActionListener(this);
		opp.add(e);
		pow_ten.addActionListener(this);
		opp.add(pow_ten);
		invert.addActionListener(this);
		opp.add(invert);
		seven.addActionListener(this);
		opp.add(seven);
		eight.addActionListener(this);
		opp.add(eight);
		nine.addActionListener(this);
		opp.add(nine);
		multiple.addActionListener(this);
		opp.add(multiple);

		racine.addActionListener(this);
		opp.add(racine);
		racinex.addActionListener(this);
		opp.add(racinex);
		ln.addActionListener(this);
		opp.add(ln);
		four.addActionListener(this);
		opp.add(four);
		five.addActionListener(this);
		opp.add(five);
		six.addActionListener(this);
		opp.add(six);
		substract.addActionListener(this);
		opp.add(substract);


		log.addActionListener(this);
		opp.add(log);
		fact.addActionListener(this);
		opp.add(fact);
		sin.addActionListener(this);
		opp.add(sin);
		one.addActionListener(this);
		opp.add(one);
		two.addActionListener(this);
		opp.add(two);
		three.addActionListener(this);
		opp.add(three);
		plus.addActionListener(this);
		opp.add(plus);

		cos.addActionListener(this);
		opp.add(cos);
		tan.addActionListener(this);
		opp.add(tan);
		pi.addActionListener(this);
		opp.add(pi);
		zero.addActionListener(this);
		opp.add(zero);
		dot.addActionListener(this);
		opp.add(dot);
		equal.addActionListener(this);
		opp.add(equal);
		
		this.add(head);
		this.add(opp);
		// this.add(number);

		setVisible(true);
		
			
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}
	

	
// 	public int getCalcSolution(){
		
// 		return Integer.parseInt(calcSolution.getText());
		
// 	}
	
// 	public void setCalcSolution(int solution){
		
// 		calcSolution.setText(Integer.toString(solution));
		
// 	}
	
// 	// Si on clique sur le bouton, on execute une méthode dans le controlleur
	
//             void addCalculateListener(ActionListener listenForCalcButton){
		
// 		calculateButton.addActionListener(listenForCalcButton);
		
// 	}
	
	
	
// 	void displayErrorMessage(String errorMessage){
		
// 		JOptionPane.showMessageDialog(this, errorMessage);
		
// 	}

 
	
// }