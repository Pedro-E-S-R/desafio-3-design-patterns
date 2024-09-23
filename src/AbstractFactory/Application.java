package AbstractFactory;

import AbstractFactory.colheita.Colher;
import AbstractFactory.factories.FazendaFactory;
import AbstractFactory.plantacao.Laranja;

public class Application {
    private Colher colher;
    private Laranja plantar;

    public Application(FazendaFactory f){
        colher = f.inicioColheita();
        plantar = f.inicioPlantacao();
    }
    public void cicloFazenda(){
        plantar.plantar();
        colher.colheita();

    }
}
