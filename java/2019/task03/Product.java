/**
   02
*/

public class Product
{
	private String name;
	private float cost;
	private int quantity;

	public Product(String name, float cost)
	{
		this(name, cost, 0);
	}

	public Product(String name, float cost, int quantity)
	{
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void addQuantity(int quantity)
	{
		this.quantity += quantity;
	}

	public boolean canRemove(int quantity)
	{
		if(this.quantity - quantity < 0)
			return false;
		return true;
	}

	public void remove(int quantity) throws UnsuficientItemsException
	{
		if(canRemove(quantity))
			this.quantity -= quantity;
		else
			throw new UnsuficientItemsException();
	}

	@Override
	public boolean equals(Object object)
	{
		if(object instanceof Product)
		{
			Product product = (Product)object;
			if(this.name.equals(product.name))
				return true;
		}
		return false;
	}

	public float getCost()
	{
		return cost;
	}

	public void setCost(float cost)
	{
		this.cost = cost;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
