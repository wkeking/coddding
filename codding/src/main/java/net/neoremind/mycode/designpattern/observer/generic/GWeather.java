package net.neoremind.mycode.designpattern.observer.generic;

import net.neoremind.mycode.designpattern.observer.WeatherType;

public class GWeather extends Observable<GWeather, Race, WeatherType> {

    private WeatherType currentWeather;

    public GWeather() {
        currentWeather = WeatherType.SUNNY;
    }

    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to " + currentWeather + ".");
        notifyObservers(currentWeather);
    }
}
