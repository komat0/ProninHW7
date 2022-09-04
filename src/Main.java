public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 100, 2);
        Human human = new Human("Alex", 500, 1);
        Robot robot = new Robot("r2d2", 1000, 3);
        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(3);

        Persons[] persons = new Persons[3];
        {
            persons[0] = cat;
            persons[1] = human;
            persons[2] = robot;
        }

        Obstacles[] obstacles = new Obstacles[2];
        {
            obstacles[0] = treadmill;
            obstacles[1] = wall;
        }

        cat.info();
        human.info();
        robot.info();
        cat.getName();

        System.out.println("=====");

    }
}