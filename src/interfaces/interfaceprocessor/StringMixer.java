package interfaces.interfaceprocessor;

public class StringMixer {
	public String process(String s) {
		char[] carr = new char[s.length()];
		if((s.length()) % 2 == 0) {
			for(int i=0; i<s.length(); i+=2) {
				carr[i] = s.charAt(i+1);
				carr[i+1] = s.charAt(i);
			}
			return new String(carr);
		} else {
			for(int i=0; i<s.length() - 1;i+=2) {
				carr[i] = s.charAt(i+1);
				carr[i+1] = s.charAt(i);
			}
			carr[s.length() - 1] = s.charAt(s.length() - 1);
			return new String(carr);
		}
	}
}
