package br.com.zup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Categoria {
    private List<Categoria> categoriaA = new ArrayList<>();
    private List<Categoria> categoriaB = new ArrayList<>();
    private List<Categoria> categoriaD = new ArrayList<>();
    private List<Categoria> categoriaE = new ArrayList<>();

    public Categoria() {
    }

    public List<Categoria> getCategoriaA() {
        return categoriaA;
    }

    public void setCategoriaA(List<Categoria> categoriaA) {
        this.categoriaA = categoriaA;
    }

    public List<Categoria> getCategoriaB() {
        return categoriaB;
    }

    public void setCategoriaB(List<Categoria> categoriaB) {
        this.categoriaB = categoriaB;
    }

    public List<Categoria> getCategoriaD() {
        return categoriaD;
    }

    public void setCategoriaD(List<Categoria> categoriaD) {
        this.categoriaD = categoriaD;
    }

    public List<Categoria> getCategoriaE() {
        return categoriaE;
    }

    public void setCategoriaE(List<Categoria> categoriaE) {
        this.categoriaE = categoriaE;
    }
    public void adicionarCarro(Categoria novoCarro){
        categoriaB.add(novoCarro);
    }
    public void adicionarMoto(Categoria novaMoto){
        categoriaA.add(novaMoto);
    }
    public void adicionarCarreta(Categoria novaCarreta){
        categoriaA.add(novaCarreta);
    }
    public void adicionarOnibus(Categoria novoOnibus){
        categoriaA.add(novoOnibus);
    }
}