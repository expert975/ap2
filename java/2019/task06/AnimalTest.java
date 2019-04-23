/**
   01,02,03,04
*/

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex1.*;

public class AnimalTest
{
	public static void main(String args[])
	{
		Dog dog = new Dog("Puppy", 2);
		Horse horse = new Horse("Pony", 5);
		Sloth sloth = new Sloth("Lazy", 1);
		Veterinary veterinary = new Veterinary();

		sloth.talk();
		horse.talk();
		dog.talk();

		veterinary.examine(dog);
		veterinary.examine(horse);
		veterinary.examine(sloth);

		Zoo zoo = new Zoo(new Horse("Animal0", 0),
						  new Sloth("Animal1", 1),
						  new Dog("Animal2", 2),
						  new Horse("Animal3", 3),
						  new Sloth("Animal4", 4),
						  new Dog("Animal5", 5),
						  new Horse("Animal6", 6),
						  new Sloth("Animal7", 7),
						  new Dog("Animal8", 8),
						  new Horse("Animal9", 9)
						  );

		zoo.shakeCages();
	}
}
