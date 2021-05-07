import java.awt.event.*;
import javax.swing.*;

public class CarGame extends JFrame {

	int img_x = 150, img_y = 150;
	public CarGame() {
		setSize(600, 300);
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon("Linux.png");
		button.setIcon(icon);
		button.setLocation(img_x, img_y);
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addKeyListener(new KeyListener( ) {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP: img_y -= 10; break;
				case KeyEvent.VK_DOWN: img_y += 10; break;
				case KeyEvent.VK_LEFT: img_x -= 10; break;
				case KeyEvent.VK_RIGHT: img_x += 10; break;
				}
				button.setLocation(img_x, img_y);
			}
		public void keyReleased(KeyEvent arg0) {}
		public void keyTyped(KeyEvent arg0) {}
		});
		
		add(panel);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		CarGame f = new CarGame();
		
	}

}
