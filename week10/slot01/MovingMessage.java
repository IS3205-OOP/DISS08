package week10.slot01;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MovingMessage {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Moving Message App");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		Dimension defDimension = new Dimension(300, 50);
		
		JLabel label = new JLabel("Moving where?");
		JTextField textField = new JTextField();
		textField.setPreferredSize(defDimension);
		JButton button = new JButton("Answer");
		button.setPreferredSize(defDimension);
		
		textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String userInput = textField.getText();
				label.setText(userInput);
			}
			
		});
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String userInput = textField.getText();
				label.setText(userInput);
			}
			
		});
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		
		frame.getContentPane().add(panel);
		
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
