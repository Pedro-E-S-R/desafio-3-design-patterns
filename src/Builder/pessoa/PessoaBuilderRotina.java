package Builder.pessoa;

import Builder.Conjunto.Alimentacao;
import Builder.Conjunto.Roupa;
import Builder.Conjunto.TV;

public class PessoaBuilderRotina implements Rotina{
    private Roupa roupa;
    private Alimentacao alimento;
    private TV controle;


    @Override
    public void setRoupa(Roupa roupa) {
        this.roupa = roupa;
    }

    @Override
    public void setAlimento(Alimentacao alimento) {
        this.alimento = alimento;
    }

    @Override
    public void ligarTV(TV controle) {
        this.controle = controle;
    }
    public PessoaRotina getPessoa(){
        return new PessoaRotina(roupa,alimento,controle);
    }
    public PessoalFeito getPessoaFeito(){
        return new PessoalFeito(roupa,alimento,controle);
    }
}

