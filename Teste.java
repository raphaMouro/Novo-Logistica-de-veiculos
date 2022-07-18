public class Teste{
	
	public static void main(String [] args){
		
		System.out.println ("");
		System.out.println ("Teste da Classe Caminhao");
		
		Caminhao ca = new Caminhao();
		ca.movimento(15);
		ca.movimento(30);
		ca.movimento(65);
		
		ca.carregaCaminhao(50);
		ca.carregaCaminhao(50);
		ca.carregaCaminhao(50);
		
		ca.descarregaCaminhao(20);
		ca.descarregaCaminhao(75);

		System.out.println(ca.toString());
		
		System.out.println ("");
		System.out.println ("Teste da Classe Onibus");

		Onibus onibus = new Onibus();
		onibus.embarca(50);
		onibus.acelera(30);
		onibus.freia(30);
		onibus.desembarca(10);
		onibus.embarca(3);
		onibus.acelera(30);
		
		System.out.println(onibus.toString());

		System.out.println ("");
		System.out.println ("Teste da Classe Veiculo");

		Veiculo carro1 = new Veiculo();
        carro1.setAno(2019);
        carro1.setCor(" Azul");
        carro1.setModelo(" pick-up");

        Veiculo carro2 = new Veiculo();
        carro2.setAno(2020);
        carro2.setCor(" Branco");
        carro2.setModelo(" Fiorino");

		String imprime1 = carro1.exibe();
        System.out.println(imprime1);
        String imprime2 = carro2.exibe();
        System.out.println(imprime2);
	}
}