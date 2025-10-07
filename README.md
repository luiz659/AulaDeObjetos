Sistema de Desconto em Java — Orientação a Objetos

Este projeto foi desenvolvido com o objetivo de praticar os conceitos de Programação Orientada a Objetos (POO) em Java, aplicando na criação de uma classe que calcula o valor final de um produto com desconto.

🚀 Funcionalidades

Cadastro de um produto com:

Nome

Valor original

Porcentagem de desconto

Cálculo automático do valor final após o desconto

Exibição dos dados formatados no console

🧱 Conceitos aplicados

Classes e Objetos

Encapsulamento

Métodos com retorno

Construtores

Atributos de instância

💻 Exemplo de uso
public class Produto {
    private String nome;
    private double valor;
    private double desconto;

    public Produto(String nome, double valor, double desconto) {
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
    }

    public double calcularValorFinal() {
        return valor - (valor * desconto / 100);
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Valor original: R$" + valor);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Valor final: R$" + calcularValorFinal());
    }
}

🧩 Classe Principal
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500.00, 10);
        produto.exibirInformacoes();
    }
}

🏁 Resultado esperado
Produto: Notebook
Valor original: R$3500.0
Desconto: 10.0%
Valor final: R$3150.0

📚 Aprendizado

Este exercício me ajudou a compreender melhor como a orientação a objetos facilita a organização e o reaproveitamento de código, tornando o programa mais modular e fácil de manter.


🧑‍💻 Autor

Luiz Otávio Rosa
📍 Estudante de Desenvolvimento de Software
🔗 LinkedIn
