public class CaminhaoTest extends Veiculo {



    public void deveConseguirCarregarOCaminhaoAteCargaLimite() {
        Caminhao caminhao = new Caminhao();
        caminhao.carregaCaminhao(100);
        System.out.println("O caminhao carregou ate seu limite de " +
                caminhao.capacidadeDeCarga + " carregado com: " + caminhao.qtdCarga);
    }

    public void naoDeveConseguirCarregarOCaminhaoAlemCargaLimite() {
        Caminhao caminhao = new Caminhao();
        caminhao.carregaCaminhao(200);
        System.out.println("O caminhao carregou ate seu limite de " +
                caminhao.capacidadeDeCarga + " carregado com: " + caminhao.qtdCarga);
    }

    public void naoDeveConseguirCarregarOCaminhaoComValoresNegativos() {
        Caminhao caminhao = new Caminhao();
        caminhao.carregaCaminhao(-200);
        System.out.println("O caminhao carregou ate seu limite de " +
                caminhao.capacidadeDeCarga + " carregado com: " + caminhao.qtdCarga);
    }

    public static void main(String [] args) {
        CaminhaoTest caminhaoTest = new CaminhaoTest();

        caminhaoTest.deveConseguirCarregarOCaminhaoAteCargaLimite();
        caminhaoTest.naoDeveConseguirCarregarOCaminhaoAlemCargaLimite();
        caminhaoTest.naoDeveConseguirCarregarOCaminhaoComValoresNegativos();
    }

}
