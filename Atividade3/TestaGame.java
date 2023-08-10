package Atividade3;

public class TestaGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogo jogo1 = new Jogo(1, "The Witcher 3", 59.99, "RPG");
        Jogo jogo2 = new Jogo(2, "FIFA 22", 49.99, "Esportes");
        Console console1 = new Console(3, "PlayStation 5", 499.99, "Sony");
        Console console2 = new Console(4, "Xbox Series X", 499.99, "Microsoft");

        jogo1.visualizar();
        System.out.println();
        jogo2.visualizar();
        System.out.println();
        console1.visualizar();
        System.out.println();
        console2.visualizar();
	}

}
