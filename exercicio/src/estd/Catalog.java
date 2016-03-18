package estd;

public class Catalog {
	
	private String description;
	private Product[] products;
	
	
	public Catalog(String description){
		setDescription(description);
	}

	public Product[] getProducts() {
		return products;
	}
	
	public void addProducts(Product[] products) {
		for (Product p : products) {
			addProduct(p);
		}
	}
	
	public void addProduct(Product product) {
		//TODO implementar para adicionar produto
	}
	
	public void removeProduct(Product product) {
		//TODO implementar para remover produto a partir da classe informada
	}
	
	public void removeProduct(int code) {
		//TODO implementar para remover produto a partir de um índice
	}

	/**
	 * Retorna a descrição do produto
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Define descrição do produto
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Retorna lista de produtos filtrando por categoria.
	 * @param category
	 * @return
	 */
	public Product[] getProductsByCategory(Category category){
		Product[] products = null;
		
		for (Product p : getProducts()) {
			if (p.getCategory().equals(category)) {
				//TODO
			}
		}
		
		return products;
	}
}
