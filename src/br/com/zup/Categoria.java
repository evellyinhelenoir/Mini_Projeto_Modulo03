package br.com.zup;

import java.util.HashMap;
import java.util.List;

public class Categoria {
    private HashMap<String, String> categoriaA = new HashMap<String, String>();
    private HashMap<String, String> categoriaB = new HashMap<String, String>();
    private HashMap<String, String> categoriaD = new HashMap<String, String>();
    private HashMap<String, String> categoriaE = new HashMap<String, String>();

    public Categoria(HashMap<String, String> categoriaA, HashMap<String, String> categoriaB, HashMap<String, String> categoriaD, HashMap<String, String> categoriaE) {
        this.categoriaA = categoriaA;
        this.categoriaB = categoriaB;
        this.categoriaD = categoriaD;
        this.categoriaE = categoriaE;
    }
}
