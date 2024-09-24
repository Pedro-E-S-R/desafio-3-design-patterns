package Builder.Conjunto;

public class Alimentacao {
    private String proteina;
    private String acompanhamento;
    private String bebida;

    public Alimentacao(String proteina, String acompanhamento, String bebida) {
        this.proteina = proteina;
        this.acompanhamento = acompanhamento;
        this.bebida = bebida;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
}
