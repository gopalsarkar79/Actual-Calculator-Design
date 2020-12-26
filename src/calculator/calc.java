package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calc {

	private JFrame frame;
	private JTextField textField;
	private JButton btn9;
	private JButton btn6;
	private JButton btn0;
	private JButton bt1;
	private JButton btnbackspc;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btndot;
	private JButton btndbl00;
	private JButton btn7;
	private JButton btn4;
	private JButton btn3;
	private JButton btnequal;
	private JButton btnadd;
	private JButton btnminus;
	private JButton btnmulti;
	private JButton btndivide;
	private JButton btnmod;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 235, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(0, 10, 223, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnclear.setBounds(0, 69, 63, 49);
		frame.getContentPane().add(btnclear);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn9.setBounds(0, 115, 63, 49);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn6.setBounds(0, 163, 63, 49);
		frame.getContentPane().add(btn6);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn0.setBounds(0, 258, 63, 49);
		frame.getContentPane().add(btn0);
		
		bt1 = new JButton("1");
		bt1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+bt1.getText();
				textField.setText(number);
			}
		});
		bt1.setBounds(0, 211, 63, 49);
		frame.getContentPane().add(bt1);
		
		btnbackspc = new JButton("\uF0E7");
		btnbackspc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnbackspc.setFont(new Font("Wingdings", Font.BOLD, 17));
		btnbackspc.setBounds(53, 69, 63, 49);
		frame.getContentPane().add(btnbackspc);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn8.setBounds(63, 115, 53, 49);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn5.setBounds(61, 163, 55, 49);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn2.setBounds(61, 211, 55, 49);
		frame.getContentPane().add(btn2);
		
		btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndot.setBounds(61, 258, 55, 49);
		frame.getContentPane().add(btndot);
		
		btndbl00 = new JButton("00");
		btndbl00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btndbl00.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndbl00.setBounds(113, 69, 55, 49);
		frame.getContentPane().add(btndbl00);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn7.setBounds(113, 115, 55, 49);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn4.setBounds(113, 163, 55, 49);
		frame.getContentPane().add(btn4);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn3.setBounds(113, 211, 55, 49);
		frame.getContentPane().add(btn3);
		
		btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
			}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnequal.setBounds(113, 258, 55, 49);
		frame.getContentPane().add(btnequal);
		
		btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "+";
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnadd.setBounds(165, 69, 55, 49);
		frame.getContentPane().add(btnadd);
		
		btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnminus.setBounds(165, 115, 55, 49);
		frame.getContentPane().add(btnminus);
		
		btnmulti = new JButton("*");
		btnmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "*";
			}
		});
		btnmulti.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnmulti.setBounds(165, 163, 55, 49);
		frame.getContentPane().add(btnmulti);
		
		btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btndivide.setBounds(165, 211, 55, 49);
		frame.getContentPane().add(btndivide);
		
		btnmod = new JButton("%");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "%";
			}
		});
		btnmod.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnmod.setBounds(165, 258, 55, 49);
		frame.getContentPane().add(btnmod);
	}
}
