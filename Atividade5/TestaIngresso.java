package Atividade5;

public class TestaIngresso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vip vip1 = new Vip(1, 100.0, "Acesso à área VIP");
        Vip vip2 = new Vip(2, 150.0, "Assento confortável");

        MeiaEntrada meia1 = new MeiaEntrada(3, 50.0, "Estudante");
        MeiaEntrada meia2 = new MeiaEntrada(4, 60.0, "Idoso");

        vip1.visualizar();
        System.out.println();
        vip2.visualizar();
        System.out.println();
        meia1.visualizar();
        System.out.println();
        meia2.visualizar();
	}

}
