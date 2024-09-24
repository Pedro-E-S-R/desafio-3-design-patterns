package SingletonLaze;

public class Demo {
    public static void main(String[] args) {
        System.out.println("(OBS: se o resultado for diferente a ideia do Singleton falhou)\nRESULTADO:");
        Singleton singleton = Singleton.getInstance("Primeiro valor, então o que deve sempre ser retornado");
        Singleton anotherSingleton = Singleton.getInstance("Segundo valor e se deu certo, deve ser ignorado");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
