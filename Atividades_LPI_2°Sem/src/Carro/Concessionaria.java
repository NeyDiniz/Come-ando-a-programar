package Carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concessionaria {
	
	private ArrayList<Carro>car;
	private Map<String, Double> tabela_placaCar_preco;


	public Concessionaria() {
		car = new ArrayList<>();
		tabela_placaCar_preco = new HashMap<>();
		
	}
	
	public void addCarro(Carro novoCarro) {
		car.add(novoCarro);
		tabela_placaCar_preco.put(novoCarro.getPlaca(), novoCarro.getPreco());
				
		
	}
	
	public void listarCarros() {
		Carro C;
		for (int contador = 0; contador < car.size(); contador ++) {
			C = car.get(contador);
			System.out.println("O modelo do carro é: " + C.getModelo());
			System.out.println("O ano do carro é: " + C.getAno());
		}
		
	}
	
	public double listartabelaPreco(String placa) {
		tabela_placaCar_preco.get(placa);
		return tabela_placaCar_preco.get(placa);
					
		
	}
	
	

}
