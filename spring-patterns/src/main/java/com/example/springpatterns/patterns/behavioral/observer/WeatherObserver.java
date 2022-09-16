package com.example.springpatterns.patterns.behavioral.observer;
/**
 * Representa un observador
 *
 */
public interface WeatherObserver {

    /**
     * Actualiza el estado del observador con la nueva informacion desde
     * la clase que cambia
     * @param type
     */
    void update(WeatherType type);

}
