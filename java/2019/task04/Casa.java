/**
   06
*/

public class Casa
{
	private String cor;
	private Porta porta1;
	private Porta porta2;
	private Porta porta3;

	public Casa(String cor)
	{
		this.cor = cor;
	}

	public Casa()
	{
		this("Invisível");
	}

	public void pinta(String cor)
	{
		this.cor = cor;
	}

	public int quantasPortasEstaoAbertas()
	{
		int count = 0;
		if(porta1.estaAberta())
			count++;
		if(porta2.estaAberta())
			count++;
		if(porta3.estaAberta())
			count++;
		return count;
	}

	public Porta getPorta3()
	{
		return porta3;
	}

	public void setPorta3(Porta porta3)
	{
		this.porta3 = porta3;
	}

	public Porta getPorta2()
	{
		return porta2;
	}

	public void setPorta2(Porta porta2)
	{
		this.porta2 = porta2;
	}

	public Porta getPorta1()
	{
		return porta1;
	}

	public void setPorta1(Porta porta1)
	{
		this.porta1 = porta1;
	}

	public String getCor()
	{
		return cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

}
