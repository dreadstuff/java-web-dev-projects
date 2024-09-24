public class Main extends HouseCat {
    public Main(String aName, double aWeight) {
        super(aName, aWeight);
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());  //prints true

    }
}
