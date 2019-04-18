/**
   03
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex3.*;

public class ContaTeste
{
	public static void main(String args[])
	{
		Cliente Cliente = new Cliente("João");
		System.out.print(Cliente + "\n");
		ContaCorrente conta = new ContaCorrente(0f);
		System.out.print(conta + "\n");
		conta.depositar(2);
		System.out.print(conta + "\n");
		conta.sacar(2);
		System.out.print(conta + "\n");
		conta.sacar(2);
		System.out.print(conta + "\n");

		ContaEspecial contaEspecial = new ContaEspecial(0f, 2f);
		contaEspecial.sacar(2);
		System.out.print(contaEspecial + "\n");
		contaEspecial.sacar(2);
		System.out.print(contaEspecial + "\n");
		contaEspecial.depositar(2);
		System.out.print(contaEspecial + "\n");
	}
}
