/**
   02
*/

public class ContaBancariaTeste
{
	public static void main(String args[])
	{
		ContaBancaria conta = new ContaBancaria();
		conta.setTipo("Corrente");
		conta.setSaldo(10.4f);
		conta.setCredito(22.3f);

		System.out.printf("Tipo: %s. Saldo: %.2f. Credito: %.2f\n",
						  conta.getTipo(), conta.getSaldo(),
						  conta.getCredito());
	}
}
