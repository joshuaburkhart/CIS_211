import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class UserPortSensor extends Sensor { // this is our NYPizzaStore
	private String logMessage;

	public UserPortSensor() {
		logMessage = "UserPortSensor started at "+ new Date();
	}

	@Override
	public OS discover(Seed s) throws IOException { // this is our createPizza()
		OSFactory of = s.getOF();// don't know what kind of factory I have until runtime
		String user = s.getUser(); // don't know who my user is until runtime
		OS os;
		// do some logic with user id's
		if (user == "joshuaburkhart") { // this is our item.equals("cheese")
			os = new AdministratorOS(of);
		} else {
			os = new UnsupportedOS();
		}
		String osProcs = os.findProcessList(); // this is another item.equals("cheese")
		// do some logic with osProcs
		if (osProcs.split("\n").length > 5) {
			logMessage += "\n### substantial usage on this os";
			String bindings = os.interestingOpenPortList(user);
			// we could do stuff with output here if we wanted to...
			os.setCurrentUserBindings(bindings); // this is our
													// pizza.setName("New York Style Cheese Pizza")
		} else {
			logMessage += "\n### not much usage on this os";
			os.setCurrentUserBindings("<not interesting>");
		}
		return os;
	}

	@Override
	public String logFindings() {
		return logMessage;

	}

}
