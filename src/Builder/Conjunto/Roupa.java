package Builder.Conjunto;

public class Roupa {
    private String parteSuperior;
    private String parteInferior;
    private String calsados;

    public Roupa(String parteSuperior, String parteInferior, String calsados) {
        this.parteSuperior = parteSuperior;
        this.parteInferior = parteInferior;
        this.calsados = calsados;
    }

    public String getParteSuperior() {
        return parteSuperior;
    }

    public void setParteSuperior(String parteSuperior) {
        this.parteSuperior = parteSuperior;
    }

    public String getParteInferior() {
        return parteInferior;
    }

    public void setParteInferior(String parteInferior) {
        this.parteInferior = parteInferior;
    }

    public String getCalsados() {
        return calsados;
    }

    public void setCalsados(String calsados) {
        this.calsados = calsados;
    }
}
