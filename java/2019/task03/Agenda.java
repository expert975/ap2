import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Agenda
{
	private List<Contato> agenda;

	public static void main(String agrs[])
	{
		Agenda myAgenda = new Agenda();
		myAgenda.add("Nome0", "email1");
		myAgenda.add("Nome1", "email1");
		myAgenda.add("Nome2", "email2");
		myAgenda.add("Nome3", "email3");
		System.out.printf("%b\n", myAgenda.find("Nome2") != null);
		myAgenda.delete("Nome2");
		System.out.printf("%b\n", myAgenda.find("Nome2") != null);
	}

	public Agenda()
	{
		agenda = new ArrayList<Contato>();
	}

	public void add(String nome, String email)
	{
		Contato contato = new Contato(nome, email);
		agenda.add(contato);
	}

	public void delete(String nome)
	{
		//"if" not thread safe?
		if(find(nome) != null)
			agenda.remove(find(nome));
	}

	public Contato find(String nome)
	{
		Iterator<Contato> itr = agenda.iterator();
		while(itr.hasNext())
		{
			Contato tmp = itr.next();
			if(tmp.getNome().equals(nome))
				return tmp;
		}
		return null;
	}
}
