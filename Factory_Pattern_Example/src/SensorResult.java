import java.io.IOException;

public interface SensorResult { // this is our Product (not in the text)
	public String systemData() throws IOException;

	public String userData() throws IOException;
}
