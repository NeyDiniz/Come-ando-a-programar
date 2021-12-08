package Carro;

public class TestConcessionaria {

	public static void main(String[] args) {
		
		Carro novoCarro = new Carro();
		novoCarro.setAno(2021);
		novoCarro.setMarca("Ford");
		novoCarro.setModelo("Focus");
		novoCarro.setPlaca("AAA-1111");
		novoCarro.setPreco(99.990);
		
		Carro novoCarro2 = new Carro();
		novoCarro2.setAno(2015);
		novoCarro2.setMarca("Chevrolet");
		novoCarro2.setModelo("Prisma");
		novoCarro2.setPlaca("ABC-1234");
		novoCarro2.setPreco(49.990);
		
		Concessionaria Loja = new Concessionaria();
		
		Loja.addCarro(novoCarro);
		Loja.addCarro(novoCarro2);
		
		Loja.listarCarros();
		System.out.println(Loja.listartabelaPreco("AAA-1111"));
		
		
		
		
		
		
		

	}

}
