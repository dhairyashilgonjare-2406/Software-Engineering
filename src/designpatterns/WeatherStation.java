package designpatterns;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(double temperature);
}

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

public class WeatherStation implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private double temperature;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Weather station updated temperature to: " + temperature + "C");
        notifyObservers();
    }
}

class TemperatureDisplay implements Observer {
    private final String name;

    public TemperatureDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(double temperature) {
        System.out.println(name + " received update: Temperature = " + temperature + "C");
    }
}
