package Lesson_20171113;


public class Plane2 {

    public IEngine getEngineInnerClass() {
        return new Plane2Engine();
    }

    private class Plane2Engine implements IEngine {
        @Override
        public void start() {
            System.out.println("ВжВжВжВжВжВжВжВж(внутренний класс)");
        }
    }

    public IEngine getEngineMethodClass() {
        class Plane2Engine implements IEngine {
            @Override
            public void start() {
                System.out.println("ВжВжВжВжВжВжВжВж! ХрХрХрХрХр....... (внутренний класс в методе)");
            }
        }

        return new Plane2Engine();
    }

    public IEngine getEngineAnonymousClass() {
        IEngine iengine = new IEngine() {
            @Override
            public void start() {
                System.out.println("ВжВжВжВжВжВжВжВж! ХрХрХрХрХр....... ПФфффф..... (анонимный класс в методе)");
            }
        };

        return iengine;
    }


}
