import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MacOSXFactory extends OSFactory { // this is our
												// NYPizzaIngredientFactory

	@Override
	public String createCurrentProcessList() throws IOException {
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec("ps -ef");

		InputStream is = proc.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String output = "";
		String line = null;

		while ((line = br.readLine()) != null) {
			output += line;
			output += "\n";
		}

		// we could do stuff with output here if we wanted to...

		return output;
	}

	@Override
	public String createOSName() throws IOException {
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec("uname -a");

		InputStream is = proc.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		return br.readLine();
	}

	@Override
	public String currentBindingList(String user) throws IOException {
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec("lsof -nPi");// you probably don't have this
											// installed

		InputStream is = proc.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String line = null;
		String bindings = "";

		while ((line = br.readLine()) != null) {
			if (line.contains(user)) {
				bindings += line;
				bindings += "\n";
			}
		}

		return bindings;
	}

}
