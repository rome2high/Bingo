import java.util.Iterator;

//Code Unit 13: in this code unit, you are going to supply two pieces of code:
//iterator method that is inside the ArraySet class and the external class ArrayIterator.

public class ArrayIterator <T> implements Iterator<T>{
	private int count;
	private int current;
	private T[] items;
	
	public ArrayIterator(ArraySet<T>  arraySet) {
	}
	public boolean hasNext() {
		return false;
	}
	public T next() {
		return null;
	}
	public void remove(){
		throw new UnsupportedOperationException("No remove implementation.");
	}
	
}



