public class Fruits {
    //Attributes of fruits
    String Type;
    String Taste;
    int NoOfSeeds;

    public static void main(String[] args) {
        Fruits obj1 = new Fruits();//first object
        Fruits obj2 = new Fruits();//second object

        obj1.Type = "Mangoes";
        obj1.Taste = "sweet";
        obj1.NoOfSeeds = 2;

        //Printing out object 1
        System.out.println("Fruit 1:");
        System.out.println("Type: " + obj1.Type);
        System.out.println("Taste: " + obj1.Taste);
        System.out.println("Number of Seeds: " + obj1.NoOfSeeds);

        //Set values for object 2
        obj2.Type = "Apples";
        obj2.Taste = "sour";
        obj2.NoOfSeeds = 5;

        //Printing out object 2
        System.out.println("\nFruit 2:");
        System.out.println("Type: " + obj2.Type);
        System.out.println("Taste: " + obj2.Taste);
        System.out.println("Number of Seeds: " + obj2.NoOfSeeds);
    }
}