/**
   05
*/

public class PortaTeste
{
	public static void main(String args[])
	{
		Porta porta = new Porta();
		System.out.println(porta);
		porta.abre();
		System.out.println(porta);
		porta.fecha();
		System.out.println(porta);
		porta.pinta("Azul");
		System.out.println(porta);
		porta.pinta("Vermelhor");
		System.out.println(porta);
		porta.pinta("Preto");
		System.out.println(porta);
		porta.pinta("Cinza");
		System.out.println(porta);
		porta.setDimensaoX(1.1f);
		System.out.println(porta);
		porta.setDimensaoY(1.1f);
		System.out.println(porta);
		porta.setDimensaoZ(1.1f);
		System.out.println(porta);
		System.out.printf("Aberta: %b\n", porta.estaAberta());
	}
}
