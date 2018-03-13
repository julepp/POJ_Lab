import java.util.ArrayList;
public class Main {
	  public static ArrayList<Product> getSampleProducts(int n){
		  ArrayList<Product> sample= new ArrayList<>();
	  for (int i=1;i<=n;i++){
		  Product p = new Product ("Product " + i, i * 25);
		  sample.add(p);
	  }
	  return sample;
	  }
	  public static Cart getSampleCart() { 
		  Cart c = new Cart();
		  for (Product p : getSampleProducts(10)){
			  c.addProduct(p);
		  }
		  return c;
	  }
	  
}
	  
