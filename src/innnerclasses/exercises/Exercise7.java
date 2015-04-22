package innnerclasses.exercises;

class Exercise7 {
	private String word;
	public Exercise7(String word) {
		this.word = word;
	}
	private void say() {
		System.out.println(word);
	}
	
	void think() {
		Ex7Inner ex7Inner = this.new Ex7Inner();
		ex7Inner.modifyOutterField("perfect");
	}
	
	class Ex7Inner {
		void modifyOutterField(String newWord) {
			word = newWord;
			say();
		}
	 }
	
	public static void main(String[] args) {
		Exercise7 ex7Outter = new Exercise7("Bad");
		ex7Outter.say();
		ex7Outter.think();
		ex7Outter.say();
	}
}

