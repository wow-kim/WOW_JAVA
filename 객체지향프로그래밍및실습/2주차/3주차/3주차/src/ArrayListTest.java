import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("ö��");
		list.add("����");
		list.add("����");
		for(String obj : list)
			System.out.print(obj + " ");
	}

}
