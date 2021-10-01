package br.com.zup;

public class Veiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private String ano;
    private String placa;

    public Veiculo() {

    }

    public Veiculo (String tipo, String marca, String modelo, String ano, String placa) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
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
        retorno.append("=======Veículo======");
        retorno.append("\nMarca do veiculo: " + marca);
        retorno.append("\nModelo do veiculo: " + modelo);
        retorno.append("\nAno do veiculo: " + ano);
        retorno.append("\nPlaca do veiculo: " + placa);
        return retorno.toString();
    }

}
