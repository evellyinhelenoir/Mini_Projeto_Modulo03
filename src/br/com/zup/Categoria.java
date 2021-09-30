package br.com.zup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Categoria {

    private Veiculo veiculo;
    private List<Veiculo> categoriaA = new ArrayList<>();
    private List<Veiculo> categoriaB = new ArrayList<>();
    private List<Veiculo> categoriaD = new ArrayList<>();
    private List<Veiculo> categoriaE = new ArrayList<>();

    public Categoria() {
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Veiculo> getCategoriaA() {
        return categoriaA;
    }

    public void setCategoriaA(List<Veiculo> categoriaA) {
        this.categoriaA = categoriaA;
    }

    public List<Veiculo> getCategoriaB() {
        return categoriaB;
    }

    public void setCategoriaB(List<Veiculo> categoriaB) {
        this.categoriaB = categoriaB;
    }

    public List<Veiculo> getCategoriaD() {
        return categoriaD;
    }

    public void setCategoriaD(List<Veiculo> categoriaD) {
        this.categoriaD = categoriaD;
    }

    public List<Veiculo> getCategoriaE() {
        return categoriaE;
    }

    public void setCategoriaE(List<Veiculo> categoriaE) {
        this.categoriaE = categoriaE;
    }

    public void adicionarCarro(Veiculo novoCarro){
        categoriaB.add(novoCarro);
    }

    public void adicionarMoto(Veiculo novaMoto){
        categoriaA.add(novaMoto);
    }

    public void adicionarOnibus(Veiculo novoOnibus){
        categoriaD.add(novoOnibus);
    }

    public void adicionarCarreta(Veiculo novaCarreta){
        categoriaE.add(novaCarreta);
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("=======Categorias======");
        retorno.append(super.toString());
        return retorno.toString();
    }
}