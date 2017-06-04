package factory.sort;

import java.util.Vector;

import bubble.Bubble;
import sort.Sort;

public class SortFactory {

	 public Sort getSort(String sortType, Vector<Integer> vector)
	 {
	      if(sortType == null)
	      {
	         return null;
	      }		
	      if(sortType.equalsIgnoreCase("bubble"))
	      {
	         return new Bubble(vector);
	         
	      }
	      
	      return null;
	   }
}
