package lesson8;

public interface Actions {

    boolean run(int width); // сущности должны пробегать горизонтальную дистанцию
    boolean jump(int width); // сущности должны преодолевать вертикальные препятствия

    boolean isReady(); // проверка готовности к следующему препятствию
    void setReady(boolean ready); // выход из игры


}
