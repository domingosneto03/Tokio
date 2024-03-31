package M1_T06_P25;

public class Main {

	public static void main(String[] args) {
		
		Baralho baraja = new Baralho();
        Molho molho = baraja.getMolho();
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
