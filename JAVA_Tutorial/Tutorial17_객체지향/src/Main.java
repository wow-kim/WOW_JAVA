// 객체지향기법의 적절한 활용

public class Main {

	public static void main(String[] args) {
		
		Hero[] heros = new Hero[3];
		heros[0] = new Warrior("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Wizzard("마법사");
		
		for(int i=0; i < heros.length; i++) {
			heros[i].attack();
			
			if(heros[i] instanceof Warrior) { // heros[i]가 Warrior의 인스턴스인지 묻는것.
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
