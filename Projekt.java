package demo;

public class Projekt {

	public static void main(String[] args) {

		Car car = new Car("Audi", true, 0, 1110000.99);
		car.printCar();
		System.out.println("===> zmieniam wartosci");

		car.setMilleage(100);
		car.setPrice(500000);
		car.setBrand("Honda");
		
		System.out.println("nowy przebieg: " + car.getMilleage());
		System.out.println("Nowa cena:  " + car.getPrice());
        System.out.println("Nowa marka: " + car.getBrand() );
	}
}
