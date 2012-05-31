abstract public class RouterFactory { // this could be our
										// CalzoneIngredientFactory .. (not in
										// the text)
	public String currentIpTables() {
		return createCurrentIpTables();
	}

	abstract public String createCurrentIpTables();
}
