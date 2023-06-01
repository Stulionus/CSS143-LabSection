package Labs.Lab9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Application extends JFrame implements ActionListener {
	JButton myButton = new JButton("Hello World");

	public Application() {
		super("Window");

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myButton.setEnabled(true);
		myButton.setBounds(75, 120, 150, 30);
		this.add(myButton);

		myButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Button clicked!");
	}

	public static void main(String[] args) {
		JFrame app = new Application();
	}
}
