package Lesson_20171113;

public class Airplane {

    private AirplaneEngine leftEngine;
    private AirplaneEngine rightEngine;

    public void leftEngine(int num) {
        leftEngine = new AirplaneEngine(num);
    }

    public void rightEngine(int num) {
        rightEngine = new AirplaneEngine(num);
    }

    public void startEngines() {
        leftEngine.start();
        rightEngine.start();
        System.out.println("Завелись!\n");
    }

    private class AirplaneEngine implements IEngine {
        private Engine engine;

        AirplaneEngine(int num) {
            engine = new Engine(num);
        }

        @Override
        public void start() {
            System.out.println("ЖЖЖЖЖЖЖЖЖЖЖжжжжжжжжжжж!");
        }

        private class Engine {
            private int num;

            Engine(int num) {
                this.num = num;
            }
        }

    }

}
