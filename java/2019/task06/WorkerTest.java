/**
   05, 06
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex5.*;

public class WorkerTest
{
	public static void main(String args[])
	{
		Worker worker1 = new Worker("João1", "007", Rank.SELLER);
		System.out.println(worker1);
		Worker worker2 = new Worker("João2", "001", Rank.SELLER,
									"Escolinha Da Esquina");
		System.out.println(worker2);
		Worker worker3 = new Worker("João3", "002", Rank.SUPERVISOR,
									"Escolinha Da Esquina", "Escola do centro");
		System.out.println(worker3);
		Worker worker4 = new Worker("João4", "003", Rank.MANAGER,
									"Escolinha Da Esquina", "Escola do centro",
									"Universidade da cidade vizinha");
		System.out.println(worker4);
	}
}
