package javaoo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPessoas {
    private List<Pessoa> pessoas;

    public GerenciadorPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public Pessoa localizarPessoaPorCodigo(int codigo) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codigo) {
                return pessoa;
            }
        }
        return null;
    }

    public void removerPessoaPorCodigo(int codigo) {
        Pessoa pessoa = localizarPessoaPorCodigo(codigo);
        if (pessoa != null) {
            pessoas.remove(pessoa);
        }
    }

    public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa encontrada no cadastro.");
        } else {
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }
    }
}
