import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GUITic extends JFrame implements ActionListener, MouseListener {
	
	public GUITic() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic Tac Toe");
		
		JPanel panel = new JPanel();
		
		JButton[][] buttons = new JButton[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				buttons[i][j] = new JButton();
				buttons[i][j].addActionListener(this);
				panel.add(buttons[i][j]);
			}
		}
		
		panel.addMouseListener(this);
		add(panel);
		setVisible(true);
		
		
		
	}
	
	
	public static void main(String[] args) {
		GUITic f = new GUITic();
	}
	
	@Override
	public void actionPerformed(ActioneEvent e) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if( e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ") == true) {
					if(turn == 'X') {
						button[i][j].setText("X");
						turn = "O";
					}
					else {
						buttons[i][j].setText("O");
						turn = "X";
					}
				}
			}
		}
	}
	
}
