package estd;

public class Catalog {
	
	private String description;
	private Product[] products;
	private int size;
	
	public Catalog(String description){
		setDescription(description);
	}

	public Product[] getProducts() {
		return this.products;
	}
	
	/**
	 * Adiciona produtos a partir da lista informada
	 * @param products
	 */
	public void addProducts(Product[] products) {
		int newLength = 0;

		//Considerar os produtos que já tem na lista.
		if (this.products != null) {
			newLength += this.products.length;
		}
		//E considerar os produtos que estão sendo adicionados.
		newLength += products.length;
		
		//Criar vetor
		Product[] newProducts = new Product[newLength];
		
		//Adicionar os produtos existentes ao novo vetor.
		int i = 0;
		if (this.products != null){
			for (Product p : this.products) {
				//Ignorar espaços vazios
				if (p != null){
					newProducts[i] = p;
					size++;
					i++;
				}
			}
		}
		
		//Adicionar os produtos do parâmetro ao novo vetor
		for (Product p : products) {
			//Ignorar se estiver em branco
			if (p != null){
				newProducts[i] = p;
				size++;
				i++;
			}
		}
		
		this.products = newProducts;
		newProducts = null;
	}
	
	/**
	 * Adiciona novo produto a partir do objeto informado.
	 * @param product
	 */
	public void addProduct(Product product) {
		//Adicionar somente 1 item
		Product[] p = new Product[1];
		p[0] = product;
		//Reaproveitar método de adicionar produto
		addProducts(p);
	}
	
	
	/**
	 * Remove produto a partir do objeto informado.
	 * @param product
	 */
	public void removeProduct(Product product) {
		int i = 0;
		for (Product p : this.products) {
			if (p != null){
				if (p.equals(product)) {
					this.products[i] = null;
					size--;
					//break;
				}
			}
			i++;
		}
	}
	
	/**
	 * Remove produto com o código especificado.
	 * @param code
	 */
	public void removeProduct(int code) {
		int i = 0;
		for (Product p : this.products) {
			if (p != null) {
				if (p.getCode() == code) {
					this.products[i] = null;
					size--;
					//break;
				}
			}
			i++;
		}
	}

	/**
	 * Retorna a descrição do produto
	 * @return
	 */
	public String getDescription() {
		return this.description;
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
		Product[] products = new Product[getProducts().length];
		
		//Armazenar os produtos por categoria
		int itensFound = 0;
		for (Product p : getProducts()) {
			if (p != null){
				if (p.getCategory().equals(category)) {
					products[itensFound] = p;
					itensFound += 1;
				}
			}
		}
		
		//Retornar vetor apenas com os elementos pertencentes à categoria informada
		Product[] productsByCaregory = new Product[itensFound];
		for (int i = 0; i < itensFound; i++) {
			productsByCaregory[i] = products[i];
		}
		
		products = null;
		
		return productsByCaregory;
	}
	
	
	/**
	 * Retorna a quantidade de produtos no catálogo
	 * @return
	 */
	public int getSize(){
		return this.size;
	}
}
