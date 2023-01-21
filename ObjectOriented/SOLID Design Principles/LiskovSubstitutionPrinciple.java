/*
L in SOLID stands for Liskov Substitution Principle.
Subtypes should be replacable by there base types.
For example, baseClass has a child subClass;
subClass should be able to replace baseClass without ruining the program.
Another is if you have class Bird with the ability to fly. 
But if you add a child class Penguin, penguins can't fly. 
Therefore breaking LSP. 
In real world example, it could be violated through a student accessing teacher resources
Employee accessing boss's email
ect...

*/
public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Eagle bob = new Eagle("Bob");
        Penguin bill = new Penguin("Bill");
        Action doAction = new Action();
        doAction.doAction(bob);
        doAction.doAction(bill);
    }
}
class Eagle {
    String name;
    public Eagle(String name) {
        this.name = name;
    }

}

class Penguin {
    String name;
    public Penguin(String name) {
        this.name = name;
    }

}
class Action {
    public void doAction(Eagle type) {
        System.out.println("Eagle is flying!");
    }
    public void doAction(Penguin type) {
        System.out.print("Penguin couldn't fly");
    }
}

