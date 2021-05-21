import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyFrame1 extends JFrame implements MouseListener, MouseMotionListener {
	
	public MyFrame1() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame1");
		
		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		add(panel);
		setVisible(true);
	}
	
	public void mousePressed(MouseEvent e) {
		display("Mouse Pressed (# of Clicks: " + e.getClickCount() + ")", e);
	}
	public void mouseReleased(MouseEvent e) {
		display("Mouse Released (# of Clicks: " + e.getClickCount() + ")", e);
	}
	public void mouseEntered(MouseEvent e) {
		display("Mouse Entered", e);
	}
	public void mouseExited(MouseEvent e) {
		display("Mouse Exited", e);
	}
	public void mouseClicked(MouseEvent e) {
		display("Mouse Clicked (# of Clicks: " + e.getClickCount() + ")", e);
	}
	public void mouseDragged(MouseEvent e) {
		display("Mouse Dragged", e);
	}
	public void mouseMoved(MouseEvent e) {
		display("Mouse Moved", e);
	}
	protected void display(String s, MouseEvent e) {
		System.out.println(s + " X-" + e.getX() + " Y-" + e.getY());
	}
	

	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();
	}

}
