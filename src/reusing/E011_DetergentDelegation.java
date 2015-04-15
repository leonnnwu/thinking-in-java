package reusing;

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		System.out.println(x);
	}
}

public class E011_DetergentDelegation {
	
	private String s = "E011_DetergentDelegation";
	
	private Cleanser cleanser = new Cleanser();
	
	public void append(String a) { s += a; }
	
	public void dilute() { cleanser.dilute(); }
	public void apply() { cleanser.apply(); }
	public void scrub() { cleanser.scrub(); }
	
	public void foam() { append(" foam()"); }

	public static void main(String[] args) {
		E011_DetergentDelegation x = new E011_DetergentDelegation();
		x.dilute();
	    x.apply();
	    x.scrub();
	    x.foam();
	    System.out.println(x);
	    System.out.println("Testing base class:");
	    Cleanser.main(args);
	}

}
