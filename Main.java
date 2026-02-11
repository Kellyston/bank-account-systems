//bank account systems 
import java.util.Scanner;

class Conta {
    String titular;
    double saldo;

    //Método para depositar
    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado!");
        }
    }

    // Método para sacar
    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}


public class Main{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        Conta minhaConta = null;
        int opcao = 0;

        while(opcao != 5){
            System.out.println("\n=== Menu de Opções ===");
            System.out.println("1 -- Criar Conta");
            System.out.println("2 -- Ver Saldo");
            System.out.println("3 -- Depositar");
            System.out.println("4 -- Sacar");
            System.out.println("5 -- Sair");
            System.out.print("escolha uma opção: ");

            opcao = entrada.nextInt();

            if (opcao == 1 ){
                minhaConta = new Conta();
                System.out.println("Digite o nome do Titular: ");
                entrada.nextLine();
                minhaConta.titular = entrada.nextLine();
                System.out.println("Conta criada para " + minhaConta.titular);
            } else if (opcao == 2) {
                if (minhaConta != null){
                    System.out.println("Saldo atual: R$" + minhaConta.saldo);
                } else {
                    System.out.println("Crie uma conta primeiro!");
                }
            } else if (opcao == 3) {
                if (minhaConta != null){
                    System.out.print("Valor do depósito: ");
                    double v = entrada.nextDouble();
                    minhaConta.depositar(v);
                } else {
                    System.out.println("Crie uma conta primeiro!");
                }
            } else if (opcao == 4){
                if (minhaConta != null){
                    System.out.println("Valor a ser sacado: ");
                    double v = entrada.nextDouble();
                    minhaConta.sacar(v);
                } else {
                    System.out.println("Crie uma conta primeiro!");
                }
            } else if (opcao == 5){
                System.out.println("Saindo do Sistema...");
            } else {
                System.out.println("Opção invalida. escolha outra opção!");
            }
        }
        entrada.close();
    }
}