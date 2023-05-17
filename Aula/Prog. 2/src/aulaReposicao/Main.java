package aulaReposicao;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro(100);
        Veiculo moto = new Moto(200);

        carro.frear();
        moto.frear();
        System.out.println(carro.getVelocidade());
        System.out.println(moto.getVelocidade());
    }
}
