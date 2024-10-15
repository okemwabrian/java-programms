public class Car {
    // Attributes of object Car
    String brand;
    String model;
    int year;

    public static void main(String[] args) {
        Car obj1 = new Car(); // First object
        Car obj2 = new Car(); //second object

        obj1.brand = "mazida";
        obj1.model = "Cx5";
        obj1.year = 2016;

        obj2.brand = "Toyota";
		obj2.model = "prado";
        obj2.year = 2024;

        // Use the correct object reference to access brand
        System.out.println("object one details");
        System.out.println(obj1.brand);
        System.out.println(obj1.model);
        System.out.println(obj1.year);

        System.out.println("---------------------------------------------------"	);

        System.out.println("object two details");
        System.out.println(obj2.brand);
		System.out.println(obj2.model);
        System.out.println(obj2.year);
    }
}
