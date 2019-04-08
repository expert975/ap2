/**
   05
*/

public class Porta
{
	private boolean aberta;
	private String cor;
	private float dimensaoX;
	private float dimensaoY;
	private float dimensaoZ;

	public Porta(String cor, float dimensaoX, float dimensaoY, float dimensaoZ)
	{
		this.aberta = false;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}

	public Porta()
	{
		this("Invisível", 1, 1, 1);
	}

	public void abre()
	{
		aberta = true;
	}

	public void fecha()
	{
		aberta = false;
	}

	public void pinta(String cor)
	{
		this.cor = cor;
	}

	public boolean estaAberta()
	{
		return aberta;
	}

	public float getDimensaoZ()
	{
		return dimensaoZ;
	}

	public void setDimensaoZ(float dimensaoZ)
	{
		this.dimensaoZ = dimensaoZ;
	}

	public float getDimensaoY()
	{
		return dimensaoY;
	}

	public void setDimensaoY(float dimensaoY)
	{
		this.dimensaoY = dimensaoY;
	}

	public float getDimensaoX()
	{
		return dimensaoX;
	}

	public void setDimensaoX(float dimensaoX)
	{
		this.dimensaoX = dimensaoX;
	}

	public String getCor()
	{
		return cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public boolean getAberta()
	{
		return aberta;
	}

	public void setAberta(boolean aberta)
	{
		this.aberta = aberta;
	}

	@Override
	public String toString()
	{
		return "aberta: " + aberta + " cor: " + cor
			+ " dimX: " + dimensaoX + " dimY: " + dimensaoY
			+ " dimZ: " + dimensaoZ;
	}
}
