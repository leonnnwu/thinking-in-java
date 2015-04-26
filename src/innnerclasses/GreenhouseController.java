package innnerclasses;

import innnerclasses.controller.Event;
import innnerclasses.controller.GreenhouseControls25;

//Configure and execute the greenhouse system.
//{Args: 5000}

public class GreenhouseController {

	public static void main(String[] args) {
		GreenhouseControls25 gc = new GreenhouseControls25();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = { gc.new ThermostatNight(0), gc.new LightOn(200),
				gc.new LightOff(400), gc.new WaterOn(600),
				gc.new WaterMistOn(650), gc.new WaterMistOff(700),
				gc.new WaterOff(800), gc.new ThermostatDay(1400),
				gc.new FanOff(1600), gc.new FanOn(1800)};
		gc.addEvent(gc.new Restart(2000, eventList));
		if (args.length == 1)
			gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
		gc.run();
	}

}
