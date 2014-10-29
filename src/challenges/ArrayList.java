/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package challenges;

/**
 *
 * @author ossama
 */
public class ArrayList
{
   // Attributes
	public String[] array;
	private int currentIndex;

	// Constructors
	public ArrayList()
	{
		// 10 elements default
		array = new String[2];
		currentIndex = 0;
	}

	// Private methods
	private void addSpace()
	{
		int oldSize = array.length;
		String[] newArray = new String[oldSize + 10];

		for (int i = 0; i < array.length; i++)
			newArray[i] = array[i];

		array = newArray;
	}

	// Public methods
	public void add(String val)
	{
		if (currentIndex < array.length)
			array[currentIndex] = val;
		else
		{
			addSpace();
			array[currentIndex] = val;
		}

		currentIndex++;
	}

	public void clear()
	{
		array = new String[10];
		currentIndex = 0;
	}

	public boolean contains(String val)
	{
		for (int i = 0; i < currentIndex; i++)
			if (array[i].equals(val))
				return true;

		return false;
	}

	public String get(int index)
	{
		// Check with currentIndex
		return index < currentIndex ? array[index] : null;
	}

	public int indexOf(String val)
	{
		for (int i = 0; i < currentIndex; i++)
			if (array[i].equals(val))
				return i;

		return -1;
	}

	public boolean isEmpty()
	{
		return currentIndex == 0;
	}

	public void remove(int index)
	{
		if (index >= 0 && index < currentIndex)
		{
			for (int i = index; i < currentIndex; i++)
				array[i] = array[i + 1];

			currentIndex--;
		}
		else
			throw new IndexOutOfBoundsException();
	}

	public void remove(String val)
	{
		boolean found = false;

		for (int i = 0; i < currentIndex; i++)
		{
			if (!found && array[i].equals(val))
				found = true;

			if (found)
				array[i] = array[i + 1];
		}

		if (found)
			currentIndex--;
	}

	public void set(int index, String val)
	{
		// Check with currentIndex
		if (index < currentIndex)
			array[index] = val;
		else
			throw new IndexOutOfBoundsException();
	}

	public int size()
	{
		return currentIndex;
	}

	public String[] toArray()
	{
		String[] arr = new String[currentIndex];

		for (int i = 0; i < arr.length; i++)
			arr[i] = array[i];

		return arr;
	} 
}
