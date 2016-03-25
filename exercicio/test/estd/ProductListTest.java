package estd;

import org.junit.Assert;
import org.junit.Test;

public class ProductListTest {
	
	@Test
	public void productListTest(){
		
		/*
		 	Inserir produtos na lista
		 */
		Category praiaPiscina = new Category("Praia e Piscina");
		Category jogosSalao = new Category("Jogos de Salão");
		
		Product[] productList = {
				new Product(2421753, "Piscina Splash 12000 Lts", 699, praiaPiscina),
				new Product(648413, "Mesa de Ping Pong", 379, jogosSalao),
				new Product(176571, "Filtro e Bomba p/ Piscina", 279, praiaPiscina),
				new Product(2474178, "Kit 2 Cadeiras Reclináveis", 69, praiaPiscina),
				new Product(183032, "Mesa de Pebolim", 899, jogosSalao),
				new Product(560283, "Kit limpeza para Piscina", 209, praiaPiscina),
				new Product(2439013, "Escada para Piscina", 149, praiaPiscina),
				new Product(20691, "Campo de Futebol de Botão", 64, jogosSalao),
				new Product(2422515, "Colchão Inflável Poltrona", 59, praiaPiscina),
				new Product(29212, "Bote Inflável", 129, praiaPiscina)
		};
		//
		
		/*
			i. Inserir lista de produtos.
		*/
		Catalog catalog = new Catalog("Catálogo de produtos");
		catalog.addProducts(productList);
		
		//Deve ter inserido os 10 produtos
		Assert.assertEquals(catalog.getSize(), 10);
		
		
		/*
			i. Os seguintes itens deverão ser removidos da lista de produtos por falta em estoque: (3.0)
			Código: 560283
			Código: 2422515
		*/
		catalog.removeProduct(560283);
		catalog.removeProduct(2422515);
		
		//Deve ter removido 2 produtos, restando 8
		Assert.assertEquals(catalog.getSize(), 8);
		
		/*
			Liste em tela os produtos restantes que sejam da categoria Praia e Piscina. (2.0)
		*/
		Product[] productsInPraiaPiscina = catalog.getProductsByCategory(praiaPiscina);
		System.out.printf("Cód., Descrição, Categoria, Preço Produto\n");
		for (Product p : productsInPraiaPiscina) {
			System.out.printf("%d, %s, %s, %.2f\n", p.getCode(), p.getDescription(), p.getCategory().getDescription(), p.getPrice());
		}
	}
}