
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposito();
		} catch (MinhaExcecao e) {
			System.out.println("tratamento ...");
		}
	}
}
