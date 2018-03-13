import java.util.ArrayList;
public class Cart {
ArrayList<CartItem> item = new ArrayList<>();

public double totalPriceOfProducts(){
	double summary = 0;
	for (CartItem i : item )
		summary += i.getProduct().getPrice();
	return summary;
}
public double totalPriceOfDiscountedProducts(){
	double summary = 0;
	for(CartItem i : item)
		summary += i.getCurrentPrice();
	return summary;
}
public ArrayList<CartItem> getItems() { 
	return item;
}
public Cart addProduct(Product p){
	item.add(new CartItem(p));
	promotion.SumOfProducts += p.getPrice();
			return this;
}
public Cart addPromotion (IPromotion p){
	promotion.add(p);
	return this;
}
public Cart applyPromotions(){
	for(IPromotion p : promotions){
		p.CalculateOffer(this);
	}
	return this;
}
@Override
public String toString() { 
	return "Cart [\nitem=" + item + "\npromotions=" + promotions +"\npromotionSumOfProducts=" + promotionSumOfProduxts + "]";
}
}
