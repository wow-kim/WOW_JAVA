import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MyFrame1 extends JFrame {
	
	private JButton button;
	private JLabel label;
	int counter=0;
	
	public MyFrame1() {
		setSize(400, 150);
		setTitle("�̺�Ʈ ����");
		setLayout(new FlowLayout());
		button = new JButton("����");
		label = new JLabel("������ ī���Ͱ�:   " + counter);
		
		// Ŭ���� ����, �̰Ÿ��� extends�� implements�� ���ÿ� �ϴ� ����� ����
//		class MyListener implements ActionListener{
//			public void actionPerformed(ActionEvent e) {
//				counter++;
//				label.setText("������ ī���Ͱ�:   " + counter);
//			}
//		}
//		
//		button.addActionListener(new MyListener());
		
		
		// ����Ŭ����
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				counter++;
//				label.setText("������ ī���Ͱ�:   " + counter);
//			}
//		});
		
		// ���ٽ�
		button.addActionListener(e -> {
			counter++;
			label.setText("������ ī���Ͱ�:   " + counter);
		});
		
		
		add(label);
		add(button);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		MyFrame1 t = new MyFrame1();
	}

}
