package estd;

/**
 * Aplique os conceitos de estruturas de dados estudados para solucionar o problema abaixo:
 * i) Uma empresa necessita criar um aplica��o para dispor em tela os produtos de uma determinada categoria de forma decrescente baseado pelo pre�o do produto. (2.0)
 * @author gilmar.goulart
 *
 */
public class Product {
	
	private int code;
	private String description;
	private float price;
	private Category category;
	
	/**
	 * Instancia produto definindo c�digo e descri��o.
	 * @param code
	 * @param description
	 */
	public Product(int code, String description){
		setCode(code);
		setDescription(description);
		setPrice(0);
	}
	
	/**
	 * Instancia produto com c�digo aleat�rio, definindo descri��o, pre�o e categoria.
	 * @param description
	 * @param price
	 * @param category
	 */
	public Product(String description, float price, Category category){
		int randomCode = (int) (Math.random()*99999);
		setCode(randomCode);
		setDescription(description);
		setPrice(price);
		setCategory(category);
	}
	
	/**
	 * Instancia produto com os dados informados.
	 * @param code
	 * @param description
	 * @param price
	 * @param category
	 */
	public Product(int code, String description, float price, Category category){
		setCode(code);
		setDescription(description);
		setPrice(price);
		setCategory(category);
	}
	
	/**
	 * Retorna o c�digo do produto.
	 * @return
	 */
	public int getCode() {
		return code;
	}
	/**
	 * Define o c�digo do produto.
	 * @param code
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	/**
	 * Retorna a descri��o do produto
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Define a descri��o do produto.
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Retorna o pre�o do produto.
	 * @return
	 */
	public float getPrice() {
		return price;
	}
	
	/**
	 * Define o pre�o do produto.
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	/**
	 * Retorna a categoria do produto.
	 * @return
	 */
	public Category getCategory() {
		return category;
	}
	
	/**
	 * Define a categoria do produto.
	 * @param category
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
