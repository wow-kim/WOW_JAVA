import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempConverter extends JFrame {

	public TempConverter() {
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel label1 = new JLabel("È­¾¾ ¿Âµµ");
		JLabel label2 = new JLabel("¼·¾¾ ¿Âµµ");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("º¯È¯");
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		setSize(300,150);
		setTitle("¿Âµµº¯È¯±â");
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		TempConverter f = new TempConverter();
	}

}
