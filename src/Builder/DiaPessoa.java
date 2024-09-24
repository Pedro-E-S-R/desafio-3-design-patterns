package Builder;

import Builder.Conjunto.Alimentacao;
import Builder.Conjunto.Roupa;
import Builder.Conjunto.TV;
import Builder.pessoa.Rotina;

public class DiaPessoa {
    void pessoaDeManha(Rotina rotina){
        rotina.setRoupa(new Roupa(null,"Calça moleton","Chinelo"));
        rotina.setAlimento(new Alimentacao("Ovo","Batata Doce","Whey"));
        rotina.ligarTV(new TV(true,26));
    }
    void pessoaDeMeioDia(Rotina rotina){
        rotina.setRoupa(new Roupa("Camisa polo","Calça jeans","sapato social"));
        rotina.setAlimento(new Alimentacao("Bife",
                "Arroz, feijão e batata frita","Suco de Laranja"));
        rotina.ligarTV(new TV(false));
    }
}
