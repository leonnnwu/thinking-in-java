package innnerclasses.exercises;

public class Exercise4 {

	private Object[] items;
	private int next = 0;
	public Exercise4(int size) {
		items = new Object[size];
	}
	
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	
	public void test() {
		System.out.println(this.getClass().getSimpleName() + " test");
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
		
		public Exercise4 getOutterExercise4() {
			return Exercise4.this;
		}
	}
	
	public Selector getSelector() {
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		Exercise4 exercise2 = new Exercise4(10);
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
		Exercise4 exercise22 = new Exercise4(3);
		exercise22.add(w1);
		exercise22.add(w2);
		exercise22.add(w3);
		Selector selector2 = exercise22.getSelector();
		while (!selector2.end()) {
			System.out.println(selector2.current() + " ");
			selector2.next();
		}
		
		((SequenceSelector)selector2).getOutterExercise4().test();
	}

}
