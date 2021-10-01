package br.com.zup;

public class Pessoa {

    private String nomePessoa;
    private String cpfPessoa;
    private int idade;
    private String telefone;
    private String endereco;


    public Pessoa() {
    }

    public Pessoa(String nomePessoa, String cpfPessoa, int idade, String telefone, String endereco) {
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome: " + nomePessoa);
        retorno.append("\nCPF: " + cpfPessoa);
        retorno.append("\nIdade: " + idade + " anos");
        retorno.append("\nTelefone: " + telefone);
        retorno.append("\nEndereço: " + endereco);
        return retorno.toString();
    }

}
