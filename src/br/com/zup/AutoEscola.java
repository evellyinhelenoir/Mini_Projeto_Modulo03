package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class AutoEscola {
    private String nomeDaEmpresa;
    private String enderecoDaEmpresa;
    private String cnpj;
    private List<Funcionario> funcionario = new ArrayList<>();
    private List<Aluno> aluno = new ArrayList<>();
    private List<Veiculo> veiculo = new ArrayList<>();

    public AutoEscola() {
    }

    public AutoEscola(String nomeDaEmpresa, String enderecoDaEmpresa, String cnpj) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.enderecoDaEmpresa = enderecoDaEmpresa;
        this.cnpj = cnpj;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getEnderecoDaEmpresa() {
        return enderecoDaEmpresa;
    }

    public void setEnderecoDaEmpresa(String enderecoDaEmpresa) {
        this.enderecoDaEmpresa = enderecoDaEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    //Métodos referentes a lista de Alunos
    public void adicionarAlunos(Aluno novoAluno){
        aluno.add(novoAluno);
    }

    public List<Aluno> exibirListaAlunos(){
        for (Aluno referencia: aluno){
            System.out.println(referencia);
        }

        return aluno;
    }

    public boolean removeAluno(String cpfExcluir) {
        for(Aluno referencia :aluno) {
            if(referencia.getCpfPessoa().equals(cpfExcluir))
                aluno.remove(referencia);
            return true;
        }
        return false;
    }

    //Métodos referentes a lista de Funcionarios
    public void adicionarFuncionario(Funcionario novoFuncionario) {
        funcionario.add(novoFuncionario);
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome da Empresa: " + nomeDaEmpresa);
        retorno.append("\nEndereço da empresa: " + enderecoDaEmpresa);
        retorno.append("\nCNPJ da empresa: " + cnpj);
        return retorno.toString();
    }

}

