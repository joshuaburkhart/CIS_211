import java.io.IOException;

abstract class OS implements SensorResult { // this is our Pizza
	private String current_user_bindings = null;

	public String systemData() throws IOException { // this calls our prepare()
													// methods
		return findName() + "\n" + findProcessList();
	}

	public String userData() throws IOException { // this is our getName()
		return current_user_bindings;
	}

	abstract public String findProcessList() throws IOException; // this is our
																	// prepare()

	abstract public String findName() throws IOException; // this is another
															// prepare()

	abstract public String interestingOpenPortList(String user) throws IOException; // this
																			// is
																			// another
																			// prepare()
	public void setCurrentUserBindings(String current_user_bindings) {
		this.current_user_bindings = current_user_bindings;
	}

	public String getCurrentUserBindings() {
		return this.current_user_bindings;
	}
}
