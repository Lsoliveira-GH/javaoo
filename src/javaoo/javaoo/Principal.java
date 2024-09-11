package javaoo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    private static GerenciadorPessoas gerenciadorPessoas = new GerenciadorPessoas();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = lerOpcao();
            processarOpcao(opcao);
        } while (opcao != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Listar Pessoas");
        System.out.println("2. Cadastrar Pessoa");
        System.out.println("3. Localizar Pessoa por Código");
        System.out.println("4. Remover Pessoa por Código");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao() {
        int opcao = 0;
        try {
            opcao = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Opção inválida. Tente novamente.");
            scanner.next(); // Limpa o buffer do scanner
        }
        return opcao;
    }

    private static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                gerenciadorPessoas.listarPessoas();
                break;
            case 2:
                cadastrarPessoa();
                break;
            case 3:
                localizarPessoa();
                break;
            case 4:
                removerPessoa();
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void cadastrarPessoa() {
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Função: ");
        String funcao = scanner.nextLine();
        Pessoa pessoa = new Pessoa(codigo, nome, funcao);
        gerenciadorPessoas.adicionarPessoa(pessoa);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    private static void localizarPessoa() {
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        Pessoa pessoa = gerenciadorPessoas.localizarPessoaPorCodigo(codigo);
        if (pessoa != null) {
            System.out.println("Pessoa encontrada: " + pessoa);
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    private static void removerPessoa() {
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        gerenciadorPessoas.removerPessoaPorCodigo(codigo);
        System.out.println("Pessoa removida se existia.");
    }
}