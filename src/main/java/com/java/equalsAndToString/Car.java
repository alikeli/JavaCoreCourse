package com.java.equalsAndToString;

import java.util.Objects;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        //Посмотрим на метод equals(). Первое сравнение сравнивает текущий экземпляр объекта this с переданным объектом o.
        // Если это один и тот же объект, то equals() вернёт true.
        if (o == null || getClass() != o.getClass()) return false;
        //Во втором сравнении проверяется, является ли переданный объект null и какой у него тип.
        // Если переданный объект другого типа, то объекты не равны.
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
        //Наконец, equals() сравнивает поля объектов. Если два объекта имеют одинаковые значения полей, то объекты совпадают.
    }


    @Override
    public String toString() {
        return "Car " +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'';
    }
}
