// ��ü�������� ������ Ȱ��

public class Main {

	public static void main(String[] args) {
		
		Hero[] heros = new Hero[3];
		heros[0] = new Warrior("����");
		heros[1] = new Archer("�ü�");
		heros[2] = new Wizzard("������");
		
		for(int i=0; i < heros.length; i++) {
			heros[i].attack();
			
			if(heros[i] instanceof Warrior) { // heros[i]�� Warrior�� �ν��Ͻ����� ���°�.
				Warrior temp = (Warrior) heros[i];
				temp.groundCutting();
			}
			else if(heros[i] instanceof Archer) {
				Archer temp = (Archer) heros[i];
				temp.fireArrow();
			}
			else if(heros[i] instanceof Wizzard) {
				Wizzard temp = (Wizzard) heros[i];
				temp.freezing();
			}
		}
				
		
		
	}

}
