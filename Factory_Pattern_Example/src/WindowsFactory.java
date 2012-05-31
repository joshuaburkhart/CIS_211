import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WindowsFactory extends OSFactory { // this is our
												// ChicagoPizzaFactory

	@Override
	public String createCurrentProcessList() throws IOException {
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec("wmic process");

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
		Process proc = rt.exec("systeminfo ");

		InputStream is = proc.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		return br.readLine();
	}

	@Override
	public String currentBindingList(String user) {
		// TODO Auto-generated method stub
		return null;
	}

}
