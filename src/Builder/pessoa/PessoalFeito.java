package Builder.pessoa;

import Builder.Conjunto.Alimentacao;
import Builder.Conjunto.Roupa;
import Builder.Conjunto.TV;

public class PessoalFeito {
    private final Roupa roupa;
    private final Alimentacao alimento;
    private final TV controle;

    public PessoalFeito(Roupa roupa, Alimentacao alimento, TV controle) {
        this.roupa = roupa;
        this.alimento = alimento;
        this.controle = controle;
    }
    public String print(){
        String rotina = "";
        if(roupa.getParteSuperior() != null) {
            rotina += "Vestiu: "+roupa.getParteSuperior() +",\n";
        }if(roupa.getParteInferior() != null) {
            rotina += "mais: "+roupa.getParteInferior() +",\n";
        }if(roupa.getCalsados() != null) {
            rotina += "mais: "+roupa.getCalsados() +",\n";
        }
        rotina += "Depois disso, foi comer um "+alimento.getProteina();
        rotina += "\ncom " + alimento.getAcompanhamento();
        rotina += "\ne de bebida o" + alimento.getBebida();
        if(controle.getLigada()){
            rotina += "\nfez isso tudo assistindo o canal " + controle.getCanal();
        }
        return rotina;
    }
}
