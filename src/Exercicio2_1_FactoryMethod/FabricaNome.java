package Exercicio2_1_FactoryMethod;
/**
 * 
 * @author Jessica Alexandre da Silva
 * 			8162257402
 *
 */
public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
