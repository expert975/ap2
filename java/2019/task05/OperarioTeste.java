/**
   08
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex8.*;

public class OperarioTeste
{
	public static void main(String args[])
	{
		Operario operario =
			new Operario("João", "no mato", "190", 1, 515.30f, 0.6f, 100000f,
						 0.01f);
		System.out.print(operario.getNome() + " mora "
						 + operario.getEndereço());
		System.out.printf(" e ganha ");
		System.out.print(operario.calcularSalario());
		System.out.printf(". Pois seu patrão apropria %.2f%% de seu trabalho.",
						  (100 - operario.getComissao()*100));
		System.out.println();
		System.out.println(Float.compare(operario.calcularSalario(),
										 206.12f + 1000f) == 0);
	}
}
