package collectionsdemo.vectordemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("a");
		vector.add("b");
		Iterator<String> it = vector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
