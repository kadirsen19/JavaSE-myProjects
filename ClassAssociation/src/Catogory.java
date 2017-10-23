import java.util.ArrayList;
import java.util.List;

public class Catogory {

	private String catogoryId;
	private String catagoryName;
	
	private List<Product> listProduct= new ArrayList<Product>();
	
	public void addCatogory(Product ctgr1 ) {
		
		listProduct.add(ctgr1);
		
	}
	public void showProductList()
	{
		for (Product product : listProduct) {
//			System.out.println("Katagori id -->"+this.catogoryId+
//								"Katagori name -->"+this.catagoryName+
//								"Urun id -->"+product.getProductId()+
//								"Urun adý -->"+product.getProductName()+
//								"Urun fiyatý-->"+product.getProductPrice());
			System.out.println(product.toString());
		}
	}
	
	
	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	public Catogory(String catogoryId, String catagoryName) {
	
		this.catogoryId = catogoryId;
		this.catagoryName = catagoryName;
	}
	
	public Catogory() {
		
	}

	public String getCatogoryId() {
		return catogoryId;
	}
	public void setCatogoryId(String catogoryId) {
		this.catogoryId = catogoryId;
	}
	public String getCatagoryName() {
		return catagoryName;
	}
	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}
	
}
