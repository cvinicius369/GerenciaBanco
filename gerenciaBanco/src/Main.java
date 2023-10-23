/*
By:      @cvinicius369
E-mail:  vinicius182102@gmail.com
Project: Gerenciamento de Conta Bancária
*/

/*Abaixo realizei as importações que podem ser necessárias no código,
como o scanner por exemplo.*/
import java.util.ArrayList;
import java.util.Scanner;

/*Abaixo é a classe de Conta Bancaria onde o usuário realizará as operações de
saque, deposito ou tirar o saldo.*/
class ContaBancaria {
    /*Abaixo estão as variaveis onde consta o numero da conta do usuario e o saldo atual
    no metodo ContaBancaria() deixei pré-definido o saldo.*/
    private int numeroConta, idade;
    private double saldo;
    private String nome;
    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 150.0;
        this.nome = "Caio Vinicius de A. Faguette";
        this.idade = 20;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de $" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de $" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }
}

/*Abaixo é a classe Main, onde será executado as classes e metodos criados,
na classe main realizei duas instancias, uma parra o scanner e outra da classe ContaBancaria
criando o objeto "caio" que será o usuário de exemplo, após isso passei algumas informações basicas
sobre a conta do usuario caio, e abaixo criei uma esturura condicional para definir qual será a ação
do proprietário da conta.
 */
public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ContaBancaria caio = new ContaBancaria(369);

        System.out.println("Nome do titular: " + caio.getNome());
        System.out.println("Idade do titular: " + caio.getIdade());
        System.out.println("Sua conta é: " + caio.getNumeroConta());
        System.out.println("Seu saldo é de: " + caio.getSaldo());
        System.out.println("Digite 1 para sacar ou 2 para depositar");
        int action = scanner.nextInt();

        if (action == 1) {

            System.out.println("Informe o valor do saque");
            float valor = scanner.nextFloat();

            caio.sacar(valor);
        } else if (action == 2) {
            System.out.println("Informe o valor do deposito");
            float valor = scanner.nextFloat();

            caio.depositar(valor);
        } else {
            System.out.println("Ação invalida!");
        }
    }
}
