package layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Shape;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	static JFrame frame;
	static Color color;
	
	
	public static void main(String[] args) {
		
		new Main(0, 0);
	}
	
	
  public  Main(int seasons, int disciplines){
	  color = Color.lightGray;
	  frame = new JFrame("Discplinas");
	  
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	  frame.setLayout(new GridLayout(0,1,10,10));
	 addSeason();
    
    
    frame.pack();
    frame.setVisible(true);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
  
    
  }
  
  public static void addSeason(){
	  Season season = new Season();
	  season.setSize(new Dimension(0, 100));
	  
	  
	  
	  if (color == Color.lightGray){
		  color = Color.CYAN;
	  }
	  else{
		  color = Color.lightGray;
	  }
	  
	  season.setBackground(color);
	  season.setCreateDiscs();
	  
	  frame.add(season);
	  
  }
  
  public static void addEmptySeason(){
	  Season season = new Season();	  
	  season.setCreateSeasons();
	  frame.add(season);	  
  }
  

  
 
  

 
}