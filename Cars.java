public class Cars {
    //atributes of cars
    String Brand;
    String Model;
    String  Color;
    int   Year;
    int Millage;

    public static void main(String[] args) {
        Cars obj1 = new Cars();// first object
        Cars obj2 = new Cars();//second object

// attributes of the car 1
        obj1.Brand = "Toyota";
        obj1.Model = "Fielder";
        obj1.Color = "Blue";
        obj1.Year = 2013;
        obj1.Millage = 202200;
        //printing out of car (object 1)
        System.out.println("Car 1");
        System.out.println("Brand: " + obj1.Brand);
        System.out.println("Model: " + obj1.Model);
        System.out.println("Color: " + obj1.Color);
        System.out.println("Year: "+ obj1.Year);
        System.out.println("Milllage: " + obj1.Millage);
// attributes of the car 2
        obj2.Brand = "Nisan";
        obj2.Model = "matatu";
        obj2.Color = "Black";
        obj2.Year = 2020;
        obj2.Millage = 1666525;

        // printing out of car (object 2)
        System.out.println("\nCar 2");
        System.out.println("Brand: " + obj2.Brand);
        System.out.println("Model: " + obj2.Model);
        System.out.println("Color: " + obj2.Color);
        System.out.println("Year: "+ obj2.Year);
        System.out.println("Milllage: " + obj2.Millage);


    }


}
