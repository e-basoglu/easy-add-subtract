import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame();
		
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.yellow);
		panel1.setBounds(20,30,540,310);
		panel1.setLayout(null);
		frame.add(panel1);
		
		JLabel text1 = new JLabel();
		text1.setText("Easy Add and Subtract");
		text1.setBounds(190, 20, 150,20);
		text1.setLayout(null);
		panel1.add(text1);
		
		JLabel text2 = new JLabel();
		text2.setText("Enter the first number:");
		text2.setBounds(190, 60, 150,20);
		text2.setLayout(null);
		panel1.add(text2);
		
		//First number
		JTextField firstNumber = new JTextField();
		firstNumber.setBounds(190, 85, 150,20);
		panel1.add(firstNumber);
		//
		
		JLabel text3 = new JLabel();
		text3.setText("Enter the second number:");
		text3.setBounds(190, 110, 150,20);
		text3.setLayout(null);
		panel1.add(text3);
		
		//Second number
		JTextField secondNumber = new JTextField();
		secondNumber.setBounds(190,135, 150,20);
		panel1.add(secondNumber);
		//
		
		JPanel resultDisplay = new JPanel();
		resultDisplay.setBackground(Color.white);
		resultDisplay.setBounds(400,100, 80,80);
		resultDisplay.setLayout(null);
		panel1.add(resultDisplay);
		
		JLabel process = new JLabel("Result:");
		process.setBounds(20, 15, 50,30);
		process.setLayout(null);
		resultDisplay.add(process);
		
		JLabel result = new JLabel();
		result.setBounds(30, 40, 50,30);
		result.setLayout(null);
		resultDisplay.add(result);
		
		JButton buttonAdd = new JButton("Add");
		buttonAdd.setBounds(190,180, 150,20);
		buttonAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int first = Integer.parseInt(firstNumber.getText());
				int last = Integer.parseInt(secondNumber.getText());
				int processResult = first + last;
				result.setText(Integer.toString(processResult));
			}
		});
		panel1.add(buttonAdd);
		
		JButton buttonSubtract = new JButton("Subtract");
		buttonSubtract.setBounds(190,210, 150,20);
		buttonSubtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int first = Integer.parseInt(firstNumber.getText());
				int last = Integer.parseInt(secondNumber.getText());
				int processResult = first - last;
				result.setText(Integer.toString(processResult));
			}
		});
		panel1.add(buttonSubtract);
		
		frame.setTitle("Easy_Add_Subtract");
		frame.setLayout(null);
		frame.setSize(600,400);
		frame.setVisible(true);
		frame.setResizable(false);
    }
}
