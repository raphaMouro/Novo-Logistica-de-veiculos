
public class Veiculo {
   
	//Características
   private String modelo;
   private String cor;
   private int ano;
   protected int velocidade;


   public void acelera(int incremento){
	velocidade = velocidade + incremento;
   }

   public String exibe (){
      return ("As características do veículo são:" + getModelo() + "," + getCor () + "," + getAno());
   }

   public String getCor(){
      return cor;
   }

   public void setCor(String cor){
      this.cor = cor;
   }

   public String getModelo(){
      return modelo;
   }

   public void setModelo(String modelo){
      this.modelo = modelo;
   }

   public int getAno(){
      return ano;
   }

   public void setAno(int ano){
      this.ano = ano;
   }


   public void freia(int decremento){					 
	   velocidade = velocidade - decremento;
   }

   public String toString(){
	   return new String ("Velocidade: " +velocidade); 
   }
}
