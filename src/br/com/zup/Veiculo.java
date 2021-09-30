package br.com.zup;

public class Veiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private String ano;

    public Veiculo() {

    }

    public Veiculo(String tipo, String marca, String modelo, String ano) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Tipo do veiculo: " + tipo);
        retorno.append("\n Marca do veiculo: " + marca);
        retorno.append("\n Modelo do veiculo: " + modelo);
        retorno.append("\n Ano do veiculo: " + ano);
        return retorno.toString();
    }
}

