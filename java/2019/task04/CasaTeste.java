/**
   06
*/

public class CasaTeste
{
	public static void main(String args[])
	{
		Casa casa = new Casa();
		casa.setCor("Amarelo");
		casa.setPorta1(new Porta());
		casa.getPorta1().abre();
		casa.setPorta2(new Porta());
		casa.getPorta2().abre();
		casa.setPorta3(new Porta());
		casa.getPorta3().abre();
		System.out.printf("Portas abertas: %d\n",
						  casa.quantasPortasEstaoAbertas());
	}
}
