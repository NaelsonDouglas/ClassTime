package layout;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Season extends JPanel{
	  JButton btn = new JButton("+");
	  static ListenMoreDiscBtn listenMoreClass;
	  static ListenMoreSeasonBtn listenMoreSeason;
	 

	
	 public  Season(){	
		 setLayout(new FlowLayout(FlowLayout.LEFT));
		 setSize(new Dimension(1920, 1600));
		 setAlignmentX(JPanel.CENTER_ALIGNMENT);
		 setAlignmentY(JPanel.CENTER_ALIGNMENT);
		 
		 listenMoreClass = new ListenMoreDiscBtn();
		 listenMoreSeason = new ListenMoreSeasonBtn();
		 setCreateSeasons();
		 add(btn); 
	  }
	 
	 public void setCreateDiscs(){ 
		 btn.removeActionListener(listenMoreClass);
		 btn.addActionListener(listenMoreClass);
	 }
	 
	 public void setCreateSeasons(){
		 
		 btn.addActionListener(listenMoreSeason);
	 }
	 
	 public void unSetCreateDiscs(){
		 
		 btn.removeActionListener(listenMoreClass);
	 }
	 
	 public void unSetCreateSeasons(){
		 btn.removeActionListener(listenMoreSeason);
	 }	
	
	
	public class ListenMoreDiscBtn implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
				remove(btn);	
				add(new Class());				
				add(btn);	
				unSetCreateSeasons();
				revalidate();
				
		}
		
	}
	
	public class ListenMoreSeasonBtn implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
				remove(btn);	
				Main.addSeason();
				unSetCreateSeasons();
				add(btn);
		}
		
	}
	
	
	
	
}
