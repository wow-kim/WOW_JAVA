import java.awt.event.*;
import javax.swing.*;

public class MouseTest extends JFrame {
	
	int img_x = 150, img_y = 150;
	
	public MouseTest() {
		setSize(600, 300);
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon("Linux.png");
		button.setIcon(icon);
		button.setLocation(img_x, img_y);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				button.setLocation(img_x, img_y);
			}
			public void mouseReleased(MouseEvent e) { }
			public void mouseEntered(MouseEvent e) { }
			public void mouseExited(MouseEvent e) { }
			public void mouseClicked(MouseEvent e) {}
		});
		
		// MouseAdpater()는 인터페이스가 아닌 클래스
		// 서브 클래스를 만들고 그 안에 있는 mousePressed method를 재정의하는 것, 더 편하다!
		panel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				button.setLocation(img_x, img_y);
			}
		});
		
		add(panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		MouseTest f = new MouseTest();

	}

}
