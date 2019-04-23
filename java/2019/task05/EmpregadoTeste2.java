/**
   06
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex6.*;

public class EmpregadoTeste2
{
	public static void main(String args[])
	{
		Empregado empregado = new Empregado("João", "no mato",
											"190", 1, 515.30f, 0.6f);
		System.out.print(empregado.getNome() + " mora "
						 + empregado.getEndereço());
		System.out.printf(" e ganha ");
		System.out.println(empregado.calcularSalario());
		System.out.println(Float.compare(empregado.calcularSalario(), 206.12f)
						   == 0);
	}
}
