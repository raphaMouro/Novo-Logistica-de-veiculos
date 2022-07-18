public class Caminhao extends Veiculo {
	
	protected final int limitedaestrada = 50;
	protected int capacidadeDeCarga = 100;
	public int qtdCarga;
	
	public void movimento(int n){
		if ((velocidade + n) <= limitedaestrada){
			velocidade = velocidade + n;
			System.out.println ("Dentro da velocidade permitida");
		}

		else{
			System.out.println("Ultrapassou a velocidade permitida, risco de infração.");
		}
	}
		
	public void carregaCaminhao(int n){
		System.out.println("Carregando Caminhao");
		if ((qtdCarga + n) <= capacidadeDeCarga &&  n > 0) {
			qtdCarga = qtdCarga + n;
			System.out.println("Carregamento da Carga liberado >> Carga=" + qtdCarga);
				
		}
		
		else {
			System.out.println("Verifique a capacidade de carga mínima e máxima permitida.");
		

			}
	
	
	}

	public void descarregaCaminhao(int n){
		System.out.println("Descarregando Caminhao");
		if((qtdCarga - n) >= 0){
			qtdCarga = qtdCarga - n;
			System.out.println("Retirar Carga >> Carga=" + qtdCarga);
				}
		else{
			qtdCarga = qtdCarga - n;
			System.out.println("Caminhao Descarregado >> Carga=" + qtdCarga);
		}
	}
		
	public String toString(){
		return(super.toString() + " Carga: "+qtdCarga);
	}

}