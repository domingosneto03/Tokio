package tokio;

public class Main {

	public static void main(String[] args) {
		Baralho baralho = new Baralho();
        Molho molho = baralho.getMolho();
        System.out.println(molho.toString());

        molho.setAlgoritmo(new OrdPalNumInc());
        molho.ordena();
        System.out.println(molho.toString());

        molho.setAlgoritmo(new OrdPalNumDec());
        molho.ordena();
        System.out.println(molho.toString());

        molho.setAlgoritmo(new OrdNumIncPal());
        molho.ordena();
        System.out.println(molho.toString());
	}

}
