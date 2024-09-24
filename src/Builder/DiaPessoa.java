package Builder;

import Builder.Conjunto.Alimentacao;
import Builder.Conjunto.Roupa;
import Builder.Conjunto.TV;
import Builder.pessoa.Builder;

public class DiaPessoa {
    void pessoaDeManha(Builder builder){
        builder.setRoupa(new Roupa(null,"Calça moleton","Chinelo"));
        builder.setAlimento(new Alimentacao("Ovo","Batata Doce","Whey"));
        builder.ligarTV(new TV(true,26));
    }
    void pessoaDeMeioDia(Builder builder){
        builder.setRoupa(new Roupa("Camisa polo","Calça jeans","sapato social"));
        builder.setAlimento(new Alimentacao("Bife",
                "Arroz, feijão e batata frita","Suco de Laranja"));
        builder.ligarTV(new TV(false));
    }
}
