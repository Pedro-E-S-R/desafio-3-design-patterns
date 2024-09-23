package AbstractFactory;

import AbstractFactory.factories.FaFactory;
import AbstractFactory.factories.FazendaFactory;

public class Demon {
    public static void main(String[] args) {
        FazendaFactory fazenda = new FaFactory();
        Application app = new Application(fazenda);

        app.cicloFazenda();
    }
}
