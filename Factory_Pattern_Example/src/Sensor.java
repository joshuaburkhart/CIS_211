import java.io.IOException;

abstract public class Sensor { // this is our PizzaStore
	public SensorResult run(Seed s) throws IOException { // this is our
															// orderPizza()
		// initialize & check system for errors

		SensorResult result = discover(s); // this is our createPizza()

		System.out.println("System Information:");
		System.out.println(result.systemData()); // calling our prepare()
		System.out.println("User Information:");
		System.out.println(result.userData()); // calling our pizza's getName()
		
		System.out.println("\n***\nLog Message: " + logFindings() + "\n***\n");

		return result;
	}

	abstract public SensorResult discover(Seed s) throws IOException;

	abstract public String logFindings();
}
