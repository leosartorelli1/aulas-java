public class GerenciarEstacionamento {
    public static void main(String[] args) {
        Cliente jorge = new Cliente("Jorgin", "email@jorgin.com.br", "19-99999-9999");
        System.out.println(jorge);
        Carro carro1 = new Carro("Mitsubishi", "2017", "Lancer", "AFH-9999");
        Carro carro2 = new Carro("Volkswagen", "2015", "Golf", "KIJ-9999");
        System.out.println();
        jorge.adicionarCarro(carro1);
        jorge.adicionarCarro(carro2);
        System.out.println(jorge);
        System.out.println("Jorge tem" + jorge.getCarros().size() + "carros");

    }
}
