package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {

	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	AddNumbers addNums = (int x, int y) -> {
		return (x + y);
	};
	AddNumbers randNum = (int x, int y) -> {
		Random r = new Random();
		return (x + r.nextInt(y - x));
	};
	TellAJoke tellJoke = () -> {
		JOptionPane.showMessageDialog(null, "What Did the Foot Say to the Other Foot?");
		JOptionPane.showMessageDialog(null, "FOOT!");
	};

	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.
		addNumbers.addActionListener(this);
		randNumber.addActionListener(this);
		tellAJoke.addActionListener(this);

		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(addNumbers)) {
			int f = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
			int s = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
			JOptionPane.showMessageDialog(null, "Your sum is " + addNums.act(f, s));
		}
		if (e.getSource().equals(randNumber)) {
			int f = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
			int s = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
			JOptionPane.showMessageDialog(null, "Your number is " + randNum.act(f, s));
		}
		if (e.getSource().equals(tellAJoke)) {
			tellJoke.act();
		}
	}
}