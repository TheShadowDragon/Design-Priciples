package Associations;
/*
 Composition is used for has a relations
 Composition could be implemenented through:
 Constructors,
 Implemented inside the class
 */
public class HasAComposition {
    public static void main(String[] args) {
        Car car = new Car(new carColor("red"), new carSpeed(10));
    }
}

class Car {
    carColor carColor;
    carSpeed carSpeed;
    public Car(carColor color, carSpeed speed) {
        System.out.println(color.getColor() + speed.getSpeed());
    }
}

class carColor {
    String color;
    public carColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    } 
}

class carSpeed {
    int speed;
    public carSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
}
//Can use composition to store data in a list. Such as employees in a compnay class