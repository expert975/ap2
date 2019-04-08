/**
   04
*/

public class PessoaTeste
{
	public static void main(String args[])
	{
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("João");
		pessoa.setIdade(2);
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();

		System.out.printf("%s tem %s anos\n", pessoa.getNome(),
						  pessoa.getIdade());
	}
}
