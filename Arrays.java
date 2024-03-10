package homeWork2;

public class Arrays {
	private char[] array;
	public Arrays (char[] array) {
		this.array = array;
	}
	public int compareTo(Arrays another) {
		int length = Math.min(this.array.length,another.array.length);
		int index = 0;
		while(index < length && this.array[index] == another.array[index]) {
			index++;
		}
		return index == length ? this.array.length - another.array.length : 
			this.array[index] - another.array[index];
	}
	public int count(char character) {
	    int count = 0;
	    int index = 0;
	    while (index < array.length) {
	        count += (array[index] == character) ? 1 : 0;
	        index++;
	    }
	    return count;
	}
	public int compareToIgnoreCase(Arrays another) {
	    int length = Math.min(this.array.length, another.array.length);
	    int index = 0;
	    while (index < length && Character.toLowerCase(this.array[index]) == Character.toLowerCase(another.array[index])) {
	        index++;
	    }
	    return index == length ? this.array.length - another.array.length :
	            Character.toLowerCase(this.array[index]) - Character.toLowerCase(another.array[index]);
	}
	public boolean contains(char character) {
	    String arrayString = new String(array);
	    return arrayString.indexOf(character) >= 0;
	}
	public boolean equals(Arrays another) {
	    return compareTo (another) == 0;
	}
	public boolean equalsIgnoreCase(Arrays another) {
	    return compareToIgnoreCase (another) == 0;
	}
}