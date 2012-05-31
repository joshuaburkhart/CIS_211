public class Seed { // this delivers our factories (not in the text)
	private RouterFactory rf;
	private OSFactory of;
	private String user;

	public Seed(String user) {
		this.user = user;
	}

	public String getUser() {
		return this.user;
	}

	public void setOF(OSFactory of) {
		this.of = of;
	}

	public OSFactory getOF() {
		return this.of;
	}

	public void setRF(RouterFactory rf) {
		this.rf = rf;
	}

	public RouterFactory getRF() {
		return this.rf;
	}
}
