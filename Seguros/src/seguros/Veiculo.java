package seguros;

/**
 *
 * @author alunolab08
 */
public class Veiculo {
    private Modelo modelo1;
    private int ano;
    private String marca, cor, placa;

    public Veiculo(int ano, String marca, String cor, String placa) {
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }

    public Modelo getModelo1() {
        return modelo1;
    }

    public void setModelo1(Modelo modelo1) {
        this.modelo1 = modelo1;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }
}
