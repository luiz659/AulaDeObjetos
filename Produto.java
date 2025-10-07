package fag.objetos;
public class Produto {
  
	private String nome;
	private double preco;
	private double descontoPercent;
	
	
	public Produto() {
		
	}
	
	public Produto(double preco, double descontoPercent, String nome) {
		
		setPreco(preco);
		setDescontPercent(descontoPercent);
		setNome(nome);	
}
	
	public double getPreco() {
		return this.preco;
		
	}
	
	public void setPreco(double preco) {
		if (preco >= 0 ) {
			this.preco = preco;
		}
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	
   public double getDescontPercent() {
   	return this.descontoPercent;
   }
  
   public void setDescontPercent( double descontPercent) {
     if(descontPercent >=0 && descontPercent <=100) {
   	  this.descontoPercent = descontPercent;
     }
   }
   	
   	public double precoComDesconto() {
   		return preco-((preco * descontoPercent)/100);
