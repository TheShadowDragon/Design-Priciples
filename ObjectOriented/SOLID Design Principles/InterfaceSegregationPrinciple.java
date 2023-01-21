/*
 I in SOLID stands for Interface Segregation Principle
 Many specific Interfaces are better than a general interface
 */
public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        Premium joe = new Premium();
        Free jeff = new Free();
        joe.getHoursWatched();
        jeff.displayAds();
    }
}
interface hasAds {
    public void displayAds();
}
interface noAds {
    public void getHoursWatched();
}
class Premium implements noAds{
    @Override
    public void getHoursWatched() {
        System.out.println("Getting hours watched");
    }
}
class Free implements hasAds{
    @Override
    public void displayAds() {
        System.out.println("Displaying ads");
    }
}
