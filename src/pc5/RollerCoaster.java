package pc5;

public class RollerCoaster extends Attraction{
    @Override
    public void info() {
        System.out.println("Американские горки - это острые ощущения");
    }

    @Override
    public void maintain() {
        System.out.println("Проверка безопасности");
    }
}
