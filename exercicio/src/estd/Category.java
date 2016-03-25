package estd;

public class Category {
	private int code;
	private String description;


	/**
	 * Instancia categoria com c�digo e descri��o especificados.
	 * @param code
	 * @param description
	 */
	public Category(int code, String description){
		setCode(code);
		setDescription(description);
	}
	
	/**
	 * Instancia categoria com c�digo rand�mico, e a descri��o especificada.
	 * @param description
	 */
	public Category(String description){
		int randomCode = (int) (Math.random()*99999);
		setCode(randomCode);
		setDescription(description);
	}
	
	/**
	 * Retorna o c�digo da categoria.
	 * @return
	 */
	public int getCode() {
		return this.code;
	}
	
	/**
	 * Define o c�digo da categoria.
	 * @param code
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	
	/**
	 * Retorna a descri��o da categoria.
	 * @return
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Define a descri��o da categoria.
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}