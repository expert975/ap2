/**
   02
*/

public class Market
{
	private ProductList stock;

	public Market()
	{
		stock = new ProductList();
	}

	public void sell(ProductList productList, String paymentMethod)
		throws UnsuficientItemsException, NoSuchItemException
	{
		try
		{
			stock.remove(productList);
		}
		catch(UnsuficientItemsException | NoSuchItemException e)
		{
			throw e; //pass the hot potato
		}
	}

	public ProductList getStock()
	{
		return stock;
	}

}
