package AbstractFactory.factories;

import AbstractFactory.colheita.Colher;
import AbstractFactory.colheita.FazendaColher;
import AbstractFactory.plantacao.FazendaPlantar;
import AbstractFactory.plantacao.Laranja;

public class FaFactory implements FazendaFactory{
    @Override
    public Colher inicioColheita() {
        return new FazendaColher();
    }

    @Override
    public Laranja inicioPlantacao() {
        return new FazendaPlantar();
    }
}
