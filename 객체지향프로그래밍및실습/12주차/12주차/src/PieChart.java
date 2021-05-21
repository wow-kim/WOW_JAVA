import java.awt.*;
import javax.swing.*;

class Slice {
	double value;
	Color color;
	
	public Slice(double value, Color color) {
		this.value = value;
		this.color = color;
	}
}

class MyPanel extends JPanel {
	Slice[] list = {
			new Slice(10, Color.red), new Slice(20, Color.blue), new Slice(30, Color.orange),
			new Slice(40, Color.green)
	};
	
	public void paintComponent(Graphics g) {
		double total = 0.0D;
		for (Slice s : list) {
			total += s.value;
		}
		double currValue = 0.0;
		int start = 0;
		for (Slice s : list) {
			start = (int)(currValue * 360 / total);
			int angle = (int) (s.value * 360 / total);
			
			g.setColor(s.color);
			g.fillArc(100, 50, 200, 200, start, angle);
			currValue += s.value;
		}
	}
}

public class PieChart extends JFrame {
	
	public PieChart() {
		setSize(600, 300);
		setTitle("Pie Chart");
		setVisible(true);
		add(new MyPanel());
	}
	
	public static void main(String[] args) {
		PieChart c = new PieChart();
	}

}
