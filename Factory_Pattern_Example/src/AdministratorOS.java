import java.io.IOException;

public class AdministratorOS extends OS { // this is our CheesePizza
	OSFactory of;

	public AdministratorOS(OSFactory of) {
		this.of = of;
	}

	@Override
	public String findProcessList() throws IOException {
		// notify administrator of intended monitoring
		return this.of.currentProcessList();
	}
	
	@Override
	public String interestingOpenPortList(String user) throws IOException {
		// notify administrator of intended monitoring
		return this.of.currentBindingList(user);
	}

	@Override
	public String findName() throws IOException {
		return "Administrator's " + this.of.createOSName();
	}

}
