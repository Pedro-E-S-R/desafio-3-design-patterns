package Builder.Conjunto;

public class TV {
    private Boolean ligada;
    private int canal;

    public TV(Boolean ligada) {
        this.ligada = ligada;
    }

    public TV(Boolean ligada, int canal) {
        this.ligada = ligada;
        this.canal = canal;
    }

    public Boolean getLigada() {
        return ligada;
    }

    public void setLigada(Boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (ligada) {
            this.canal = canal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("A TV está desligada. Não é possível alterar o canal.");
        }
    }
}
