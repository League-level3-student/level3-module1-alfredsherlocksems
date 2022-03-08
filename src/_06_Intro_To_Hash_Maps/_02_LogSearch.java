package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> h = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton[] b = new JButton[4];
	
	public static void main (String[] args) {
		_02_LogSearch l = new _02_LogSearch();
		l.setup();
	}
	
	void setup () {
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.add(panel);
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton();
			b[i].addActionListener(this);
			panel.add(b[i]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == b[0]) {
			String id = JOptionPane.showInputDialog("Enter an ID number.");
			String name = JOptionPane.showInputDialog("Enter a name.");
			int  d = Integer.parseInt(id);
			h.put(d, name);
		}
		else if (arg0.getSource() == b[1]) {
			boolean idThere = false;
			String id = JOptionPane.showInputDialog("Enter an ID number.");
			int d = Integer.parseInt(id);
			for (Integer i: h.keySet()) {
				if (d == i) {
					idThere = true;
					JOptionPane.showMessageDialog(null, h.get(d));
					break;
				}
			}
			if (!idThere) {
				JOptionPane.showMessageDialog(null, "The id is not there.");
			}
		}
		else if (arg0.getSource() == b[2]){
			ArrayList<String> names = new ArrayList<String>();
			ArrayList<Integer> keys = new ArrayList<Integer>();
			for(String n: h.values()) {
				names.add(n);
			}
			for(Integer i: h.keySet()) {
				keys.add(i);
			}
			for (int i = 0; i < h.size(); i++) {
				JOptionPane.showMessageDialog(null, "ID: " + keys.get(i) + " Name: " + names.get(i));
			}
		}
		else {
			boolean idThere = false;
			String id = JOptionPane.showInputDialog("Enter an ID number.");
			int d = Integer.parseInt(id);
			for (Integer i: h.keySet()) {
				if (d == i) {
					idThere = true;
					h.remove(i);
					break;
				}
			}
			if (!idThere) {
				JOptionPane.showMessageDialog(null, "The id is not there.");
			}
		}
	}
	
	/*
     * Crate a HashMap of Integers for the keys and Strings for the values.
     * Create a GUI with three buttons.
     * Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     * 
     * Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     * 
     * Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     * 
     * When this is complete, add a fourth button to your window.
     * Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list.
     */
	
}
