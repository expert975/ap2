/**
   08
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex9.*;

public class VendedorTeste
{
	public static void main(String args[])
	{
		Vendedor vendedor =
			new Vendedor("João", "no mato", "190", 1, 515.30f, 0.6f, 100000f,
						 0.01f);
		System.out.print(vendedor.getNome() + " mora "
						 + vendedor.getEndereço());
		System.out.printf(" e ganha ");
		System.out.print(vendedor.calcularSalario());
		System.out.println();
		System.out.println(Float.compare(vendedor.calcularSalario(),
										 206.12f + 1000f) == 0);
	}
}
