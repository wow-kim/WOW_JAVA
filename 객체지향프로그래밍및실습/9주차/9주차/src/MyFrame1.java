import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MyFrame1 extends JFrame {
	
	private JButton button;
	private JLabel label;
	int counter=0;
	
	public MyFrame1() {
		setSize(400, 150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값:   " + counter);
		
		// 클래스 정의, 이거말고도 extends와 implements를 동시에 하는 방법도 있음
//		class MyListener implements ActionListener{
//			public void actionPerformed(ActionEvent e) {
//				counter++;
//				label.setText("현재의 카운터값:   " + counter);
//			}
//		}
//		
//		button.addActionListener(new MyListener());
		
		
		// 무명클래스
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				counter++;
//				label.setText("현재의 카운터값:   " + counter);
//			}
//		});
		
		// 람다식
		button.addActionListener(e -> {
			counter++;
			label.setText("현재의 카운터값:   " + counter);
		});
		
		
		add(label);
		add(button);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		MyFrame1 t = new MyFrame1();
	}

}
