/**
   02
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex2.*;

public class EmpregadoTeste
{
	public static void main(String args[])
	{
		Empregado empregado = new Empregado("João", 500.20f);
		System.out.print(empregado + "\n");
		empregado = new Gerente("João", 300.20f, "Comissão de frente");
		System.out.print(empregado + "\n");
		empregado = new Vendedor("João", 500.30f, 0.1f);
		System.out.print(empregado + "\n");
	}
}
