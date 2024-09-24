package Builder.pessoa;

import Builder.Conjunto.Alimentacao;
import Builder.Conjunto.Roupa;
import Builder.Conjunto.TV;

public interface Builder {
    void setRoupa(Roupa roupa);
    void setAlimento(Alimentacao alimento);
    void ligarTV(TV controle);
}
