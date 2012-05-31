import java.io.IOException;

abstract public class OSFactory { // this is our PizzaIngredientFactory
	public String currentProcessList() throws IOException {

		// do something here.. log the creation of a process list etc

		return createCurrentProcessList();
	}

	// String would normally be some superclass
	abstract protected String createCurrentProcessList() throws IOException;
	
	abstract public String currentBindingList(String user) throws IOException;
	
	abstract public String createOSName() throws IOException;

}
