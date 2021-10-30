package Atividades;

public class TestMethodMoto {

	public static void main(String[] args) {
		
		championship championship = new championship();
		championship.setCircuit("Interlagos");
		championship.setCity("São Paulo");
		championship.setCountry("Brazil");
		championship.setDate("20/11/2021");
		championship.setNumber_laps(20);
		
		Moto moto = new Moto();
		moto.setBrand("Honda");
		moto.setCc(1000);
		moto.setColor("blue");
		moto.setHorse_power(600);
		moto.setModel(null);
		moto.setYear_manufacture(2021);
		
		Pilot pilot = new Pilot();
		pilot.setAge(36);
		pilot.setName("Ney Diniz");
		pilot.setNationality("brasileiro");
		pilot.setNumber_victories(10);
		pilot.setPosition(1);
		
		
		System.out.println("No dia " + championship.date + " haverá mais uma etapa do campeonato nacional de motociclismo. A corrida ocorrerá no circuito " + 
		championship.circuit + " na cidade de " + championship.city + " aqui no " + championship.country + ".");
		
		
		
		
		
		
		
		
		
		

	}

}
