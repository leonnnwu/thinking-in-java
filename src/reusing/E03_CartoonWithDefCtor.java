package reusing;

class Art {
	Art() { 
		System.out.println("Art constructor"); 
	}
}

class Drawing extends Art {
	Drawing() { 
		System.out.println("Drawing constructor"); 
	}
}

class CartoonWithDefCtor extends Drawing{
	
}

public class E03_CartoonWithDefCtor {
	public static void main(String[] args) {
		new CartoonWithDefCtor();
	}

}
