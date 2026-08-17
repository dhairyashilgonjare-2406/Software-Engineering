package designpatterns;

public class Demo {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Design Patterns Demo - Singleton, Factory, Observer");
        System.out.println("========================================\n");

        System.out.println("1) Singleton Pattern");
        SingletonConfig config1 = SingletonConfig.getInstance();
        SingletonConfig config2 = SingletonConfig.getInstance();
        config1.setDatabaseUrl("jdbc:postgresql://localhost:5432/appdb");
        System.out.println("Same instance: " + (config1 == config2));
        System.out.println("Database URL: " + config2.getDatabaseUrl() + "\n");

        System.out.println("2) Factory Pattern");
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("CIRCLE");
        Shape rectangle = factory.getShape("RECTANGLE");
        Shape triangle = factory.getShape("TRIANGLE");
        System.out.println(circle.draw());
        System.out.println(rectangle.draw());
        System.out.println(triangle.draw() + "\n");

        System.out.println("3) Observer Pattern");
        WeatherStation station = new WeatherStation();
        TemperatureDisplay phoneDisplay = new TemperatureDisplay("Phone");
        TemperatureDisplay webDisplay = new TemperatureDisplay("Web Dashboard");

        station.registerObserver(phoneDisplay);
        station.registerObserver(webDisplay);

        station.setTemperature(25.5);
        station.setTemperature(28.1);
    }
}
