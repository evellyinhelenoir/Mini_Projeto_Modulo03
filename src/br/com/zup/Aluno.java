package br.com.zup;

public class Aluno extends Pessoa {

    private String categoriaDesejada;

    public Aluno() {
    }

    public Aluno(String nomePessoa, String cpfPessoa, int idade, String telefone, String endereco, String categoriaDesejada) {
        super(nomePessoa, cpfPessoa, idade, telefone, endereco);
        this.categoriaDesejada = categoriaDesejada;
    }


    public String getCategoriaDesejada() {
        return categoriaDesejada;
    }

    public void setCategoriaDesejada(String categoriaDesejada) {
        this.categoriaDesejada = categoriaDesejada;
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n======Aluno======");
        retorno.append(super.toString());
        retorno.append("\nCategoria Desejada: " + categoriaDesejada);
        retorno.append("\n=================");
        return retorno.toString();
    }

}
