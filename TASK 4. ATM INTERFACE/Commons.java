import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Commons {
	//all classes in this project will share a Common Graphical user Interface "..... 
	public Component Frame() {
		JFrame frame = new JFrame("ATM management System");
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.decode("#ADD8E6"));
		
		//----------------heading of the project ----------------------------------
		JLabel atm = new JLabel("ATM");
		atm.setBounds(0, 30, 600, 120);
		atm.setHorizontalAlignment(JLabel.CENTER);
		atm.setFont(new Font("Monospaced", Font.BOLD, 120));
		JLabel man = new JLabel("MANAGEMENT SYSTEM");
		man.setBounds(0, 140, 600, 20);
		man.setHorizontalAlignment(JLabel.CENTER);
		man.setFont(new Font("Monospaced", Font.BOLD, 20));
		frame.add(man);
		frame.add(atm);
		//-----------------------------------------------
		return frame;
	}
}

//all the modules(other classes) just need to create the instanceof the class commons to access the graphical user interface ,which is common for all the classes.. 