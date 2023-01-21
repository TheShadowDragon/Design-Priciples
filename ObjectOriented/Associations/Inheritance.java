package Associations;
//Easiest. Just use inherit the class with a keyword.

class Inheritance {
    public static void main(String[] args) {
        Frog frog = new Frog("Joe");
        frog.sleep();
        frog.eat();
    }
}

class Animal {
    public void sleep() {
        System.out.println("Sleeping");
    }
    public void eat() {
        System.out.println("Eating");
    }
}
class Frog extends Animal {
    String name;
    public Frog(String name) {
        this.name = name;
    }
}

