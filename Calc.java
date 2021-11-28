package javaMain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calc {

	private JFrame frame;
	private JTextField txtFirst;
	private JTextField txtSecond;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstNumber = new JLabel("first number");
		lblFirstNumber.setFont(new Font("Snap ITC", Font.PLAIN, 13));
		lblFirstNumber.setBounds(10, 82, 126, 14);
		frame.getContentPane().add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("Second number");
		lblSecondNumber.setFont(new Font("Snap ITC", Font.PLAIN, 13));
		lblSecondNumber.setBounds(10, 133, 114, 14);
		frame.getContentPane().add(lblSecondNumber);
		
		txtFirst = new JTextField();
		txtFirst.setFont(new Font("Snap ITC", Font.PLAIN, 13));
		txtFirst.setBounds(158, 79, 86, 20);
		frame.getContentPane().add(txtFirst);
		txtFirst.setColumns(10);
		
		txtSecond = new JTextField();
		txtSecond.setFont(new Font("Snap ITC", Font.PLAIN, 13));
		txtSecond.setBounds(158, 130, 86, 20);
		frame.getContentPane().add(txtSecond);
		txtSecond.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Snap ITC", Font.PLAIN, 13));
		lblResult.setBounds(59, 186, 77, 14);
		frame.getContentPane().add(lblResult);
		
		result = new JTextField();
		result.setFont(new Font("Snap ITC", Font.PLAIN, 13));
		result.setBounds(158, 183, 86, 20);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double v1= Double.parseDouble(txtFirst.getText());
				double v2=Double.parseDouble(txtSecond.getText());
			double res=	v1+v2;
			result.setText(String.valueOf(res));
			}
		});
		btnNewButton.setBounds(317, 72, 89, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Diff");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double v1= Double.parseDouble(txtFirst.getText());
				double v2=Double.parseDouble(txtSecond.getText());
				double res=v1-v2;
			result.setText(String.valueOf(res));
			}
		});
		btnNewButton_1.setBounds(317, 123, 89, 37);
		frame.getContentPane().add(btnNewButton_1);
	}
}
