
public class RectArrayTest {
	static class Rect{
		int width, height;
		
		public Rect(int w, int h) {
			this.width = w;
			this.height = h;
		}
		double calcArea() { return (double)width*height;}
	}
	
	public static void main(String[] args) {
		Rect[] list;
		list = new Rect[5];
		
		for (int i=0; i< list.length; i++)
			list[i] = new Rect(i,i);

		for(int j=0; j <list.length; j++)
			System.out.println(j+"��° �簢�� ���� : " + list[j].calcArea());
		
	}

}
