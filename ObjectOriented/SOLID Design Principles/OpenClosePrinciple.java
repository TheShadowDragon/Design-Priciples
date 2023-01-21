/*
O stands for Open Close Principle
A class should be open for extension, but closed for modification.
Have the ability to extend a class behavior without modifying it
*/
public class OpenClosePrinciple {
    public static void main(String[] args) {
        Add add = new Add(1, 2);
        Subtract subtract = new Subtract(1, 2);
        Divide divide = new Divide(2, 1);
        add.calculate();
        subtract.calculate();
        divide.calculate();
    }
}
interface calculateBlueprint {
    void calculate();
}

class Add implements calculateBlueprint{
    private int x, y;
    public Add(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void calculate() {
        System.out.println(x + y);
    }
    

}

class Subtract implements calculateBlueprint{
    private int x, y;
    public Subtract(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void calculate() {
        System.out.println(x - y);
    }
}

class Divide implements calculateBlueprint{
    private int x, y;
    public Divide(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void calculate() {
        System.out.println(x / y);
    }

}
