package polymorphism.music3;

import java.util.Random;

import polymorphism.music.Note;

class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play() " + n);
	}

	String what() {
		return "Instrument";
	}

	void adjust() {
		System.out.println("Adjusting Instrument");
	}
	
	public String toString() {
		return what();
	}
}

class Wind extends Instrument {
	void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	String what() {
		return "Wind";
	}

	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	String what() {
		return "Percussion";
	}

	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	String what() {
		return "Stringed";
	}

	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind {
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}

	String what() {
		return "Woodwind";
	}
}

class Piano extends Instrument {
	void play(Note n) {
		System.out.println("Piano.play() " + n);
	}

	String what() {
		return "Piano";
	}

	void adjust() {
		System.out.println("Adjusting Piano");
	}
}

class RandomInstrumentGenerator{
	private Random random = new Random(34);
	
	public Instrument next() {
		switch (random.nextInt(6)) {
		default:
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Stringed();
		case 3:
			return new Brass();
		case 4:
			return new Woodwind();
		case 5:
			return new Piano();
		
		}
	}
}

public class Music3 {

	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		RandomInstrumentGenerator generator = new RandomInstrumentGenerator();
		
		Instrument[] orchestra = new Instrument[9];
		
		for (int i = 0; i < orchestra.length; i++) {
			orchestra[i] = generator.next();
		}
		
		tuneAll(orchestra);
	}

}
