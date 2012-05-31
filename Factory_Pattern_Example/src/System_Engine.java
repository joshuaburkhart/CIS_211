import java.io.IOException;

public class System_Engine { // this is our driver
	public static void main(String args[]) throws IOException {
		// system figures out factory
		MacOSXFactory mosx = new MacOSXFactory();

		// system figures out which user
		String user = "joshuaburkhart";

		// system creates seed
		Seed s = new Seed(user);
		s.setOF(mosx);
		// s.setRF(xyz);
		// set other factories

		// system launches sensor
		Sensor sensor = new UserPortSensor();

		// system gets result from sensor
		SensorResult result = sensor.run(s);

		// now do something with the result... (normally use it to create
		// another seed)
		// ...
	}
}
