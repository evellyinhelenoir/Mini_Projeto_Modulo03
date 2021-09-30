package br.com.zup;

public class Veiculo {
    private String marca;
    private String modelo;
    private String ano;

    public Veiculo() {

    }

    public Veiculo ( String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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
        retorno.append("\n Marca do veiculo: " + marca);
        retorno.append("\n Modelo do veiculo: " + modelo);
        retorno.append("\n Ano do veiculo: " + ano);
        return retorno.toString();
    }
}

