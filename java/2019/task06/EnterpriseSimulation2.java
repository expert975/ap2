/**
   07, 08, 10
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex5.*;

public class EnterpriseSimulation2
{
	public static void main(String args[])
	{
		Worker worker0 = new Worker("João0", "000", Rank.MANAGER,
									"Escolinha Da Esquina");
		Worker worker1 = new Worker("João1", "001", Rank.SUPERVISOR,
									"Escolinha Da Esquina");
		Worker worker2 = new Worker("João2", "002", Rank.SELLER,
									"Escolinha Da Esquina");
		Worker worker3 = new Worker("João3", "003", Rank.SELLER,
									"Escolinha Da Esquina");

		Worker worker4 = new Worker("João4", "004", Rank.SELLER,
									"Escolinha Da Esquina", "Escola do centro");
		Worker worker5 = new Worker("João5", "005", Rank.SUPERVISOR,
									"Escolinha Da Esquina", "Escola do centro");
		Worker worker6 = new Worker("João6", "006", Rank.SELLER,
									"Escolinha Da Esquina", "Escola do centro");
		Worker worker7 = new Worker("João7", "007", Rank.SELLER,
									"Escolinha Da Esquina", "Escola do centro");

		Worker worker8 = new Worker("João8", "008", Rank.SELLER,
									"Escolinha Da Esquina", "Escola do centro",
									"Universidade da cidade vizinha");
		Worker worker9 = new Worker("João9", "009", Rank.SELLER,
									"Escolinha Da Esquina", "Escola do centro",
									"Universidade da cidade vizinha");

		Worker workers[] = new Worker[]{worker0, worker1, worker2, worker3,
										worker4, worker5, worker6, worker7,
										worker8, worker9};

		float totalSalaryCost = 0;
		for(int i=0; i<10; i++)
		{
			totalSalaryCost += workers[i].getSalary();
			System.out.println(workers[i]);
		}
		System.out.println("Labor cost: " + totalSalaryCost);
	}
}
