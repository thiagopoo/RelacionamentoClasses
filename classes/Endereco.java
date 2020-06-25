package classes;

public class Endereco {

    private String nomeRua, bairro, cidade, pais, cep;
    private int numero;

    public Endereco(String nomeRua, String bairro, String cidade, String pais, String cep, int numero) {
        this.nomeRua = nomeRua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
    }

    public String imprime() {
        return "O endereco do autore é - Rua: " + nomeRua +
                " Bairro: " + bairro + " Cidade: " + cidade +
                " País: " + pais + " CEP: " + cep +
                " Numero: " + numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
