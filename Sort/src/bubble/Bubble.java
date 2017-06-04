package bubble;
import java.util.Vector;

import sort.Sort;

public class Bubble implements Sort {

	private Vector<Integer> m_vector;
	
	public Bubble(Vector<Integer> vector)
	{
		 m_vector = new Vector<Integer>(vector);
	}
	
	public Vector<Integer> getVector()
	{
		return m_vector;
	}

	
	@Override
	public void sort()
	{
		boolean swapped;
		do 
		{
			swapped = false;
			for (int i = 0; i < m_vector.size() - 1; i++) 
			{
				if (m_vector.get(i) > m_vector.get(i + 1)) {
					swap(m_vector, i, i + 1);
					swapped = true;
				}
			}
		} while (swapped);
	}

	private void swap(Vector<Integer> vector, int frist_element, int second_element)
	{
		int temp = vector.get(frist_element);
		vector.set(frist_element, vector.get(second_element));
		vector.set(second_element, temp);
	}
}
