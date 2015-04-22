package innnerclasses.exercises;

import com.sun.org.apache.bcel.internal.generic.NEW;

class Word {
	private String string;
	
	public Word(String s) {
		string = s;
	}
	
	public String toString() {
		return string;
	}
}

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class Exercise2 {
	
	private Object[] items;
	private int next = 0;
	public Exercise2(int size) {
		items = new Object[size];
	}
	
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		public Object current() {
			return items[i];
		}
		
		public void next() {
			if(i<items.length)
				i++;
		}
	}
	
	public Selector getSelector() {
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		Exercise2 exercise2 = new Exercise2(10);
		for(int i=0; i<10; i++) {
			exercise2.add(new Word(Integer.toString(i)));
		}
		Selector selector = exercise2.getSelector();
		while(!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.next();
		}
		
		Word w1 = new Word("One");
		Word w2 = new Word("Two");
		Word w3 = new Word("Three");
		Exercise2 exercise22 = new Exercise2(3);
		exercise22.add(w1);
		exercise22.add(w2);
		exercise22.add(w3);
		Selector selector2 = exercise22.getSelector();
		while (!selector2.end()) {
			System.out.println(selector2.current() + " ");
			selector2.next();
		}
	}

}
