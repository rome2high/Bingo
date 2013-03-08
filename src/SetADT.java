// @author  Dr. Lewis
import  java.util.Iterator;

public interface  SetADT<T> {
        public void  add(T  element);
        public void  addAll(SetADT<T> set);
        public  T  removeRandom();
        public  T  remove(T  element);
        public  SetADT<T> union(SetADT<T> set);
        public  boolean  contains(T  target);
        public  boolean  equals(SetADT<T> set);
        public  boolean  isEmpty();
        public  int  size();
        public  Iterator<T>  iterator();
        public  String toString();
} 