/**
   01
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex1.*;

public class IngressoTeste
{
	public static void main(String args[])
	{
		IngressoVIP ingressoVIP = new IngressoVIP();
		ingressoVIP.setValor(2.2f);
		ingressoVIP.setValorAdicional(1.1f);
		if(Float.compare(ingressoVIP .getValor(), 3.3f) == 1)
			System.out.printf("Success!\n");
		else
			System.out.printf("Failure!\n Expected: %f. Got: %f\n",
							  3.3f, ingressoVIP.getValor());
	}
}
