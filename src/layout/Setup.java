package layout;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Setup extends JFrame{
	
	int nOfSeasons,nOfDisciplines;
	JButton btnOk;
	private JFrame theFrame;
	private JPanel thePanel;
	private JLabel labelSeasons,labelDisciplines;
	private JTextField tField1, tField2;
	
	public  Setup(){

		theFrame = new JFrame("Configurações");
		thePanel = new JPanel();
		tField1 = new JTextField("",5);
		tField2 = new JTextField("",5);
		labelSeasons = new JLabel("Quantidade de períodos");
		labelDisciplines = new JLabel("Quantidade máxima de matérias por período");
		btnOk = new JButton("OK");
		
		btnOk.addActionListener(new ListenForButton());
		
		thePanel.add(labelSeasons);
		thePanel.add(tField1);
		thePanel.add(labelDisciplines);
		thePanel.add(tField2);
		theFrame.add(thePanel);
		thePanel.add(btnOk);
		theFrame.setVisible(true);
		
		
	}
	
	private class ListenForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				nOfSeasons = Integer.parseInt(tField1.getText());
				nOfDisciplines = Integer.parseInt(tField2.getText());
				
				new Main(nOfSeasons, nOfDisciplines);
				theFrame.setVisible(false);
				theFrame.dispose();
			} catch(NumberFormatException except){
				JOptionPane.showMessageDialog(Setup.this, "Coloca o valor certo aí", "Errou", JOptionPane.ERROR_MESSAGE);
			}
		}	
		
	}

	public int getnOfSeasons() {
		return nOfSeasons;
	}

	public int getnOfDisciplines() {
		return nOfDisciplines;
	}
	
	
}
