package sort;
import java.util.Vector;

import factory.sort.SortFactory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> array = new Vector<Integer>();
		 array.add(5); //5 1 4 2 8
		 array.add(1);
		 array.add(4);
		 array.add(2);
		 array.add(8);
		 
		 SortFactory sortFactory = new SortFactory();
		 
		 Sort bubble_sort = sortFactory.getSort("bubble", array);
		 
		 bubble_sort.sort();
		 
		 System.out.print(bubble_sort.getVector());
	}

}
