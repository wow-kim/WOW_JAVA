
public class CalTime {

	public static void main(String[] args) {
		final double lightspeed = 30e4; // �ε��Ҽ����� ��ȣ����� ����
		double distance = 40e12;
		
		double secs;
		
		secs = distance/lightspeed;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("�ɸ��� �ð���" + light_year + "�����Դϴ�.");
		
	}

}
