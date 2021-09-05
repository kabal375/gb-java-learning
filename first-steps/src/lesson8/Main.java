package lesson8;

public class Main {

    /*
   + Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
    Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

   + Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
    соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
    (успешно пробежал, не смог пробежать и т.д.).

   + Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

    * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
    Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
    */

    public static void main(String[] args) {
        System.out.println("Hello!");

        Actions[] characters = {new Cat(5, 20),
                                new Human(10, 15),
                                new Robot(2, 5)};


        Obstacle[] obstacles = {new Racetrack(5),
                                new TheWall(5),
                                new Racetrack(15)};

        int i = 0;
        for (Obstacle obstacle : obstacles) {
            i++;
            System.out.println("--- Obstacle " + i +": "+ obstacle.getClass().getSimpleName());
            for (Actions character : characters) {
                if (character.isReady()) {
                    if (obstacle instanceof Racetrack) {
                        character.setReady(character.run(((Racetrack) obstacle).getWidth()));
                    }
                    if (obstacle instanceof TheWall) {
                        character.setReady(character.jump(((TheWall) obstacle).getHeight()));
                    }
                }

                        //if (animal instanceof Cat)

            }

        }



    }

}
