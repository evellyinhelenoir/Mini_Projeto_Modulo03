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


    //Métodos referentes a  Alunos
    public void adicionarAlunos(Aluno novoAluno){
        aluno.add(novoAluno);
    }

    public List<Aluno> exibirListaAlunos(){
        for (Aluno referencia: aluno){
            System.out.println(referencia);
        }

        return aluno;
    }

    public void removerAluno(String pegarCPF) {
        Aluno alunoARemover = null;

        for (Aluno referencia : aluno) {
            if (referencia.getCpfPessoa().equals(pegarCPF)) {
                System.out.println("Aluno Removido.");
                alunoARemover = referencia;

            }
        }

        aluno.remove(alunoARemover);

    }

    //Métodos referentes a lista de Funcionarios
    public void adicionarFuncionario(Funcionario novoFuncionario) {
        funcionario.add(novoFuncionario);
    }

    public List<Funcionario> exibirListaFuncionario(){
        for (Funcionario referencia: funcionario){
            System.out.println(referencia);
        }

        return funcionario;
    }

    public void removerFuncionario(String pegarCPF) {
        Funcionario funcionarioARemover = null;

        for (Funcionario referencia : funcionario) {
            if (referencia.getCpfPessoa().equals(pegarCPF)) {
                System.out.println("Funcionario Removido.");
                funcionarioARemover = referencia;

            }
        }

        funcionario.remove(funcionarioARemover);

    }

    //Métodos referentes a lista de Veiculos
    public void adicionarVeiculo(Veiculo novoVeiculo){
        veiculo.add(novoVeiculo);
    }

    public List<Veiculo> exibirListaVeiculos(){
        for (Veiculo referencia: veiculo){
            System.out.println(referencia);
        }

        return veiculo;
    }

    public void removerVeiculo(String pegarPlaca) {
        Veiculo veiculoARemover = null;

        for (Veiculo referencia : veiculo) {
            if (referencia.getPlaca().equals(pegarPlaca)) {
                System.out.println("Carro Removido.");
                veiculoARemover = referencia;

            }
        }

        veiculo.remove(veiculoARemover);

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

