package Atividade4;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicamento medicamento1 = new Medicamento(1, "Paracetamol", "Rua A, 123", "Acetaminofeno");
        Medicamento medicamento2 = new Medicamento(2, "Ibuprofeno", "Av. B, 456", "Ibuprofeno");

        Perfumaria perfumaria1 = new Perfumaria(3, "Perfume Floral", "Rua C, 789", "Floral");
        Perfumaria perfumaria2 = new Perfumaria(4, "Loção Hidratante", "Av. D, 987", "Coco");

        medicamento1.visualizar();
        System.out.println();
        medicamento2.visualizar();
        System.out.println();
        perfumaria1.visualizar();
        System.out.println();
        perfumaria2.visualizar();
	}

}
