package hellojavapkg;

public class Array {
	private int[] items;
	private int count;
	
	public Array(int length) {
		items = new int[length];
		count = 0;
	}
    
	public void print() {
		for (int i = 0; i < count; i++)
			System.out.println(items[i]);
	}
	
	public void insert(int item) {
		if (count == items.length) {
			resize(items.length * 2);
			}
		items[count++] = item;
		}
	
	public void removeAt(int index) {
		// Validate the index (if index is in array)
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();
		
		// Shift items to the left to fill the gaps (basically replace "removed" index with the index after it)
		for (int i = index; i < count - 1; i++)
			items[i] = items[i + 1];
		
		// Remove last item in array (remove the repeat)
		count--;
		
		// Check if the array is larger than the stated number of elements
		if (count > 0 && count == items.length / 4) {
			resize(items.length / 2);
		}

	}
	
	public void resize(int newLength) {
		int[] newItems = new int[newLength];
		for (int i = 0; i < count ; i++) {
			newItems[i] = items[i];
		}
		items = newItems;
	}
}
