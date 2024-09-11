package javaoo;

public class Pessoa {
	 	private int codigo;
	    private String nome;
	    private String funcao;

	    public Pessoa(int codigo, String nome, String funcao) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.funcao = funcao;
}
	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getFuncao() {
	        return funcao;
	    }

	    public void setFuncao(String funcao) {
	        this.funcao = funcao;
	    }

	    @Override
	    public String toString() {
	        return "Código: " + codigo + ", Nome: " + nome + ", Função: " + funcao;
	    }
	}
