/**
   02
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;

public class ProductList extends ArrayList<Product>
{
	/**
	 * @return Can return null */
	public Product findProduct(Product productToFind)
	{
		for(Product product: this)
			if(product.equals(productToFind))
				return product;
		return null;
	}

	public boolean canRemoveProductQuantities(ProductList productListToRemove)
	{
		for(Product productToRemove: productListToRemove)
		{
			Product product = this.findProduct(productToRemove);
			if(product == null)
				return false;
			else if(!product.canRemove(productToRemove.getQuantity()))
				return false;
		}
		return true;
	}

	public void remove(ProductList productListToRemove)
		throws NoSuchItemException, UnsuficientItemsException
	{
		if(!this.containsAll(productListToRemove))
			throw new NoSuchItemException();
		if(!canRemoveProductQuantities(productListToRemove))
			throw new UnsuficientItemsException();
		for(Product productToRemove: productListToRemove)
		{
			Product product = this.findProduct(productToRemove);
			product.remove(productToRemove.getQuantity());
		}
	}
}
