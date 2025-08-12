package pc5;

public class Manuscript implements Exhibit{
    @Override
    public void info() {
        System.out.println("Манускрипт времен царя Гороха");
    }

    @Override
    public void preserve() {
        System.out.println("Контроль влажности");
    }
}
