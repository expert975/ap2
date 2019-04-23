/**
   05
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex5.*;

public class FornecedorTeste
{
	public static void main(String args[])
	{
		Fornecedor fornecedor = new Fornecedor("João", "no mato",
											   "190", 233f, 215.5f);
		System.out.println(fornecedor.getNome() + " mora "
						   + fornecedor.getEndereço());
		System.out.println(Float.compare(fornecedor.obterSaldo(), 17.5f)
						   == 0);
	}
}
