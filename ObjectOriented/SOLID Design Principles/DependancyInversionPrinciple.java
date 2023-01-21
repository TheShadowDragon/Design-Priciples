/*
 D stands for Dependancy Inversion Principle
 We must depend on abstraction not concrete classes
 High level modules must not depend on low level modules
 Both should depend on abstraction
 */
public class DependancyInversionPrinciple {
    public static void main(String[] args) {
    Premium joe = new Premium();
    Free jeff = new Free();
    jeff.playVideo();
    jeff.playAds();
    joe.playVideo();
    joe.playAds();
    joe.skipAds();
    }
}

abstract class baseClass {
    public void playVideo() {
        System.out.println("Playing video");
    }
    public abstract void playAds();
    public abstract void skipAds();
}

class Free extends baseClass {
    public void playAds() {
        System.out.println("Playing ads");
    }
    public void skipAds(){};

}
class Premium extends baseClass {
    public void skipAds() {
        System.out.println("Skipped ads");
    }
    public void playAds(){};
    
}
