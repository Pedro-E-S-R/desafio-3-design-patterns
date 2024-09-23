package AbstractFactory.factories;

import AbstractFactory.colheita.Colher;
import AbstractFactory.plantacao.Laranja;

public interface FazendaFactory {
    Colher inicioColheita();
    Laranja inicioPlantacao();
}
