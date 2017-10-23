
public class Test {

	public static void main(String[] args) {
		
		Catogory catagory1 = new Catogory("10","Beyaz Eþya");
		
		Product product1 = new Product(123,"Buzdolabý",900);
		
		product1.setCatagory(catagory1);
		
		product1.getCatagory().addCatogory(product1);
	
		
		
		Product product2 = new Product(321,"bulaþýk makinesi",600);
		
		product2.setCatagory(catagory1);
		
		product2.getCatagory().addCatogory(product2);
		
		catagory1.showProductList();
	}

}
