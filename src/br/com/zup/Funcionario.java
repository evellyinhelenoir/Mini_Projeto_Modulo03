package br.com.zup;

public class Funcionario extends Pessoa {

    private String funcao;

    public Funcionario() {
    }

    public Funcionario(String nomePessoa, String cpfPessoa, int idade, String telefone, String endereco, String funcao) {
        super(nomePessoa, cpfPessoa, idade, telefone, endereco);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n======Funcionário======");
        retorno.append(super.toString());
        retorno.append("\nFunção: " + funcao);
        retorno.append("\n=================");
        return retorno.toString();
    }

}
