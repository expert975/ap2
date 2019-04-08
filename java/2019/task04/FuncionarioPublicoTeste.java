/**
   03
*/

public class FuncionarioPublicoTeste
{
	public static void main(String args[])
	{
		FuncionarioPublico instance = new FuncionarioPublico();
		instance.setNome("João");
		instance.setSalario(2.20f);

		System.out.printf("%s ganha %.2f\n", instance.getNome(),
						  instance.getSalario());
	}
}
