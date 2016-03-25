package estd;

public class Category {
	private int code;
	private String description;


	/**
	 * Instancia categoria com código e descrição especificados.
	 * @param code
	 * @param description
	 */
	public Category(int code, String description){
		setCode(code);
		setDescription(description);
	}
	
	/**
	 * Instancia categoria com código randômico, e a descrição especificada.
	 * @param description
	 */
	public Category(String description){
		int randomCode = (int) (Math.random()*99999);
		setCode(randomCode);
		setDescription(description);
	}
	
	/**
	 * Retorna o código da categoria.
	 * @return
	 */
	public int getCode() {
		return this.code;
	}
	
	/**
	 * Define o código da categoria.
	 * @param code
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	
	/**
	 * Retorna a descrição da categoria.
	 * @return
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Define a descrição da categoria.
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}