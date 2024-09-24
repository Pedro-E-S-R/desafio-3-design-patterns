package Builder.pessoa;

import Builder.Conjunto.Alimentacao;
import Builder.Conjunto.Roupa;
import Builder.Conjunto.TV;

public class PessoaRotina {
    private final Roupa roupa;
    private final Alimentacao alimento;
    private final TV controle;

    public PessoaRotina(Roupa roupa, Alimentacao alimento, TV controle) {
        this.roupa = roupa;
        this.alimento = alimento;
        this.controle = controle;
    }
    public Roupa getRoupa() {
        return roupa;
    }
    public Alimentacao getAlimento() {
        return alimento;
    }
    public TV getControle() {
        return controle;
    }


}
