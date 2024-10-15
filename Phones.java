public class Phones {
	//atributes of the object Phones

	String Brand;
	String Type;
	int Storage;

	public static void main (String[] args){
		Phones obj1 = new Phones(); //first object
		Phones obj2 = new Phones(); //second object

		obj1.Brand = "Brand :Samsung";
		obj1.Type = "Type: s-series";
		obj1.Storage = 256;


		obj2.Brand = "Tecno";
		obj2.Type = "spark";
		obj2.Storage = 128;


		System.out.println("Phone 1 Details");

		System.out.println(obj1.Brand);
		System.out.println(obj1.Type);
		System.out.println(obj1.Storage);

		System.out.println("/////*********************************//////////////////****************/////////////***************/////////");

		System.out.println("Phone 2 Details");

		System.out.println(obj1.Brand);
		System.out.println(obj1.Type);
		System.out.println(obj1.Storage);





		}
	}