package interfaces.exercise;

import interfaces.interfaceprocessor.Apply;
import interfaces.interfaceprocessor.Processor;
import interfaces.interfaceprocessor.StringMixer;

class StringMixerAdapter implements Processor {
	
	StringMixer stringMixer;
	
	public StringMixerAdapter(StringMixer stringMixer) {
		this.stringMixer = stringMixer;
	}

	@Override
	public String name() {
		return "StringMixerAdapter";
	}

	@Override
	public Object process(Object input) {
		return stringMixer.process((String)input);
	}
	
}

public class Exercise11 {
	
	public static void main(String[] args) {
		String string = new String(args[0]);
		Apply.process(new StringMixerAdapter(new StringMixer()), string);
	}

}
