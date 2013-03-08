/*
 * Code Unit 3: The ArraySet represents an array implementation of a set.
 */
// adapted from Lewis' book
import  java.util.*;

public class  ArraySet<T> implements SetADT<T>, Iterable<T> {
	private  static Random  rand= new Random();
	private  final int DEFAULT_CAPACITY = 100;
	private  final int NOT_FOUND = -1;
	private  int count; // the current number of elements in the set
	private  T[] contents;

	public ArraySet() {
		count = 0;
		contents = (T[]) (new Object[DEFAULT_CAPACITY]);;
	}

	public ArraySet(int initialCapacity) {
		count = 0;
		contents = (T[]) (new Object[initialCapacity]);
	}

	//Code Unit 4: add method that adds the specified element to the set if it is not
	//already present.  Expands the capacity of the set array if necessary.
	public void  add(T  element) {
		if(!contains(element)) { 
			if(size() == contents.length)
				expandCapacity(); 

			contents[count] = element; 
			count++;
		}
	}

	private void expandCapacity() {
		T[]  larger = (T[]) (new Object[contents.length *2]);
		for(int index=0; index < contents.length; index++)
			larger[index] = contents[index];

		contents = larger;
	}
	
	//Code Unit 5: addAll method that adds the contents of the parameter to this set.
	public void  addAll(SetADT<T> set) {
		Iterator<T>  scan = set.iterator(); 
		while(scan.hasNext())
			add(scan.next());
	}
	
	//Code Unit 6: removeRandom method that removes a random element from theSet and returns it.
	//Throws an EmptyCollectionException if the set is empty.
	public T  removeRandom()  throws EmptyCollectionException {
		if(isEmpty()) 
			throw  new EmptyCollectionException(“Empty set”); 

		int choice = rand.nextInt(count);
		T result = contents[choice];
		contents[choice] = contents[count-1];  //fill the gap
		contents[count-1] = null;
		count--;
		return  result;
	}

	public class EmptyCollectionException extends  RuntimeException{
		public EmptyCollectionException(String err) {
			super(err);
		}
	}

	//Code Unit 7: union method that returns a new set that is the union of this set and the parameter.
	public SetADT<T>  union(SetADT<T> set) {
		ArraySet<T>  both = new  ArraySet<T>(); 

		for(int index=0; index < count; index++)
			both.add(contents[index]);  

		Iterator<T>  scan = set.iterator();
		
		while(scan.hasNext())
			both.add(scan.next());

		return  both;
	}
	
	//Code Unit 8: contains method that returns true if this set contains the specified target element.
	public boolean  contains(T  target) {
		int  search = NOT_FOUND;

		for(int index=0; index < count && search == NOT_FOUND; index++)
			if(((BingoBall)contents[index]).equals((BingoBall)  target))
				search = index;

		return  (search != NOT_FOUND);
	}

	//Code Unit 9: getContents method that returns a handle to the array in the ArraySet class.
	public T[] getContents() {
		return (T[]) contents;
	}
	
	//The remove operation removes the specified element from the set and returns it.
	//This method will throw an EmptyCollectionException if the set is empty
	//and a NoSuchElementException if the target element is not in the set.
	public T remove(T target) throws EmptyCollectionException, NoSuchElementException{
		return (target);
	}
	
	//Code Unit 11: size method returns an integer that indicating the
	//number of actual elements in the array. This is a simple method.
	public int size() {
		return 1;
	}
	
	//Code Unit 12: isEmpty method returns a boolean value
	//that indicates whether the set is empty or not.  This is also a simple method
	public boolean  isEmpty() {
		return true;
	}
	
	//Code Unit 13: in this code unit, you are going to supply two pieces of code:
	//iterator method that is inside the ArraySet class and the external class ArrayIterator.
	public Iterator<T>  iterator(){
		return null;
	}

	//print all the element in the object
	//behave like bingoball objects
	//retrun B 1, B 2, B 30,...
	//using any loop but recommend iterator-while loop
	public  String toString() {
    	return ("");
    }

	//Code Unit 15: in this code unit, you are going to
	//supply the source code for the equals method that is inside the ArraySet class.
	//Return True if the current set contains exactly the same elements as the set passed as a parameter
	//@Override
	public boolean equals(SetADT<T> set) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
 }