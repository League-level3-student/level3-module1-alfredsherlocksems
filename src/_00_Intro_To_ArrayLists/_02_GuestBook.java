package _00_Intro_To_ArrayLists;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	String name;
	String message;
	ArrayList<String> list = new ArrayList<String>();
	int g = 4;
	
	public static void main (String [] args) {
		_02_GuestBook b = new _02_GuestBook();
		b.setup();
	}
	void setup () {
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.add(panel);
		b1.setText("Add Name");
		b2.setText("View Names");
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		list.add("Guest 1: Person 1");
		list.add("Guest 2: Person 2");
		list.add("Guest3: Person 3");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == b1) {
			name = JOptionPane.showInputDialog("Please Enter a Name.");
			list.add("Guest " + g + ": " + name);
			g+=1;
		}
		else {
			message = "";
			for (String s: list) {
				message+= s + "\n";
			}
			JOptionPane.showMessageDialog(null, message);
		}
	} 
}
