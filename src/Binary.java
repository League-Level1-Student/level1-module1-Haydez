import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel ();
	JTextField text = new JTextField(20);
	void maker() {

		frame.setVisible(true);
		button.addActionListener(this);
		button.setText("Convert");
		frame.setTitle("Convert 8 bits of binary to ASCII");
		System.out.println("cuz everytime we touch i get this feeling cuz everytime we kiss i swear i could fly");
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.pack();
	}
	public static void main(String[] args) {
		new Binary().maker();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(text.getText());
		String letter = convert(text.getText());
		label.setText(letter);
		frame.pack();
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
}
