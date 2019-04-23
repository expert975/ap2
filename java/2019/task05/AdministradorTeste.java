/**
   07
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex7.*;

public class AdministradorTeste
{
	public static void main(String args[])
	{
		Administrador administrador =
			new Administrador("João", "no mato", "190", 1, 515.30f, 0.6f, 500f);
		System.out.print(administrador.getNome() + " mora "
						 + administrador.getEndereço());
		System.out.printf(" e ganha ");
		System.out.print(administrador.calcularSalario());
		System.out.printf(", pois tem ajuda de custo de ");
		System.out.println(administrador.getAjudaDeCusto());
		System.out.println(Float.compare(administrador.calcularSalario(),
										 206.12f + 500f) == 0);
	}
}
