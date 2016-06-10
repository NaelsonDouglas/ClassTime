package layout;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Class extends JPanel {
	
	String name;
	JTextField nameField;
	
	public Class(){
		name="Matéria";
		nameField = new JTextField(name);		
		nameField.requestFocus();
		
		add(nameField);	
		setAlignmentY(JPanel.CENTER_ALIGNMENT);
		setAlignmentX(JPanel.CENTER_ALIGNMENT);
		
		
		
	}
	
	
	
	
	

}
