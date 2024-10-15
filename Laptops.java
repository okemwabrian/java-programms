public class Laptops {
    // Attributes of object laptops
    String Brand;
    String Storagetype;
    String Graphic;
    int Ram;

    public static void main(String[] args) {
        Laptops obj1 = new Laptops(); // First object
        Laptops obj2 = new Laptops(); // Second object

        // Assign values to obj1
        obj1.Brand = "Dell";
        obj1.Storagetype = "SSD";
        obj1.Graphic = "integrated";
        obj1.Ram = 16;

        // Assign values to obj2
        obj2.Brand = "Omen";
        obj2.Storagetype = "SSD";
        obj2.Graphic = "dedicated";
        obj2.Ram = 32;

        // Print details for Laptop 1
        System.out.println("details of Laptop 1:");
        System.out.println("Brand: " + obj1.Brand);
        System.out.println("Storage Type: " + obj1.Storagetype);
        System.out.println("RAM: " + obj1.Ram + "GB");
        System.out.println("Graphics: " + obj1.Graphic);

        System.out.println("-----------------------------");

        // Print details for Laptop 2
        System.out.println("Laptop 2:");
        System.out.println("Brand: " + obj2.Brand);
        System.out.println("Storage Type: " + obj2.Storagetype);
        System.out.println("RAM: " + obj2.Ram + "GB");
        System.out.println("Graphics: " + obj2.Graphic);
    }
}
