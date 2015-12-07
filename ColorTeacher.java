import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton yellowBut;
	JButton redBut;
	JButton blueBut;
	JButton greenBut;
	Color yellow;
	Color red;
	Color green;
	Color blue;
	
	public static void main(String[] args) {
		ColorTeacher r = new ColorTeacher();
	}
	
	ColorTeacher(){
		frame = new JFrame("Color Teacher");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.add(panel);
		
		yellowBut = new JButton();
		panel.add(yellowBut);
		yellowBut.setBackground(Color.yellow);
		yellowBut.setOpaque(true);
		yellowBut.addActionListener(this);
		
		redBut = new JButton();
		panel.add(redBut);
		redBut.setBackground(Color.red);
		redBut.setOpaque(true);
		redBut.addActionListener(this);
		
		blueBut = new JButton();
		panel.add(blueBut);
		blueBut.setBackground(Color.blue);
		blueBut.setOpaque(true);
		blueBut.addActionListener(this);
		
		greenBut = new JButton();
		panel.add(greenBut);
		greenBut.setBackground(Color.green);
		greenBut.setOpaque(true);
		greenBut.addActionListener(this);
		
		frame.pack();
	}
	
	
	public void actionPerformed(ActionEvent arg0){
		if (arg0.getSource() == yellowBut){
			speak("Yellow");
		}
		
		if(arg0.getSource() == redBut){
			speak("Red");
		}
		
		if(arg0.getSource() == blueBut){
			speak("Blue");
		}
		if(arg0.getSource() == greenBut){
			speak("Green");
		}
	}

	void speak(String words){
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}